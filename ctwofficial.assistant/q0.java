package com.ctwofficial.assistant;

import android.widget.TextView;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextView f2544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextView f2546g;

    static {
        Protect.classesInit0(30);
    }

    public /* synthetic */ q0(TextView textView, MainActivity mainActivity, TextView textView2, int i) {
        this.f2543d = i;
        this.f2544e = textView;
        this.f2545f = mainActivity;
        this.f2546g = textView2;
        if (new Date().after(new Date(1796922002875L ^ 3899))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
