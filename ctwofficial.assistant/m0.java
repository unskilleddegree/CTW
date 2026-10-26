package com.ctwofficial.assistant;

import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f32short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f2391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f2392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f2395h;

    static {
        Protect.classesInit0(54);
        f32short = new short[]{1467, 1440, 1444, 1450, 1441, 1424, 1440, 1469, 1424, 1442, 1454, 1446, 1443, 2489, 2484, 2478, 2477, 2481, 2492, 2468, 2434, 2483, 2492, 2480, 2488, 2164, 2154, 2159, 2146, 2170, 2146, 2155, 593, 590, 583, 594, 597, 583, 598, 598, 264, 279, 267, 268};
    }

    public /* synthetic */ m0(TextInputEditText textInputEditText, TextInputEditText textInputEditText2, MainActivity mainActivity, String str, TextInputEditText textInputEditText3) {
        this.f2391d = textInputEditText;
        this.f2392e = textInputEditText2;
        this.f2393f = mainActivity;
        this.f2394g = str;
        this.f2395h = textInputEditText3;
        if (new Date().after(new Date(1796922001061L ^ 1061))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
