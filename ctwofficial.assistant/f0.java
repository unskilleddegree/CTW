package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f24short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2352h;
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2354k;

    static {
        Protect.classesInit0(154);
        f24short = new short[]{2301, 2303, 2269, 2278, 2274, 2284, 2279, 2266, 2301, 2280, 2301, 2300, 2298, 2980, 2998, 3010, 3007, 3010, 2996, 3010, 1674, 1672, 1719, 1680, 1690, 1676, 1687, 1672, 1691, 1709, 1674, 1695, 1674, 1675, 1677, 1920, 1922, 1959, 1937, 1926, 1922, 1937, 1926, 2992, 2994, 2949, 2986, 2976, 2998, 2987, 2989, 2976, 2962, 2977, 2998, 2999, 2989, 2987, 2986, 1628, 1630, 1644, 1613, 1630, 1601, 1611, 1613, 1638, 1609, 1605, 1613, 1557, 1559, 1573, 1540, 1559, 1544, 1538, 1540, 1576, 1541, 1580, 1536, 1544, 1551, 1762, 1760, 1728, 1791, 1766, 1733, 1762, 1783, 1762, 1763, 1765, 403, 401, 418, 415, 407, 398, 405, 386, 387, 2733, 2735, 2711, 2744, 2740, 2748};
    }

    public /* synthetic */ f0(MainActivity mainActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f2348d = mainActivity;
        this.f2349e = str;
        this.f2350f = str2;
        this.f2351g = str3;
        this.f2352h = str4;
        this.i = str5;
        this.f2353j = str6;
        this.f2354k = str7;
        if (new Date().after(new Date(1796922007313L ^ 7569))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
