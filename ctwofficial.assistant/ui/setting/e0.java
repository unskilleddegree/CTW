package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SharedSettingsActivity f2601e;

    static {
        Protect.classesInit0(157);
    }

    public /* synthetic */ e0(SharedSettingsActivity sharedSettingsActivity, int i) {
        this.f2600d = i;
        this.f2601e = sharedSettingsActivity;
        if (new Date().after(new Date(1796922008808L ^ 9832))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
