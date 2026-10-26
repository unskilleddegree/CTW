package com.ctwofficial.assistant.ui.setting;

import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f100short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f2660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h.k f2661f;

    static {
        Protect.classesInit0(70);
        f100short = new short[]{1485, 1480, 1485, 1500, 1496, 1481, 1502, 1038, 1034, 1072, 1045, 1039, 1032};
    }

    public /* synthetic */ p(TextInputEditText textInputEditText, h.k kVar, int i) {
        this.f2659d = i;
        this.f2660e = textInputEditText;
        this.f2661f = kVar;
        if (new Date().after(new Date(1796922000267L ^ 267))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
