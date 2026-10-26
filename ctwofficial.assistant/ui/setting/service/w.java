package com.ctwofficial.assistant.ui.setting.service;

import android.view.MotionEvent;
import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class w implements View.OnTouchListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f149short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2921h;

    static {
        Protect.classesInit0(52);
        f149short = new short[]{2872, 397, 414, 397, 390, 412};
    }

    public w(AutoClickService autoClickService) {
        this.f2921h = autoClickService;
        if (new Date().after(new Date(1796922007934L ^ 9214))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final native boolean onTouch(View view, MotionEvent motionEvent);
}
