package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.z;
import b5.a;
import b5.d;
import b5.e;
import b5.f;
import b5.g;
import com.ctwofficial.assistant.R;
import d0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o5.t;
import q5.h;
import r0.j0;
import r0.j1;
import r0.k1;
import r0.n1;
import r0.v0;
import s0.c;
import y5.l;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements q5.b {
    public final boolean A;
    public final l B;
    public boolean C;
    public final g D;
    public final ValueAnimator E;
    public final int F;
    public int G;
    public int H;
    public final float I;
    public int J;
    public final float K;
    public boolean L;
    public boolean M;
    public final boolean N;
    public int O;
    public b1.b P;
    public boolean Q;
    public int R;
    public boolean S;
    public final float T;
    public int U;
    public int V;
    public int W;
    public WeakReference X;
    public WeakReference Y;
    public final ArrayList Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public VelocityTracker f3120a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h f3121b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f3122c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3123d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f3124d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3125e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f3126e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3127f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public HashMap f3128f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3129g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final SparseIntArray f3130g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3131h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e f3132h0;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y5.g f3135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ColorStateList f3136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3148y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3149z;

    public BottomSheetBehavior() {
        this.f3123d = 0;
        this.f3125e = true;
        this.f3137n = -1;
        this.f3138o = -1;
        this.D = new g(this);
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = 4;
        this.T = 0.1f;
        this.Z = new ArrayList();
        this.f3124d0 = -1;
        this.f3130g0 = new SparseIntArray();
        this.f3132h0 = new e(this, 0);
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = v0.f7028a;
        if (j0.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewA = A(viewGroup.getChildAt(i));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static int B(int i, int i5, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i5, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public final int C() {
        if (this.f3125e) {
            return this.G;
        }
        return Math.max(this.F, this.f3144u ? 0 : this.f3149z);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.J;
        }
        if (i == 5) {
            return this.W;
        }
        if (i == 6) {
            return this.H;
        }
        throw new IllegalArgumentException(com.ctwofficial.assistant.ui.setting.service.h.l(i, "Invalid state to get top offset: "));
    }

    public final boolean E() {
        WeakReference weakReference = this.X;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.X.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void F(int i) {
        if (i == -1) {
            if (this.i) {
                return;
            } else {
                this.i = true;
            }
        } else {
            if (!this.i && this.f3131h == i) {
                return;
            }
            this.i = false;
            this.f3131h = Math.max(0, i);
        }
        N();
    }

    public final void G(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(com.ctwofficial.assistant.ui.setting.service.h.q(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.L || i != 5) {
            int i5 = (i == 6 && this.f3125e && D(i) <= this.G) ? 3 : i;
            WeakReference weakReference = this.X;
            if (weakReference == null || weakReference.get() == null) {
                H(i);
                return;
            }
            View view = (View) this.X.get();
            a aVar = new a(this, view, i5);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = v0.f7028a;
                if (view.isAttachedToWindow()) {
                    view.post(aVar);
                    return;
                }
            }
            aVar.run();
        }
    }

    public final void H(int i) {
        if (this.O == i) {
            return;
        }
        this.O = i;
        WeakReference weakReference = this.X;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            M(true);
        } else if (i == 6 || i == 5 || i == 4) {
            M(false);
        }
        L(i, true);
        ArrayList arrayList = this.Z;
        if (arrayList.size() <= 0) {
            K();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean I(View view, float f7) {
        if (this.M) {
            return true;
        }
        if (view.getTop() < this.J) {
            return false;
        }
        return Math.abs(((f7 * this.T) + ((float) view.getTop())) - ((float) this.J)) / ((float) y()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        H(2);
        L(r4, true);
        r2.D.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.D(r4)
            b1.b r1 = r2.P
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.n(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f1593r = r3
            r3 = -1
            r1.f1579c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1577a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f1593r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f1593r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.H(r3)
            r3 = 1
            r2.L(r4, r3)
            b5.g r3 = r2.D
            r3.a(r4)
            return
        L40:
            r2.H(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.J(android.view.View, int, boolean):void");
    }

    public final void K() {
        View view;
        int iA;
        WeakReference weakReference = this.X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.j(view, 524288);
        v0.h(view, 0);
        v0.j(view, 262144);
        v0.h(view, 0);
        v0.j(view, 1048576);
        v0.h(view, 0);
        SparseIntArray sparseIntArray = this.f3130g0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            v0.j(view, i);
            v0.h(view, 0);
            sparseIntArray.delete(0);
        }
        int i5 = 6;
        if (!this.f3125e && this.O != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            z zVar = new z(i5, this);
            ArrayList arrayListE = v0.e(view);
            int i9 = 0;
            while (true) {
                if (i9 >= arrayListE.size()) {
                    int i10 = 0;
                    int i11 = -1;
                    while (true) {
                        int[] iArr = v0.f7031d;
                        if (i10 >= 32 || i11 != -1) {
                            break;
                        }
                        int i12 = iArr[i10];
                        boolean z8 = true;
                        for (int i13 = 0; i13 < arrayListE.size(); i13++) {
                            z8 &= ((c) arrayListE.get(i13)).a() != i12;
                        }
                        if (z8) {
                            i11 = i12;
                        }
                        i10++;
                    }
                    iA = i11;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListE.get(i9)).f7347a).getLabel())) {
                    iA = ((c) arrayListE.get(i9)).a();
                    break;
                }
                i9++;
            }
            if (iA != -1) {
                c cVar = new c(null, iA, string, zVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = v0.c(view);
                r0.b bVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof r0.a ? ((r0.a) accessibilityDelegateC).f6932a : new r0.b(accessibilityDelegateC);
                if (bVar == null) {
                    bVar = new r0.b();
                }
                v0.m(view, bVar);
                v0.j(view, cVar.a());
                v0.e(view).add(cVar);
                v0.h(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.L) {
            int i14 = 5;
            if (this.O != 5) {
                v0.k(view, c.f7344j, new z(i14, this));
            }
        }
        int i15 = this.O;
        int i16 = 4;
        int i17 = 3;
        if (i15 == 3) {
            v0.k(view, c.i, new z(this.f3125e ? 4 : 6, this));
            return;
        }
        if (i15 == 4) {
            v0.k(view, c.f7343h, new z(this.f3125e ? 3 : 6, this));
        } else {
            if (i15 != 6) {
                return;
            }
            v0.k(view, c.i, new z(i16, this));
            v0.k(view, c.f7343h, new z(i17, this));
        }
    }

    public final void L(int i, boolean z8) {
        y5.g gVar;
        if (i == 2) {
            return;
        }
        boolean z9 = this.O == 3 && (this.A || E());
        if (this.C == z9 || (gVar = this.f3135l) == null) {
            return;
        }
        this.C = z9;
        ValueAnimator valueAnimator = this.E;
        if (!z8 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gVar.k(this.C ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gVar.f8611d.i, z9 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void M(boolean z8) {
        WeakReference weakReference = this.X;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                if (this.f3128f0 != null) {
                    return;
                } else {
                    this.f3128f0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.X.get() && z8) {
                    this.f3128f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z8) {
                return;
            }
            this.f3128f0 = null;
        }
    }

    public final void N() {
        View view;
        if (this.X != null) {
            w();
            if (this.O != 4 || (view = (View) this.X.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // q5.b
    public final void a() {
        h hVar = this.f3121b0;
        if (hVar == null) {
            return;
        }
        int i = hVar.f6819d;
        int i5 = hVar.f6818c;
        c.b bVar = hVar.f6821f;
        hVar.f6821f = null;
        if (bVar != null) {
            float f7 = bVar.f1715c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.L) {
                    AnimatorSet animatorSetA = hVar.a();
                    animatorSetA.setDuration(v4.a.c(i5, i, f7));
                    animatorSetA.start();
                    G(4);
                    return;
                }
                b5.b bVar2 = new b5.b(0, this);
                View view = hVar.f6817b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new k1.a(1));
                objectAnimatorOfFloat.setDuration(v4.a.c(i5, i, f7));
                objectAnimatorOfFloat.addListener(new b5.b(8, hVar));
                objectAnimatorOfFloat.addListener(bVar2);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        G(this.L ? 5 : 4);
    }

    @Override // q5.b
    public final void b(c.b bVar) {
        h hVar = this.f3121b0;
        if (hVar == null) {
            return;
        }
        c.b bVar2 = hVar.f6821f;
        hVar.f6821f = bVar;
        if (bVar2 == null) {
            return;
        }
        hVar.b(bVar.f1715c);
    }

    @Override // q5.b
    public final void c(c.b bVar) {
        h hVar = this.f3121b0;
        if (hVar == null) {
            return;
        }
        hVar.f6821f = bVar;
    }

    @Override // q5.b
    public final void d() {
        h hVar = this.f3121b0;
        if (hVar == null) {
            return;
        }
        c.b bVar = hVar.f6821f;
        hVar.f6821f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSetA = hVar.a();
        animatorSetA.setDuration(hVar.f6820e);
        animatorSetA.start();
    }

    @Override // d0.b
    public final void g(d0.e eVar) {
        this.X = null;
        this.P = null;
        this.f3121b0 = null;
    }

    @Override // d0.b
    public final void j() {
        this.X = null;
        this.P = null;
        this.f3121b0 = null;
    }

    @Override // d0.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        b1.b bVar;
        if (!view.isShown() || !this.N) {
            this.Q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3122c0 = -1;
            this.f3124d0 = -1;
            VelocityTracker velocityTracker = this.f3120a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3120a0 = null;
            }
        }
        if (this.f3120a0 == null) {
            this.f3120a0 = VelocityTracker.obtain();
        }
        this.f3120a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x8 = (int) motionEvent.getX();
            this.f3124d0 = (int) motionEvent.getY();
            if (this.O != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.n(view2, x8, this.f3124d0)) {
                    this.f3122c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3126e0 = true;
                }
            }
            this.Q = this.f3122c0 == -1 && !coordinatorLayout.n(view, x8, this.f3124d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3126e0 = false;
            this.f3122c0 = -1;
            if (this.Q) {
                this.Q = false;
                return false;
            }
        }
        if (this.Q || (bVar = this.P) == null || !bVar.o(motionEvent)) {
            WeakReference weakReference2 = this.Y;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.Q || this.O == 1 || coordinatorLayout.n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.P == null || (i = this.f3124d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.P.f1578b) {
                return false;
            }
        }
        return true;
    }

    @Override // d0.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = v0.f7028a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.X == null) {
            this.f3133j = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z8 = (i5 < 29 || this.f3140q || this.i) ? false : true;
            if (this.f3141r || this.f3142s || this.f3143t || this.f3145v || this.f3146w || this.f3147x || z8) {
                t.b(view, new d(this, z8));
            }
            b5.h hVar = new b5.h(view);
            if (i5 >= 30) {
                n1.g(view, hVar);
            } else {
                PathInterpolator pathInterpolator = k1.f6992e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener j1Var = new j1(view, hVar);
                view.setTag(R.id.tag_window_insets_animation_callback, j1Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(j1Var);
                }
            }
            this.X = new WeakReference(view);
            this.f3121b0 = new h(view);
            y5.g gVar = this.f3135l;
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.K;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar.i(fI);
            } else {
                ColorStateList colorStateList = this.f3136m;
                if (colorStateList != null) {
                    j0.q(view, colorStateList);
                }
            }
            K();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.P == null) {
            this.P = new b1.b(coordinatorLayout.getContext(), coordinatorLayout, this.f3132h0);
        }
        int top = view.getTop();
        coordinatorLayout.p(view, i);
        this.V = coordinatorLayout.getWidth();
        this.W = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.U = height;
        int iMin = this.W;
        int i9 = iMin - height;
        int i10 = this.f3149z;
        if (i9 < i10) {
            boolean z9 = this.f3144u;
            int i11 = this.f3138o;
            if (z9) {
                if (i11 != -1) {
                    iMin = Math.min(iMin, i11);
                }
                this.U = iMin;
            } else {
                int iMin2 = iMin - i10;
                if (i11 != -1) {
                    iMin2 = Math.min(iMin2, i11);
                }
                this.U = iMin2;
            }
        }
        this.G = Math.max(0, this.W - this.U);
        this.H = (int) ((1.0f - this.I) * this.W);
        w();
        int i12 = this.O;
        if (i12 == 3) {
            view.offsetTopAndBottom(C());
        } else if (i12 == 6) {
            view.offsetTopAndBottom(this.H);
        } else if (this.L && i12 == 5) {
            view.offsetTopAndBottom(this.W);
        } else if (i12 == 4) {
            view.offsetTopAndBottom(this.J);
        } else if (i12 == 1 || i12 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        L(this.O, false);
        this.Y = new WeakReference(A(view));
        ArrayList arrayList = this.Z;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // d0.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f3137n, marginLayoutParams.width), B(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3138o, marginLayoutParams.height));
        return true;
    }

    @Override // d0.b
    public final boolean n(View view) {
        WeakReference weakReference = this.Y;
        return (weakReference == null || view != weakReference.get() || this.O == 3) ? false : true;
    }

    @Override // d0.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i5, int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i10 = top - i5;
        boolean z8 = this.N;
        if (i5 > 0) {
            if (i10 < C()) {
                int iC = top - C();
                iArr[1] = iC;
                int i11 = -iC;
                WeakHashMap weakHashMap = v0.f7028a;
                view.offsetTopAndBottom(i11);
                H(3);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap2 = v0.f7028a;
                view.offsetTopAndBottom(-i5);
                H(1);
            }
        } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
            int i12 = this.J;
            if (i10 > i12 && !this.L) {
                int i13 = top - i12;
                iArr[1] = i13;
                int i14 = -i13;
                WeakHashMap weakHashMap3 = v0.f7028a;
                view.offsetTopAndBottom(i14);
                H(4);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap4 = v0.f7028a;
                view.offsetTopAndBottom(-i5);
                H(1);
            }
        }
        z(view.getTop());
        this.R = i5;
        this.S = true;
    }

    @Override // d0.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i9, int[] iArr) {
    }

    @Override // d0.b
    public final void r(View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        int i = this.f3123d;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3131h = fVar.f1674g;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3125e = fVar.f1675h;
            }
            if (i == -1 || (i & 4) == 4) {
                this.L = fVar.i;
            }
            if (i == -1 || (i & 8) == 8) {
                this.M = fVar.f1676j;
            }
        }
        int i5 = fVar.f1673f;
        if (i5 == 1 || i5 == 2) {
            this.O = 4;
        } else {
            this.O = i5;
        }
    }

    @Override // d0.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new f(this);
    }

    @Override // d0.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i5) {
        this.R = 0;
        this.S = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // d0.b
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i5;
        float yVelocity;
        int i9 = 3;
        if (view.getTop() == C()) {
            H(3);
            return;
        }
        WeakReference weakReference = this.Y;
        if (weakReference != null && view2 == weakReference.get() && this.S) {
            if (this.R > 0) {
                if (!this.f3125e && view.getTop() > this.H) {
                    i9 = 6;
                }
            } else if (this.L) {
                VelocityTracker velocityTracker = this.f3120a0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f3127f);
                    yVelocity = this.f3120a0.getYVelocity(this.f3122c0);
                }
                if (I(view, yVelocity)) {
                    i9 = 5;
                } else if (this.R == 0) {
                    top2 = view.getTop();
                    if (this.f3125e) {
                        i5 = this.H;
                        if (top2 < i5) {
                            if (top2 >= Math.abs(top2 - this.J)) {
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.J)) {
                            i9 = 4;
                        }
                        i9 = 6;
                    } else if (Math.abs(top2 - this.G) >= Math.abs(top2 - this.J)) {
                        i9 = 4;
                    }
                } else {
                    if (!this.f3125e) {
                        top = view.getTop();
                        if (Math.abs(top - this.H) < Math.abs(top - this.J)) {
                            i9 = 6;
                        }
                    }
                    i9 = 4;
                }
            } else if (this.R == 0) {
                top2 = view.getTop();
                if (this.f3125e) {
                    i5 = this.H;
                    if (top2 < i5) {
                        if (top2 >= Math.abs(top2 - this.J)) {
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.J)) {
                        i9 = 4;
                    }
                    i9 = 6;
                } else if (Math.abs(top2 - this.G) >= Math.abs(top2 - this.J)) {
                    i9 = 4;
                }
            } else {
                if (!this.f3125e) {
                    top = view.getTop();
                    if (Math.abs(top - this.H) < Math.abs(top - this.J)) {
                        i9 = 6;
                    }
                }
                i9 = 4;
            }
            J(view, i9, false);
            this.S = false;
        }
    }

    @Override // d0.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.O;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        b1.b bVar = this.P;
        if (bVar != null && (this.N || i == 1)) {
            bVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3122c0 = -1;
            this.f3124d0 = -1;
            VelocityTracker velocityTracker = this.f3120a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3120a0 = null;
            }
        }
        if (this.f3120a0 == null) {
            this.f3120a0 = VelocityTracker.obtain();
        }
        this.f3120a0.addMovement(motionEvent);
        if (this.P != null && ((this.N || this.O == 1) && actionMasked == 2 && !this.Q)) {
            float fAbs = Math.abs(this.f3124d0 - motionEvent.getY());
            b1.b bVar2 = this.P;
            if (fAbs > bVar2.f1578b) {
                bVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Q;
    }

    public final void w() {
        int iY = y();
        if (this.f3125e) {
            this.J = Math.max(this.W - iY, this.G);
        } else {
            this.J = this.W - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f7;
        float f9 = 0.0f;
        if (this.f3135l != null && (weakReference = this.X) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.X.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float f10 = this.f3135l.f();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || f10 <= 0.0f) {
                        f7 = 0.0f;
                    } else {
                        f7 = radius / f10;
                    }
                } else {
                    f7 = 0.0f;
                }
                y5.g gVar = this.f3135l;
                float fA = gVar.f8611d.f8594a.f8651f.a(gVar.d());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f9 = radius2 / fA;
                    }
                }
                return Math.max(f7, f9);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i;
        if (this.i) {
            return Math.min(Math.max(this.f3133j, this.W - ((this.V * 9) / 16)), this.U) + this.f3148y;
        }
        return (this.f3140q || this.f3141r || (i = this.f3139p) <= 0) ? this.f3131h + this.f3148y : Math.max(this.f3131h, i + this.f3134k);
    }

    public final void z(int i) {
        if (((View) this.X.get()) != null) {
            ArrayList arrayList = this.Z;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.J;
            if (i <= i5 && i5 != C()) {
                C();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i5 = 0;
        this.f3123d = 0;
        this.f3125e = true;
        this.f3137n = -1;
        this.f3138o = -1;
        this.D = new g(this);
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = 4;
        this.T = 0.1f;
        this.Z = new ArrayList();
        this.f3124d0 = -1;
        this.f3130g0 = new SparseIntArray();
        this.f3132h0 = new e(this, i5);
        this.f3134k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.f7744g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3136m = h4.e.j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.B = l.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        l lVar = this.B;
        if (lVar != null) {
            y5.g gVar = new y5.g(lVar);
            this.f3135l = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f3136m;
            if (colorStateList != null) {
                this.f3135l.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3135l.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.E.addUpdateListener(new b5.c(i5, this));
        this.K = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f3137n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f3138o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            F(i);
        } else {
            F(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.L != z8) {
            this.L = z8;
            if (!z8 && this.O == 5) {
                G(4);
            }
            K();
        }
        this.f3140q = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f3125e != z9) {
            this.f3125e = z9;
            if (this.X != null) {
                w();
            }
            H((this.f3125e && this.O == 6) ? 3 : this.O);
            L(this.O, true);
            K();
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f3123d = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f7 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f7 > 0.0f && f7 < 1.0f) {
            this.I = f7;
            if (this.X != null) {
                this.H = (int) ((1.0f - f7) * this.W);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i9 = typedValuePeekValue2.data;
                if (i9 >= 0) {
                    this.F = i9;
                    L(this.O, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.F = dimensionPixelOffset;
                    L(this.O, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3129g = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f3141r = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f3142s = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f3143t = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f3144u = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f3145v = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f3146w = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f3147x = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.A = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f3127f = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
