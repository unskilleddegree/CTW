package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ctwofficial.assistant.R;
import e2.o;
import o5.n;
import s5.d;
import s5.e;
import s5.f;
import s5.h;
import s5.i;
import s5.k;
import s5.p;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // s5.d
    public final e a(Context context, AttributeSet attributeSet) {
        i iVar = new i(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        n.b(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = a.f7746j;
        n.c(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        iVar.f7487h = Math.max(h4.e.m(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), iVar.f7461a * 2);
        iVar.i = h4.e.m(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        iVar.f7488j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        iVar.a();
        return iVar;
    }

    public int getIndicatorDirection() {
        return ((i) this.f7451d).f7488j;
    }

    public int getIndicatorInset() {
        return ((i) this.f7451d).i;
    }

    public int getIndicatorSize() {
        return ((i) this.f7451d).f7487h;
    }

    public void setIndicatorDirection(int i) {
        ((i) this.f7451d).f7488j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        e eVar = this.f7451d;
        if (((i) eVar).i != i) {
            ((i) eVar).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        e eVar = this.f7451d;
        if (((i) eVar).f7487h != iMax) {
            ((i) eVar).f7487h = iMax;
            ((i) eVar).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // s5.d
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((i) this.f7451d).a();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        i iVar = (i) this.f7451d;
        f fVar = new f(iVar);
        Context context2 = getContext();
        p pVar = new p(context2, iVar, fVar, new h(iVar));
        Resources resources = context2.getResources();
        e2.p pVar2 = new e2.p();
        ThreadLocal threadLocal = h0.n.f4489a;
        pVar2.f3706d = h0.i.a(resources, R.drawable.indeterminate_static, null);
        new o(pVar2.f3706d.getConstantState());
        pVar.f7514q = pVar2;
        setIndeterminateDrawable(pVar);
        setProgressDrawable(new k(getContext(), iVar, fVar));
    }
}
