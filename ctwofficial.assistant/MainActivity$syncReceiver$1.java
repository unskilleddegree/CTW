package com.ctwofficial.assistant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity$syncReceiver$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: short */
    private static final short[] f4short;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f2254b;

    static {
        Protect.classesInit0(2);
        f4short = new short[]{2530, 2542, 2540, 2479, 2530, 2549, 2550, 2479, 2514, 2500, 2514, 2514, 2504, 2510, 2511, 2526, 2504, 2511, 2519, 2496, 2509, 2504, 2501, 2160, 2157, 2145, 2151, 2164, 2122, 2150, 2160, 2150, 2150, 2172, 2170, 2171, 2122, 2168, 2160, 2150, 2150, 2164, 2162, 2160, 736, 726, 704, 730, 659, 711, 730, 727, 722, 728, 659, 709, 722, 735, 730, 727, 669, 518, 522, 523, 529, 512, 541, 529, 2930, 2942, 2943, 2943, 2932, 2930, 2917, 2936, 2919, 2936, 2917, 2920, 1841, 1834, 1843, 1843, 1919, 1852, 1854, 1841, 1841, 1840, 1835, 1919, 1853, 1850, 1919, 1852, 1854, 1836, 1835, 1919, 1835, 1840, 1919, 1841, 1840, 1841, 1906, 1841, 1834, 1843, 1843, 1919, 1835, 1830, 1839, 1850, 1919, 1854, 1841, 1851, 1837, 1840, 1846, 1851, 1905, 1841, 1850, 1835, 1905, 1820, 1840, 1841, 1841, 1850, 1852, 1835, 1846, 1833, 1846, 1835, 1830, 1810, 1854, 1841, 1854, 1848, 1850, 1837, 2893, 2921, 2920, 2915, 2925, 2933, 2927, 2854, 2933, 2915, 2932, 2928, 2915, 2932, 2854, 2930, 2915, 2932, 2934, 2931, 2930, 2931, 2933, 2856, 2854, 2901, 2927, 2922, 2919, 2925, 2919, 2920, 2854, 2922, 2921, 2913, 2927, 2920, 2854, 2931, 2922, 2919, 2920, 2913, 2856, 971, 967, 965, 902, 971, 988, 991, 902, 1001, 1003, 1003, 1005, 1019, 1019, 993, 1002, 993, 996, 993, 1020, 1009, 1015, 1019, 1020, 1001, 1020, 1021, 1019, 2556, 2544, 2546, 2481, 2556, 2539, 2536, 2481, 2508, 2502, 2513, 2524, 2496, 2514, 2526, 2518, 2513, 2496, 2506, 2518, 409, 411, 396, 401, 407, 406, 391, 394, 413, 404, 407, 409, 412, 391, 395, 413, 396, 396, 401, 406, 415, 395, 2266, 2264, 2249, 2286, 2249, 2255, 2260, 2259, 2266, 2197, 2195, 2195, 2195, 2196};
    }

    public /* synthetic */ MainActivity$syncReceiver$1(MainActivity mainActivity) {
        i9 = i;
        this.f2254b = mainActivity;
        if (new Date().after(new Date(1796922000908L ^ 1164))) {
            System.exit(0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
