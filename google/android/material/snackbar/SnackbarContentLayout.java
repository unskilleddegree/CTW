package com.google.android.material.snackbar;

import a6.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ctwofficial.assistant.R;
import java.util.WeakHashMap;
import q2.f;
import r0.v0;
import v4.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f3281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f3282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3284g;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public final boolean a(int i, int i5, int i9) {
        boolean z8;
        if (i != getOrientation()) {
            setOrientation(i);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f3281d.getPaddingTop() == i5 && this.f3281d.getPaddingBottom() == i9) {
            return z8;
        }
        TextView textView = this.f3281d;
        WeakHashMap weakHashMap = v0.f7028a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f3282e;
    }

    public TextView getMessageView() {
        return this.f3281d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3281d = (TextView) findViewById(R.id.snackbar_text);
        this.f3282e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f3281d.getLayout();
        boolean z8 = layout != null && layout.getLineCount() > 1;
        if (!z8 || this.f3284g <= 0 || this.f3282e.getMeasuredWidth() <= this.f3284g) {
            if (!z8) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i5);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3284g = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3283f = f.r(context, R.attr.motionEasingEmphasizedInterpolator, a.f7893b);
    }
}
