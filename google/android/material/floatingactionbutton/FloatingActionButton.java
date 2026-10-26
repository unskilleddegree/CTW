package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d0.f;
import d8.i;
import h4.e;
import i2.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m5.a;
import m5.b;
import n5.j;
import n5.q;
import n5.s;
import o5.n;
import o5.t;
import o5.u;
import r0.v0;
import v4.h;
import y5.g;
import y5.l;
import y5.w;
import z4.d;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends u implements a, w, d0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f3200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3203h;
    public ColorStateList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f3209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f3210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f3211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f3212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f3213s;

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private q getImpl() {
        if (this.f3213s == null) {
            this.f3213s = new s(this, new c(8, this));
        }
        return this.f3213s;
    }

    public final void c(z4.a aVar) {
        q impl = getImpl();
        if (impl.f6214t == null) {
            impl.f6214t = new ArrayList();
        }
        impl.f6214t.add(aVar);
    }

    public final void d(z4.a aVar) {
        q impl = getImpl();
        if (impl.f6213s == null) {
            impl.f6213s = new ArrayList();
        }
        impl.f6213s.add(aVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(h hVar) {
        q impl = getImpl();
        n5.i iVar = new n5.i(this, hVar);
        if (impl.f6215u == null) {
            impl.f6215u = new ArrayList();
        }
        impl.f6215u.add(iVar);
    }

    public final int f(int i) {
        int i5 = this.f3205k;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(d dVar, boolean z8) {
        q impl = getImpl();
        int i = 0;
        q2.c cVar = dVar == null ? null : new q2.c(this, dVar, 10, 0 == true ? 1 : 0);
        FloatingActionButton floatingActionButton = impl.f6216v;
        FloatingActionButton floatingActionButton2 = impl.f6216v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f6212r == 1) {
                return;
            }
        } else if (impl.f6212r != 2) {
            return;
        }
        Animator animator = impl.f6206l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = v0.f7028a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z8 ? 8 : 4, z8);
            if (cVar != null) {
                ((e) cVar.f6703e).t((FloatingActionButton) cVar.f6704f);
                return;
            }
            return;
        }
        v4.e eVar = impl.f6208n;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, q.F, q.G);
        animatorSetB.addListener(new j(impl, z8, cVar));
        ArrayList arrayList = impl.f6214t;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f3200e;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3201f;
    }

    @Override // d0.a
    public d0.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f6204j;
    }

    public Drawable getContentBackground() {
        return getImpl().f6200e;
    }

    public int getCustomSize() {
        return this.f3205k;
    }

    public int getExpandedComponentIdHint() {
        return this.f3212r.f5705c;
    }

    public v4.e getHideMotionSpec() {
        return getImpl().f6208n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.i;
    }

    public l getShapeAppearanceModel() {
        l lVar = getImpl().f6196a;
        lVar.getClass();
        return lVar;
    }

    public v4.e getShowMotionSpec() {
        return getImpl().f6207m;
    }

    public int getSize() {
        return this.f3204j;
    }

    public int getSizeDimension() {
        return f(this.f3204j);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3202g;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3203h;
    }

    public boolean getUseCompatPadding() {
        return this.f3208n;
    }

    public final boolean h() {
        q impl = getImpl();
        if (impl.f6216v.getVisibility() == 0) {
            if (impl.f6212r != 1) {
                return false;
            }
        } else if (impl.f6212r == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        q impl = getImpl();
        if (impl.f6216v.getVisibility() != 0) {
            if (impl.f6212r != 2) {
                return false;
            }
        } else if (impl.f6212r == 1) {
            return false;
        }
        return true;
    }

    public final void j(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f3209o;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f3202g;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f3203h;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(n.u.c(colorForState, mode));
    }

    public final void l(z4.c cVar, boolean z8) {
        q impl = getImpl();
        int i = 0;
        q2.c cVar2 = cVar == null ? null : new q2.c(this, cVar, 10, 0 == true ? 1 : 0);
        FloatingActionButton floatingActionButton = impl.f6216v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.f6216v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f6212r == 2) {
                return;
            }
        } else if (impl.f6212r != 1) {
            return;
        }
        Animator animator = impl.f6206l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z9 = impl.f6207m == null;
        WeakHashMap weakHashMap = v0.f7028a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z8);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f6210p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (cVar2 != null) {
                ((e) cVar2.f6703e).u();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z9 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z9 ? 0.4f : 0.0f);
            float f7 = z9 ? 0.4f : 0.0f;
            impl.f6210p = f7;
            impl.a(f7, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        v4.e eVar = impl.f6207m;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, q.D, q.E);
        animatorSetB.addListener(new f6.b(impl, z8, cVar2));
        ArrayList arrayList = impl.f6213s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f6216v;
        g gVar = impl.f6197b;
        if (gVar != null) {
            y5.h.b(floatingActionButton, gVar);
        }
        if (impl instanceof s) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.B == null) {
            impl.B = new f(1, impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f6216v.getViewTreeObserver();
        f fVar = impl.B;
        if (fVar != null) {
            viewTreeObserver.removeOnPreDrawListener(fVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i5) {
        int sizeDimension = getSizeDimension();
        this.f3206l = (sizeDimension - this.f3207m) / 2;
        getImpl().r();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i5));
        Rect rect = this.f3209o;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b6.a aVar = (b6.a) parcelable;
        super.onRestoreInstanceState(aVar.f497d);
        Bundle bundle = (Bundle) aVar.f1687f.get("expandableWidgetHelper");
        bundle.getClass();
        b bVar = this.f3212r;
        bVar.getClass();
        bVar.f5704b = bundle.getBoolean("expanded", false);
        bVar.f5705c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f5704b) {
            FloatingActionButton floatingActionButton = bVar.f5703a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        b6.a aVar = new b6.a(parcelableOnSaveInstanceState);
        b bVar = this.f3212r;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f5704b);
        bundle.putInt("expandedComponentIdHint", bVar.f5705c);
        aVar.f1687f.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f3210p;
            rect.set(0, 0, measuredWidth, measuredHeight);
            j(rect);
            s sVar = this.f3213s;
            int i = -(sVar.f6201f ? Math.max((sVar.f6205k - sVar.f6216v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3200e != colorStateList) {
            this.f3200e = colorStateList;
            q impl = getImpl();
            g gVar = impl.f6197b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            n5.c cVar = impl.f6199d;
            if (cVar != null) {
                if (colorStateList != null) {
                    cVar.f6159m = colorStateList.getColorForState(cVar.getState(), cVar.f6159m);
                }
                cVar.f6162p = colorStateList;
                cVar.f6160n = true;
                cVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3201f != mode) {
            this.f3201f = mode;
            g gVar = getImpl().f6197b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f7) {
        q impl = getImpl();
        if (impl.f6203h != f7) {
            impl.f6203h = f7;
            impl.k(f7, impl.i, impl.f6204j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f7) {
        q impl = getImpl();
        if (impl.i != f7) {
            impl.i = f7;
            impl.k(impl.f6203h, f7, impl.f6204j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f7) {
        q impl = getImpl();
        if (impl.f6204j != f7) {
            impl.f6204j = f7;
            impl.k(impl.f6203h, impl.i, f7);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f3205k) {
            this.f3205k = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        g gVar = getImpl().f6197b;
        if (gVar != null) {
            gVar.i(f7);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        if (z8 != getImpl().f6201f) {
            getImpl().f6201f = z8;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f3212r.f5705c = i;
    }

    public void setHideMotionSpec(v4.e eVar) {
        getImpl().f6208n = eVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(v4.e.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            q impl = getImpl();
            float f7 = impl.f6210p;
            impl.f6210p = f7;
            Matrix matrix = impl.A;
            impl.a(f7, matrix);
            impl.f6216v.setImageMatrix(matrix);
            if (this.f3202g != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f3211q.j(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.f3207m = i;
        q impl = getImpl();
        if (impl.f6211q != i) {
            impl.f6211q = i;
            float f7 = impl.f6210p;
            impl.f6210p = f7;
            Matrix matrix = impl.A;
            impl.a(f7, matrix);
            impl.f6216v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        getImpl().l();
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        getImpl().l();
    }

    public void setShadowPaddingEnabled(boolean z8) {
        q impl = getImpl();
        impl.f6202g = z8;
        impl.r();
    }

    @Override // y5.w
    public void setShapeAppearanceModel(l lVar) {
        getImpl().o(lVar);
    }

    public void setShowMotionSpec(v4.e eVar) {
        getImpl().f6207m = eVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(v4.e.b(getContext(), i));
    }

    public void setSize(int i) {
        this.f3205k = 0;
        if (i != this.f3204j) {
            this.f3204j = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3202g != colorStateList) {
            this.f3202g = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3203h != mode) {
            this.f3203h = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationZ(float f7) {
        super.setTranslationZ(f7);
        getImpl().m();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f3208n != z8) {
            this.f3208n = z8;
            getImpl().i();
        }
    }

    @Override // o5.u, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class BaseBehavior<T extends FloatingActionButton> extends d0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Rect f3214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f3215e;

        public BaseBehavior() {
            this.f3215e = true;
        }

        @Override // d0.b
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f3209o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // d0.b
        public final void g(d0.e eVar) {
            if (eVar.f3391h == 0) {
                eVar.f3391h = 80;
            }
        }

        @Override // d0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof d0.e ? ((d0.e) layoutParams).f3384a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // d0.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListJ = coordinatorLayout.j(floatingActionButton);
            int size = arrayListJ.size();
            int i5 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                View view2 = (View) arrayListJ.get(i9);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof d0.e ? ((d0.e) layoutParams).f3384a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.p(floatingActionButton, i);
            Rect rect = floatingActionButton.f3209o;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                d0.e eVar = (d0.e) floatingActionButton.getLayoutParams();
                int i10 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i5 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i5 = -rect.top;
                }
                if (i5 != 0) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    floatingActionButton.offsetTopAndBottom(i5);
                }
                if (i10 != 0) {
                    WeakHashMap weakHashMap2 = v0.f7028a;
                    floatingActionButton.offsetLeftAndRight(i10);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            d0.e eVar = (d0.e) floatingActionButton.getLayoutParams();
            if (!this.f3215e || eVar.f3389f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f3214d == null) {
                this.f3214d = new Rect();
            }
            Rect rect = this.f3214d;
            o5.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            d0.e eVar = (d0.e) floatingActionButton.getLayoutParams();
            if (!this.f3215e || eVar.f3389f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((d0.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.f7750n);
            this.f3215e = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            getImpl().n(this.i);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.f3209o = new Rect();
        this.f3210p = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.f7749m, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f3200e = e.j(context2, typedArrayH, 1);
        this.f3201f = t.d(typedArrayH.getInt(2, -1), null);
        this.i = e.j(context2, typedArrayH, 12);
        this.f3204j = typedArrayH.getInt(7, -1);
        this.f3205k = typedArrayH.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(3, 0);
        float dimension = typedArrayH.getDimension(4, 0.0f);
        float dimension2 = typedArrayH.getDimension(9, 0.0f);
        float dimension3 = typedArrayH.getDimension(11, 0.0f);
        this.f3208n = typedArrayH.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayH.getDimensionPixelSize(10, 0));
        v4.e eVarA = v4.e.a(context2, typedArrayH, 15);
        v4.e eVarA2 = v4.e.a(context2, typedArrayH, 8);
        l lVarA = l.c(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, l.f8645m).a();
        boolean z8 = typedArrayH.getBoolean(5, false);
        setEnabled(typedArrayH.getBoolean(0, true));
        typedArrayH.recycle();
        i iVar = new i(this);
        this.f3211q = iVar;
        iVar.e(attributeSet, i);
        this.f3212r = new b(this);
        getImpl().o(lVarA);
        getImpl().g(this.f3200e, this.f3201f, this.i, dimensionPixelSize);
        getImpl().f6205k = dimensionPixelSize2;
        q impl = getImpl();
        if (impl.f6203h != dimension) {
            impl.f6203h = dimension;
            impl.k(dimension, impl.i, impl.f6204j);
        }
        q impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.k(impl2.f6203h, dimension2, impl2.f6204j);
        }
        q impl3 = getImpl();
        if (impl3.f6204j != dimension3) {
            impl3.f6204j = dimension3;
            impl3.k(impl3.f6203h, impl3.i, dimension3);
        }
        getImpl().f6207m = eVarA;
        getImpl().f6208n = eVarA2;
        getImpl().f6201f = z8;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
