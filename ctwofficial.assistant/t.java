package com.ctwofficial.assistant;

import android.content.Context;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2564h;

    static {
        Protect.classesInit0(175);
    }

    public /* synthetic */ t(Context context, String str, int i, String str2, String str3) {
        this.f2560d = context;
        this.f2561e = str;
        this.f2562f = i;
        this.f2563g = str2;
        this.f2564h = str3;
        if (new Date().after(new Date(1796922005014L ^ 5270))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
