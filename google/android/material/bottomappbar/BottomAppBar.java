package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d0.e;
import i2.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n.n3;
import o5.n;
import o5.p;
import o5.t;
import q2.f;
import r0.j0;
import r0.v0;
import r2.o;
import s.i;
import y5.g;
import y5.h;
import y5.j;
import y5.l;
import z4.b;
import z4.d;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements d0.a {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f3095u0 = 0;
    public Integer U;
    public final g V;
    public AnimatorSet W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnimatorSet f3096a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f3097b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f3098c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f3099d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f3100e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f3101f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f3102g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f3103h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f3104i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final boolean f3105j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f3106k0;
    public final boolean l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f3107m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f3108n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Behavior f3109o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3110p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3111q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f3112r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final z4.a f3113s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b f3114t0;

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void J(BottomAppBar bottomAppBar, View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.f3387d = 17;
        int i = bottomAppBar.f3099d0;
        if (i == 1) {
            eVar.f3387d = 49;
        }
        if (i == 0) {
            eVar.f3387d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f3110p0;
    }

    private int getFabAlignmentAnimationDuration() {
        return f.q(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return C(this.f3097b0);
    }

    private float getFabTranslationY() {
        if (this.f3099d0 == 1) {
            return -getTopEdgeTreatment().i;
        }
        View viewA = A();
        return viewA != null ? (-((getMeasuredHeight() + getBottomInset()) - viewA.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f3112r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f3111q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z4.g getTopEdgeTreatment() {
        return (z4.g) this.V.f8611d.f8594a.i;
    }

    public final View A() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((i) coordinatorLayout.f908e.f6717f).get(this);
        ArrayList arrayList = coordinatorLayout.f910g;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int B(ActionMenuView actionMenuView, int i, boolean z8) {
        int dimensionPixelOffset = 0;
        if (this.f3102g0 != 1 && (i != 1 || !z8)) {
            return 0;
        }
        boolean zC = t.c(this);
        int measuredWidth = zC ? getMeasuredWidth() : 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof n3) && (((n3) childAt.getLayoutParams()).f5924a & 8388615) == 8388611) {
                measuredWidth = zC ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zC ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i9 = zC ? this.f3111q0 : -this.f3112r0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zC) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i9) + dimensionPixelOffset);
    }

    public final float C(int i) {
        boolean zC = t.c(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewA = A();
        int i5 = zC ? this.f3112r0 : this.f3111q0;
        return ((getMeasuredWidth() / 2) - ((this.f3101f0 == -1 || viewA == null) ? this.f3100e0 + i5 : ((viewA.getMeasuredWidth() / 2) + this.f3101f0) + i5)) * (zC ? -1 : 1);
    }

    public final boolean D() {
        View viewA = A();
        FloatingActionButton floatingActionButton = viewA instanceof FloatingActionButton ? (FloatingActionButton) viewA : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void E(int i, boolean z8) {
        WeakHashMap weakHashMap = v0.f7028a;
        if (!isLaidOut()) {
            this.f3107m0 = false;
            return;
        }
        AnimatorSet animatorSet = this.f3096a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!D()) {
            i = 0;
            z8 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i5 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - B(actionMenuView, i, z8)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new z4.e(this, actionMenuView, i, z8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f3096a0 = animatorSet3;
        animatorSet3.addListener(new z4.a(this, i5));
        this.f3096a0.start();
    }

    public final void F() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f3096a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (D()) {
            I(actionMenuView, this.f3097b0, this.f3108n0, false);
        } else {
            I(actionMenuView, 0, false, false);
        }
    }

    public final void G() {
        getTopEdgeTreatment().f9197j = getFabTranslationX();
        this.V.k((this.f3108n0 && D() && this.f3099d0 == 1) ? 1.0f : 0.0f);
        View viewA = A();
        if (viewA != null) {
            viewA.setTranslationY(getFabTranslationY());
            viewA.setTranslationX(getFabTranslationX());
        }
    }

    public final void H(int i) {
        float f7 = i;
        if (f7 != getTopEdgeTreatment().f9196h) {
            getTopEdgeTreatment().f9196h = f7;
            this.V.invalidateSelf();
        }
    }

    public final void I(ActionMenuView actionMenuView, int i, boolean z8, boolean z9) {
        o oVar = new o(this, actionMenuView, i, z8);
        if (z9) {
            actionMenuView.post(oVar);
        } else {
            oVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.V.f8611d.f8598e;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().i;
    }

    public int getFabAlignmentMode() {
        return this.f3097b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f3101f0;
    }

    public int getFabAnchorMode() {
        return this.f3099d0;
    }

    public int getFabAnimationMode() {
        return this.f3098c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f9195g;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f9194f;
    }

    public boolean getHideOnScroll() {
        return this.f3104i0;
    }

    public int getMenuAlignmentMode() {
        return this.f3102g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        if (z8) {
            AnimatorSet animatorSet = this.f3096a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.W;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            G();
            View viewA = A();
            if (viewA != null) {
                WeakHashMap weakHashMap = v0.f7028a;
                if (viewA.isLaidOut()) {
                    viewA.post(new o5.o(viewA, 2));
                }
            }
        }
        F();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z4.f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z4.f fVar = (z4.f) parcelable;
        super.onRestoreInstanceState(fVar.f497d);
        this.f3097b0 = fVar.f9192f;
        this.f3108n0 = fVar.f9193g;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        z4.f fVar = new z4.f(super.onSaveInstanceState());
        fVar.f9192f = this.f3097b0;
        fVar.f9193g = this.f3108n0;
        return fVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        j0.a.h(this.V, colorStateList);
    }

    public void setCradleVerticalOffset(float f7) {
        if (f7 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().y(f7);
            this.V.invalidateSelf();
            G();
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        g gVar = this.V;
        gVar.i(f7);
        int iE = gVar.f8611d.f8607o - gVar.e();
        Behavior behavior = getBehavior();
        behavior.f3086k = iE;
        if (behavior.f3085j == 1) {
            setTranslationY(behavior.i + iE);
        }
    }

    public void setFabAlignmentMode(int i) {
        int i5 = 1;
        this.f3107m0 = true;
        E(i, this.f3108n0);
        if (this.f3097b0 != i) {
            WeakHashMap weakHashMap = v0.f7028a;
            if (isLaidOut()) {
                AnimatorSet animatorSet = this.W;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f3098c0 == 1) {
                    View viewA = A();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewA instanceof FloatingActionButton ? (FloatingActionButton) viewA : null, "translationX", C(i));
                    objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    View viewA2 = A();
                    FloatingActionButton floatingActionButton = viewA2 instanceof FloatingActionButton ? (FloatingActionButton) viewA2 : null;
                    if (floatingActionButton != null && !floatingActionButton.h()) {
                        floatingActionButton.g(new d(this, i), true);
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.setInterpolator(f.r(getContext(), R.attr.motionEasingEmphasizedInterpolator, v4.a.f7892a));
                this.W = animatorSet2;
                animatorSet2.addListener(new z4.a(this, i5));
                this.W.start();
            }
        }
        this.f3097b0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f3101f0 != i) {
            this.f3101f0 = i;
            G();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f3099d0 = i;
        G();
        View viewA = A();
        if (viewA != null) {
            J(this, viewA);
            viewA.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f3098c0 = i;
    }

    public void setFabCornerSize(float f7) {
        if (f7 != getTopEdgeTreatment().f9198k) {
            getTopEdgeTreatment().f9198k = f7;
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f7) {
        if (f7 != getFabCradleMargin()) {
            getTopEdgeTreatment().f9195g = f7;
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f7) {
        if (f7 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f9194f = f7;
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z8) {
        this.f3104i0 = z8;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f3102g0 != i) {
            this.f3102g0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                I(actionMenuView, this.f3097b0, D(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            j0.a.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // d0.a
    public Behavior getBehavior() {
        if (this.f3109o0 == null) {
            this.f3109o0 = new Behavior();
        }
        return this.f3109o0;
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Rect f3115m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference f3116n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f3117o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final a f3118p;

        public Behavior() {
            this.f3118p = new a(this);
            this.f3115m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, d0.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3116n = new WeakReference(bottomAppBar);
            int i5 = BottomAppBar.f3095u0;
            View viewA = bottomAppBar.A();
            if (viewA != null) {
                WeakHashMap weakHashMap = v0.f7028a;
                if (!viewA.isLaidOut()) {
                    BottomAppBar.J(bottomAppBar, viewA);
                    this.f3117o = ((ViewGroup.MarginLayoutParams) ((e) viewA.getLayoutParams())).bottomMargin;
                    if (viewA instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewA;
                        if (bottomAppBar.f3099d0 == 0 && bottomAppBar.f3103h0) {
                            j0.s(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c(bottomAppBar.f3113s0);
                        floatingActionButton.d(new z4.a(bottomAppBar, 3));
                        floatingActionButton.e(bottomAppBar.f3114t0);
                    }
                    viewA.addOnLayoutChangeListener(this.f3118p);
                    bottomAppBar.G();
                }
            }
            coordinatorLayout.p(bottomAppBar, i);
            super.l(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, d0.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i5) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i, i5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3118p = new a(this);
            this.f3115m = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        g gVar = new g();
        this.V = gVar;
        int i5 = 0;
        this.f3107m0 = false;
        this.f3108n0 = true;
        this.f3113s0 = new z4.a(this, i5);
        this.f3114t0 = new b(this);
        Context context2 = getContext();
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.f7742e, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListJ = h4.e.j(context2, typedArrayH, 1);
        if (typedArrayH.hasValue(12)) {
            setNavigationIconTint(typedArrayH.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayH.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayH.getDimensionPixelOffset(9, 0);
        this.f3097b0 = typedArrayH.getInt(3, 0);
        this.f3098c0 = typedArrayH.getInt(6, 0);
        this.f3099d0 = typedArrayH.getInt(5, 1);
        this.f3103h0 = typedArrayH.getBoolean(16, true);
        this.f3102g0 = typedArrayH.getInt(11, 0);
        this.f3104i0 = typedArrayH.getBoolean(10, false);
        this.f3105j0 = typedArrayH.getBoolean(13, false);
        this.f3106k0 = typedArrayH.getBoolean(14, false);
        this.l0 = typedArrayH.getBoolean(15, false);
        this.f3101f0 = typedArrayH.getDimensionPixelOffset(4, -1);
        boolean z8 = typedArrayH.getBoolean(0, true);
        typedArrayH.recycle();
        this.f3100e0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        z4.g gVar2 = new z4.g(i5);
        gVar2.f9198k = -1.0f;
        gVar2.f9195g = dimensionPixelOffset;
        gVar2.f9194f = dimensionPixelOffset2;
        gVar2.y(dimensionPixelOffset3);
        gVar2.f9197j = 0.0f;
        j jVar = new j();
        j jVar2 = new j();
        j jVar3 = new j();
        j jVar4 = new j();
        y5.a aVar = new y5.a(0.0f);
        y5.a aVar2 = new y5.a(0.0f);
        y5.a aVar3 = new y5.a(0.0f);
        y5.a aVar4 = new y5.a(0.0f);
        int i9 = 0;
        y5.e eVar = new y5.e(i9);
        y5.e eVar2 = new y5.e(i9);
        y5.e eVar3 = new y5.e(i9);
        l lVar = new l();
        lVar.f8646a = jVar;
        lVar.f8647b = jVar2;
        lVar.f8648c = jVar3;
        lVar.f8649d = jVar4;
        lVar.f8650e = aVar;
        lVar.f8651f = aVar2;
        lVar.f8652g = aVar3;
        lVar.f8653h = aVar4;
        lVar.i = gVar2;
        lVar.f8654j = eVar;
        lVar.f8655k = eVar2;
        lVar.f8656l = eVar3;
        gVar.setShapeAppearanceModel(lVar);
        if (z8) {
            gVar.n(2);
        } else {
            gVar.n(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        gVar.l();
        gVar.h(context2);
        setElevation(dimensionPixelSize);
        j0.a.h(gVar, colorStateListJ);
        WeakHashMap weakHashMap = v0.f7028a;
        setBackground(gVar);
        c cVar = new c(29, this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4.a.f7751o, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.recycle();
        t.b(this, new p(z9, z10, z11, cVar));
    }
}
