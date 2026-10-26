package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f12short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2260e;

    static {
        Protect.classesInit0(0);
        f12short = new short[]{2216, 2218, 2184, 2227, 2231, 2233, 2226, 2191, 2216, 2237, 2216, 2217, 2223, 868, 886, 770, 895, 770, 884, 770, 2293, 2274, 2272, 2286, 2292, 2291, 2274, 2293, 2264, 2288, 2278, 2293, 2281, 2286, 2281, 2272, 2264, 2283, 2278, 2292, 2291, 2264, 2292, 2287, 2280, 2288, 2281, 2770, 2787, 2787, 2768, 2812, 2813, 2805, 2810, 2804, 1084, 1067, 1065, 1063, 1085, 1082, 1067, 1084, 1041, 1081, 1071, 1084, 1056, 1063, 1056, 1065, 1041, 1069, 1057, 1083, 1056, 1082, 1019, 1002, 1021, 1017, 1004, 1021, 944, 950, 950, 950, 945, 1337, 1326, 1324, 1314, 1336, 1343, 1326, 1337, 1287, 1314, 1336, 1343, 1326, 1317, 1326, 1337, 3313, 3270, 3268, 3274, 3280, 3287, 3270, 3281, 3270, 3271, 3203, 3315, 3279, 3266, 3290, 3203, 3296, 3276, 3281, 3270, 3203, 3279, 3274, 3280, 3287, 3270, 3277, 3270, 3281, 3203, 3280, 3275, 3276, 3286, 3279, 3271, 3203, 3277, 3276, 3287, 3203, 3265, 3270, 3203, 3277, 3286, 3279, 3279, 3213, 2568, 2591, 2571, 2575, 2591, 2569, 2574, 2607, 2570, 2590, 2587, 2574, 2591, 2611, 2580, 2588, 2581, 2642, 2655, 2569, 2643};
    }

    public /* synthetic */ a0(MainActivity mainActivity, int i) {
        this.f2259d = i;
        this.f2260e = mainActivity;
        if (new Date().after(new Date(1796922004853L ^ 6133))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
