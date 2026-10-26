package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d0.a;
import d2.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n5.d;
import n5.e;
import n5.f;
import n5.g;
import o5.c;
import o5.n;
import q2.m;
import q2.r;
import r0.v0;
import y5.l;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements a {
    public static final b L = new b(Float.class, "width", 8);
    public static final b M = new b(Float.class, "height", 9);
    public static final b N = new b(Float.class, "paddingStart", 10);
    public static final b O = new b(Float.class, "paddingEnd", 11);
    public final f A;
    public final int B;
    public int C;
    public int D;
    public final ExtendedFloatingActionButtonBehavior E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ColorStateList I;
    public int J;
    public int K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f3194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f3195y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f3196z;

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[LOOP:0: B:37:0x007f->B:38:0x0081, LOOP_END] */
    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        n5.b bVar;
        int i5;
        AnimatorSet animatorSetA;
        ArrayList arrayList;
        int size;
        ViewGroup.LayoutParams layoutParams;
        if (i == 0) {
            bVar = extendedFloatingActionButton.f3196z;
        } else if (i == 1) {
            bVar = extendedFloatingActionButton.A;
        } else if (i == 2) {
            bVar = extendedFloatingActionButton.f3194x;
        } else {
            if (i != 3) {
                throw new IllegalStateException(h.l(i, "Unknown strategy type: "));
            }
            bVar = extendedFloatingActionButton.f3195y;
        }
        if (bVar.h()) {
            return;
        }
        WeakHashMap weakHashMap = v0.f7028a;
        if (extendedFloatingActionButton.isLaidOut()) {
            if (!extendedFloatingActionButton.isInEditMode()) {
                if (i == 2) {
                    layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.J = layoutParams.width;
                        extendedFloatingActionButton.K = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.J = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.K = extendedFloatingActionButton.getHeight();
                    }
                }
                i5 = 0;
                extendedFloatingActionButton.measure(0, 0);
                animatorSetA = bVar.a();
                animatorSetA.addListener(new b5.b(6, bVar));
                arrayList = bVar.f6144c;
                size = arrayList.size();
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    animatorSetA.addListener((Animator.AnimatorListener) obj);
                }
                animatorSetA.start();
                return;
            }
        } else if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.H) {
                if (!extendedFloatingActionButton.isInEditMode()) {
                    if (i == 2) {
                        layoutParams = extendedFloatingActionButton.getLayoutParams();
                        if (layoutParams != null) {
                            extendedFloatingActionButton.J = layoutParams.width;
                            extendedFloatingActionButton.K = layoutParams.height;
                        } else {
                            extendedFloatingActionButton.J = extendedFloatingActionButton.getWidth();
                            extendedFloatingActionButton.K = extendedFloatingActionButton.getHeight();
                        }
                    }
                    i5 = 0;
                    extendedFloatingActionButton.measure(0, 0);
                    animatorSetA = bVar.a();
                    animatorSetA.addListener(new b5.b(6, bVar));
                    arrayList = bVar.f6144c;
                    size = arrayList.size();
                    while (i5 < size) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        animatorSetA.addListener((Animator.AnimatorListener) obj2);
                    }
                    animatorSetA.start();
                    return;
                }
            }
        } else if (extendedFloatingActionButton.H) {
            if (!extendedFloatingActionButton.isInEditMode()) {
                if (i == 2) {
                    layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.J = layoutParams.width;
                        extendedFloatingActionButton.K = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.J = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.K = extendedFloatingActionButton.getHeight();
                    }
                }
                i5 = 0;
                extendedFloatingActionButton.measure(0, 0);
                animatorSetA = bVar.a();
                animatorSetA.addListener(new b5.b(6, bVar));
                arrayList = bVar.f6144c;
                size = arrayList.size();
                while (i5 < size) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    animatorSetA.addListener((Animator.AnimatorListener) obj3);
                }
                animatorSetA.start();
                return;
            }
        }
        bVar.g();
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // d0.a
    public d0.b getBehavior() {
        return this.E;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.B;
        if (i >= 0) {
            return i;
        }
        WeakHashMap weakHashMap = v0.f7028a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public v4.e getExtendMotionSpec() {
        return this.f3195y.f6147f;
    }

    public v4.e getHideMotionSpec() {
        return this.A.f6147f;
    }

    public v4.e getShowMotionSpec() {
        return this.f3196z.f6147f;
    }

    public v4.e getShrinkMotionSpec() {
        return this.f3194x.f6147f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.F = false;
            this.f3194x.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z8) {
        this.H = z8;
    }

    public void setExtendMotionSpec(v4.e eVar) {
        this.f3195y.f6147f = eVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(v4.e.b(getContext(), i));
    }

    public void setExtended(boolean z8) {
        if (this.F == z8) {
            return;
        }
        e eVar = z8 ? this.f3195y : this.f3194x;
        if (eVar.h()) {
            return;
        }
        eVar.g();
    }

    public void setHideMotionSpec(v4.e eVar) {
        this.A.f6147f = eVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(v4.e.b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i5, int i9, int i10) {
        super.setPadding(i, i5, i9, i10);
        if (!this.F || this.G) {
            return;
        }
        WeakHashMap weakHashMap = v0.f7028a;
        this.C = getPaddingStart();
        this.D = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i5, int i9, int i10) {
        super.setPaddingRelative(i, i5, i9, i10);
        if (!this.F || this.G) {
            return;
        }
        this.C = i;
        this.D = i9;
    }

    public void setShowMotionSpec(v4.e eVar) {
        this.f3196z.f6147f = eVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(v4.e.b(getContext(), i));
    }

    public void setShrinkMotionSpec(v4.e eVar) {
        this.f3194x.f6147f = eVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(v4.e.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.I = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends d0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Rect f3197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f3198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f3199f;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3198e = false;
            this.f3199f = true;
        }

        @Override // d0.b
        public final /* bridge */ /* synthetic */ boolean e(View view, Rect rect) {
            return false;
        }

        @Override // d0.b
        public final void g(d0.e eVar) {
            if (eVar.f3391h == 0) {
                eVar.f3391h = 80;
            }
        }

        @Override // d0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof d0.e ? ((d0.e) layoutParams).f3384a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // d0.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListJ = coordinatorLayout.j(extendedFloatingActionButton);
            int size = arrayListJ.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayListJ.get(i5);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof d0.e ? ((d0.e) layoutParams).f3384a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.p(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            d0.e eVar = (d0.e) extendedFloatingActionButton.getLayoutParams();
            boolean z8 = this.f3198e;
            boolean z9 = this.f3199f;
            if ((!z8 && !z9) || eVar.f3389f != appBarLayout.getId()) {
                return false;
            }
            if (this.f3197d == null) {
                this.f3197d = new Rect();
            }
            Rect rect = this.f3197d;
            c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z9 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z9 ? 3 : 0);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            d0.e eVar = (d0.e) extendedFloatingActionButton.getLayoutParams();
            boolean z8 = this.f3198e;
            boolean z9 = this.f3199f;
            if ((!z8 && !z9) || eVar.f3389f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((d0.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z9 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z9 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.a.f7748l);
            this.f3198e = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f3199f = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.f3193w = 0;
        i2.c cVar = new i2.c(7);
        g gVar = new g(this, cVar);
        this.f3196z = gVar;
        f fVar = new f(this, cVar);
        this.A = fVar;
        this.F = true;
        this.G = false;
        this.H = false;
        Context context2 = getContext();
        this.E = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.f7747k, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        v4.e eVarA = v4.e.a(context2, typedArrayH, 5);
        v4.e eVarA2 = v4.e.a(context2, typedArrayH, 4);
        v4.e eVarA3 = v4.e.a(context2, typedArrayH, 2);
        v4.e eVarA4 = v4.e.a(context2, typedArrayH, 6);
        this.B = typedArrayH.getDimensionPixelSize(0, -1);
        int i5 = typedArrayH.getInt(3, 1);
        WeakHashMap weakHashMap = v0.f7028a;
        this.C = getPaddingStart();
        this.D = getPaddingEnd();
        i2.c cVar2 = new i2.c(7);
        n5.h dVar = new d(this, 1);
        r rVar = new r(this, dVar, 9, false);
        e eVar = new e(this, cVar2, i5 != 1 ? i5 != 2 ? new m(this, rVar, dVar, 20, false) : rVar : dVar, true);
        this.f3195y = eVar;
        e eVar2 = new e(this, cVar2, new d(this, 0), false);
        this.f3194x = eVar2;
        gVar.f6147f = eVarA;
        fVar.f6147f = eVarA2;
        eVar.f6147f = eVarA3;
        eVar2.f6147f = eVarA4;
        typedArrayH.recycle();
        setShapeAppearanceModel(l.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, l.f8645m).a());
        this.I = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.I = getTextColors();
    }
}
