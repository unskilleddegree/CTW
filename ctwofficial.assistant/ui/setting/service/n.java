package com.ctwofficial.assistant.ui.setting.service;

import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.proteksi.store;
import com.ctwofficial.assistant.ui.setting.level;
import np.manager.Protect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f2861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f2862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f2863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f2864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n[] f2865h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f135short;

    static {
        Protect.classesInit0(32);
        f135short = new short[]{532, 536, 537, 537, 530, 532, 515, 530, 531, 520, 534, 532, 515, 542, 513, 530, 674, 686, 687, 687, 676, 674, 693, 676, 677, 702, 680, 677, 685, 676, 516, 520, 521, 521, 514, 516, 531, 514, 515, 536, 517, 523, 520, 516, 524, 514, 515, 460, 449, 475, 459, 455, 454, 454, 461, 459, 476, 461, 460};
        n nVar = new n(level.touch(f135short, 0, 16, 599), 0);
        f2861d = nVar;
        n nVar2 = new n(level.touch(f135short, 16, 14, 737), 1);
        f2862e = nVar2;
        n nVar3 = new n(store.alexraven(f135short, 30, 17, 583), 2);
        f2863f = nVar3;
        n nVar4 = new n(slow.anchor(f135short, 47, 12, 392), 3);
        f2864g = nVar4;
        f2865h = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static native n valueOf(String str);

    public static native n[] values();
}
