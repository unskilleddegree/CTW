package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class z extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f154short;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f2948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2949n;

    static {
        Protect.classesInit0(51);
        f154short = new short[]{1347, 1391, 1376, 1387, 1381, 1399, 1389, 1399, 1393, 1322, 1377, 1379, 1388, 1382, 1387, 1382, 1379, 1398, 1383, 1393, 1343, 2551, 2555, 2473, 2494, 2490, 2472, 2484, 2485, 2534, 2698};
    }

    public z(String str, List list) {
        this.f2948m = list;
        this.f2949n = str;
        if (new Date().after(new Date(1796922001624L ^ 2648))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
