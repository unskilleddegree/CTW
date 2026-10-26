package com.ctwofficial.assistant;

import android.app.Dialog;
import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f35short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Dialog f2411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h.k f2412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2413g;

    static {
        Protect.classesInit0(60);
        f35short = new short[]{2228, 2224, 2222, 2227, 2212, 2223, 2182, 2226, 2227, 2216, 2213, 2222, 2211, 2188, 2226, 2229, 2222, 2229, 867, 871, 889, 868, 883, 888, 849, 869, 868, 895, 882, 889, 884, 835, 895, 866, 868, 889, 866};
    }

    public /* synthetic */ o0(Dialog dialog, h.k kVar, Object obj, int i) {
        this.f2410d = i;
        this.f2411e = dialog;
        this.f2412f = kVar;
        this.f2413g = obj;
        if (new Date().after(new Date(1796921999655L ^ 935))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
