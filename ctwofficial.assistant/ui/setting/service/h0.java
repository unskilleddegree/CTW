package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f124short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f2812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2814c;

    static {
        Protect.classesInit0(102);
        f124short = new short[]{638, 607, 596, 597, 628, 601, 579, 580, 593, 606, 595, 597, 610, 597, 579, 581, 604, 580, 536, 579, 580, 593, 580, 597, 525, 1953, 1965, 2043, 2028, 2017, 2040, 2024, 1968, 2311, 2315, 2385, 2382, 2393, 2372, 2424, 2378, 2374, 2395, 2375, 2382, 2392, 2326, 1962};
    }

    public h0(i0 i0Var, Integer num, int i) {
        this.f2812a = i0Var;
        this.f2813b = num;
        this.f2814c = i;
        if (new Date().after(new Date(1796922002387L ^ 2387))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
