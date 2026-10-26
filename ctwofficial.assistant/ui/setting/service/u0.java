package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f146short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2905c;

    static {
        Protect.classesInit0(156);
        f146short = new short[]{2955, 2985, 2982, 2988, 2977, 2988, 2985, 3004, 2989, 3040, 3002, 2985, 3007, 3061, 3209, 3205, 3272, 3264, 3281, 3264, 3287, 3286, 3224, 1190, 1194, 1276, 1251, 1263, 1277, 1219, 1262, 1207, 2116};
    }

    public u0(String str, Integer num, String str2) {
        this.f2903a = str;
        this.f2904b = num;
        this.f2905c = str2;
        if (new Date().after(new Date(1796922001642L ^ 2666))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
