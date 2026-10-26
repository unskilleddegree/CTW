package com.ctwofficial.assistant.ui.setting.service;

import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.ui.setting.writer;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f137short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfo f2869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityNodeInfo f2870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f2872e;

    static {
        Protect.classesInit0(47);
        f137short = new short[]{1683, 1690, 1690, 1689, 1678, 2525, 2554, 2556, 2555, 2541, 2554, 2555, 2556, 2543, 2530, 2509, 2529, 2555, 2556, 2535, 2539, 2556, 2509, 2529, 2528, 2554, 2539, 2550, 2554, 2470, 2529, 2536, 2536, 2539, 2556, 2483, 679, 683, 744, 740, 741, 767, 746, 738, 741, 750, 761, 694, 1218, 1230, 1162, 1159, 1181, 1178, 1167, 1152, 1165, 1163, 1235, 2536, 2532, 2469, 2464, 2464, 2486, 2465, 2487, 2487, 2465, 2487, 2553, 1546, 1542, 1621, 1605, 1609, 1620, 1603, 1602, 1563, 2351};
    }

    public o(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2, AccessibilityNodeInfo accessibilityNodeInfo3, List list, c0 c0Var) {
        h7.h.e(accessibilityNodeInfo, writer.bridge(f137short, 0, 5, 1788));
        this.f2868a = accessibilityNodeInfo;
        this.f2869b = accessibilityNodeInfo2;
        this.f2870c = accessibilityNodeInfo3;
        this.f2871d = list;
        this.f2872e = c0Var;
        if (new Date().after(new Date(1796922005255L ^ 5511))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
