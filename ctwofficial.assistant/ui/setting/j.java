package com.ctwofficial.assistant.ui.setting;

import android.content.DialogInterface;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.s f2645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h.k f2646g;

    static {
        Protect.classesInit0(77);
    }

    public /* synthetic */ j(androidx.recyclerview.widget.s sVar, int i, h.k kVar, int i5) {
        this.f2643d = i5;
        this.f2645f = sVar;
        this.f2644e = i;
        this.f2646g = kVar;
        if (new Date().after(new Date(1796922000723L ^ 2003))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
