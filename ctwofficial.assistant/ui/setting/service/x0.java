package com.ctwofficial.assistant.ui.setting.service;

import com.ctwofficial.assistant.alexrange;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f152short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2929a;

    static {
        Protect.classesInit0(99);
        f152short = new short[]{1129, 1150, 1146, 1128, 1140, 1141, 2736, 2699, 2692, 2707, 2692, 2700, 2697, 2692, 2695, 2697, 2688, 2765, 2711, 2688, 2692, 2710, 2698, 2699, 2776, 1323};
    }

    public x0(String str) {
        h7.h.e(str, alexrange.wolf(f152short, 0, 6, 1051));
        this.f2929a = str;
        if (new Date().after(new Date(1796922007763L ^ 8787))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
