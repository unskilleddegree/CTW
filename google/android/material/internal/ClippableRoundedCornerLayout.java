package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f3220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3221e;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public final void a(float f7, float f9, float f10, float f11, float f12) {
        RectF rectF = new RectF(f7, f9, f10, f11);
        if (this.f3220d == null) {
            this.f3220d = new Path();
        }
        this.f3221e = f12;
        this.f3220d.reset();
        this.f3220d.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        this.f3220d.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f3220d == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f3220d);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f3221e;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
