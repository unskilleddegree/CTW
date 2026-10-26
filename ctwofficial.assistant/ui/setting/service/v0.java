package com.ctwofficial.assistant.ui.setting.service;

import com.ctwofficial.assistant.databinding.eagle;
import com.ctwofficial.assistant.proteksi.alexguard;
import com.ctwofficial.assistant.proteksi.locked;
import np.manager.Protect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v0 f2913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0 f2914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v0 f2915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v0[] f2916g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f148short;

    static {
        Protect.classesInit0(119);
        f148short = new short[]{2343, 2346, 2346, 2345, 2353, 423, 432, 447, 432, 438, 417, 475, 461, 453, 472};
        v0 v0Var = new v0(eagle.queue(f148short, 0, 5, 2406), 0);
        f2913d = v0Var;
        v0 v0Var2 = new v0(locked.zone(f148short, 5, 6, 501), 1);
        f2914e = v0Var2;
        v0 v0Var3 = new v0(alexguard.alexdelta(f148short, 11, 4, 396), 2);
        f2915f = v0Var3;
        f2916g = new v0[]{v0Var, v0Var2, v0Var3};
    }

    public static native v0 valueOf(String str);

    public static native v0[] values();
}
