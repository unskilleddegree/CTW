package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f43short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2432h;

    static {
        Protect.classesInit0(49);
        f43short = new short[]{1742, 1752, 1742, 1742, 1748, 1746, 1747, 1730, 1739, 1756, 1745, 1748, 1753};
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2428d = i;
        this.f2429e = obj;
        this.f2430f = obj2;
        this.f2431g = obj3;
        this.f2432h = obj4;
        if (new Date().after(new Date(1796922003029L ^ 3285))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
