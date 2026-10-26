package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.m;
import com.ctwofficial.assistant.R;
import com.google.android.material.appbar.AppBarLayout;
import g8.l;
import j0.a;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n6.e;
import o5.n;
import r0.j0;
import r0.v0;
import w5.b;
import y5.f;
import y5.g;
import y5.h;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f3223m0 = 0;
    public final TextView U;
    public final boolean V;
    public final boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e f3224a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Drawable f3225b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f3226c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f3227d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f3228e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Integer f3229f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Drawable f3230g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f3231h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f3232i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final g f3233j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final AccessibilityManager f3234k0;
    public final m l0;

    public SearchBar(Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z8) {
        ImageButton imageButtonF = n.f(this);
        if (imageButtonF == null) {
            return;
        }
        imageButtonF.setClickable(!z8);
        imageButtonF.setFocusable(!z8);
        Drawable background = imageButtonF.getBackground();
        if (background != null) {
            this.f3230g0 = background;
        }
        imageButtonF.setBackgroundDrawable(z8 ? null : this.f3230g0);
        v();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.V && this.f3228e0 == null && !(view instanceof ActionMenuView)) {
            this.f3228e0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.f3228e0;
    }

    public float getCompatElevation() {
        g gVar = this.f3233j0;
        if (gVar != null) {
            return gVar.f8611d.f8605m;
        }
        WeakHashMap weakHashMap = v0.f7028a;
        return j0.i(this);
    }

    public float getCornerSize() {
        return this.f3233j0.f();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.U.getHint();
    }

    public int getMenuResId() {
        return this.f3231h0;
    }

    public int getStrokeColor() {
        return this.f3233j0.f8611d.f8597d.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f3233j0.f8611d.f8602j;
    }

    public CharSequence getText() {
        return this.U.getText();
    }

    public TextView getTextView() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z8 = menu instanceof m.n;
        if (z8) {
            ((m.n) menu).w();
        }
        super.m(i);
        this.f3231h0 = i;
        if (z8) {
            ((m.n) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, this.f3233j0);
        if (this.W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i5 = marginLayoutParams.topMargin;
            if (i5 == 0) {
                i5 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i5;
            int i9 = marginLayoutParams.rightMargin;
            if (i9 != 0) {
                dimensionPixelSize = i9;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i10 = marginLayoutParams.bottomMargin;
            if (i10 != 0) {
                dimensionPixelSize2 = i10;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        w();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        super.onLayout(z8, i, i5, i9, i10);
        View view = this.f3228e0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i11 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f3228e0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i12 = measuredHeight + measuredHeight2;
            View view2 = this.f3228e0;
            WeakHashMap weakHashMap = v0.f7028a;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i11, measuredHeight2, getMeasuredWidth() - measuredWidth2, i12);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i11, i12);
            }
        }
        v();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        View view = this.f3228e0;
        if (view != null) {
            view.measure(i, i5);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f497d);
        setText(bVar.f8126f);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        CharSequence text = getText();
        bVar.f8126f = text == null ? null : text.toString();
        return bVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f3228e0;
        if (view2 != null) {
            removeView(view2);
            this.f3228e0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z8) {
        this.f3232i0 = z8;
        w();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        g gVar = this.f3233j0;
        if (gVar != null) {
            gVar.i(f7);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iJ;
        if (this.f3226c0 && drawable != null) {
            Integer num = this.f3229f0;
            if (num != null) {
                iJ = num.intValue();
            } else {
                iJ = g6.b.j(this, drawable == this.f3225b0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            a.g(drawable, iJ);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f3227d0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z8) {
        this.f3224a0.getClass();
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
            g gVar = this.f3233j0;
            f fVar = gVar.f8611d;
            if (fVar.f8597d != colorStateListValueOf) {
                fVar.f8597d = colorStateListValueOf;
                gVar.onStateChange(gVar.getState());
            }
        }
    }

    public void setStrokeWidth(float f7) {
        if (getStrokeWidth() != f7) {
            g gVar = this.f3233j0;
            gVar.f8611d.f8602j = f7;
            gVar.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void v() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z8 = getLayoutDirection() == 1;
        ImageButton imageButtonF = n.f(this);
        if (imageButtonF == null || !imageButtonF.isClickable()) {
            width = 0;
        } else {
            width = z8 ? getWidth() - imageButtonF.getLeft() : imageButtonF.getRight();
        }
        ActionMenuView actionMenuViewE = n.e(this);
        if (actionMenuViewE != null) {
            right = z8 ? actionMenuViewE.getRight() : getWidth() - actionMenuViewE.getLeft();
        }
        float f7 = -(z8 ? right : width);
        if (!z8) {
            width = right;
        }
        setHandwritingBoundsOffsets(f7, 0.0f, -width, 0.0f);
    }

    public final void w() {
        if (getLayoutParams() instanceof w4.b) {
            w4.b bVar = (w4.b) getLayoutParams();
            if (this.f3232i0) {
                if (bVar.f8106a == 0) {
                    bVar.f8106a = 53;
                }
            } else if (bVar.f8106a == 53) {
                bVar.f8106a = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3235j;

        public ScrollingViewBehavior() {
            this.f3235j = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, d0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.f3235j && (view2 instanceof AppBarLayout)) {
                this.f3235j = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3235j = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(int i) {
        this.U.setHint(i);
    }

    public void setText(int i) {
        this.U.setText(i);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.f3231h0 = -1;
        this.l0 = new m(8, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableH = l.h(context2, getDefaultNavigationIconResource());
        this.f3225b0 = drawableH;
        e eVar = new e();
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3224a0 = eVar;
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.E, i, R.style.Widget_Material3_SearchBar, new int[0]);
        y5.l lVarA = y5.l.b(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayH.getColor(3, 0);
        float dimension = typedArrayH.getDimension(6, 0.0f);
        this.W = typedArrayH.getBoolean(4, true);
        this.f3232i0 = typedArrayH.getBoolean(5, true);
        boolean z8 = typedArrayH.getBoolean(8, false);
        this.f3227d0 = typedArrayH.getBoolean(7, false);
        this.f3226c0 = typedArrayH.getBoolean(12, true);
        if (typedArrayH.hasValue(9)) {
            this.f3229f0 = Integer.valueOf(typedArrayH.getColor(9, -1));
        }
        int resourceId = typedArrayH.getResourceId(0, -1);
        String string = typedArrayH.getString(1);
        String string2 = typedArrayH.getString(2);
        float dimension2 = typedArrayH.getDimension(11, -1.0f);
        int color2 = typedArrayH.getColor(10, 0);
        typedArrayH.recycle();
        if (!z8) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableH);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.V = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.U = textView;
        WeakHashMap weakHashMap = v0.f7028a;
        j0.s(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        g gVar = new g(lVarA);
        this.f3233j0 = gVar;
        gVar.h(getContext());
        this.f3233j0.i(dimension);
        if (dimension2 >= 0.0f) {
            g gVar2 = this.f3233j0;
            gVar2.f8611d.f8602j = dimension2;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(color2);
            f fVar = gVar2.f8611d;
            if (fVar.f8597d != colorStateListValueOf) {
                fVar.f8597d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iJ = g6.b.j(this, R.attr.colorControlHighlight);
        this.f3233j0.j(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iJ);
        g gVar3 = this.f3233j0;
        setBackground(new RippleDrawable(colorStateListValueOf2, gVar3, gVar3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3234k0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new w5.a(this));
        }
    }
}
