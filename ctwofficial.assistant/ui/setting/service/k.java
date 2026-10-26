package com.ctwofficial.assistant.ui.setting.service;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.databinding.slow;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f129short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f2837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f2841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2842h;

    static {
        Protect.classesInit0(33);
        f129short = new short[]{280, 276, 277, 271, 282, 274, 277, 286, 265, 1668, 1697, 1723, 1724, 1671, 1722, 1708, 1709, 1722, 1691, 1702, 1705, 1720, 1723, 1696, 1703, 1724, 1760, 1707, 1703, 1702, 1724, 1705, 1697, 1702, 1709, 1722, 1781, 1566, 1554, 1616, 1629, 1607, 1628, 1622, 1601, 1551, 2990, 2978, 3058, 3056, 3051, 3041, 3047, 3007, 2871, 2875, 2943, 2930, 2920, 2927, 2938, 2933, 2936, 2942, 2906, 2854, 3257, 3253, 3301, 3324, 3318, 3326, 3296, 3301, 3284, 3313, 3313, 3303, 3312, 3302, 3302, 3240, 1786, 1782, 1714, 1715, 1701, 1698, 1727, 1720, 1719, 1698, 1727, 1721, 1720, 1687, 1714, 1714, 1700, 1715, 1701, 1701, 1771, 583, 587, 537, 522, 543, 514, 517, 524, 598, 2434, 2446, 2499, 2497, 2506, 2507, 2451, 980};
    }

    public k(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, Double d9, Integer num, String str, String str2, Float f7, String str3) {
        h7.h.e(accessibilityNodeInfo, slow.anchor(f129short, 0, 9, 379));
        this.f2835a = accessibilityNodeInfo;
        this.f2836b = rect;
        this.f2837c = d9;
        this.f2838d = num;
        this.f2839e = str;
        this.f2840f = str2;
        this.f2841g = f7;
        this.f2842h = str3;
        if (new Date().after(new Date(1796922009499L ^ 9499))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
