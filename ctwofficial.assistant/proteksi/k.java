package com.ctwofficial.assistant.proteksi;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f53short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2481b;

    static {
        Protect.classesInit0(121);
        f53short = new short[]{1512, 1507, 1508, 1518, 1507, 1508, 1517, 2836, 2847, 2840, 2834, 2847, 2840, 2833};
    }

    public /* synthetic */ k(LoginActivity loginActivity, int i) {
        this.f2480a = i;
        this.f2481b = loginActivity;
        if (new Date().after(new Date(1796922008810L ^ 9834))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final native void onFocusChange(View view, boolean z8);
}
