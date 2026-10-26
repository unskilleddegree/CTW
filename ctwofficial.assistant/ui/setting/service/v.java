package com.ctwofficial.assistant.ui.setting.service;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class v implements View.OnTouchListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f147short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2910h;
    public final /* synthetic */ WindowManager.LayoutParams i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WindowManager f2911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2912k;

    static {
        Protect.classesInit0(40);
        f147short = new short[]{1431, 2352, 2339, 2352, 2363, 2337, 1355, 586, 601, 586, 577, 603};
    }

    public /* synthetic */ v(WindowManager.LayoutParams layoutParams, WindowManager windowManager, AutoClickService autoClickService, int i) {
        this.f2906d = i;
        this.i = layoutParams;
        this.f2911j = windowManager;
        this.f2912k = autoClickService;
        if (new Date().after(new Date(1796922005593L ^ 6873))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final native boolean onTouch(View view, MotionEvent motionEvent);
}
