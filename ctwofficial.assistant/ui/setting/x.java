package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.s f2960f;

    static {
        Protect.classesInit0(66);
    }

    public /* synthetic */ x(androidx.recyclerview.widget.s sVar, int i, int i5) {
        this.f2958d = i5;
        this.f2960f = sVar;
        this.f2959e = i;
        if (new Date().after(new Date(1796922003951L ^ 4975))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
