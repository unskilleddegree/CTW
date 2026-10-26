package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g7.l f2456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f2457f;

    static {
        Protect.classesInit0(127);
    }

    public /* synthetic */ d(g7.l lVar, e eVar, int i) {
        this.f2455d = i;
        this.f2456e = lVar;
        this.f2457f = eVar;
        if (new Date().after(new Date(1796922007669L ^ 8949))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
