package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import e2.d;
import e2.e;
import e2.f;
import g6.b;
import g8.l;
import h0.i;
import h0.n;
import h2.v;
import j0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.r;
import o5.t;
import q2.m;
import s5.c;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends r {
    public static final int[] B = {R.attr.state_indeterminate};
    public static final int[] C = {R.attr.state_error};
    public static final int[][] D = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int E = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final c A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f3175h;
    public final LinkedHashSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f3176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f3180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f3181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f3182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f3184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f3185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f3188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f3190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f3192z;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i = this.f3187u;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3176j == null) {
            int iJ = b.j(this, R.attr.colorControlActivated);
            int iJ2 = b.j(this, R.attr.colorError);
            int iJ3 = b.j(this, R.attr.colorSurface);
            int iJ4 = b.j(this, R.attr.colorOnSurface);
            this.f3176j = new ColorStateList(D, new int[]{b.q(iJ3, iJ2, 1.0f), b.q(iJ3, iJ, 1.0f), b.q(iJ3, iJ4, 0.54f), b.q(iJ3, iJ4, 0.38f), b.q(iJ3, iJ4, 0.38f)});
        }
        return this.f3176j;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f3184r;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        b5.b bVar;
        Drawable drawableMutate = this.f3181o;
        ColorStateList colorStateList3 = this.f3184r;
        PorterDuff.Mode modeB = x0.c.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                a.i(drawableMutate, modeB);
            }
        }
        this.f3181o = drawableMutate;
        Drawable drawableMutate2 = this.f3182p;
        ColorStateList colorStateList4 = this.f3185s;
        PorterDuff.Mode mode = this.f3186t;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                a.i(drawableMutate2, mode);
            }
        }
        this.f3182p = drawableMutate2;
        if (this.f3183q) {
            f fVar = this.f3192z;
            if (fVar != null) {
                d dVar = fVar.f3702e;
                Drawable drawable = fVar.f3706d;
                c cVar = this.A;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f7448a == null) {
                        cVar.f7448a = new e2.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f7448a);
                }
                ArrayList arrayList = fVar.f3705h;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f3705h.size() == 0 && (bVar = fVar.f3704g) != null) {
                        dVar.f3697b.removeListener(bVar);
                        fVar.f3704g = null;
                    }
                }
                Drawable drawable2 = fVar.f3706d;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f7448a == null) {
                        cVar.f7448a = new e2.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f7448a);
                } else if (cVar != null) {
                    if (fVar.f3705h == null) {
                        fVar.f3705h = new ArrayList();
                    }
                    if (!fVar.f3705h.contains(cVar)) {
                        fVar.f3705h.add(cVar);
                        if (fVar.f3704g == null) {
                            fVar.f3704g = new b5.b(3, fVar);
                        }
                        dVar.f3697b.addListener(fVar.f3704g);
                    }
                }
            }
            Drawable drawable3 = this.f3181o;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f3181o).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.f3181o;
        if (drawable4 != null && (colorStateList2 = this.f3184r) != null) {
            a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f3182p;
        if (drawable5 != null && (colorStateList = this.f3185s) != null) {
            a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f3181o;
        Drawable drawable7 = this.f3182p;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f7 = intrinsicWidth / intrinsicHeight;
                if (f7 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f7);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f7 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f3181o;
    }

    public Drawable getButtonIconDrawable() {
        return this.f3182p;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f3185s;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f3186t;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f3184r;
    }

    public int getCheckedState() {
        return this.f3187u;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f3180n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f3187u == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3177k && this.f3184r == null && this.f3185s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        if (this.f3179m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        for (int i5 = 0; i5 < iArrOnCreateDrawableState.length; i5++) {
            int i9 = iArrOnCreateDrawableState[i5];
            if (i9 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i9 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i5] = 16842912;
            }
            this.f3188v = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f3188v = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f3178l || !TextUtils.isEmpty(getText()) || (drawableA = x0.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (t.c(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f3179m) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f3180n));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f5.a aVar = (f5.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f3929d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        f5.a aVar = new f5.a(super.onSaveInstanceState());
        aVar.f3929d = getCheckedState();
        return aVar;
    }

    @Override // n.r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.h(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f3182p = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.h(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f3185s == colorStateList) {
            return;
        }
        this.f3185s = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f3186t == mode) {
            return;
        }
        this.f3186t = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f3184r == colorStateList) {
            return;
        }
        this.f3184r = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z8) {
        this.f3178l = z8;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        setCheckedState(z8 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f3187u != i) {
            this.f3187u = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && this.f3190x == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f3189w) {
                return;
            }
            this.f3189w = true;
            LinkedHashSet linkedHashSet = this.i;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw h.j(it);
                }
            }
            if (this.f3187u != 2 && (onCheckedChangeListener = this.f3191y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i5 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f3189w = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f3180n = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z8) {
        if (this.f3179m == z8) {
            return;
        }
        this.f3179m = z8;
        refreshDrawableState();
        Iterator it = this.f3175h.iterator();
        if (it.hasNext()) {
            throw h.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3191y = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f3190x = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f3177k = z8;
        if (z8) {
            x0.c.c(this, getMaterialThemeColorsTintList());
        } else {
            x0.c.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // n.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f3181o = drawable;
        this.f3183q = false;
        a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        this.f3175h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = n.f4489a;
        Drawable drawableA = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3706d = drawableA;
        drawableA.setCallback(fVar.i);
        new e(0, fVar.f3706d.getConstantState());
        this.f3192z = fVar;
        this.A = new c(this, 2);
        Context context3 = getContext();
        this.f3181o = x0.d.a(this);
        this.f3184r = getSuperButtonTintList();
        setSupportButtonTintList(null);
        m mVarI = o5.n.i(context3, attributeSet, u4.a.f7758v, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) mVarI.f6726f;
        this.f3182p = mVarI.y(2);
        if (this.f3181o != null && v.q(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == E && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f3181o = l.h(context3, R.drawable.mtrl_checkbox_button);
                this.f3183q = true;
                if (this.f3182p == null) {
                    this.f3182p = l.h(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f3185s = h4.e.k(context3, mVarI, 3);
        this.f3186t = t.d(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f3177k = typedArray.getBoolean(10, false);
        this.f3178l = typedArray.getBoolean(6, true);
        this.f3179m = typedArray.getBoolean(9, false);
        this.f3180n = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        mVarI.I();
        a();
    }
}
