package com.ctwofficial.assistant.ui.setting.service;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ctwofficial.assistant.ui.setting.level;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f141short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2885c;

    static {
        Protect.classesInit0(45);
        f141short = new short[]{1049, 1048, 1043, 1042, 836, 891, 865, 891, 880, 894, 887, 862, 891, 865, 870, 838, 887, 874, 870, 826, 892, 893, 886, 887, 815, 1430, 1434, 1486, 1503, 1474, 1486, 1415, 1436, 1424, 1490, 1503, 1477, 1502, 1492, 1475, 1421, 2601};
    }

    public q(AccessibilityNodeInfo accessibilityNodeInfo, String str, Rect rect) {
        h7.h.e(accessibilityNodeInfo, level.touch(f141short, 0, 4, 1143));
        this.f2883a = accessibilityNodeInfo;
        this.f2884b = str;
        this.f2885c = rect;
        if (new Date().after(new Date(1796922006804L ^ 8084))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
