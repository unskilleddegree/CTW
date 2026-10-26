package com.ctwofficial.assistant.ui.setting.service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AccessibilityService.GestureResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2888a;

    static {
        Protect.classesInit0(46);
    }

    public r(AutoClickService autoClickService) {
        this.f2888a = autoClickService;
        if (new Date().after(new Date(1796922007965L ^ 8989))) {
            System.exit(0);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final native void onCompleted(GestureDescription gestureDescription);
}
