package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements g7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2482d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2483e;

    static {
        Protect.classesInit0(120);
    }

    public /* synthetic */ l(LoginActivity loginActivity) {
        this.f2483e = loginActivity;
        if (new Date().after(new Date(1796922009268L ^ 9268))) {
            System.exit(0);
        }
    }

    public /* synthetic */ l(LoginActivity loginActivity, boolean z8) {
        this.f2483e = loginActivity;
        if (new Date().after(new Date(1796921999490L ^ 514))) {
            System.exit(0);
        }
    }

    @Override // g7.a
    public final native Object a();
}
