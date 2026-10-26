package com.google.android.material.snackbar;

import a6.e;
import a6.g;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import q2.i;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f3280l;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(1, false);
        this.i = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3093j = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3092h = 0;
        this.f3280l = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, d0.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar = this.f3280l;
        eVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                i.o().y((g) eVar.f670e);
            }
        } else if (coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            i.o().w((g) eVar.f670e);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f3280l.getClass();
        return view instanceof a6.i;
    }
}
