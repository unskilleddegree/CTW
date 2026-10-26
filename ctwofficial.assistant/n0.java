package com.ctwofficial.assistant;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditText f2403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CheckBox f2406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h7.m f2407h;

    static {
        Protect.classesInit0(57);
    }

    public /* synthetic */ n0(EditText editText, MainActivity mainActivity, String str, CheckBox checkBox, h7.m mVar) {
        this.f2403d = editText;
        this.f2404e = mainActivity;
        this.f2405f = str;
        this.f2406g = checkBox;
        this.f2407h = mVar;
        if (new Date().after(new Date(1796922001959L ^ 2215))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
