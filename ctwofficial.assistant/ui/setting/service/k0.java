package com.ctwofficial.assistant.ui.setting.service;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f130short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FloatingMenuService f2844e;

    static {
        Protect.classesInit0(96);
        f130short = new short[]{2364, 2342, 2337, 2346, 2363, 2401, 2364, 2363, 2350, 2365, 2363, 2362, 2367, 2401, 2348, 2363, 2360, 2401, 2367, 2339, 2362, 2344, 2342, 2337, 556, 544, 546, 609, 556, 571, 568, 609, 558, 556, 571, 550, 544, 545, 609, 540, 539, 512, 543, 528, 515, 512, 524, 526, 539, 518, 512, 513, 1780, 1774, 1769, 1762, 1779, 1705, 1780, 1779, 1766, 1781, 1779, 1778, 1783, 1705, 1764, 1779, 1776, 1705, 1783, 1771, 1778, 1760, 1774, 1769, 1705, 1738, 1766, 1783, 1780, 1734, 1764, 1779, 1774, 1777, 1774, 1779, 1790, 1972, 1982, 1981, 1971, 1958, 1979, 1980, 1973, 1924, 1979, 1975, 1957};
    }

    public /* synthetic */ k0(FloatingMenuService floatingMenuService, int i) {
        this.f2843d = i;
        this.f2844e = floatingMenuService;
        if (new Date().after(new Date(1796922002701L ^ 3981))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
