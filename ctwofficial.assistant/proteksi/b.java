package com.ctwofficial.assistant.proteksi;

import com.ctwofficial.assistant.ui.setting.writer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f44short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2436d;

    static {
        Protect.classesInit0(124);
        f44short = new short[]{2895, 2882, 2891, 2910, 780, 814, 825, 804, 827, 804, 825, 820, 776, 827, 808, 803, 825, 869, 825, 820, 829, 808, 880, 1036, 1024, 1108, 1097, 1108, 1100, 1093, 1053, 768, 780, 840, 841, 856, 845, 837, 832, 785, 693, 697, 749, 752, 756, 764, 746, 749, 760, 756, 745, 676, 1570};
    }

    public b(String str, String str2, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h7.h.e(str, writer.bridge(f44short, 0, 4, 2875));
        this.f2433a = str;
        this.f2434b = str2;
        this.f2435c = str3;
        this.f2436d = jCurrentTimeMillis;
        if (new Date().after(new Date(1796922004167L ^ 4167))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
