package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.e;
import com.bumptech.glide.c;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import d0.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.a;
import q5.j;
import q5.k;
import r0.j0;
import r0.v0;
import s0.p;
import y5.g;
import y5.l;
import z5.d;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements q5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f3259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ColorStateList f3260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f3261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5.g f3262h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b1.b f3265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference f3272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f3273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public VelocityTracker f3275v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f3276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3278y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f3279z;

    public SideSheetBehavior() {
        this.f3262h = new b5.g(this);
        this.f3263j = true;
        this.f3264k = 5;
        this.f3267n = 0.1f;
        this.f3274u = -1;
        this.f3278y = new LinkedHashSet();
        this.f3279z = new e(this, 1);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f3272s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.j(view, 262144);
        v0.h(view, 0);
        v0.j(view, 1048576);
        v0.h(view, 0);
        final int i = 5;
        if (this.f3264k != 5) {
            v0.k(view, s0.c.f7344j, new p() { // from class: z5.b
                @Override // s0.p
                public final boolean c(View view2) {
                    this.f9201d.w(i);
                    return true;
                }
            });
        }
        final int i5 = 3;
        if (this.f3264k != 3) {
            v0.k(view, s0.c.f7343h, new p() { // from class: z5.b
                @Override // s0.p
                public final boolean c(View view2) {
                    this.f9201d.w(i5);
                    return true;
                }
            });
        }
    }

    @Override // q5.b
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f3276w;
        if (kVar == null) {
            return;
        }
        c.b bVar = kVar.f6821f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        kVar.f6821f = null;
        int i5 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        c cVar = this.f3258d;
        if (cVar != null && cVar.s() != 0) {
            i5 = 3;
        }
        b5.b bVar2 = new b5.b(12, this);
        WeakReference weakReference = this.f3273t;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iL = this.f3258d.l(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: z5.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9203a.f3258d.L(marginLayoutParams, v4.a.c(iL, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = kVar.f6817b;
        boolean z8 = bVar.f1716d == 0;
        WeakHashMap weakHashMap = v0.f7028a;
        boolean z9 = (Gravity.getAbsoluteGravity(i5, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z9 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f7 = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z9) {
            f7 = -f7;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f7);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new a(1));
        objectAnimatorOfFloat.setDuration(v4.a.c(kVar.f6818c, kVar.f6819d, bVar.f1715c));
        objectAnimatorOfFloat.addListener(new j(kVar, z8, i5));
        objectAnimatorOfFloat.addListener(bVar2);
        objectAnimatorOfFloat.start();
    }

    @Override // q5.b
    public final void b(c.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f3276w;
        if (kVar == null) {
            return;
        }
        c cVar = this.f3258d;
        int i = (cVar == null || cVar.s() == 0) ? 5 : 3;
        c.b bVar2 = kVar.f6821f;
        kVar.f6821f = bVar;
        if (bVar2 != null) {
            kVar.a(bVar.f1715c, bVar.f1716d == 0, i);
        }
        WeakReference weakReference = this.f3272s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f3272s.get();
        WeakReference weakReference2 = this.f3273t;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f3258d.L(marginLayoutParams, (int) ((view.getScaleX() * this.f3268o) + this.f3271r));
        view2.requestLayout();
    }

    @Override // q5.b
    public final void c(c.b bVar) {
        k kVar = this.f3276w;
        if (kVar == null) {
            return;
        }
        kVar.f6821f = bVar;
    }

    @Override // q5.b
    public final void d() {
        k kVar = this.f3276w;
        if (kVar == null) {
            return;
        }
        View view = kVar.f6817b;
        c.b bVar = kVar.f6821f;
        kVar.f6821f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(kVar.f6820e);
        animatorSet.start();
    }

    @Override // d0.b
    public final void g(d0.e eVar) {
        this.f3272s = null;
        this.f3265l = null;
        this.f3276w = null;
    }

    @Override // d0.b
    public final void j() {
        this.f3272s = null;
        this.f3265l = null;
        this.f3276w = null;
    }

    @Override // d0.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b1.b bVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.d(view) == null) || !this.f3263j) {
            this.f3266m = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3275v) != null) {
            velocityTracker.recycle();
            this.f3275v = null;
        }
        if (this.f3275v == null) {
            this.f3275v = VelocityTracker.obtain();
        }
        this.f3275v.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3277x = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f3266m) {
            this.f3266m = false;
            return false;
        }
        return (this.f3266m || (bVar = this.f3265l) == null || !bVar.o(motionEvent)) ? false : true;
    }

    @Override // d0.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i5;
        View viewFindViewById;
        WeakHashMap weakHashMap = v0.f7028a;
        int i9 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f3272s;
        g gVar = this.f3259e;
        int iQ = 0;
        if (weakReference == null) {
            this.f3272s = new WeakReference(view);
            this.f3276w = new k(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.i;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar.i(fI);
            } else {
                ColorStateList colorStateList = this.f3260f;
                if (colorStateList != null) {
                    j0.q(view, colorStateList);
                }
            }
            int i10 = this.f3264k == 5 ? 4 : 0;
            if (view.getVisibility() != i10) {
                view.setVisibility(i10);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (v0.d(view) == null) {
                v0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i11 = Gravity.getAbsoluteGravity(((d0.e) view.getLayoutParams()).f3386c, i) == 3 ? 1 : 0;
        c cVar = this.f3258d;
        if (cVar == null || cVar.s() != i11) {
            d0.e eVar = null;
            l lVar = this.f3261g;
            if (i11 == 0) {
                this.f3258d = new z5.a(this, i9);
                if (lVar != null) {
                    WeakReference weakReference2 = this.f3272s;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof d0.e)) {
                        eVar = (d0.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        y5.k kVarF = lVar.f();
                        kVarF.f8639f = new y5.a(0.0f);
                        kVarF.f8640g = new y5.a(0.0f);
                        l lVarA = kVarF.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(lVarA);
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalArgumentException(h.m(i11, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f3258d = new z5.a(this, iQ);
                if (lVar != null) {
                    WeakReference weakReference3 = this.f3272s;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof d0.e)) {
                        eVar = (d0.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        y5.k kVarF2 = lVar.f();
                        kVarF2.f8638e = new y5.a(0.0f);
                        kVarF2.f8641h = new y5.a(0.0f);
                        l lVarA2 = kVarF2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(lVarA2);
                        }
                    }
                }
            }
        }
        if (this.f3265l == null) {
            this.f3265l = new b1.b(coordinatorLayout.getContext(), coordinatorLayout, this.f3279z);
        }
        int iQ2 = this.f3258d.q(view);
        coordinatorLayout.p(view, i);
        this.f3269p = coordinatorLayout.getWidth();
        this.f3270q = this.f3258d.r(coordinatorLayout);
        this.f3268o = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3271r = marginLayoutParams != null ? this.f3258d.b(marginLayoutParams) : 0;
        int i12 = this.f3264k;
        if (i12 == 1 || i12 == 2) {
            iQ = iQ2 - this.f3258d.q(view);
        } else if (i12 != 3) {
            if (i12 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3264k);
            }
            iQ = this.f3258d.n();
        }
        view.offsetLeftAndRight(iQ);
        if (this.f3273t == null && (i5 = this.f3274u) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i5)) != null) {
            this.f3273t = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f3278y.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // d0.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // d0.b
    public final void r(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f9207f;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f3264k = i;
    }

    @Override // d0.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    public void setCoplanarSiblingView(View view) {
        this.f3274u = -1;
        if (view == null) {
            WeakReference weakReference = this.f3273t;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3273t = null;
            return;
        }
        this.f3273t = new WeakReference(view);
        WeakReference weakReference2 = this.f3272s;
        if (weakReference2 != null) {
            View view2 = (View) weakReference2.get();
            WeakHashMap weakHashMap = v0.f7028a;
            if (view2.isLaidOut()) {
                view2.requestLayout();
            }
        }
    }

    @Override // d0.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3264k == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f3265l.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3275v) != null) {
            velocityTracker.recycle();
            this.f3275v = null;
        }
        if (this.f3275v == null) {
            this.f3275v = VelocityTracker.obtain();
        }
        this.f3275v.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f3266m && y()) {
            float fAbs = Math.abs(this.f3277x - motionEvent.getX());
            b1.b bVar = this.f3265l;
            if (fAbs > bVar.f1578b) {
                bVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3266m;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h.q(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f3272s;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.f3272s.get();
        com.ctwofficial.assistant.j0 j0Var = new com.ctwofficial.assistant.j0(i, 2, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f7028a;
            if (view.isAttachedToWindow()) {
                view.post(j0Var);
                return;
            }
        }
        j0Var.run();
    }

    public final void x(int i) {
        View view;
        if (this.f3264k == i) {
            return;
        }
        this.f3264k = i;
        WeakReference weakReference = this.f3272s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i5 = this.f3264k == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
        Iterator it = this.f3278y.iterator();
        if (it.hasNext()) {
            throw h.j(it);
        }
        A();
    }

    public final boolean y() {
        if (this.f3265l != null) {
            return this.f3263j || this.f3264k == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        x(2);
        r2.f3262h.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            com.bumptech.glide.c r0 = r2.f3258d
            int r0 = r0.n()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.ctwofficial.assistant.ui.setting.service.h.l(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            com.bumptech.glide.c r0 = r2.f3258d
            int r0 = r0.m()
        L1f:
            b1.b r1 = r2.f3265l
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.n(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f1593r = r3
            r3 = -1
            r1.f1579c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f1577a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f1593r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f1593r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.x(r3)
            b5.g r3 = r2.f3262h
            r3.a(r4)
            return
        L57:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3262h = new b5.g(this);
        this.f3263j = true;
        this.f3264k = 5;
        this.f3267n = 0.1f;
        this.f3274u = -1;
        this.f3278y = new LinkedHashSet();
        this.f3279z = new e(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.H);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3260f = h4.e.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f3261g = l.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f3274u = resourceId;
            WeakReference weakReference = this.f3273t;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3273t = null;
            WeakReference weakReference2 = this.f3272s;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        l lVar = this.f3261g;
        if (lVar != null) {
            g gVar = new g(lVar);
            this.f3259e = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f3260f;
            if (colorStateList != null) {
                this.f3259e.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3259e.setTint(typedValue.data);
            }
        }
        this.i = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f3263j = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
