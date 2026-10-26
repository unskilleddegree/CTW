package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f95short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedSettingsActivity f2642d;

    static {
        Protect.classesInit0(13);
        f95short = new short[]{708, 705, 724, 705, 1608, -11475, -10273, 2864, 2906, 2929, 2914, 2929, 2939, 2864, 2909, 2929, 2920, 2858, 2864, -11262, -12145, 3103, 3191, 3166, 3149, 3160, 3166, 3077, 3103, 2649, 2637, 2636, 2647, 2650, 2641, 2652, 2663, 2654, 2653, 2649, 2636, 2637, 2634, 2653, 2635, 1560, 1564, 1563, 1578, 1541, 1543, 1564, 1558, 1552, 2003, 2015, 1990, 2017, 1998, 1996, 2007, 2013, 2011, 889, 885, 876, 843, 880, 893, 871, 864, 885, 890, 887, 881, 956, 945, 956, 1027, 1096, 1102, 1065, 493, 505, 504, 483, 467, 510, 489, 490, 510, 489, 511, 484, 11089, 3188, 3093, 3105, 3104, 3131, 3188, 3078, 3121, 3122, 3110, 3121, 3111, 3132, 3182, 3188, 3099, 3098, 3166, 2100, 2080, 2081, 2106, 2103, 2108, 2097, 2058, 2110, 2080, 2087, 2108, 2087, 9456, 981, 948, 896, 897, 922, 981, 958, 896, 903, 924, 903, 975, 981, 954, 955, 1023, 398, 393, 392, 409, 419, 390, 403, 402, 409, 419, 409, 402, 413, 414, 400, 409, 408, 9091, 1190, 1216, 1263, 1258, 1266, 1251, 1268, 1190, 1236, 1267, 1266, 1251, 1212, 1190, 1225, 1224, 1164, 2788, 2794, 2793, 2789, 2797, 2777, 2812, 2793, 2792, 2787, 8809, 1356, 1326, 1280, 1283, 1295, 1287, 1356, 1334, 1283, 1282, 1289, 1366, 1356, 1315, 1314, 1382, 2363, 2362, 2337, 2364, 2355, 2364, 2358, 2356, 2337, 2364, 2362, 2363, 2314, 2342, 2362, 2336, 2363, 2353, 2314, 2362, 2343, 2353, 2352, 2343, 12110, 2155, 2072, 2110, 2090, 2105, 2090, 2155, 2052, 2105, 2095, 2094, 2105, 2161, 2155, 2052, 2053, 2113, 599, 579, 578, 601, 617, 581, 579, 594, 599, 606, 617, 578, 607, 596, 599, 9322, 847, 814, 794, 795, 768, 847, 827, 774, 781, 782, 847, 839, 808, 813, 838, 853, 847, 800, 801, 869, 2672, 2667, 2647, 2672, 2678, 2669, 2666, 2659, 2604, 2602, 2602, 2602, 2605, 1030, 1053, 1028, 1028, 1865, 1870, 1862, 1868, 1857, 1876, 1861, 1800, 1806, 1806, 1806, 1801};
    }

    public i0(SharedSettingsActivity sharedSettingsActivity, ArrayList arrayList) {
        h7.h.e(arrayList, alexguard.alexdelta(f95short, 0, 4, 672));
        this.f2642d = sharedSettingsActivity;
        this.f2641c = arrayList;
        if (new Date().after(new Date(1796922003451L ^ 3451))) {
            System.exit(0);
        }
    }

    @Override // androidx.recyclerview.widget.s
    public final native int a();

    @Override // androidx.recyclerview.widget.s
    public final native void c(RecyclerView.a aVar, int i);

    @Override // androidx.recyclerview.widget.s
    public final native RecyclerView.a d(ViewGroup viewGroup);
}
