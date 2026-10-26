package com.ctwofficial.assistant.ui.setting;

import android.widget.TextView;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextView f2605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SharedSettingsActivity f2606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextView f2607g;

    static {
        Protect.classesInit0(18);
    }

    public /* synthetic */ f0(TextView textView, SharedSettingsActivity sharedSettingsActivity, TextView textView2, int i) {
        this.f2604d = i;
        this.f2605e = textView;
        this.f2606f = sharedSettingsActivity;
        this.f2607g = textView2;
        if (new Date().after(new Date(1796922005854L ^ 7134))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
