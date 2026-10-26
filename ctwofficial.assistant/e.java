package com.ctwofficial.assistant;

import android.content.DialogInterface;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2339d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ h.k f2340e;

    static {
        Protect.classesInit0(174);
    }

    public /* synthetic */ e() {
        i10 = i;
        enRouteListActivity = kVar;
        if (new Date().after(new Date(1796922009504L ^ 9504))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
