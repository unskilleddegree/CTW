package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f22short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.ctwofficial.assistant.proteksi.y f2343f;

    static {
        Protect.classesInit0(148);
        f22short = new short[]{903, 945, 935, 957, 1012, 928, 957, 944, 949, 959, 1012, 952, 949, 947, 957, 1012, 930, 949, 952, 957, 944, 1018, 660, 662, 692, 655, 651, 645, 654, 691, 660, 641, 660, 661, 659};
    }

    public /* synthetic */ e0(MainActivity mainActivity, com.ctwofficial.assistant.proteksi.y yVar, int i) {
        this.f2341d = i;
        this.f2342e = mainActivity;
        this.f2343f = yVar;
        if (new Date().after(new Date(1796922000836L ^ 1860))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
