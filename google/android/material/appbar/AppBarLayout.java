package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import com.google.android.material.appbar.AppBarLayout;
import d0.e;
import g8.l;
import h2.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import r0.c1;
import r0.d2;
import r0.j0;
import r0.n;
import r0.v0;
import s.i;
import w4.f;
import y5.g;
import y5.h;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements d0.a {
    public static final /* synthetic */ int B = 0;
    public Behavior A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3044h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d2 f3045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f3051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f3053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f3054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f3055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f3056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f3057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f3058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f3059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f3060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f3061z;

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class ScrollingViewBehavior extends w4.d {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // d0.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // d0.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            d0.b bVar = ((e) view2.getLayoutParams()).f3384a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f3062m) + this.f8117h) - y(view2);
                WeakHashMap weakHashMap = v0.f7028a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f3049n) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // d0.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                v0.m(coordinatorLayout, null);
            }
        }

        @Override // d0.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z8) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.j(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f8115f;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.d(false, !z8, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.D);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static w4.b b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            w4.b bVar = new w4.b((LinearLayout.LayoutParams) layoutParams);
            bVar.f8106a = 1;
            return bVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            w4.b bVar2 = new w4.b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar2.f8106a = 1;
            return bVar2;
        }
        w4.b bVar3 = new w4.b(layoutParams);
        bVar3.f8106a = 1;
        return bVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w4.b generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        w4.b bVar = new w4.b(context, attributeSet);
        bVar.f8106a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.f7739b);
        bVar.f8106a = typedArrayObtainStyledAttributes.getInt(1, 0);
        bVar.f8107b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new q2.e(14);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            bVar.f8108c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    public final void c() {
        Behavior behavior = this.A;
        d dVarF = (behavior == null || this.f3041e == -1 || this.i != 0) ? null : behavior.F(a1.c.f496e, this);
        this.f3041e = -1;
        this.f3042f = -1;
        this.f3043g = -1;
        if (dVarF != null) {
            Behavior behavior2 = this.A;
            if (behavior2.f3065p != null) {
                return;
            }
            behavior2.f3065p = dVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w4.b;
    }

    public final void d(boolean z8, boolean z9, boolean z10) {
        this.i = (z8 ? 1 : 2) | (z9 ? 4 : 0) | (z10 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3059x == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f3040d);
        this.f3059x.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3059x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z8) {
        if (this.f3046k || this.f3048m == z8) {
            return false;
        }
        this.f3048m = z8;
        refreshDrawableState();
        if (!(getBackground() instanceof g)) {
            return true;
        }
        if (this.f3052q) {
            g(z8 ? 0.0f : 1.0f, z8 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f3049n) {
            return true;
        }
        float f7 = this.f3061z;
        g(z8 ? 0.0f : f7, z8 ? f7 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i;
        if (this.f3051p == null && (i = this.f3050o) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f3050o);
            }
            if (viewFindViewById != null) {
                this.f3051p = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f3051p;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f7, float f9) {
        ValueAnimator valueAnimator = this.f3053r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f9);
        this.f3053r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f3056u);
        this.f3053r.setInterpolator(this.f3057v);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f3054s;
        if (animatorUpdateListener != null) {
            this.f3053r.addUpdateListener(animatorUpdateListener);
        }
        this.f3053r.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w4.b bVar = new w4.b(-1, -2);
        bVar.f8106a = 1;
        return bVar;
    }

    @Override // d0.a
    public d0.b getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f3042f;
        if (i != -1) {
            return i;
        }
        int i5 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                w4.b bVar = (w4.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = bVar.f8106a;
                if ((i9 & 5) != 5) {
                    if (i5 > 0) {
                        break;
                    }
                } else {
                    int i10 = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    if ((i9 & 8) != 0) {
                        WeakHashMap weakHashMap = v0.f7028a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i9 & 2) != 0) {
                            WeakHashMap weakHashMap2 = v0.f7028a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i10 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = v0.f7028a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i5 += iMin;
                    }
                    iMin = minimumHeight + i10;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = v0.f7028a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i5 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i5);
        this.f3042f = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f3043g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                w4.b bVar = (w4.b) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + childAt.getMeasuredHeight();
                int i9 = bVar.f8106a;
                if ((i9 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i9 & 2) != 0) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f3043g = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f3050o;
    }

    public g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g) {
            return (g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = v0.f7028a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.i;
    }

    public Drawable getStatusBarForeground() {
        return this.f3059x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        d2 d2Var = this.f3045j;
        if (d2Var != null) {
            return d2Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f3041e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                w4.b bVar = (w4.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = bVar.f8106a;
                if ((i9 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + minimumHeight;
                if (i5 == 0) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i9 & 2) != 0) {
                    WeakHashMap weakHashMap2 = v0.f7028a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f3041e = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f3058w == null) {
            this.f3058w = new int[4];
        }
        int[] iArr = this.f3058w;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z8 = this.f3047l;
        int i5 = R.attr.state_liftable;
        if (!z8) {
            i5 = -R.attr.state_liftable;
        }
        iArr[0] = i5;
        int i9 = R.attr.state_lifted;
        if (!z8 || !this.f3048m) {
            i9 = -R.attr.state_lifted;
        }
        iArr[1] = i9;
        int i10 = R.attr.state_collapsible;
        if (!z8) {
            i10 = -R.attr.state_collapsible;
        }
        iArr[2] = i10;
        int i11 = R.attr.state_collapsed;
        if (!z8 || !this.f3048m) {
            i11 = -R.attr.state_collapsed;
        }
        iArr[3] = i11;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f3051p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3051p = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        WeakHashMap weakHashMap = v0.f7028a;
        boolean z9 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f3044h = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            if (((w4.b) getChildAt(i11).getLayoutParams()).f8108c != null) {
                this.f3044h = true;
                break;
            }
        }
        Drawable drawable = this.f3059x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f3046k) {
            return;
        }
        if (!this.f3049n) {
            int childCount3 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount3) {
                    z9 = false;
                    break;
                }
                int i13 = ((w4.b) getChildAt(i12).getLayoutParams()).f8106a;
                if ((i13 & 1) == 1 && (i13 & 10) != 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (this.f3047l != z9) {
            this.f3047l = z9;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = v0.f7028a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = p4.c.h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i5));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f7);
        }
    }

    public void setExpanded(boolean z8) {
        WeakHashMap weakHashMap = v0.f7028a;
        d(z8, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z8) {
        this.f3049n = z8;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f3050o = -1;
        if (view != null) {
            this.f3051p = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f3051p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3051p = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f3050o = i;
        WeakReference weakReference = this.f3051p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3051p = null;
    }

    public void setLiftableOverrideEnabled(boolean z8) {
        this.f3046k = z8;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f3059x;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3059x = drawableMutate;
            if (drawableMutate instanceof g) {
                numValueOf = Integer.valueOf(((g) drawableMutate).f8630x);
            } else {
                ColorStateList colorStateListA = c2.a.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.f3060y = numValueOf;
            Drawable drawable3 = this.f3059x;
            boolean z8 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3059x.setState(getDrawableState());
                }
                Drawable drawable4 = this.f3059x;
                WeakHashMap weakHashMap = v0.f7028a;
                j0.b.b(drawable4, getLayoutDirection());
                this.f3059x.setVisible(getVisibility() == 0, false);
                this.f3059x.setCallback(this);
            }
            if (this.f3059x != null && getTopInset() > 0) {
                z8 = true;
            }
            setWillNotDraw(!z8);
            v0.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(l.h(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f7) {
        w4.g.a(this, f7);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z8 = i == 0;
        Drawable drawable = this.f3059x;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3059x;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class BaseBehavior<T extends AppBarLayout> extends w4.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f3062m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f3063n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ValueAnimator f3064o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public d f3065p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public WeakReference f3066q;

        public BaseBehavior() {
            this.i = -1;
            this.f8113k = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((e) childAt.getLayoutParams()).f3384a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof n) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i5, boolean z8) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i9);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (childAt != null) {
                int i10 = ((w4.b) childAt.getLayoutParams()).f8106a;
                if ((i10 & 1) != 0) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zF = true;
                    if (i5 <= 0 || (i10 & 12) == 0 ? (i10 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.f3049n) {
                zF = appBarLayout.f(D(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z8) {
                if (zE) {
                    List list = (List) ((i) coordinatorLayout.f908e.f6717f).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f910g;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        d0.b bVar = ((e) ((View) arrayList.get(i11)).getLayoutParams()).f3384a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).i == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(y() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            if (iY == i) {
                ValueAnimator valueAnimator = this.f3064o;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f3064o.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f3064o;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f3064o = valueAnimator3;
                valueAnimator3.setInterpolator(v4.a.f7896e);
                this.f3064o.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f3064o.setDuration(Math.min(iRound, 600));
            this.f3064o.setIntValues(iY, i);
            this.f3064o.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i5;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i9 = i5;
                int i10 = downNestedPreScrollRange;
                if (i9 != i10) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i, i9, i10);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f3049n) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = a1.c.f496e;
                    }
                    d dVar = new d(parcelable);
                    boolean z8 = iW == 0;
                    dVar.f3077g = z8;
                    dVar.f3076f = !z8 && (-iW) >= appBarLayout.getTotalScrollRange();
                    dVar.f3078h = i;
                    WeakHashMap weakHashMap = v0.f7028a;
                    dVar.f3079j = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.i = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                w4.b bVar = (w4.b) childAt.getLayoutParams();
                if ((bVar.f8106a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) bVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) bVar).bottomMargin;
                }
                int i5 = -iY;
                if (top <= i5 && bottom >= i5) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                w4.b bVar2 = (w4.b) childAt2.getLayoutParams();
                int i9 = bVar2.f8106a;
                if ((i9 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = v0.f7028a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i9 & 2) == 2) {
                        WeakHashMap weakHashMap2 = v0.f7028a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i9 & 5) == 5) {
                        WeakHashMap weakHashMap3 = v0.f7028a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i9 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) bVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) bVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, p4.c.h(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // w4.e, d0.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f3065p;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z8 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i5 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z8) {
                            C(coordinatorLayout, appBarLayout, i5);
                        } else {
                            A(coordinatorLayout, appBarLayout, i5);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z8) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f3076f) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f3077g) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f3078h);
                int i9 = -childAt.getBottom();
                if (this.f3065p.f3079j) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i9;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f3065p.i) + i9;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.i = 0;
            this.f3065p = null;
            int iH = p4.c.h(w(), -appBarLayout.getTotalScrollRange(), 0);
            f fVar = this.f8118d;
            if (fVar == null) {
                this.f8119e = iH;
            } else if (fVar.f8123d != iH) {
                fVar.f8123d = iH;
                fVar.a();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f3040d = w();
            if (!appBarLayout.willNotDraw()) {
                v0.postInvalidateOnAnimation(appBarLayout);
            }
            if (v0.c(coordinatorLayout) != null) {
                return true;
            }
            v0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // d0.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.q(appBarLayout, i, i5, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // d0.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i5, int[] iArr, int i9) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i5, iArr);
        }

        @Override // d0.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i9 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i9, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i9 == 0 && v0.c(coordinatorLayout2) == null) {
                v0.m(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // d0.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f3065p = (d) parcelable;
            } else {
                this.f3065p = null;
            }
        }

        @Override // d0.b
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarF = F(absSavedState, (AppBarLayout) view);
            return dVarF == null ? absSavedState : dVarF;
        }

        @Override // d0.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i5) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z8 = (i & 2) != 0 && (appBarLayout.f3049n || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z8 && (valueAnimator = this.f3064o) != null) {
                valueAnimator.cancel();
            }
            this.f3066q = null;
            this.f3063n = i5;
            return z8;
        }

        @Override // d0.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f3063n == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f3049n) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f3066q = new WeakReference(view2);
        }

        @Override // w4.c
        public final int y() {
            return w() + this.f3062m;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00af  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:62:0x015e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0163  */
        /* JADX WARN: Code duplicated, block: B:65:0x0165  */
        @Override // w4.c
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9) {
            int top;
            boolean z8;
            int i10;
            int i11;
            q2.e eVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iY = y();
            int i12 = 0;
            if (i5 == 0 || iY < i5 || iY > i9) {
                this.f3062m = 0;
            } else {
                int iH = p4.c.h(i, i5, i9);
                if (iY != iH) {
                    if (!appBarLayout.f3044h) {
                        top = iH;
                        break;
                    }
                    int iAbs = Math.abs(iH);
                    int childCount = appBarLayout.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 < childCount) {
                            View childAt = appBarLayout.getChildAt(i13);
                            w4.b bVar = (w4.b) childAt.getLayoutParams();
                            Interpolator interpolator = bVar.f8108c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i14 = bVar.f8106a;
                                    if ((i14 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                                        if ((i14 & 2) != 0) {
                                            WeakHashMap weakHashMap = v0.f7028a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = v0.f7028a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f7 = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f7) * f7)) * Integer.signum(iH);
                                        break;
                                    }
                                }
                            } else {
                                i13++;
                            }
                        }
                        top = iH;
                        break;
                    }
                    f fVar = this.f8118d;
                    int i15 = 1;
                    if (fVar != null) {
                        if (fVar.f8123d != top) {
                            fVar.f8123d = top;
                            fVar.a();
                            z8 = true;
                        }
                        int i16 = iY - iH;
                        this.f3062m = iH - top;
                        if (z8) {
                            i11 = 0;
                            while (i11 < appBarLayout.getChildCount()) {
                                w4.b bVar2 = (w4.b) appBarLayout.getChildAt(i11).getLayoutParams();
                                eVar = bVar2.f8107b;
                                if (eVar == null && (bVar2.f8106a & i15) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i11);
                                    float fW = w();
                                    Rect rect = (Rect) eVar.f6709f;
                                    Rect rect2 = (Rect) eVar.f6708e;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fW);
                                    if (fAbs <= 0.0f) {
                                        float fG = 1.0f - p4.c.g(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fG * fG)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect.height()) {
                                            childAt2.setVisibility(4);
                                        } else {
                                            childAt2.setVisibility(0);
                                        }
                                        WeakHashMap weakHashMap3 = v0.f7028a;
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        WeakHashMap weakHashMap4 = v0.f7028a;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setVisibility(0);
                                    }
                                }
                                i11++;
                                i15 = 1;
                            }
                        }
                        if (!z8 && appBarLayout.f3044h) {
                            coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                        }
                        appBarLayout.f3040d = w();
                        if (!appBarLayout.willNotDraw()) {
                            v0.postInvalidateOnAnimation(appBarLayout);
                        }
                        if (iH < iY) {
                            i10 = -1;
                        } else {
                            i10 = 1;
                        }
                        H(coordinatorLayout, appBarLayout, iH, i10, false);
                        i12 = i16;
                    } else {
                        this.f8119e = top;
                    }
                    z8 = false;
                    int i17 = iY - iH;
                    this.f3062m = iH - top;
                    if (z8) {
                        i11 = 0;
                        while (i11 < appBarLayout.getChildCount()) {
                            w4.b bVar3 = (w4.b) appBarLayout.getChildAt(i11).getLayoutParams();
                            eVar = bVar3.f8107b;
                            if (eVar == null) {
                            }
                            i11++;
                            i15 = 1;
                        }
                    }
                    if (!z8) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.f3040d = w();
                    if (!appBarLayout.willNotDraw()) {
                        v0.postInvalidateOnAnimation(appBarLayout);
                    }
                    if (iH < iY) {
                        i10 = -1;
                    } else {
                        i10 = 1;
                    }
                    H(coordinatorLayout, appBarLayout, iH, i10, false);
                    i12 = i17;
                }
            }
            if (v0.c(coordinatorLayout) != null) {
                return i12;
            }
            v0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i12;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.i = -1;
            this.f8113k = -1;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        Integer numValueOf;
        int iA;
        super(e6.a.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.f3041e = -1;
        this.f3042f = -1;
        this.f3043g = -1;
        this.i = 0;
        this.f3055t = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i5 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayH = o5.n.h(context3, attributeSet, w4.g.f8124a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayH.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayH.getResourceId(0, 0)));
            }
            typedArrayH.recycle();
            TypedArray typedArrayH2 = o5.n.h(context2, attributeSet, u4.a.f7738a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayH2.getDrawable(0);
            WeakHashMap weakHashMap = v0.f7028a;
            setBackground(drawable);
            final ColorStateList colorStateListJ = h4.e.j(context2, typedArrayH2, 6);
            this.f3052q = colorStateListJ != null;
            final ColorStateList colorStateListA = c2.a.a(getBackground());
            if (colorStateListA != null) {
                final g gVar = new g();
                gVar.j(colorStateListA);
                if (colorStateListJ != null) {
                    Context context4 = getContext();
                    TypedValue typedValueP = v.p(context4, R.attr.colorSurface);
                    if (typedValueP != null) {
                        int i9 = typedValueP.resourceId;
                        if (i9 != 0) {
                            iA = g0.b.a(context4, i9);
                        } else {
                            iA = typedValueP.data;
                        }
                        numValueOf = Integer.valueOf(iA);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f3054s = new ValueAnimator.AnimatorUpdateListener() { // from class: w4.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout = this.f8101a;
                            ArrayList arrayList = appBarLayout.f3055t;
                            int iQ = g6.b.q(colorStateListA.getDefaultColor(), colorStateListJ.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iQ);
                            y5.g gVar2 = gVar;
                            gVar2.j(colorStateListValueOf);
                            if (appBarLayout.f3059x != null && (num2 = appBarLayout.f3060y) != null && num2.equals(num)) {
                                j0.a.g(appBarLayout.f3059x, iQ);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                if (gVar2.f8611d.f8596c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(gVar);
                } else {
                    gVar.h(context2);
                    this.f3054s = new c1(this, 1, gVar);
                    setBackground(gVar);
                }
            }
            this.f3056u = q2.f.q(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f3057v = q2.f.r(context2, R.attr.motionEasingStandardInterpolator, v4.a.f7892a);
            if (typedArrayH2.hasValue(4)) {
                d(typedArrayH2.getBoolean(4, false), false, false);
            }
            if (typedArrayH2.hasValue(3)) {
                w4.g.a(this, typedArrayH2.getDimensionPixelSize(3, 0));
            }
            if (i5 >= 26) {
                if (typedArrayH2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayH2.getBoolean(2, false));
                }
                if (typedArrayH2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayH2.getBoolean(1, false));
                }
            }
            this.f3061z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f3049n = typedArrayH2.getBoolean(5, false);
            this.f3050o = typedArrayH2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayH2.getDrawable(8));
            typedArrayH2.recycle();
            j0.u(this, new i2.c(20, this));
        } catch (Throwable th) {
            typedArrayH.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        w4.b bVar = new w4.b(-1, -2);
        bVar.f8106a = 1;
        return bVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
