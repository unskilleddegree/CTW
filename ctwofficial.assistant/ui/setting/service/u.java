package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2902e;

    static {
        Protect.classesInit0(39);
    }

    public /* synthetic */ u(AutoClickService autoClickService, int i) {
        this.f2901d = i;
        this.f2902e = autoClickService;
        if (new Date().after(new Date(1796922008149L ^ 8405))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
