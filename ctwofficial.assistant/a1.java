package com.ctwofficial.assistant;

import com.ctwofficial.assistant.databinding.eagle;
import com.ctwofficial.assistant.proteksi.alexguard;
import com.ctwofficial.assistant.proteksi.store;
import np.manager.Protect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f2261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f2262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a1 f2263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a1[] f2264g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f13short;

    static {
        Protect.classesInit0(1);
        f13short = new short[]{503, 482, 497, 510, 484, 501, 500, 2482, 2483, 2472, 2467, 2491, 2478, 2493, 2482, 2472, 2489, 2488, 1696, 1723, 1702, 1696, 1701, 1701, 1722, 1703, 1697, 1712, 1713};
        a1 a1Var = new a1(store.alexraven(f13short, 0, 7, 432), 0);
        f2261d = a1Var;
        a1 a1Var2 = new a1(eagle.queue(f13short, 7, 11, 2556), 1);
        f2262e = a1Var2;
        a1 a1Var3 = new a1(alexguard.alexdelta(f13short, 18, 11, 1781), 2);
        f2263f = a1Var3;
        f2264g = new a1[]{a1Var, a1Var2, a1Var3};
    }

    public static native a1 valueOf(String str);

    public static native a1[] values();
}
