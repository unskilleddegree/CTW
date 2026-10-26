package com.google.android.material.behavior;

import a6.h;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d0.b;
import java.util.WeakHashMap;
import r0.v0;
import s0.c;
import y4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1.b f3088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f3089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3092h = 2;
    public float i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3093j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f3094k = new a(this);

    @Override // d0.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zN = this.f3090f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zN = coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3090f = zN;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3090f = false;
        }
        if (zN) {
            if (this.f3088d == null) {
                this.f3088d = new b1.b(coordinatorLayout.getContext(), coordinatorLayout, this.f3094k);
            }
            if (!this.f3091g && this.f3088d.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // d0.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = v0.f7028a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            v0.j(view, 1048576);
            v0.h(view, 0);
            if (w(view)) {
                v0.k(view, c.f7344j, new i2.c(23, this));
            }
        }
        return false;
    }

    @Override // d0.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f3088d == null) {
            return false;
        }
        if (this.f3091g && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3088d.i(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
