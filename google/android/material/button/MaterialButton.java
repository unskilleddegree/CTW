package com.google.android.material.button;

import a6.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import c5.a;
import c5.b;
import c5.c;
import c5.f;
import h2.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o5.n;
import o5.t;
import r0.v0;
import y5.h;
import y5.k;
import y5.l;
import y5.w;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f3150u = {R.attr.state_checkable};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f3151v = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f3152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f3153h;
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f3154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f3155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f3156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3164t;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f3152g;
        return (cVar == null || cVar.f1867o) ? false : true;
    }

    public final void b() {
        int i = this.f3164t;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f3156l, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f3156l, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f3156l, null, null);
        }
    }

    public final void c(boolean z8) {
        Drawable drawable = this.f3156l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f3156l = drawableMutate;
            j0.a.h(drawableMutate, this.f3155k);
            PorterDuff.Mode mode = this.f3154j;
            if (mode != null) {
                j0.a.i(this.f3156l, mode);
            }
            int intrinsicWidth = this.f3158n;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f3156l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f3158n;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3156l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3156l;
            int i = this.f3159o;
            int i5 = this.f3160p;
            drawable2.setBounds(i, i5, intrinsicWidth + i, intrinsicHeight + i5);
            this.f3156l.setVisible(true, z8);
        }
        if (z8) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i9 = this.f3164t;
        if (((i9 == 1 || i9 == 2) && drawable3 != this.f3156l) || (((i9 == 3 || i9 == 4) && drawable5 != this.f3156l) || ((i9 == 16 || i9 == 32) && drawable4 != this.f3156l))) {
            b();
        }
    }

    public final void d(int i, int i5) {
        if (this.f3156l == null || getLayout() == null) {
            return;
        }
        int i9 = this.f3164t;
        if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
            if (i9 == 16 || i9 == 32) {
                this.f3159o = 0;
                if (i9 == 16) {
                    this.f3160p = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f3158n;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f3156l.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f3161q) - getPaddingBottom()) / 2);
                if (this.f3160p != iMax) {
                    this.f3160p = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f3160p = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i10 = this.f3164t;
        if (i10 == 1 || i10 == 3 || ((i10 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i10 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3159o = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f3158n;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f3156l.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = v0.f7028a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f3161q) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f3164t == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f3159o != paddingEnd) {
            this.f3159o = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f3157m)) {
            return this.f3157m;
        }
        c cVar = this.f3152g;
        return ((cVar == null || !cVar.f1869q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f3152g.f1860g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3156l;
    }

    public int getIconGravity() {
        return this.f3164t;
    }

    public int getIconPadding() {
        return this.f3161q;
    }

    public int getIconSize() {
        return this.f3158n;
    }

    public ColorStateList getIconTint() {
        return this.f3155k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3154j;
    }

    public int getInsetBottom() {
        return this.f3152g.f1859f;
    }

    public int getInsetTop() {
        return this.f3152g.f1858e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f3152g.f1864l;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (a()) {
            return this.f3152g.f1855b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f3152g.f1863k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f3152g.f1861h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f3152g.f1862j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f3152g.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3162r;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            h.b(this, this.f3152g.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        c cVar = this.f3152g;
        if (cVar != null && cVar.f1869q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3150u);
        }
        if (this.f3162r) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3151v);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3162r);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f3152g;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f1869q);
        accessibilityNodeInfo.setChecked(this.f3162r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f497d);
        setChecked(bVar.f1853f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f1853f = this.f3162r;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i9) {
        super.onTextChanged(charSequence, i, i5, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3152g.f1870r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3156l != null) {
            if (this.f3156l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3157m = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f3152g;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        c cVar = this.f3152g;
        cVar.f1867o = true;
        MaterialButton materialButton = cVar.f1854a;
        materialButton.setSupportBackgroundTintList(cVar.f1862j);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? g8.l.h(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (a()) {
            this.f3152g.f1869q = z8;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        c cVar = this.f3152g;
        if (cVar == null || !cVar.f1869q || !isEnabled() || this.f3162r == z8) {
            return;
        }
        this.f3162r = z8;
        refreshDrawableState();
        if (getParent() instanceof f) {
            f fVar = (f) getParent();
            boolean z9 = this.f3162r;
            if (!fVar.i) {
                fVar.b(getId(), z9);
            }
        }
        if (this.f3163s) {
            return;
        }
        this.f3163s = true;
        Iterator it = this.f3153h.iterator();
        if (it.hasNext()) {
            throw com.ctwofficial.assistant.ui.setting.service.h.j(it);
        }
        this.f3163s = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            c cVar = this.f3152g;
            if (cVar.f1868p && cVar.f1860g == i) {
                return;
            }
            cVar.f1860g = i;
            cVar.f1868p = true;
            float f7 = i;
            k kVarF = cVar.f1855b.f();
            kVarF.f8638e = new y5.a(f7);
            kVarF.f8639f = new y5.a(f7);
            kVarF.f8640g = new y5.a(f7);
            kVarF.f8641h = new y5.a(f7);
            cVar.c(kVarF.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        if (a()) {
            this.f3152g.b(false).i(f7);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3156l != drawable) {
            this.f3156l = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f3164t != i) {
            this.f3164t = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f3161q != i) {
            this.f3161q = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? g8.l.h(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3158n != i) {
            this.f3158n = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3155k != colorStateList) {
            this.f3155k = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3154j != mode) {
            this.f3154j = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(v.m(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f3152g;
        cVar.d(cVar.f1858e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f3152g;
        cVar.d(i, cVar.f1859f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.i = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        a aVar = this.i;
        if (aVar != null) {
            ((f) ((e) aVar).f670e).invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f3152g;
            MaterialButton materialButton = cVar.f1854a;
            if (cVar.f1864l != colorStateList) {
                cVar.f1864l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(v5.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(v.m(getContext(), i));
        }
    }

    @Override // y5.w
    public void setShapeAppearanceModel(l lVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3152g.c(lVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (a()) {
            c cVar = this.f3152g;
            cVar.f1866n = z8;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f3152g;
            if (cVar.f1863k != colorStateList) {
                cVar.f1863k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(v.m(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            c cVar = this.f3152g;
            if (cVar.f1861h != i) {
                cVar.f1861h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f3152g;
        if (cVar.f1862j != colorStateList) {
            cVar.f1862j = colorStateList;
            if (cVar.b(false) != null) {
                j0.a.h(cVar.b(false), cVar.f1862j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f3152g;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            j0.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z8) {
        this.f3152g.f1870r = z8;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3162r);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ctwofficial.assistant.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        Drawable drawableH;
        super(e6.a.a(context, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.f3153h = new LinkedHashSet();
        this.f3162r = false;
        this.f3163s = false;
        Context context2 = getContext();
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.f7755s, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f3161q = typedArrayH.getDimensionPixelSize(12, 0);
        int i5 = typedArrayH.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3154j = t.d(i5, mode);
        this.f3155k = h4.e.j(getContext(), typedArrayH, 14);
        this.f3156l = (!typedArrayH.hasValue(10) || (resourceId = typedArrayH.getResourceId(10, 0)) == 0 || (drawableH = g8.l.h(getContext(), resourceId)) == null) ? typedArrayH.getDrawable(10) : drawableH;
        this.f3164t = typedArrayH.getInteger(11, 1);
        this.f3158n = typedArrayH.getDimensionPixelSize(13, 0);
        c cVar = new c(this, l.b(context2, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_Button).a());
        this.f3152g = cVar;
        cVar.f1856c = typedArrayH.getDimensionPixelOffset(1, 0);
        cVar.f1857d = typedArrayH.getDimensionPixelOffset(2, 0);
        cVar.f1858e = typedArrayH.getDimensionPixelOffset(3, 0);
        cVar.f1859f = typedArrayH.getDimensionPixelOffset(4, 0);
        if (typedArrayH.hasValue(8)) {
            int dimensionPixelSize = typedArrayH.getDimensionPixelSize(8, -1);
            cVar.f1860g = dimensionPixelSize;
            float f7 = dimensionPixelSize;
            k kVarF = cVar.f1855b.f();
            kVarF.f8638e = new y5.a(f7);
            kVarF.f8639f = new y5.a(f7);
            kVarF.f8640g = new y5.a(f7);
            kVarF.f8641h = new y5.a(f7);
            cVar.c(kVarF.a());
            cVar.f1868p = true;
        }
        cVar.f1861h = typedArrayH.getDimensionPixelSize(20, 0);
        cVar.i = t.d(typedArrayH.getInt(7, -1), mode);
        cVar.f1862j = h4.e.j(getContext(), typedArrayH, 6);
        cVar.f1863k = h4.e.j(getContext(), typedArrayH, 19);
        cVar.f1864l = h4.e.j(getContext(), typedArrayH, 16);
        cVar.f1869q = typedArrayH.getBoolean(5, false);
        cVar.f1872t = typedArrayH.getDimensionPixelSize(9, 0);
        cVar.f1870r = typedArrayH.getBoolean(21, true);
        WeakHashMap weakHashMap = v0.f7028a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayH.hasValue(0)) {
            cVar.f1867o = true;
            setSupportBackgroundTintList(cVar.f1862j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f1856c, paddingTop + cVar.f1858e, paddingEnd + cVar.f1857d, paddingBottom + cVar.f1859f);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f3161q);
        c(this.f3156l != null);
    }
}
