package com.ctwofficial.assistant.ui.setting.service;

import java.io.IOException;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements y7.d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f140short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MyForegroundService f2882e;

    static {
        Protect.classesInit0(3);
        f140short = new short[]{2505, 2511, 2521, 2521, 2527, 2505, 2505, 880, 885, 864, 885, 1684, 1689, 1848, 1839, 1835, 1830, 1813, 1831, 1839, 1831, 1832, 1839, 1848, 1813, 1827, 1838, 2143, 2130, 2120, 2123, 2135, 2138, 2114, 2148, 2133, 2138, 2134, 2142, 803, 811, 829, 829, 815, 809, 811, 3284, 1869, 1864, 1885, 1864, 1901, 1899, 1917, 1917, 1915, 1901, 1901, 1724, 1713, 1707, 1704, 1716, 1721, 1697, 1671, 1718, 1721, 1717, 1725, 968, 967, 974, 974, 966, 989, 968, 1014, 960, 973, 2619, 2614, 2596, 2595, 2568, 2597, 2610, 2614, 2611, 2568, 2622, 2611};
    }

    public /* synthetic */ p0(MyForegroundService myForegroundService, int i) {
        this.f2881d = i;
        this.f2882e = myForegroundService;
        if (new Date().after(new Date(1796922004498L ^ 5778))) {
            System.exit(0);
        }
    }

    private final native void a(c8.j jVar, IOException iOException);

    @Override // y7.d
    public final native void g(c8.j jVar, y7.x xVar);

    @Override // y7.d
    public final native void i(c8.j jVar, IOException iOException);
}
