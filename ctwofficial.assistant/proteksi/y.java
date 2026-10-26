package com.ctwofficial.assistant.proteksi;

import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.ui.setting.alexwolf;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f65short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2538f;

    static {
        Protect.classesInit0(136);
        f65short = new short[]{1679, 1667, 1672, 1673, 2527, 2519, 2497, 2497, 2515, 2517, 2519, 1252, 1234, 1220, 1220, 1246, 1240, 1241, 1253, 1234, 1220, 1218, 1243, 1219, 1183, 1217, 1238, 1243, 1246, 1235, 1162, 2640, 2652, 2591, 2579, 2584, 2585, 2625, 1896, 1892, 1833, 1825, 1847, 1847, 1829, 1827, 1825, 1913, 2630, 2634, 2572, 2571, 2590, 2571, 2566, 2647, 920, 916, 981, 986, 979, 979, 987, 960, 981, 1017, 981, 989, 984, 905, 2696, 2692, 2757, 2762, 2755, 2755, 2763, 2768, 2757, 2785, 2780, 2772, 2752, 2757, 2768, 2753, 2713, 2066};
    }

    public y(boolean z8, String str, String str2, boolean z9, String str3, String str4) {
        h7.h.e(str, slow.anchor(f65short, 0, 4, 1772));
        h7.h.e(str2, alexwolf.alexrange(f65short, 4, 7, 2482));
        this.f2533a = z8;
        this.f2534b = str;
        this.f2535c = str2;
        this.f2536d = z9;
        this.f2537e = str3;
        this.f2538f = str4;
        if (new Date().after(new Date(1796922006012L ^ 7036))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
