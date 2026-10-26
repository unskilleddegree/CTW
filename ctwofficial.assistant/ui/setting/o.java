package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ManualBlockListActivity f2658e;

    static {
        Protect.classesInit0(71);
    }

    public /* synthetic */ o(ManualBlockListActivity manualBlockListActivity, int i) {
        this.f2657d = i;
        this.f2658e = manualBlockListActivity;
        if (new Date().after(new Date(1796922003757L ^ 5037))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
