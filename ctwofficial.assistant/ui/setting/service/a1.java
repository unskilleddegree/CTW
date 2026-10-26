package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f111short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2774g;

    static {
        Protect.classesInit0(164);
        f111short = new short[]{1787, 1753, 1750, 1756, 1745, 1756, 1753, 1740, 1757, 1680, 1755, 1744, 1745, 1748, 1756, 1777, 1750, 1756, 1757, 1728, 1669, 2806, 2810, 2730, 2728, 2739, 2745, 2751, 2791, 1847, 1851, 1911, 1918, 1917, 1903, 1830, 1217, 1229, 1177, 1154, 1181, 1232, 1281, 1293, 1371, 1348, 1374, 1348, 1359, 1345, 1352, 1296, 1826, 1838, 1899, 1888, 1903, 1900, 1890, 1899, 1898, 1843, 2672, 2684, 2623, 2608, 2613, 2623, 2615, 2621, 2622, 2608, 2617, 2657, 1535};
    }

    public a1(int i, Integer num, int i5, int i9, boolean z8, boolean z9, boolean z10) {
        this.f2768a = i;
        this.f2769b = num;
        this.f2770c = i5;
        this.f2771d = i9;
        this.f2772e = z8;
        this.f2773f = z9;
        this.f2774g = z10;
        if (new Date().after(new Date(1796922008309L ^ 8309))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
