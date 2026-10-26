package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f151short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2928d;

    static {
        Protect.classesInit0(53);
        f151short = new short[]{939, 902, 924, 903, 909, 922, 961, 901, 908, 911, 925, 980, 1648, 1660, 1576, 1587, 1580, 1633, 1492, 1496, 1418, 1425, 1439, 1424, 1420, 1477, 2223, 2211, 2273, 2284, 2295, 2295, 2284, 2286, 2238, 2202};
    }

    public x(int i, int i5, int i9, int i10) {
        this.f2925a = i;
        this.f2926b = i5;
        this.f2927c = i9;
        this.f2928d = i10;
        if (new Date().after(new Date(1796922003203L ^ 3459))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
