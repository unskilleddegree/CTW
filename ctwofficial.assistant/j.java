package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f2364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f2365e;

    static {
        Protect.classesInit0(168);
    }

    public /* synthetic */ j(m mVar, n nVar) {
        this.f2364d = mVar;
        this.f2365e = nVar;
        if (new Date().after(new Date(1796922003425L ^ 3425))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final native boolean onLongClick(View view);
}
