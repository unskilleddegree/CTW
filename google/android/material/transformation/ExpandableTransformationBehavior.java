package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import b5.b;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AnimatorSet f3339e;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z8, boolean z9) {
        AnimatorSet animatorSet = this.f3339e;
        boolean z10 = animatorSet != null;
        if (z10) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z8, z10);
        this.f3339e = animatorSetX;
        animatorSetX.addListener(new b(4, this));
        this.f3339e.start();
        if (z9) {
            return;
        }
        this.f3339e.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z8, boolean z9);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
