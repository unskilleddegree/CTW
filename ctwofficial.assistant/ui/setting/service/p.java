package com.ctwofficial.assistant.ui.setting.service;

import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.ui.setting.writer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f139short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfo f2876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2880f;

    static {
        Protect.classesInit0(48);
        f139short = new short[]{1129, 1126, 1121, 1128, 1130, 1149, 1151, 1149, 1126, 1121, 1147, 2073, 2108, 2110, 2085, 2095, 2089, 2048, 2085, 2106, 2089, 2079, 2082, 2093, 2108, 2111, 2084, 2083, 2104, 2148, 2095, 2083, 2082, 2104, 2093, 2085, 2082, 2089, 2110, 2161, 1007, 995, 951, 930, 945, 932, 934, 951, 909, 940, 935, 934, 1022, 1348, 1352, 1308, 1289, 1306, 1295, 1293, 1308, 1336, 1306, 1281, 1291, 1293, 1365, 2047, 2035, 1959, 1970, 1953, 1972, 1974, 1959, 1936, 1979, 1978, 1983, 1975, 1946, 1981, 1975, 1974, 1963, 2030, 2252, 2240, 2189, 2191, 2190, 2181, 2201, 2211, 2191, 2197, 2190, 2196, 2269, 1285, 1289, 1359, 1344, 1351, 1358, 1356, 1371, 1369, 1371, 1344, 1351, 1373, 1300, 2752};
    }

    public p(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2, int i, int i5, int i9, String str) {
        h7.h.e(str, writer.bridge(f139short, 0, 11, 1039));
        this.f2875a = accessibilityNodeInfo;
        this.f2876b = accessibilityNodeInfo2;
        this.f2877c = i;
        this.f2878d = i5;
        this.f2879e = i9;
        this.f2880f = str;
        if (new Date().after(new Date(1796922009427L ^ 9683))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
