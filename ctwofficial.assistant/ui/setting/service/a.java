package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f109short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2767e;

    static {
        Protect.classesInit0(27);
        f109short = new short[]{1644, 1655, 1646, 1646, 1570, 1633, 1635, 1644, 1644, 1645, 1654, 1570, 1632, 1639, 1570, 1633, 1635, 1649, 1654, 1570, 1654, 1645, 1570, 1644, 1645, 1644, 1583, 1644, 1655, 1646, 1646, 1570, 1654, 1659, 1650, 1639, 1570, 1635, 1644, 1638, 1648, 1645, 1643, 1638, 1580, 1647, 1639, 1638, 1643, 1635, 1580, 1603, 1655, 1638, 1643, 1645, 1615, 1635, 1644, 1635, 1637, 1639, 1648, 2110, 2090, 2107, 2102, 2096};
    }

    public /* synthetic */ a(AutoClickService autoClickService, int i) {
        this.f2766d = i;
        this.f2767e = autoClickService;
        if (new Date().after(new Date(1796922003074L ^ 3074))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
