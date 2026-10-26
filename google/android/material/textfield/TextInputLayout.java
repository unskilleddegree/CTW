package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.x;
import b5.c;
import b5.d;
import c6.b0;
import c6.c0;
import c6.d0;
import c6.e0;
import c6.f0;
import c6.i;
import c6.n;
import c6.p;
import c6.s;
import c6.w;
import c6.z;
import com.google.android.material.internal.CheckableImageButton;
import d2.h;
import d2.r;
import h2.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n.a1;
import n.n1;
import n.u;
import o5.b;
import o5.t;
import q2.f;
import q2.m;
import r0.m0;
import r0.v0;
import v4.a;
import y5.e;
import y5.g;
import y5.j;
import y5.k;
import y5.l;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] F0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public h A;
    public boolean A0;
    public ColorStateList B;
    public ValueAnimator B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public g I;
    public g J;
    public StateListDrawable K;
    public boolean L;
    public g M;
    public g N;
    public l O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3291a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Rect f3292b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Rect f3293c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f3294d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RectF f3295d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f3296e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Typeface f3297e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f3298f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorDrawable f3299f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f3300g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f3301g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f3302h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f3303h0;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorDrawable f3304i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3305j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f3306j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3307k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Drawable f3308k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3309l;
    public ColorStateList l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f3310m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ColorStateList f3311m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3312n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f3313n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3314o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f3315o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3316p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3317p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e0 f3318q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ColorStateList f3319q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a1 f3320r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f3321r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3322s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3323s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3324t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3325t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f3326u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3327u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3328v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f3329v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a1 f3330w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f3331w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f3332x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f3333x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3334y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final b f3335y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f3336z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f3337z0;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3300g;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.I;
        }
        int iJ = g6.b.j(this.f3300g, com.ctwofficial.assistant.R.attr.colorControlHighlight);
        int i = this.R;
        int[][] iArr = F0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.I;
            int i5 = this.f3291a0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g6.b.q(iJ, i5, 0.1f), i5}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.I;
        TypedValue typedValueP = v.p(context, com.ctwofficial.assistant.R.attr.colorSurface);
        if (typedValueP == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", "TextInputLayout", context.getResources().getResourceName(com.ctwofficial.assistant.R.attr.colorSurface)));
        }
        int i9 = typedValueP.resourceId;
        int iA = i9 != 0 ? g0.b.a(context, i9) : typedValueP.data;
        g gVar3 = new g(gVar2.f8611d.f8594a);
        int iQ = g6.b.q(iJ, iA, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{iQ, 0}));
        gVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iQ, iA});
        g gVar4 = new g(gVar2.f8611d.f8594a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], f(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.J == null) {
            this.J = f(true);
        }
        return this.J;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3300g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f3300g = editText;
        int i = this.i;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f3307k);
        }
        int i5 = this.f3305j;
        if (i5 != -1) {
            setMaxEms(i5);
        } else {
            setMaxWidth(this.f3309l);
        }
        this.L = false;
        i();
        setTextInputAccessibilityDelegate(new d0(this));
        Typeface typeface = this.f3300g.getTypeface();
        b bVar = this.f3335y0;
        bVar.m(typeface);
        float textSize = this.f3300g.getTextSize();
        if (bVar.f6351h != textSize) {
            bVar.f6351h = textSize;
            bVar.h(false);
        }
        int i9 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f3300g.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f3300g.getGravity();
        int i10 = (gravity & (-113)) | 48;
        if (bVar.f6350g != i10) {
            bVar.f6350g = i10;
            bVar.h(false);
        }
        if (bVar.f6348f != gravity) {
            bVar.f6348f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = v0.f7028a;
        this.f3331w0 = editText.getMinimumHeight();
        this.f3300g.addTextChangedListener(new c0(this, editText));
        if (this.l0 == null) {
            this.l0 = this.f3300g.getHintTextColors();
        }
        if (this.F) {
            if (TextUtils.isEmpty(this.G)) {
                CharSequence hint = this.f3300g.getHint();
                this.f3302h = hint;
                setHint(hint);
                this.f3300g.setHint((CharSequence) null);
            }
            this.H = true;
        }
        if (i9 >= 29) {
            p();
        }
        if (this.f3320r != null) {
            n(this.f3300g.getText());
        }
        r();
        this.f3310m.b();
        this.f3296e.bringToFront();
        s sVar = this.f3298f;
        sVar.bringToFront();
        Iterator it = this.f3303h0.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(this);
        }
        sVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.G)) {
            return;
        }
        this.G = charSequence;
        b bVar = this.f3335y0;
        if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
            bVar.A = charSequence;
            bVar.B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.f3333x0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f3328v == z8) {
            return;
        }
        if (z8) {
            a1 a1Var = this.f3330w;
            if (a1Var != null) {
                this.f3294d.addView(a1Var);
                this.f3330w.setVisibility(0);
            }
        } else {
            a1 a1Var2 = this.f3330w;
            if (a1Var2 != null) {
                a1Var2.setVisibility(8);
            }
            this.f3330w = null;
        }
        this.f3328v = z8;
    }

    public final void a(float f7) {
        b bVar = this.f3335y0;
        if (bVar.f6340b == f7) {
            return;
        }
        int i = 1;
        if (this.B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B0 = valueAnimator;
            valueAnimator.setInterpolator(f.r(getContext(), com.ctwofficial.assistant.R.attr.motionEasingEmphasizedInterpolator, a.f7893b));
            this.B0.setDuration(f.q(getContext(), com.ctwofficial.assistant.R.attr.motionDurationMedium4, 167));
            this.B0.addUpdateListener(new c(i, this));
        }
        this.B0.setFloatValues(bVar.f6340b, f7);
        this.B0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3294d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i5;
        g gVar = this.I;
        if (gVar == null) {
            return;
        }
        l lVar = gVar.f8611d.f8594a;
        l lVar2 = this.O;
        if (lVar != lVar2) {
            gVar.setShapeAppearanceModel(lVar2);
        }
        if (this.R == 2 && (i = this.T) > -1 && (i5 = this.W) != 0) {
            g gVar2 = this.I;
            gVar2.f8611d.f8602j = i;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
            y5.f fVar = gVar2.f8611d;
            if (fVar.f8597d != colorStateListValueOf) {
                fVar.f8597d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iB = this.f3291a0;
        if (this.R == 1) {
            iB = i0.a.b(this.f3291a0, g6.b.i(getContext(), com.ctwofficial.assistant.R.attr.colorSurface, 0));
        }
        this.f3291a0 = iB;
        this.I.j(ColorStateList.valueOf(iB));
        g gVar3 = this.M;
        if (gVar3 != null && this.N != null) {
            if (this.T > -1 && this.W != 0) {
                gVar3.j(this.f3300g.isFocused() ? ColorStateList.valueOf(this.f3313n0) : ColorStateList.valueOf(this.W));
                this.N.j(ColorStateList.valueOf(this.W));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.F) {
            return 0;
        }
        int i = this.R;
        b bVar = this.f3335y0;
        if (i == 0) {
            fD = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final h d() {
        h hVar = new h();
        hVar.f3516f = f.q(getContext(), com.ctwofficial.assistant.R.attr.motionDurationShort2, 87);
        hVar.f3517g = f.r(getContext(), com.ctwofficial.assistant.R.attr.motionEasingLinearInterpolator, a.f7892a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f3300g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f3302h != null) {
            boolean z8 = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.f3300g.setHint(this.f3302h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f3300g.setHint(hint);
                this.H = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f3294d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f3300g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z8 = this.F;
        b bVar = this.f3335y0;
        if (z8) {
            TextPaint textPaint = bVar.N;
            RectF rectF = bVar.f6346e;
            int iSave = canvas.save();
            if (bVar.B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f7 = bVar.f6358p;
                float f9 = bVar.f6359q;
                float f10 = bVar.F;
                if (f10 != 1.0f) {
                    canvas.scale(f10, f10, f7, f9);
                }
                if (bVar.f6345d0 <= 1 || bVar.C) {
                    canvas.translate(f7, f9);
                    bVar.Y.draw(canvas);
                } else {
                    float lineStart = bVar.f6358p - bVar.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f9);
                    float f11 = alpha;
                    textPaint.setAlpha((int) (bVar.f6341b0 * f11));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, g6.b.c(bVar.K, textPaint.getAlpha()));
                    }
                    bVar.Y.draw(canvas);
                    textPaint.setAlpha((int) (bVar.f6339a0 * f11));
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, g6.b.c(bVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = bVar.Y.getLineBaseline(0);
                    CharSequence charSequence = bVar.f6343c0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f6343c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    canvas = canvas;
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.N == null || (gVar = this.M) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f3300g.isFocused()) {
            Rect bounds = this.N.getBounds();
            Rect bounds2 = this.M.getBounds();
            float f13 = bVar.f6340b;
            int iCenterX = bounds2.centerX();
            bounds.left = a.c(iCenterX, bounds2.left, f13);
            bounds.right = a.c(iCenterX, bounds2.right, f13);
            this.N.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z8;
        ColorStateList colorStateList;
        if (this.C0) {
            return;
        }
        this.C0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f3335y0;
        if (bVar != null) {
            bVar.L = drawableState;
            ColorStateList colorStateList2 = bVar.f6353k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = bVar.f6352j) == null || !colorStateList.isStateful())) {
                z8 = false;
            } else {
                bVar.h(false);
                z8 = true;
            }
        } else {
            z8 = false;
        }
        if (this.f3300g != null) {
            WeakHashMap weakHashMap = v0.f7028a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z8) {
            invalidate();
        }
        this.C0 = false;
    }

    public final boolean e() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof i);
    }

    public final g f(boolean z8) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ctwofficial.assistant.R.dimen.mtrl_shape_corner_size_small_component);
        float f7 = z8 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3300g;
        float popupElevation = editText instanceof z ? ((z) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ctwofficial.assistant.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ctwofficial.assistant.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j jVar = new j();
        j jVar2 = new j();
        j jVar3 = new j();
        j jVar4 = new j();
        int i = 0;
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        y5.a aVar = new y5.a(f7);
        y5.a aVar2 = new y5.a(f7);
        y5.a aVar3 = new y5.a(dimensionPixelOffset);
        y5.a aVar4 = new y5.a(dimensionPixelOffset);
        l lVar = new l();
        lVar.f8646a = jVar;
        lVar.f8647b = jVar2;
        lVar.f8648c = jVar3;
        lVar.f8649d = jVar4;
        lVar.f8650e = aVar;
        lVar.f8651f = aVar2;
        lVar.f8652g = aVar4;
        lVar.f8653h = aVar3;
        lVar.i = eVar;
        lVar.f8654j = eVar2;
        lVar.f8655k = eVar3;
        lVar.f8656l = eVar4;
        EditText editText2 = this.f3300g;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof z ? ((z) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.A;
            String simpleName = g.class.getSimpleName();
            TypedValue typedValueP = v.p(context, com.ctwofficial.assistant.R.attr.colorSurface);
            if (typedValueP == null) {
                throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", simpleName, context.getResources().getResourceName(com.ctwofficial.assistant.R.attr.colorSurface)));
            }
            int i5 = typedValueP.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i5 != 0 ? g0.b.a(context, i5) : typedValueP.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(lVar);
        y5.f fVar = gVar.f8611d;
        if (fVar.f8600g == null) {
            fVar.f8600g = new Rect();
        }
        gVar.f8611d.f8600g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z8) {
        int compoundPaddingLeft;
        if (z8 || getPrefixText() == null) {
            compoundPaddingLeft = (!z8 || getSuffixText() == null) ? this.f3300g.getCompoundPaddingLeft() : this.f3298f.b();
        } else {
            compoundPaddingLeft = this.f3296e.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3300g;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.R;
        if (i == 1 || i == 2) {
            return this.I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3291a0;
    }

    public int getBoxBackgroundMode() {
        return this.R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zC = t.c(this);
        RectF rectF = this.f3295d0;
        return zC ? this.O.f8653h.a(rectF) : this.O.f8652g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zC = t.c(this);
        RectF rectF = this.f3295d0;
        return zC ? this.O.f8652g.a(rectF) : this.O.f8653h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zC = t.c(this);
        RectF rectF = this.f3295d0;
        return zC ? this.O.f8650e.a(rectF) : this.O.f8651f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zC = t.c(this);
        RectF rectF = this.f3295d0;
        return zC ? this.O.f8651f.a(rectF) : this.O.f8650e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3317p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3319q0;
    }

    public int getBoxStrokeWidth() {
        return this.U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.f3314o;
    }

    public CharSequence getCounterOverflowDescription() {
        a1 a1Var;
        if (this.f3312n && this.f3316p && (a1Var = this.f3320r) != null) {
            return a1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.C;
    }

    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    public ColorStateList getCursorColor() {
        return this.D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.l0;
    }

    public EditText getEditText() {
        return this.f3300g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3298f.f1959j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3298f.f1959j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3298f.f1965p;
    }

    public int getEndIconMode() {
        return this.f3298f.f1961l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3298f.f1966q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3298f.f1959j;
    }

    public CharSequence getError() {
        w wVar = this.f3310m;
        if (wVar.f2000q) {
            return wVar.f1999p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3310m.f2003t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3310m.f2002s;
    }

    public int getErrorCurrentTextColors() {
        a1 a1Var = this.f3310m.f2001r;
        if (a1Var != null) {
            return a1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3298f.f1956f.getDrawable();
    }

    public CharSequence getHelperText() {
        w wVar = this.f3310m;
        if (wVar.f2007x) {
            return wVar.f2006w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        a1 a1Var = this.f3310m.f2008y;
        if (a1Var != null) {
            return a1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3335y0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f3335y0;
        return bVar.e(bVar.f6353k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3311m0;
    }

    public e0 getLengthCounter() {
        return this.f3318q;
    }

    public int getMaxEms() {
        return this.f3305j;
    }

    public int getMaxWidth() {
        return this.f3309l;
    }

    public int getMinEms() {
        return this.i;
    }

    public int getMinWidth() {
        return this.f3307k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3298f.f1959j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3298f.f1959j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3328v) {
            return this.f3326u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3334y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3332x;
    }

    public CharSequence getPrefixText() {
        return this.f3296e.f1899f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3296e.f1898e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3296e.f1898e;
    }

    public l getShapeAppearanceModel() {
        return this.O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3296e.f1900g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3296e.f1900g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3296e.f1902j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3296e.f1903k;
    }

    public CharSequence getSuffixText() {
        return this.f3298f.f1968s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3298f.f1969t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3298f.f1969t;
    }

    public Typeface getTypeface() {
        return this.f3297e0;
    }

    public final int h(int i, boolean z8) {
        int compoundPaddingRight;
        if (z8 || getSuffixText() == null) {
            compoundPaddingRight = (!z8 || getPrefixText() == null) ? this.f3300g.getCompoundPaddingRight() : this.f3296e.a();
        } else {
            compoundPaddingRight = this.f3298f.b();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.R;
        if (i == 0) {
            this.I = null;
            this.M = null;
            this.N = null;
        } else if (i == 1) {
            this.I = new g(this.O);
            this.M = new g();
            this.N = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.R + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.F || (this.I instanceof i)) {
                this.I = new g(this.O);
            } else {
                l lVar = this.O;
                int i5 = i.C;
                if (lVar == null) {
                    lVar = new l();
                }
                c6.g gVar = new c6.g(lVar, new RectF());
                c6.h hVar = new c6.h(gVar);
                hVar.B = gVar;
                this.I = hVar;
            }
            this.M = null;
            this.N = null;
        }
        s();
        x();
        if (this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.S = getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (h4.e.s(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f3300g != null && this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f3300g;
                WeakHashMap weakHashMap = v0.f7028a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3300g.getPaddingEnd(), getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (h4.e.s(getContext())) {
                EditText editText2 = this.f3300g;
                WeakHashMap weakHashMap2 = v0.f7028a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3300g.getPaddingEnd(), getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.R != 0) {
            t();
        }
        EditText editText3 = this.f3300g;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.R;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f7;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i;
        float f12;
        int i5;
        if (e()) {
            int width = this.f3300g.getWidth();
            int gravity = this.f3300g.getGravity();
            b bVar = this.f3335y0;
            boolean zB = bVar.b(bVar.A);
            bVar.C = zB;
            Rect rect = bVar.f6344d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i5 = rect.left;
                        f10 = i5;
                    } else {
                        f7 = rect.right;
                        f9 = bVar.Z;
                    }
                } else if (zB) {
                    f7 = rect.right;
                    f9 = bVar.Z;
                } else {
                    i5 = rect.left;
                    f10 = i5;
                }
                float fMax = Math.max(f10, rect.left);
                rectF = this.f3295d0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (bVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.C) {
                        f12 = bVar.Z;
                        f11 = f12 + fMax;
                    } else {
                        i = rect.right;
                        f11 = i;
                    }
                } else if (bVar.C) {
                    i = rect.right;
                    f11 = i;
                } else {
                    f12 = bVar.Z;
                    f11 = f12 + fMax;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.Q;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.T);
                i iVar = (i) this.I;
                iVar.getClass();
                iVar.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f7 = width / 2.0f;
            f9 = bVar.Z / 2.0f;
            f10 = f7 - f9;
            float fMax2 = Math.max(f10, rect.left);
            rectF = this.f3295d0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f11 = (width / 2.0f) + (bVar.Z / 2.0f);
            } else {
                f11 = (width / 2.0f) + (bVar.Z / 2.0f);
            }
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(a1 a1Var, int i) {
        try {
            a1Var.setTextAppearance(i);
            if (a1Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        a1Var.setTextAppearance(com.ctwofficial.assistant.R.style.TextAppearance_AppCompat_Caption);
        a1Var.setTextColor(g0.b.a(getContext(), com.ctwofficial.assistant.R.color.design_error));
    }

    public final boolean m() {
        w wVar = this.f3310m;
        return (wVar.f1998o != 1 || wVar.f2001r == null || TextUtils.isEmpty(wVar.f1999p)) ? false : true;
    }

    public final void n(Editable editable) {
        String str;
        ((a3.h) this.f3318q).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z8 = this.f3316p;
        int i = this.f3314o;
        String string = null;
        if (i == -1) {
            this.f3320r.setText(String.valueOf(length));
            this.f3320r.setContentDescription(null);
            this.f3316p = false;
        } else {
            this.f3316p = length > i;
            Context context = getContext();
            this.f3320r.setContentDescription(context.getString(this.f3316p ? com.ctwofficial.assistant.R.string.character_counter_overflowed_content_description : com.ctwofficial.assistant.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f3314o)));
            if (z8 != this.f3316p) {
                o();
            }
            String str2 = p0.b.f6560b;
            p0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? p0.b.f6563e : p0.b.f6562d;
            a1 a1Var = this.f3320r;
            String string2 = getContext().getString(com.ctwofficial.assistant.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f3314o));
            bVar.getClass();
            d dVar = p0.g.f6572c;
            if (string2 != null) {
                String str3 = p0.b.f6561c;
                String str4 = p0.b.f6560b;
                boolean z9 = bVar.f6564a;
                boolean zC = dVar.c(string2, string2.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean zC2 = (zC ? p0.g.f6571b : p0.g.f6570a).c(string2, string2.length());
                if (z9 || !(zC2 || p0.b.a(string2) == 1)) {
                    str = (!z9 || (zC2 && p0.b.a(string2) != -1)) ? "" : str3;
                } else {
                    str = str4;
                }
                spannableStringBuilder.append((CharSequence) str);
                if (zC != z9) {
                    spannableStringBuilder.append(zC ? (char) 8235 : (char) 8234);
                    spannableStringBuilder.append((CharSequence) string2);
                    spannableStringBuilder.append((char) 8236);
                } else {
                    spannableStringBuilder.append((CharSequence) string2);
                }
                boolean zC3 = (zC ? p0.g.f6571b : p0.g.f6570a).c(string2, string2.length());
                if (!z9 && (zC3 || p0.b.b(string2) == 1)) {
                    str3 = str4;
                } else if (!z9 || (zC3 && p0.b.b(string2) != -1)) {
                    str3 = "";
                }
                spannableStringBuilder.append((CharSequence) str3);
                string = spannableStringBuilder.toString();
            }
            a1Var.setText(string);
        }
        if (this.f3300g == null || z8 == this.f3316p) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        a1 a1Var = this.f3320r;
        if (a1Var != null) {
            l(a1Var, this.f3316p ? this.f3322s : this.f3324t);
            if (!this.f3316p && (colorStateList2 = this.B) != null) {
                this.f3320r.setTextColor(colorStateList2);
            }
            if (!this.f3316p || (colorStateList = this.C) == null) {
                return;
            }
            this.f3320r.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3335y0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        s sVar = this.f3298f;
        sVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z8 = false;
        this.E0 = false;
        if (this.f3300g != null && this.f3300g.getMeasuredHeight() < (iMax = Math.max(sVar.getMeasuredHeight(), this.f3296e.getMeasuredHeight()))) {
            this.f3300g.setMinimumHeight(iMax);
            z8 = true;
        }
        boolean zQ = q();
        if (z8 || zQ) {
            this.f3300g.post(new androidx.lifecycle.b0(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        EditText editText = this.f3300g;
        if (editText != null) {
            Rect rect = this.f3292b0;
            o5.c.a(this, editText, rect);
            g gVar = this.M;
            if (gVar != null) {
                int i11 = rect.bottom;
                gVar.setBounds(rect.left, i11 - this.U, rect.right, i11);
            }
            g gVar2 = this.N;
            if (gVar2 != null) {
                int i12 = rect.bottom;
                gVar2.setBounds(rect.left, i12 - this.V, rect.right, i12);
            }
            if (this.F) {
                float textSize = this.f3300g.getTextSize();
                b bVar = this.f3335y0;
                if (bVar.f6351h != textSize) {
                    bVar.f6351h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f3300g.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (bVar.f6350g != i13) {
                    bVar.f6350g = i13;
                    bVar.h(false);
                }
                if (bVar.f6348f != gravity) {
                    bVar.f6348f = gravity;
                    bVar.h(false);
                }
                if (this.f3300g == null) {
                    throw new IllegalStateException();
                }
                boolean zC = t.c(this);
                int i14 = rect.bottom;
                Rect rect2 = this.f3293c0;
                rect2.bottom = i14;
                int i15 = this.R;
                if (i15 == 1) {
                    rect2.left = g(rect.left, zC);
                    rect2.top = rect.top + this.S;
                    rect2.right = h(rect.right, zC);
                } else if (i15 != 2) {
                    rect2.left = g(rect.left, zC);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zC);
                } else {
                    rect2.left = this.f3300g.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f3300g.getPaddingRight();
                }
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                int i19 = rect2.bottom;
                Rect rect3 = bVar.f6344d;
                if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i16, i17, i18, i19);
                    bVar.M = true;
                }
                if (this.f3300g == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.O;
                textPaint.setTextSize(bVar.f6351h);
                textPaint.setTypeface(bVar.f6363u);
                textPaint.setLetterSpacing(bVar.W);
                float f7 = -textPaint.ascent();
                rect2.left = this.f3300g.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.R != 1 || this.f3300g.getMinLines() > 1) ? rect.top + this.f3300g.getCompoundPaddingTop() : (int) (rect.centerY() - (f7 / 2.0f));
                rect2.right = rect.right - this.f3300g.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.R != 1 || this.f3300g.getMinLines() > 1) ? rect.bottom - this.f3300g.getCompoundPaddingBottom() : (int) (rect2.top + f7);
                rect2.bottom = compoundPaddingBottom;
                int i20 = rect2.left;
                int i21 = rect2.top;
                int i22 = rect2.right;
                Rect rect4 = bVar.f6342c;
                if (rect4.left != i20 || rect4.top != i21 || rect4.right != i22 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i20, i21, i22, compoundPaddingBottom);
                    bVar.M = true;
                }
                bVar.h(false);
                if (!e() || this.f3333x0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        EditText editText;
        super.onMeasure(i, i5);
        boolean z8 = this.E0;
        s sVar = this.f3298f;
        if (!z8) {
            sVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if (this.f3330w != null && (editText = this.f3300g) != null) {
            this.f3330w.setGravity(editText.getGravity());
            this.f3330w.setPadding(this.f3300g.getCompoundPaddingLeft(), this.f3300g.getCompoundPaddingTop(), this.f3300g.getCompoundPaddingRight(), this.f3300g.getCompoundPaddingBottom());
        }
        sVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f0 f0Var = (f0) parcelable;
        super.onRestoreInstanceState(f0Var.f497d);
        setError(f0Var.f1923f);
        if (f0Var.f1924g) {
            post(new x(4, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z8 = i == 1;
        if (z8 != this.P) {
            y5.c cVar = this.O.f8650e;
            RectF rectF = this.f3295d0;
            float fA = cVar.a(rectF);
            float fA2 = this.O.f8651f.a(rectF);
            float fA3 = this.O.f8653h.a(rectF);
            float fA4 = this.O.f8652g.a(rectF);
            l lVar = this.O;
            h4.e eVar = lVar.f8646a;
            h4.e eVar2 = lVar.f8647b;
            h4.e eVar3 = lVar.f8649d;
            h4.e eVar4 = lVar.f8648c;
            e eVar5 = new e(0);
            e eVar6 = new e(0);
            e eVar7 = new e(0);
            e eVar8 = new e(0);
            y5.a aVar = new y5.a(fA2);
            y5.a aVar2 = new y5.a(fA);
            y5.a aVar3 = new y5.a(fA4);
            y5.a aVar4 = new y5.a(fA3);
            l lVar2 = new l();
            lVar2.f8646a = eVar2;
            lVar2.f8647b = eVar;
            lVar2.f8648c = eVar3;
            lVar2.f8649d = eVar4;
            lVar2.f8650e = aVar;
            lVar2.f8651f = aVar2;
            lVar2.f8652g = aVar4;
            lVar2.f8653h = aVar3;
            lVar2.i = eVar5;
            lVar2.f8654j = eVar6;
            lVar2.f8655k = eVar7;
            lVar2.f8656l = eVar8;
            this.P = z8;
            setShapeAppearanceModel(lVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f0 f0Var = new f0(super.onSaveInstanceState());
        if (m()) {
            f0Var.f1923f = getError();
        }
        s sVar = this.f3298f;
        f0Var.f1924g = sVar.f1961l != 0 && sVar.f1959j.f3218g;
        return f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.D;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueP = v.p(context, com.ctwofficial.assistant.R.attr.colorControlActivated);
            if (typedValueP != null) {
                int i = typedValueP.resourceId;
                if (i != 0) {
                    colorStateListValueOf = v.m(context, i);
                } else {
                    int i5 = typedValueP.data;
                    if (i5 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i5);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f3300g;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f3300g.getTextCursorDrawable().mutate();
        if ((m() || (this.f3320r != null && this.f3316p)) && (colorStateList = this.E) != null) {
            colorStateListValueOf = colorStateList;
        }
        j0.a.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z8;
        if (this.f3300g == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z9 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            b0 b0Var = this.f3296e;
            if (b0Var.getMeasuredWidth() > 0) {
                int measuredWidth = b0Var.getMeasuredWidth() - this.f3300g.getPaddingLeft();
                if (this.f3299f0 == null || this.f3301g0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f3299f0 = colorDrawable;
                    this.f3301g0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f3300g.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f3299f0;
                if (drawable != colorDrawable2) {
                    this.f3300g.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else if (this.f3299f0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f3300g.getCompoundDrawablesRelative();
                this.f3300g.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f3299f0 = null;
                z8 = true;
            } else {
                z8 = false;
            }
        } else if (this.f3299f0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f3300g.getCompoundDrawablesRelative();
            this.f3300g.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f3299f0 = null;
            z8 = true;
        } else {
            z8 = false;
        }
        s sVar = this.f3298f;
        if ((sVar.d() || ((sVar.f1961l != 0 && sVar.c()) || sVar.f1968s != null)) && sVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = sVar.f1969t.getMeasuredWidth() - this.f3300g.getPaddingRight();
            if (sVar.d()) {
                checkableImageButton = sVar.f1956f;
            } else if (sVar.f1961l != 0 && sVar.c()) {
                checkableImageButton = sVar.f1959j;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f3300g.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f3304i0;
            if (colorDrawable3 != null && this.f3306j0 != measuredWidth2) {
                this.f3306j0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f3300g.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f3304i0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f3304i0 = colorDrawable4;
                this.f3306j0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f3304i0;
            if (drawable2 != colorDrawable5) {
                this.f3308k0 = drawable2;
                this.f3300g.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f3304i0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f3300g.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f3304i0) {
                this.f3300g.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f3308k0, compoundDrawablesRelative5[3]);
            } else {
                z9 = z8;
            }
            this.f3304i0 = null;
            return z9;
        }
        return z8;
    }

    public final void r() {
        Drawable background;
        a1 a1Var;
        EditText editText = this.f3300g;
        if (editText == null || this.R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = n1.f5921a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3316p && (a1Var = this.f3320r) != null) {
            drawableMutate.setColorFilter(u.c(a1Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f3300g.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f3300g;
        if (editText == null || this.I == null) {
            return;
        }
        if ((this.L || editText.getBackground() == null) && this.R != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f3300g;
            WeakHashMap weakHashMap = v0.f7028a;
            editText2.setBackground(editTextBoxBackground);
            this.L = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3291a0 != i) {
            this.f3291a0 = i;
            this.f3321r0 = i;
            this.f3325t0 = i;
            this.f3327u0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(g0.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3321r0 = defaultColor;
        this.f3291a0 = defaultColor;
        this.f3323s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3325t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3327u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.R) {
            return;
        }
        this.R = i;
        if (this.f3300g != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.S = i;
    }

    public void setBoxCornerFamily(int i) {
        k kVarF = this.O.f();
        y5.c cVar = this.O.f8650e;
        kVarF.f8634a = y5.h.a(i);
        kVarF.f8638e = cVar;
        y5.c cVar2 = this.O.f8651f;
        kVarF.f8635b = y5.h.a(i);
        kVarF.f8639f = cVar2;
        y5.c cVar3 = this.O.f8653h;
        kVarF.f8637d = y5.h.a(i);
        kVarF.f8641h = cVar3;
        y5.c cVar4 = this.O.f8652g;
        kVarF.f8636c = y5.h.a(i);
        kVarF.f8640g = cVar4;
        this.O = kVarF.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f3317p0 != i) {
            this.f3317p0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f3313n0 = colorStateList.getDefaultColor();
            this.f3329v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3315o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3317p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3317p0 != colorStateList.getDefaultColor()) {
            this.f3317p0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3319q0 != colorStateList) {
            this.f3319q0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.U = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.V = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f3312n != z8) {
            w wVar = this.f3310m;
            if (z8) {
                a1 a1Var = new a1(getContext());
                this.f3320r = a1Var;
                a1Var.setId(com.ctwofficial.assistant.R.id.textinput_counter);
                Typeface typeface = this.f3297e0;
                if (typeface != null) {
                    this.f3320r.setTypeface(typeface);
                }
                this.f3320r.setMaxLines(1);
                wVar.a(this.f3320r, 2);
                ((ViewGroup.MarginLayoutParams) this.f3320r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.ctwofficial.assistant.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f3320r != null) {
                    EditText editText = this.f3300g;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                wVar.g(this.f3320r, 2);
                this.f3320r = null;
            }
            this.f3312n = z8;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f3314o != i) {
            if (i > 0) {
                this.f3314o = i;
            } else {
                this.f3314o = -1;
            }
            if (!this.f3312n || this.f3320r == null) {
                return;
            }
            EditText editText = this.f3300g;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3322s != i) {
            this.f3322s = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3324t != i) {
            this.f3324t = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (m() || (this.f3320r != null && this.f3316p)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.f3311m0 = colorStateList;
        if (this.f3300g != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f3298f.f1959j.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f3298f.f1959j.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i) {
        s sVar = this.f3298f;
        CharSequence text = i != 0 ? sVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        s sVar = this.f3298f;
        Drawable drawableH = i != 0 ? g8.l.h(sVar.getContext(), i) : null;
        TextInputLayout textInputLayout = sVar.f1954d;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        checkableImageButton.setImageDrawable(drawableH);
        if (drawableH != null) {
            p4.c.c(textInputLayout, checkableImageButton, sVar.f1963n, sVar.f1964o);
            p4.c.s(textInputLayout, checkableImageButton, sVar.f1963n);
        }
    }

    public void setEndIconMinSize(int i) {
        s sVar = this.f3298f;
        if (i < 0) {
            sVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != sVar.f1965p) {
            sVar.f1965p = i;
            CheckableImageButton checkableImageButton = sVar.f1959j;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = sVar.f1956f;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f3298f.f(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f3298f;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        View.OnLongClickListener onLongClickListener = sVar.f1967r;
        checkableImageButton.setOnClickListener(onClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f3298f;
        sVar.f1967r = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f3298f;
        sVar.f1966q = scaleType;
        sVar.f1959j.setScaleType(scaleType);
        sVar.f1956f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        s sVar = this.f3298f;
        if (sVar.f1963n != colorStateList) {
            sVar.f1963n = colorStateList;
            p4.c.c(sVar.f1954d, sVar.f1959j, colorStateList, sVar.f1964o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f3298f;
        if (sVar.f1964o != mode) {
            sVar.f1964o = mode;
            p4.c.c(sVar.f1954d, sVar.f1959j, sVar.f1963n, mode);
        }
    }

    public void setEndIconVisible(boolean z8) {
        this.f3298f.g(z8);
    }

    public void setError(CharSequence charSequence) {
        w wVar = this.f3310m;
        if (!wVar.f2000q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            wVar.f();
            return;
        }
        wVar.c();
        wVar.f1999p = charSequence;
        wVar.f2001r.setText(charSequence);
        int i = wVar.f1997n;
        if (i != 1) {
            wVar.f1998o = 1;
        }
        wVar.i(i, wVar.f1998o, wVar.h(wVar.f2001r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        w wVar = this.f3310m;
        wVar.f2003t = i;
        a1 a1Var = wVar.f2001r;
        if (a1Var != null) {
            WeakHashMap weakHashMap = v0.f7028a;
            a1Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        w wVar = this.f3310m;
        wVar.f2002s = charSequence;
        a1 a1Var = wVar.f2001r;
        if (a1Var != null) {
            a1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        w wVar = this.f3310m;
        TextInputLayout textInputLayout = wVar.f1992h;
        if (wVar.f2000q == z8) {
            return;
        }
        wVar.c();
        if (z8) {
            a1 a1Var = new a1(wVar.f1991g);
            wVar.f2001r = a1Var;
            a1Var.setId(com.ctwofficial.assistant.R.id.textinput_error);
            wVar.f2001r.setTextAlignment(5);
            Typeface typeface = wVar.B;
            if (typeface != null) {
                wVar.f2001r.setTypeface(typeface);
            }
            int i = wVar.f2004u;
            wVar.f2004u = i;
            a1 a1Var2 = wVar.f2001r;
            if (a1Var2 != null) {
                wVar.f1992h.l(a1Var2, i);
            }
            ColorStateList colorStateList = wVar.f2005v;
            wVar.f2005v = colorStateList;
            a1 a1Var3 = wVar.f2001r;
            if (a1Var3 != null && colorStateList != null) {
                a1Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = wVar.f2002s;
            wVar.f2002s = charSequence;
            a1 a1Var4 = wVar.f2001r;
            if (a1Var4 != null) {
                a1Var4.setContentDescription(charSequence);
            }
            int i5 = wVar.f2003t;
            wVar.f2003t = i5;
            a1 a1Var5 = wVar.f2001r;
            if (a1Var5 != null) {
                WeakHashMap weakHashMap = v0.f7028a;
                a1Var5.setAccessibilityLiveRegion(i5);
            }
            wVar.f2001r.setVisibility(4);
            wVar.a(wVar.f2001r, 0);
        } else {
            wVar.f();
            wVar.g(wVar.f2001r, 0);
            wVar.f2001r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        wVar.f2000q = z8;
    }

    public void setErrorIconDrawable(int i) {
        s sVar = this.f3298f;
        sVar.h(i != 0 ? g8.l.h(sVar.getContext(), i) : null);
        p4.c.s(sVar.f1954d, sVar.f1956f, sVar.f1957g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f3298f;
        CheckableImageButton checkableImageButton = sVar.f1956f;
        View.OnLongClickListener onLongClickListener = sVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f3298f;
        sVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f1956f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        s sVar = this.f3298f;
        if (sVar.f1957g != colorStateList) {
            sVar.f1957g = colorStateList;
            p4.c.c(sVar.f1954d, sVar.f1956f, colorStateList, sVar.f1958h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f3298f;
        if (sVar.f1958h != mode) {
            sVar.f1958h = mode;
            p4.c.c(sVar.f1954d, sVar.f1956f, sVar.f1957g, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        w wVar = this.f3310m;
        wVar.f2004u = i;
        a1 a1Var = wVar.f2001r;
        if (a1Var != null) {
            wVar.f1992h.l(a1Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        w wVar = this.f3310m;
        wVar.f2005v = colorStateList;
        a1 a1Var = wVar.f2001r;
        if (a1Var == null || colorStateList == null) {
            return;
        }
        a1Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f3337z0 != z8) {
            this.f3337z0 = z8;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        w wVar = this.f3310m;
        if (zIsEmpty) {
            if (wVar.f2007x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!wVar.f2007x) {
            setHelperTextEnabled(true);
        }
        wVar.c();
        wVar.f2006w = charSequence;
        wVar.f2008y.setText(charSequence);
        int i = wVar.f1997n;
        if (i != 2) {
            wVar.f1998o = 2;
        }
        wVar.i(i, wVar.f1998o, wVar.h(wVar.f2008y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        w wVar = this.f3310m;
        wVar.A = colorStateList;
        a1 a1Var = wVar.f2008y;
        if (a1Var == null || colorStateList == null) {
            return;
        }
        a1Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z8) {
        w wVar = this.f3310m;
        TextInputLayout textInputLayout = wVar.f1992h;
        if (wVar.f2007x == z8) {
            return;
        }
        wVar.c();
        if (z8) {
            a1 a1Var = new a1(wVar.f1991g);
            wVar.f2008y = a1Var;
            a1Var.setId(com.ctwofficial.assistant.R.id.textinput_helper_text);
            wVar.f2008y.setTextAlignment(5);
            Typeface typeface = wVar.B;
            if (typeface != null) {
                wVar.f2008y.setTypeface(typeface);
            }
            wVar.f2008y.setVisibility(4);
            a1 a1Var2 = wVar.f2008y;
            WeakHashMap weakHashMap = v0.f7028a;
            a1Var2.setAccessibilityLiveRegion(1);
            int i = wVar.f2009z;
            wVar.f2009z = i;
            a1 a1Var3 = wVar.f2008y;
            if (a1Var3 != null) {
                a1Var3.setTextAppearance(i);
            }
            ColorStateList colorStateList = wVar.A;
            wVar.A = colorStateList;
            a1 a1Var4 = wVar.f2008y;
            if (a1Var4 != null && colorStateList != null) {
                a1Var4.setTextColor(colorStateList);
            }
            wVar.a(wVar.f2008y, 1);
            wVar.f2008y.setAccessibilityDelegate(new c6.v(wVar));
        } else {
            wVar.c();
            int i5 = wVar.f1997n;
            if (i5 == 2) {
                wVar.f1998o = 0;
            }
            wVar.i(i5, wVar.f1998o, wVar.h(wVar.f2008y, ""));
            wVar.g(wVar.f2008y, 1);
            wVar.f2008y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        wVar.f2007x = z8;
    }

    public void setHelperTextTextAppearance(int i) {
        w wVar = this.f3310m;
        wVar.f2009z = i;
        a1 a1Var = wVar.f2008y;
        if (a1Var != null) {
            a1Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.A0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.F) {
            this.F = z8;
            if (z8) {
                CharSequence hint = this.f3300g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.f3300g.setHint((CharSequence) null);
                }
                this.H = true;
            } else {
                this.H = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.f3300g.getHint())) {
                    this.f3300g.setHint(this.G);
                }
                setHintInternal(null);
            }
            if (this.f3300g != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f3335y0;
        View view = bVar.f6338a;
        u5.d dVar = new u5.d(view.getContext(), i);
        ColorStateList colorStateList = dVar.f7779j;
        if (colorStateList != null) {
            bVar.f6353k = colorStateList;
        }
        float f7 = dVar.f7780k;
        if (f7 != 0.0f) {
            bVar.i = f7;
        }
        ColorStateList colorStateList2 = dVar.f7771a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f7775e;
        bVar.T = dVar.f7776f;
        bVar.R = dVar.f7777g;
        bVar.V = dVar.i;
        u5.a aVar = bVar.f6367y;
        if (aVar != null) {
            aVar.f7765f = true;
        }
        i2.c cVar = new i2.c(12, bVar);
        dVar.a();
        bVar.f6367y = new u5.a(cVar, dVar.f7783n);
        dVar.c(view.getContext(), bVar.f6367y);
        bVar.h(false);
        this.f3311m0 = bVar.f6353k;
        if (this.f3300g != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3311m0 != colorStateList) {
            if (this.l0 == null) {
                b bVar = this.f3335y0;
                if (bVar.f6353k != colorStateList) {
                    bVar.f6353k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f3311m0 = colorStateList;
            if (this.f3300g != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(e0 e0Var) {
        this.f3318q = e0Var;
    }

    public void setMaxEms(int i) {
        this.f3305j = i;
        EditText editText = this.f3300g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f3309l = i;
        EditText editText = this.f3300g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.i = i;
        EditText editText = this.f3300g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f3307k = i;
        EditText editText = this.f3300g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        s sVar = this.f3298f;
        sVar.f1959j.setContentDescription(i != 0 ? sVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        s sVar = this.f3298f;
        sVar.f1959j.setImageDrawable(i != 0 ? g8.l.h(sVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        s sVar = this.f3298f;
        if (z8 && sVar.f1961l != 1) {
            sVar.f(1);
        } else if (z8) {
            sVar.getClass();
        } else {
            sVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        s sVar = this.f3298f;
        sVar.f1963n = colorStateList;
        p4.c.c(sVar.f1954d, sVar.f1959j, colorStateList, sVar.f1964o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        s sVar = this.f3298f;
        sVar.f1964o = mode;
        p4.c.c(sVar.f1954d, sVar.f1959j, sVar.f1963n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3330w == null) {
            a1 a1Var = new a1(getContext());
            this.f3330w = a1Var;
            a1Var.setId(com.ctwofficial.assistant.R.id.textinput_placeholder);
            a1 a1Var2 = this.f3330w;
            WeakHashMap weakHashMap = v0.f7028a;
            a1Var2.setImportantForAccessibility(2);
            h hVarD = d();
            this.f3336z = hVarD;
            hVarD.f3515e = 67L;
            this.A = d();
            setPlaceholderTextAppearance(this.f3334y);
            setPlaceholderTextColor(this.f3332x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3328v) {
                setPlaceholderTextEnabled(true);
            }
            this.f3326u = charSequence;
        }
        EditText editText = this.f3300g;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3334y = i;
        a1 a1Var = this.f3330w;
        if (a1Var != null) {
            a1Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3332x != colorStateList) {
            this.f3332x = colorStateList;
            a1 a1Var = this.f3330w;
            if (a1Var == null || colorStateList == null) {
                return;
            }
            a1Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        b0 b0Var = this.f3296e;
        b0Var.getClass();
        b0Var.f1899f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        b0Var.f1898e.setText(charSequence);
        b0Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f3296e.f1898e.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3296e.f1898e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(l lVar) {
        g gVar = this.I;
        if (gVar == null || gVar.f8611d.f8594a == lVar) {
            return;
        }
        this.O = lVar;
        b();
    }

    public void setStartIconCheckable(boolean z8) {
        this.f3296e.f1900g.setCheckable(z8);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? g8.l.h(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        b0 b0Var = this.f3296e;
        if (i < 0) {
            b0Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != b0Var.f1902j) {
            b0Var.f1902j = i;
            CheckableImageButton checkableImageButton = b0Var.f1900g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        b0 b0Var = this.f3296e;
        CheckableImageButton checkableImageButton = b0Var.f1900g;
        View.OnLongClickListener onLongClickListener = b0Var.f1904l;
        checkableImageButton.setOnClickListener(onClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        b0 b0Var = this.f3296e;
        b0Var.f1904l = onLongClickListener;
        CheckableImageButton checkableImageButton = b0Var.f1900g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p4.c.u(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        b0 b0Var = this.f3296e;
        b0Var.f1903k = scaleType;
        b0Var.f1900g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        b0 b0Var = this.f3296e;
        if (b0Var.f1901h != colorStateList) {
            b0Var.f1901h = colorStateList;
            p4.c.c(b0Var.f1897d, b0Var.f1900g, colorStateList, b0Var.i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        b0 b0Var = this.f3296e;
        if (b0Var.i != mode) {
            b0Var.i = mode;
            p4.c.c(b0Var.f1897d, b0Var.f1900g, b0Var.f1901h, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        this.f3296e.c(z8);
    }

    public void setSuffixText(CharSequence charSequence) {
        s sVar = this.f3298f;
        sVar.getClass();
        sVar.f1968s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sVar.f1969t.setText(charSequence);
        sVar.m();
    }

    public void setSuffixTextAppearance(int i) {
        this.f3298f.f1969t.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3298f.f1969t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d0 d0Var) {
        EditText editText = this.f3300g;
        if (editText != null) {
            v0.m(editText, d0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3297e0) {
            this.f3297e0 = typeface;
            this.f3335y0.m(typeface);
            w wVar = this.f3310m;
            if (typeface != wVar.B) {
                wVar.B = typeface;
                a1 a1Var = wVar.f2001r;
                if (a1Var != null) {
                    a1Var.setTypeface(typeface);
                }
                a1 a1Var2 = wVar.f2008y;
                if (a1Var2 != null) {
                    a1Var2.setTypeface(typeface);
                }
            }
            a1 a1Var3 = this.f3320r;
            if (a1Var3 != null) {
                a1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.f3294d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z8, boolean z9) {
        ColorStateList colorStateList;
        a1 a1Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f3300g;
        boolean z10 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3300g;
        boolean z11 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.l0;
        b bVar = this.f3335y0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.l0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3329v0) : this.f3329v0));
        } else if (m()) {
            a1 a1Var2 = this.f3310m.f2001r;
            bVar.i(a1Var2 != null ? a1Var2.getTextColors() : null);
        } else if (this.f3316p && (a1Var = this.f3320r) != null) {
            bVar.i(a1Var.getTextColors());
        } else if (z11 && (colorStateList = this.f3311m0) != null && bVar.f6353k != colorStateList) {
            bVar.f6353k = colorStateList;
            bVar.h(false);
        }
        s sVar = this.f3298f;
        b0 b0Var = this.f3296e;
        if (z10 || !this.f3337z0 || (isEnabled() && z11)) {
            if (z9 || this.f3333x0) {
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B0.cancel();
                }
                if (z8 && this.A0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f3333x0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f3300g;
                v(editText3 != null ? editText3.getText() : null);
                b0Var.f1905m = false;
                b0Var.e();
                sVar.f1970u = false;
                sVar.m();
                return;
            }
            return;
        }
        if (z9 || !this.f3333x0) {
            ValueAnimator valueAnimator2 = this.B0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B0.cancel();
            }
            if (z8 && this.A0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((i) this.I).B.f1925s.isEmpty() && e()) {
                ((i) this.I).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3333x0 = true;
            a1 a1Var3 = this.f3330w;
            if (a1Var3 != null && this.f3328v) {
                a1Var3.setText((CharSequence) null);
                r.a(this.f3294d, this.A);
                this.f3330w.setVisibility(4);
            }
            b0Var.f1905m = true;
            b0Var.e();
            sVar.f1970u = true;
            sVar.m();
        }
    }

    public final void v(Editable editable) {
        ((a3.h) this.f3318q).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3294d;
        if (length != 0 || this.f3333x0) {
            a1 a1Var = this.f3330w;
            if (a1Var == null || !this.f3328v) {
                return;
            }
            a1Var.setText((CharSequence) null);
            r.a(frameLayout, this.A);
            this.f3330w.setVisibility(4);
            return;
        }
        if (this.f3330w == null || !this.f3328v || TextUtils.isEmpty(this.f3326u)) {
            return;
        }
        this.f3330w.setText(this.f3326u);
        r.a(frameLayout, this.f3336z);
        this.f3330w.setVisibility(0);
        this.f3330w.bringToFront();
        announceForAccessibility(this.f3326u);
    }

    public final void w(boolean z8, boolean z9) {
        int defaultColor = this.f3319q0.getDefaultColor();
        int colorForState = this.f3319q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3319q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.W = colorForState2;
        } else if (z9) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }

    public final void x() {
        a1 a1Var;
        EditText editText;
        EditText editText2;
        if (this.I == null || this.R == 0) {
            return;
        }
        boolean z8 = false;
        boolean z9 = isFocused() || ((editText2 = this.f3300g) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3300g) != null && editText.isHovered())) {
            z8 = true;
        }
        if (!isEnabled()) {
            this.W = this.f3329v0;
        } else if (m()) {
            if (this.f3319q0 != null) {
                w(z9, z8);
            } else {
                this.W = getErrorCurrentTextColors();
            }
        } else if (!this.f3316p || (a1Var = this.f3320r) == null) {
            if (z9) {
                this.W = this.f3317p0;
            } else if (z8) {
                this.W = this.f3315o0;
            } else {
                this.W = this.f3313n0;
            }
        } else if (this.f3319q0 != null) {
            w(z9, z8);
        } else {
            this.W = a1Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        s sVar = this.f3298f;
        TextInputLayout textInputLayout = sVar.f1954d;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        TextInputLayout textInputLayout2 = sVar.f1954d;
        sVar.k();
        p4.c.s(textInputLayout2, sVar.f1956f, sVar.f1957g);
        p4.c.s(textInputLayout2, checkableImageButton, sVar.f1963n);
        if (sVar.a() instanceof n) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                p4.c.c(textInputLayout, checkableImageButton, sVar.f1963n, sVar.f1964o);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                j0.a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        b0 b0Var = this.f3296e;
        p4.c.s(b0Var.f1897d, b0Var.f1900g, b0Var.f1901h);
        if (this.R == 2) {
            int i = this.T;
            if (z9 && isEnabled()) {
                this.T = this.V;
            } else {
                this.T = this.U;
            }
            if (this.T != i && e() && !this.f3333x0) {
                if (e()) {
                    ((i) this.I).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.R == 1) {
            if (!isEnabled()) {
                this.f3291a0 = this.f3323s0;
            } else if (z8 && !z9) {
                this.f3291a0 = this.f3327u0;
            } else if (z9) {
                this.f3291a0 = this.f3325t0;
            } else {
                this.f3291a0 = this.f3321r0;
            }
        }
        b();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ctwofficial.assistant.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3296e.f1900g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3296e.b(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.i = -1;
        this.f3305j = -1;
        this.f3307k = -1;
        this.f3309l = -1;
        this.f3310m = new w(this);
        this.f3318q = new a3.h(3);
        this.f3292b0 = new Rect();
        this.f3293c0 = new Rect();
        this.f3295d0 = new RectF();
        this.f3303h0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f3335y0 = bVar;
        this.E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3294d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.f7892a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f6350g != 8388659) {
            bVar.f6350g = 8388659;
            bVar.h(false);
        }
        m mVarI = o5.n.i(context2, attributeSet, u4.a.M, i, com.ctwofficial.assistant.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        b0 b0Var = new b0(this, mVarI);
        this.f3296e = b0Var;
        TypedArray typedArray = (TypedArray) mVarI.f6726f;
        this.F = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.A0 = typedArray.getBoolean(47, true);
        this.f3337z0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.O = l.b(context2, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_Design_TextInputLayout).a();
        this.Q = context2.getResources().getDimensionPixelOffset(com.ctwofficial.assistant.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.S = typedArray.getDimensionPixelOffset(9, 0);
        this.U = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.V = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ctwofficial.assistant.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.T = this.U;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        k kVarF = this.O.f();
        if (dimension >= 0.0f) {
            kVarF.f8638e = new y5.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            kVarF.f8639f = new y5.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            kVarF.f8640g = new y5.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            kVarF.f8641h = new y5.a(dimension4);
        }
        this.O = kVarF.a();
        ColorStateList colorStateListK = h4.e.k(context2, mVarI, 7);
        if (colorStateListK != null) {
            int defaultColor = colorStateListK.getDefaultColor();
            this.f3321r0 = defaultColor;
            this.f3291a0 = defaultColor;
            if (colorStateListK.isStateful()) {
                this.f3323s0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.f3325t0 = colorStateListK.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3327u0 = colorStateListK.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3325t0 = this.f3321r0;
                ColorStateList colorStateListM = v.m(context2, com.ctwofficial.assistant.R.color.mtrl_filled_background_color);
                this.f3323s0 = colorStateListM.getColorForState(new int[]{-16842910}, -1);
                this.f3327u0 = colorStateListM.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3291a0 = 0;
            this.f3321r0 = 0;
            this.f3323s0 = 0;
            this.f3325t0 = 0;
            this.f3327u0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListX = mVarI.x(1);
            this.f3311m0 = colorStateListX;
            this.l0 = colorStateListX;
        }
        ColorStateList colorStateListK2 = h4.e.k(context2, mVarI, 14);
        this.f3317p0 = typedArray.getColor(14, 0);
        this.f3313n0 = g0.b.a(context2, com.ctwofficial.assistant.R.color.mtrl_textinput_default_box_stroke_color);
        this.f3329v0 = g0.b.a(context2, com.ctwofficial.assistant.R.color.mtrl_textinput_disabled_color);
        this.f3315o0 = g0.b.a(context2, com.ctwofficial.assistant.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListK2 != null) {
            setBoxStrokeColorStateList(colorStateListK2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(h4.e.k(context2, mVarI, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.D = mVarI.x(24);
        this.E = mVarI.x(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i5 = typedArray.getInt(34, 1);
        boolean z8 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z9 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z10 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f3324t = typedArray.getResourceId(22, 0);
        this.f3322s = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i5);
        setCounterOverflowTextAppearance(this.f3322s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3324t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(mVarI.x(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(mVarI.x(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(mVarI.x(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(mVarI.x(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(mVarI.x(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(mVarI.x(58));
        }
        s sVar = new s(this, mVarI);
        this.f3298f = sVar;
        boolean z11 = typedArray.getBoolean(0, true);
        mVarI.I();
        WeakHashMap weakHashMap = v0.f7028a;
        setImportantForAccessibility(2);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 >= 26) {
            m0.m(this, 1);
        }
        frameLayout.addView(b0Var);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(z11);
        setHelperTextEnabled(z9);
        setErrorEnabled(z8);
        setCounterEnabled(z10);
        setHelperText(text2);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3298f.f1959j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3298f.f1959j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3298f.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3298f.f1959j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        s sVar = this.f3298f;
        TextInputLayout textInputLayout = sVar.f1954d;
        CheckableImageButton checkableImageButton = sVar.f1959j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            p4.c.c(textInputLayout, checkableImageButton, sVar.f1963n, sVar.f1964o);
            p4.c.s(textInputLayout, checkableImageButton, sVar.f1963n);
        }
    }
}
