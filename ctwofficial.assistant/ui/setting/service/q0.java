package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f142short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MyForegroundService f2887e;

    static {
        Protect.classesInit0(11);
        f142short = new short[]{3137, 3139, 3154};
    }

    public /* synthetic */ q0(MyForegroundService myForegroundService, int i) {
        this.f2886d = i;
        this.f2887e = myForegroundService;
        if (new Date().after(new Date(1796922008351L ^ 8607))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
