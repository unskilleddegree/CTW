package com.ctwofficial.assistant.proteksi;

import android.content.DialogInterface;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.h f2487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2488c;

    static {
        Protect.classesInit0(122);
    }

    public /* synthetic */ n(h.h hVar, LoginActivity loginActivity, int i) {
        this.f2486a = i;
        this.f2487b = hVar;
        this.f2488c = loginActivity;
        if (new Date().after(new Date(1796922007058L ^ 7314))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final native void onShow(DialogInterface dialogInterface);
}
