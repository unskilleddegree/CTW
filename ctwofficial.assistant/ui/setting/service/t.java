package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f144short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2898f;

    static {
        Protect.classesInit0(44);
        f144short = new short[]{1878, 1868, 1867, 1856, 1873, 1803, 1878, 1873, 1860, 1879, 1873, 1872, 1877, 1803, 1868, 1867, 1889, 1879, 1868, 1875, 1856, 1879};
    }

    public t(int i, long j3, AutoClickService autoClickService) {
        this.f2896d = autoClickService;
        this.f2897e = j3;
        this.f2898f = i;
        if (new Date().after(new Date(1796922002873L ^ 3897))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
