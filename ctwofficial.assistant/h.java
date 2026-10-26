package com.ctwofficial.assistant;

import android.content.DialogInterface;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2360d;

    static {
        Protect.classesInit0(170);
    }

    public /* synthetic */ h(int i) {
        this.f2360d = i;
        if (new Date().after(new Date(1796921999997L ^ 253))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
