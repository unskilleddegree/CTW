package com.ctwofficial.assistant.ui.setting.service;

import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.proteksi.locked;
import com.ctwofficial.assistant.proteksi.store;
import com.ctwofficial.assistant.ui.setting.alexwolf;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f127short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfo f2827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityNodeInfo f2828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityNodeInfo f2829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f2833h;

    static {
        Protect.classesInit0(36);
        f127short = new short[]{3128, 3121, 3121, 3122, 3109, 3097, 3128, 3123, 3122, 1235, 1233, 1226, 1216, 1222, 1261, 1228, 1223, 1222, 2872, 2871, 2864, 2873, 2875, 2860, 2862, 2860, 2871, 2864, 2858, 2371, 2378, 2378, 2377, 2398, 2431, 2371, 2393, 2398, 2383, 2377, 2007, 2043, 2017, 2022, 2045, 2033, 2022, 1988, 2043, 2020, 2017, 2020, 1980, 2039, 2043, 2042, 2016, 2037, 2045, 2042, 2033, 2022, 1961, 824, 820, 891, 882, 882, 881, 870, 858, 891, 880, 881, 809, 2595, 2607, 2687, 2685, 2662, 2668, 2666, 2625, 2656, 2667, 2666, 2610, 545, 557, 617, 612, 638, 633, 620, 611, 622, 616, 579, 610, 617, 616, 560, 3041, 3053, 2988, 2985, 2985, 3007, 2984, 3006, 3006, 2947, 2978, 2985, 2984, 3006, 3056, 2724, 2728, 2798, 2785, 2790, 2799, 2797, 2810, 2808, 2810, 2785, 2790, 2812, 2741, 902, 906, 965, 972, 972, 975, 984, 1017, 965, 991, 984, 969, 975, 919, 3215, 3203, 3281, 3270, 3280, 3276, 3279, 3285, 3270, 3271, 3315, 3281, 3274, 3264, 3270, 3230, 2921};
    }

    public j(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2, AccessibilityNodeInfo accessibilityNodeInfo3, AccessibilityNodeInfo accessibilityNodeInfo4, List list, String str, String str2, Integer num) {
        h7.h.e(accessibilityNodeInfo2, locked.zone(f127short, 0, 9, 3159));
        h7.h.e(accessibilityNodeInfo3, slow.anchor(f127short, 9, 9, 1187));
        h7.h.e(str, store.alexraven(f127short, 18, 11, 2910));
        h7.h.e(str2, alexwolf.alexrange(f127short, 29, 11, 2348));
        this.f2826a = accessibilityNodeInfo;
        this.f2827b = accessibilityNodeInfo2;
        this.f2828c = accessibilityNodeInfo3;
        this.f2829d = accessibilityNodeInfo4;
        this.f2830e = list;
        this.f2831f = str;
        this.f2832g = str2;
        this.f2833h = num;
        if (new Date().after(new Date(1796922003865L ^ 4889))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
