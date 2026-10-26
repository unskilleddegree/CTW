package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ctwofficial.assistant.R;
import e3.b;
import java.util.WeakHashMap;
import o5.n;
import r0.v0;
import s5.d;
import s5.e;
import s5.k;
import s5.p;
import s5.q;
import s5.r;
import s5.t;
import s5.u;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // s5.d
    public final e a(Context context, AttributeSet attributeSet) {
        u uVar = new u(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        n.b(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = a.f7752p;
        n.c(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        uVar.f7538h = typedArrayObtainStyledAttributes.getInt(0, 1);
        uVar.i = typedArrayObtainStyledAttributes.getInt(1, 0);
        uVar.f7540k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), uVar.f7461a);
        typedArrayObtainStyledAttributes.recycle();
        uVar.a();
        uVar.f7539j = uVar.i == 1;
        return uVar;
    }

    @Override // s5.d
    public final void b(int i) {
        e eVar = this.f7451d;
        if (eVar != null && ((u) eVar).f7538h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((u) this.f7451d).f7538h;
    }

    public int getIndicatorDirection() {
        return ((u) this.f7451d).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((u) this.f7451d).f7540k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        e eVar = this.f7451d;
        u uVar = (u) eVar;
        boolean z9 = true;
        if (((u) eVar).i != 1) {
            WeakHashMap weakHashMap = v0.f7028a;
            if ((getLayoutDirection() != 1 || ((u) eVar).i != 2) && (getLayoutDirection() != 0 || ((u) eVar).i != 3)) {
                z9 = false;
            }
        }
        uVar.f7539j = z9;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i5, int i9, int i10) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i5 - (getPaddingBottom() + getPaddingTop());
        p indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        k progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        e eVar = this.f7451d;
        if (((u) eVar).f7538h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((u) eVar).f7538h = i;
        ((u) eVar).a();
        if (i == 0) {
            p indeterminateDrawable = getIndeterminateDrawable();
            r rVar = new r((u) eVar);
            indeterminateDrawable.f7513p = rVar;
            rVar.f3767d = indeterminateDrawable;
        } else {
            p indeterminateDrawable2 = getIndeterminateDrawable();
            t tVar = new t(getContext(), (u) eVar);
            indeterminateDrawable2.f7513p = tVar;
            tVar.f3767d = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // s5.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((u) this.f7451d).a();
    }

    public void setIndicatorDirection(int i) {
        e eVar = this.f7451d;
        ((u) eVar).i = i;
        u uVar = (u) eVar;
        boolean z8 = true;
        if (i != 1) {
            WeakHashMap weakHashMap = v0.f7028a;
            if ((getLayoutDirection() != 1 || ((u) eVar).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z8 = false;
            }
        }
        uVar.f7539j = z8;
        invalidate();
    }

    @Override // s5.d
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((u) this.f7451d).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        e eVar = this.f7451d;
        if (((u) eVar).f7540k != i) {
            ((u) eVar).f7540k = Math.min(i, ((u) eVar).f7461a);
            ((u) eVar).a();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        b tVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        u uVar = (u) this.f7451d;
        q qVar = new q(uVar);
        qVar.f7515b = 300.0f;
        Context context2 = getContext();
        if (uVar.f7538h == 0) {
            tVar = new r(uVar);
        } else {
            tVar = new t(context2, uVar);
        }
        setIndeterminateDrawable(new p(context2, uVar, qVar, tVar));
        setProgressDrawable(new k(getContext(), uVar, qVar));
    }
}
