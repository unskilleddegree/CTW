package com.ctwofficial.assistant.proteksi;

import android.net.Uri;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class CtwNativeEndpoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CtwNativeEndpoints f2424a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f38short;

    static {
        Protect.classesInit0(29);
        f38short = new short[]{838, 849, 850, 957, 906, 926, 922, 902, 925, 906, 907, 975, 921, 910, 899, 922, 906, 975, 920, 910, 924, 975, 897, 922, 899, 899, 961, 1649, 1645, 1645, 1641, 1642};
        f2424a = new CtwNativeEndpoints();
        System.loadLibrary(locked.zone(f38short, 0, 3, 805));
    }

    private final native String nativeGetEndpoint(int i);

    public final native String a(int i);

    public final native String b(int i);

    public final native Uri c(int i);
}
