package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import d5.c;
import g6.b;
import h2.v;
import h4.e;
import j0.a;
import o5.n;
import y5.f;
import y5.g;
import y5.h;
import y5.k;
import y5.l;
import y5.w;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f3165o = {R.attr.state_checkable};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f3166p = {R.attr.state_checked};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f3167q = {com.ctwofficial.assistant.R.attr.state_dragged};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f3168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3171n;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f3168k.f3629c.getBounds());
        return rectF;
    }

    public final void f() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f3168k).f3640o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cVar.f3640o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cVar.f3640o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f3168k.f3629c.f8611d.f8596c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f3168k.f3630d.f8611d.f8596c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f3168k.f3635j;
    }

    public int getCheckedIconGravity() {
        return this.f3168k.f3633g;
    }

    public int getCheckedIconMargin() {
        return this.f3168k.f3631e;
    }

    public int getCheckedIconSize() {
        return this.f3168k.f3632f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f3168k.f3637l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f3168k.f3628b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f3168k.f3628b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f3168k.f3628b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f3168k.f3628b.top;
    }

    public float getProgress() {
        return this.f3168k.f3629c.f8611d.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f3168k.f3629c.f();
    }

    public ColorStateList getRippleColor() {
        return this.f3168k.f3636k;
    }

    public l getShapeAppearanceModel() {
        return this.f3168k.f3638m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f3168k.f3639n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f3168k.f3639n;
    }

    public int getStrokeWidth() {
        return this.f3168k.f3634h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3170m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f3168k;
        cVar.k();
        h.b(this, cVar.f3629c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        c cVar = this.f3168k;
        if (cVar != null && cVar.f3644s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3165o);
        }
        if (this.f3170m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3166p);
        }
        if (this.f3171n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3167q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f3170m);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f3168k;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f3644s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f3170m);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        this.f3168k.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f3169l) {
            c cVar = this.f3168k;
            if (!cVar.f3643r) {
                cVar.f3643r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f3168k.f3629c.j(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f7) {
        super.setCardElevation(f7);
        c cVar = this.f3168k;
        cVar.f3629c.i(cVar.f3627a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f3168k.f3630d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.j(colorStateList);
    }

    public void setCheckable(boolean z8) {
        this.f3168k.f3644s = z8;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f3170m != z8) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f3168k.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        c cVar = this.f3168k;
        if (cVar.f3633g != i) {
            cVar.f3633g = i;
            MaterialCardView materialCardView = cVar.f3627a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f3168k.f3631e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f3168k.f3631e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f3168k.g(g8.l.h(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f3168k.f3632f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f3168k.f3632f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f3168k;
        cVar.f3637l = colorStateList;
        Drawable drawable = cVar.f3635j;
        if (drawable != null) {
            a.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z8) {
        super.setClickable(z8);
        c cVar = this.f3168k;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z8) {
        if (this.f3171n != z8) {
            this.f3171n = z8;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f7) {
        super.setMaxCardElevation(f7);
        this.f3168k.m();
    }

    public void setOnCheckedChangeListener(d5.a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z8) {
        super.setPreventCornerOverlap(z8);
        c cVar = this.f3168k;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f7) {
        c cVar = this.f3168k;
        cVar.f3629c.k(f7);
        g gVar = cVar.f3630d;
        if (gVar != null) {
            gVar.k(f7);
        }
        g gVar2 = cVar.f3642q;
        if (gVar2 != null) {
            gVar2.k(f7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0051  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f7) {
        super.setRadius(f7);
        c cVar = this.f3168k;
        k kVarF = cVar.f3638m.f();
        kVarF.f8638e = new y5.a(f7);
        kVarF.f8639f = new y5.a(f7);
        kVarF.f8640g = new y5.a(f7);
        kVarF.f8641h = new y5.a(f7);
        cVar.h(kVarF.a());
        cVar.i.invalidateSelf();
        if (cVar.i()) {
            cVar.l();
        } else if (cVar.f3627a.getPreventCornerOverlap()) {
            g gVar = cVar.f3629c;
            if (!gVar.f8611d.f8594a.e(gVar.d())) {
                cVar.l();
            }
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f3168k;
        cVar.f3636k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f3640o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM = v.m(getContext(), i);
        c cVar = this.f3168k;
        cVar.f3636k = colorStateListM;
        RippleDrawable rippleDrawable = cVar.f3640o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM);
        }
    }

    @Override // y5.w
    public void setShapeAppearanceModel(l lVar) {
        setClipToOutline(lVar.e(getBoundsAsRectF()));
        this.f3168k.h(lVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        c cVar = this.f3168k;
        if (i != cVar.f3634h) {
            cVar.f3634h = i;
            g gVar = cVar.f3630d;
            ColorStateList colorStateList = cVar.f3639n;
            gVar.f8611d.f8602j = i;
            gVar.invalidateSelf();
            f fVar = gVar.f8611d;
            if (fVar.f8597d != colorStateList) {
                fVar.f8597d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z8) {
        super.setUseCompatPadding(z8);
        c cVar = this.f3168k;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f3168k;
        if (cVar != null && cVar.f3644s && isEnabled()) {
            this.f3170m = !this.f3170m;
            refreshDrawableState();
            f();
            cVar.f(this.f3170m, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ctwofficial.assistant.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f3168k;
        if (cVar.f3639n != colorStateList) {
            cVar.f3639n = colorStateList;
            g gVar = cVar.f3630d;
            gVar.f8611d.f8602j = cVar.f3634h;
            gVar.invalidateSelf();
            f fVar = gVar.f8611d;
            if (fVar.f8597d != colorStateList) {
                fVar.f8597d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        Drawable drawableH;
        super(e6.a.a(context, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.f3170m = false;
        this.f3171n = false;
        this.f3169l = true;
        TypedArray typedArrayH = n.h(getContext(), attributeSet, u4.a.f7757u, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet, i);
        this.f3168k = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = cVar.f3629c;
        gVar.j(cardBackgroundColor);
        cVar.f3628b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f3627a;
        ColorStateList colorStateListJ = e.j(materialCardView.getContext(), typedArrayH, 11);
        cVar.f3639n = colorStateListJ;
        if (colorStateListJ == null) {
            cVar.f3639n = ColorStateList.valueOf(-1);
        }
        cVar.f3634h = typedArrayH.getDimensionPixelSize(12, 0);
        boolean z8 = typedArrayH.getBoolean(0, false);
        cVar.f3644s = z8;
        materialCardView.setLongClickable(z8);
        cVar.f3637l = e.j(materialCardView.getContext(), typedArrayH, 6);
        cVar.g((!typedArrayH.hasValue(2) || (resourceId = typedArrayH.getResourceId(2, 0)) == 0 || (drawableH = g8.l.h(materialCardView.getContext(), resourceId)) == null) ? typedArrayH.getDrawable(2) : drawableH);
        cVar.f3632f = typedArrayH.getDimensionPixelSize(5, 0);
        cVar.f3631e = typedArrayH.getDimensionPixelSize(4, 0);
        cVar.f3633g = typedArrayH.getInteger(3, 8388661);
        ColorStateList colorStateListJ2 = e.j(materialCardView.getContext(), typedArrayH, 7);
        cVar.f3636k = colorStateListJ2;
        if (colorStateListJ2 == null) {
            cVar.f3636k = ColorStateList.valueOf(b.j(materialCardView, com.ctwofficial.assistant.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListJ3 = e.j(materialCardView.getContext(), typedArrayH, 1);
        colorStateListJ3 = colorStateListJ3 == null ? ColorStateList.valueOf(0) : colorStateListJ3;
        g gVar2 = cVar.f3630d;
        gVar2.j(colorStateListJ3);
        RippleDrawable rippleDrawable = cVar.f3640o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f3636k);
        }
        gVar.i(materialCardView.getCardElevation());
        float f7 = cVar.f3634h;
        ColorStateList colorStateList = cVar.f3639n;
        gVar2.f8611d.f8602j = f7;
        gVar2.invalidateSelf();
        f fVar = gVar2.f8611d;
        if (fVar.f8597d != colorStateList) {
            fVar.f8597d = colorStateList;
            gVar2.onStateChange(gVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(gVar));
        Drawable drawableC = cVar.j() ? cVar.c() : gVar2;
        cVar.i = drawableC;
        materialCardView.setForeground(cVar.d(drawableC));
        typedArrayH.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f3168k.f3629c.j(colorStateList);
    }
}
