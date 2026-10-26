package com.ctwofficial.assistant.ui.setting.service;

import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.databinding.eagle;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f133short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityNodeInfo f2852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityNodeInfo f2853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f2854e;

    static {
        Protect.classesInit0(31);
        f133short = new short[]{740, 741, 750, 751, 2803, 2756, 2770, 2766, 2765, 2775, 2756, 2757, 2786, 2766, 2772, 2771, 2760, 2756, 2771, 2798, 2759, 2759, 2756, 2771, 2697, 2767, 2766, 2757, 2756, 2716, 1624, 1620, 1543, 1563, 1537, 1542, 1559, 1553, 1609, 2844, 2832, 2899, 2911, 2910, 2884, 2897, 2905, 2910, 2901, 2882, 2829, 1625, 1621, 1541, 1543, 1564, 1558, 1552, 1595, 1562, 1553, 1552, 1608, 671, 659, 705, 726, 704, 732, 735, 709, 726, 727, 739, 705, 730, 720, 726, 654, 1202};
    }

    public /* synthetic */ m(AccessibilityNodeInfo accessibilityNodeInfo, String str, AccessibilityNodeInfo accessibilityNodeInfo2, AccessibilityNodeInfo accessibilityNodeInfo3, int i) {
        this(accessibilityNodeInfo, str, (i & 4) != 0 ? null : accessibilityNodeInfo2, accessibilityNodeInfo3, (Integer) null);
        if (new Date().after(new Date(1796922001552L ^ 2576))) {
            System.exit(0);
        }
    }

    public m(AccessibilityNodeInfo accessibilityNodeInfo, String str, AccessibilityNodeInfo accessibilityNodeInfo2, AccessibilityNodeInfo accessibilityNodeInfo3, Integer num) {
        h7.h.e(accessibilityNodeInfo, eagle.queue(f133short, 0, 4, 650));
        this.f2850a = accessibilityNodeInfo;
        this.f2851b = str;
        this.f2852c = accessibilityNodeInfo2;
        this.f2853d = accessibilityNodeInfo3;
        this.f2854e = num;
        if (new Date().after(new Date(1796922003795L ^ 5075))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
