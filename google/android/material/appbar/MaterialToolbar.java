package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m.n;
import r0.j0;
import r0.v0;
import y5.g;
import y5.h;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f3067c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView.ScaleType f3068a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Boolean f3069b0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3068a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z8 = menu instanceof n;
        if (z8) {
            ((n) menu).w();
        }
        super.m(i);
        if (z8) {
            ((n) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i5, int i9, int i10) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z8, i, i5, i9, i10);
        v vVar = o5.n.f6399c;
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList arrayListG = o5.n.g(this, getTitle());
            TextView textView = arrayListG.isEmpty() ? null : (TextView) Collections.min(arrayListG, vVar);
            ArrayList arrayListG2 = o5.n.g(this, getSubtitle());
            TextView textView2 = arrayListG2.isEmpty() ? null : (TextView) Collections.max(arrayListG2, vVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    v(textView, pair);
                }
                if (this.W && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3069b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3068a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f7);
        }
    }

    public void setLogoAdjustViewBounds(boolean z8) {
        Boolean bool = this.f3069b0;
        if (bool == null || bool.booleanValue() != z8) {
            this.f3069b0 = Boolean.valueOf(z8);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3068a0 != scaleType) {
            this.f3068a0 = scaleType;
            requestLayout();
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

    public void setSubtitleCentered(boolean z8) {
        if (this.W != z8) {
            this.W = z8;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z8) {
        if (this.V != z8) {
            this.V = z8;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i5 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i5, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListA;
        super(e6.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayH = o5.n.h(context2, attributeSet, u4.a.A, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayH.hasValue(2)) {
            setNavigationIconTint(typedArrayH.getColor(2, -1));
        }
        this.V = typedArrayH.getBoolean(4, false);
        this.W = typedArrayH.getBoolean(3, false);
        int i5 = typedArrayH.getInt(1, -1);
        if (i5 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3067c0;
            if (i5 < scaleTypeArr.length) {
                this.f3068a0 = scaleTypeArr[i5];
            }
        }
        if (typedArrayH.hasValue(0)) {
            this.f3069b0 = Boolean.valueOf(typedArrayH.getBoolean(0, false));
        }
        typedArrayH.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListA = ColorStateList.valueOf(0);
        } else {
            colorStateListA = c2.a.a(background);
        }
        if (colorStateListA != null) {
            g gVar = new g();
            gVar.j(colorStateListA);
            gVar.h(context2);
            WeakHashMap weakHashMap = v0.f7028a;
            gVar.i(j0.i(this));
            setBackground(gVar);
        }
    }
}
