package com.ctwofficial.assistant.ui.setting.service;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f134short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2859h;
    public final /* synthetic */ WindowManager.LayoutParams i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FloatingMenuService f2860j;

    static {
        Protect.classesInit0(63);
        f134short = new short[]{1270, 688, 675, 688, 699, 673, 563, 569, 570, 564, 545, 572, 571, 562, 515, 572, 560, 546, 2230, 2216, 2223, 2213, 2222, 2230, 2188, 2208, 2223, 2208, 2214, 2212, 2227};
    }

    public m0(WindowManager.LayoutParams layoutParams, FloatingMenuService floatingMenuService) {
        this.i = layoutParams;
        this.f2860j = floatingMenuService;
        if (new Date().after(new Date(1796922000709L ^ 1989))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final native boolean onTouch(View view, MotionEvent motionEvent);
}
