package com.google.android.material.bottomnavigation;

import a5.b;
import a5.c;
import a5.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ctwofficial.assistant.R;
import o5.n;
import o5.t;
import q2.m;
import r5.l;
import u4.a;
import x3.h;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends l {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // r5.l
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i5) != 1073741824 && suggestedMinimumHeight > 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i5);
    }

    public void setItemHorizontalTranslationEnabled(boolean z8) {
        b bVar = (b) getMenuView();
        if (bVar.O != z8) {
            bVar.setItemHorizontalTranslationEnabled(z8);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i5) {
        super(context, attributeSet, i, i5);
        m mVarI = n.i(getContext(), attributeSet, a.f7743f, i, i5, new int[0]);
        TypedArray typedArray = (TypedArray) mVarI.f6726f;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        mVarI.I();
        t.b(this, new h(3));
    }
}
