package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f114short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f2778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2779e;

    static {
        Protect.classesInit0(192);
        f114short = new short[]{1473, 1512, 1522, 1513, 1507, 1455, 1508, 1510, 1513, 1507, 1518, 1507, 1510, 1523, 1506, 1466, 2603, 2599, 2666, 2664, 2665, 2658, 2686, 2638, 2665, 2659, 2658, 2687, 2618, 3021};
    }

    public b1(a1 a1Var, int i) {
        this.f2778d = a1Var;
        this.f2779e = i;
        if (new Date().after(new Date(1796922005296L ^ 5552))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
