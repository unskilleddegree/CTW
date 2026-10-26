package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import d0.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q2.f;
import v4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TimeInterpolator f3083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TimeInterpolator f3084h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f3087l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3080d = new LinkedHashSet();
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3085j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3086k = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // d0.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3081e = f.q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3082f = f.q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3083g = f.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f7895d);
        this.f3084h = f.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f7894c);
        return false;
    }

    @Override // d0.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9, int[] iArr) {
        if (i > 0) {
            slideDown(view);
        } else if (i < 0) {
            slideUp(view);
        }
    }

    public void slideDown(V v3) {
        if (this.f3085j == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f3087l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.f3085j = 1;
        Iterator it = this.f3080d.iterator();
        if (it.hasNext()) {
            throw h.j(it);
        }
        this.f3087l = v3.animate().translationY(this.i + this.f3086k).setInterpolator(this.f3084h).setDuration(this.f3082f).setListener(new b5.b(11, this));
    }

    public void slideUp(V v3) {
        if (this.f3085j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f3087l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.f3085j = 2;
        Iterator it = this.f3080d.iterator();
        if (it.hasNext()) {
            throw h.j(it);
        }
        this.f3087l = v3.animate().translationY(0).setInterpolator(this.f3083g).setDuration(this.f3081e).setListener(new b5.b(11, this));
    }

    @Override // d0.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i5) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
