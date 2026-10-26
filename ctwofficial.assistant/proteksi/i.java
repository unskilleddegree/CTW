package com.ctwofficial.assistant.proteksi;

import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.ui.setting.level;
import np.manager.Protect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f2475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f2476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f2477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f2478g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f51short;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        Protect.classesInit0(118);
        f51short = new short[]{1192, 1199, 1191, 1198, 2043, 2045, 2027, 2027, 2029, 2043, 2043, 2508, 2523, 2523, 2502, 2523, 1086, 1064, 1083, 1063, 1056, 1063, 1070};
        i iVar = new i(level.touch(f51short, 0, 4, 1249), 0);
        i iVar2 = new i(store.alexraven(f51short, 4, 7, 1960), 1);
        f2475d = iVar2;
        i iVar3 = new i(slow.anchor(f51short, 11, 5, 2441), 2);
        f2476e = iVar3;
        i iVar4 = new i(locked.zone(f51short, 16, 7, 1129), 3);
        f2477f = iVar4;
        f2478g = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static native i valueOf(String str);

    public static native i[] values();
}
