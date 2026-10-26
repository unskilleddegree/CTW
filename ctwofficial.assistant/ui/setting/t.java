package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ManualEnRouteActivity f2953e;

    static {
        Protect.classesInit0(68);
    }

    public /* synthetic */ t(ManualEnRouteActivity manualEnRouteActivity, int i) {
        this.f2952d = i;
        this.f2953e = manualEnRouteActivity;
        if (new Date().after(new Date(1796922002030L ^ 2286))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
