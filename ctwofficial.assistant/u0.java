package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f73short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2570g;

    static {
        Protect.classesInit0(196);
        f73short = new short[]{3094, 3103, 3085, 3105, 3086, 3084, 3089, 3096, 3095, 3090, 3099, 1288, 1293, 1304, 1293, 468, 458, 463, 450, 474, 450, 459};
    }

    public /* synthetic */ u0(MainActivity mainActivity, String str, String str2, int i) {
        this.f2567d = i;
        this.f2568e = mainActivity;
        this.f2569f = str;
        this.f2570g = str2;
        if (new Date().after(new Date(1796921999713L ^ 993))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
