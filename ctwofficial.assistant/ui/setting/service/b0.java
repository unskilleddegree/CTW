package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f113short;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f2777m;

    static {
        Protect.classesInit0(194);
        f113short = new short[]{2723, 2708, 2690, 2718, 2717, 2695, 2708, 2709, 2777, 2695, 2704, 2717, 2692, 2708, 2764, 1343};
    }

    public b0(c0 c0Var) {
        this.f2777m = c0Var;
        if (new Date().after(new Date(1796922006876L ^ 8156))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
