package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2368f;

    static {
        Protect.classesInit0(109);
    }

    public /* synthetic */ j0(int i, int i5, Object obj) {
        this.f2366d = i5;
        this.f2368f = obj;
        this.f2367e = i;
        if (new Date().after(new Date(1796922009283L ^ 9283))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
