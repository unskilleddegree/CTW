package com.ctwofficial.assistant;

import android.content.DialogInterface;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f25short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2357f;

    static {
        Protect.classesInit0(171);
        f25short = new short[]{2923, 2928, 2932, 2938, 2929, 2880, 2928, 2925, 2880, 2930, 2942, 2934, 2931, 3180, 3175, 3182, 3195, 3152, 3174, 3179, 2063, 2064, 2060, 2059};
    }

    public /* synthetic */ g(int i, int i5, Object obj) {
        this.f2355d = i5;
        this.f2357f = obj;
        this.f2356e = i;
        if (new Date().after(new Date(1796922009474L ^ 9474))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
