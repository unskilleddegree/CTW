package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f143short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f2894g;

    static {
        Protect.classesInit0(43);
        f143short = new short[]{269, 279, 272, 283, 266, 336, 269, 266, 287, 268, 266, 267, 270, 336, 279, 272, 314, 268, 279, 264, 283, 268};
    }

    public s(long j3, AutoClickService autoClickService, int i, List list) {
        this.f2891d = j3;
        this.f2892e = autoClickService;
        this.f2893f = i;
        this.f2894g = list;
        if (new Date().after(new Date(1796922006849L ^ 8129))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
