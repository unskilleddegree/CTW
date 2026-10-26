package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BlockedListActivity f2628e;

    static {
        Protect.classesInit0(80);
    }

    public /* synthetic */ h(BlockedListActivity blockedListActivity, int i) {
        this.f2627d = i;
        this.f2628e = blockedListActivity;
        if (new Date().after(new Date(1796921999475L ^ 755))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
