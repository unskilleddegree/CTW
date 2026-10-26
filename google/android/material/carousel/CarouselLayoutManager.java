package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;
import c1.d;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import e5.b;
import e5.c;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f3172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f3173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View.OnLayoutChangeListener f3174q;

    public CarouselLayoutManager() {
        d dVar = new d();
        new b();
        this.f3174q = new View.OnLayoutChangeListener() { // from class: e5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i5, int i9, int i10, int i11, int i12, int i13, int i14) {
                if (i == i11 && i5 == i12 && i9 == i13 && i10 == i14) {
                    return;
                }
                view.post(new b0(15, this.f3783a));
            }
        };
        this.f3172o = dVar;
        m0();
        B0(0);
    }

    public final boolean A0() {
        return z0() && C() == 1;
    }

    public final void B0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(h.l(i, "invalid orientation:"));
        }
        b(null);
        c cVar2 = this.f3173p;
        if (cVar2 == null || i != cVar2.f3786a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f3173p = cVar;
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean L() {
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        d dVar = this.f3172o;
        float dimension = dVar.f1807a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dVar.f1807a = dimension;
        float dimension2 = dVar.f1808b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dVar.f1808b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f3174q);
    }

    @Override // androidx.recyclerview.widget.w
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3174q);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    @Override // androidx.recyclerview.widget.w
    public final View T(View view, int i, a0 a0Var, r1.w wVar) {
        byte b9;
        if (v() == 0) {
            return null;
        }
        int i5 = this.f3173p.f3786a;
        if (i == 1) {
            b9 = -1;
        } else if (i == 2) {
            b9 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && i5 == 1) {
                        b9 = 1;
                    } else {
                        b9 = -2147483648;
                    }
                } else if (i5 != 0) {
                    b9 = -2147483648;
                } else if (A0()) {
                    b9 = -1;
                } else {
                    b9 = 1;
                }
            } else if (i5 == 1) {
                b9 = -1;
            } else {
                b9 = -2147483648;
            }
        } else if (i5 != 0) {
            b9 = -2147483648;
        } else if (A0()) {
            b9 = 1;
        } else {
            b9 = -1;
        }
        if (b9 == -2147483648) {
            return null;
        }
        if (b9 == -1) {
            if (w.H(view) == 0) {
                return null;
            }
            int iH = w.H(u(0)) - 1;
            if (iH < 0 || iH >= B()) {
                return u(A0() ? v() - 1 : 0);
            }
            this.f3173p.a();
            throw null;
        }
        if (w.H(view) == B() - 1) {
            return null;
        }
        int iH2 = w.H(u(v() - 1)) + 1;
        if (iH2 < 0 || iH2 >= B()) {
            return u(A0() ? 0 : v() - 1);
        }
        this.f3173p.a();
        throw null;
    }

    @Override // androidx.recyclerview.widget.w
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(w.H(u(0)));
            accessibilityEvent.setToIndex(w.H(u(v() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void Y(int i, int i5) {
        B();
    }

    @Override // androidx.recyclerview.widget.w
    public final void b0(int i, int i5) {
        B();
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean d() {
        return z0();
    }

    @Override // androidx.recyclerview.widget.w
    public final void d0(a0 a0Var, r1.w wVar) {
        if (wVar.b() > 0) {
            if ((z0() ? this.f1261m : this.f1262n) > 0.0f) {
                A0();
                View view = a0Var.j(0, Long.MAX_VALUE).f1121a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(a0Var);
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean e() {
        return !z0();
    }

    @Override // androidx.recyclerview.widget.w
    public final void e0(r1.w wVar) {
        if (v() == 0) {
            return;
        }
        w.H(u(0));
    }

    @Override // androidx.recyclerview.widget.w
    public final int j(r1.w wVar) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(r1.w wVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(r1.w wVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        return false;
    }

    @Override // androidx.recyclerview.widget.w
    public final int m(r1.w wVar) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(r1.w wVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n0(int i, a0 a0Var, r1.w wVar) {
        if (!z0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = a0Var.j(0, Long.MAX_VALUE).f1121a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(r1.w wVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final void o0(int i) {
    }

    @Override // androidx.recyclerview.widget.w
    public final int p0(int i, a0 a0Var, r1.w wVar) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = a0Var.j(0, Long.MAX_VALUE).f1121a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.w
    public final x r() {
        return new x(-2, -2);
    }

    @Override // androidx.recyclerview.widget.w
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (z0()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean z0() {
        return this.f3173p.f3786a == 0;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        new b();
        this.f3174q = new View.OnLayoutChangeListener() { // from class: e5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                if (i9 == i13 && i10 == i14 && i11 == i15 && i12 == i16) {
                    return;
                }
                view.post(new b0(15, this.f3783a));
            }
        };
        this.f3172o = new d();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            B0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
