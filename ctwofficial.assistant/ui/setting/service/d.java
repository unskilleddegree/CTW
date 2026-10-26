package com.ctwofficial.assistant.ui.setting.service;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements g7.l {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f118short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AccessibilityNodeInfo f2789e;

    static {
        Protect.classesInit0(26);
        f118short = new short[]{1775, 1778, 1927, 1928, 1935, 1925, 1952, 1922, 1922, 1924, 1938, 1938, 1928, 1923, 1928, 1933, 1928, 1941, 1944, 1967, 1934, 1925, 1924, 1960, 1935, 1927, 1934, 1938, 1955, 1944, 1975, 1928, 1924, 1942, 1960, 1925, 1993, 1999, 1999, 1999, 1992};
    }

    public /* synthetic */ d(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        this.f2788d = i;
        this.f2789e = accessibilityNodeInfo;
        if (new Date().after(new Date(1796922005370L ^ 5626))) {
            System.exit(0);
        }
    }

    @Override // g7.l
    public final native Object d(Object obj);
}
