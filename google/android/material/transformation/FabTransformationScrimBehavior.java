package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f6.d;
import java.util.ArrayList;
import v4.f;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f3346g;

    public FabTransformationScrimBehavior() {
        this.f3345f = new f(75L);
        this.f3346g = new f(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, d0.b
    public final boolean f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // d0.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z8, boolean z9) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        f fVar = z8 ? this.f3345f : this.f3346g;
        if (z8) {
            if (!z9) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        fVar.a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        c.E(animatorSet, arrayList);
        animatorSet.addListener(new d(view2, z8));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3345f = new f(75L);
        this.f3346g = new f(0L);
    }
}
