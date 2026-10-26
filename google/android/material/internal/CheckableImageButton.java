package com.google.android.material.internal;

import a6.f;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import n.y;
import o5.a;
import r0.v0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends y implements Checkable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f3217j = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3219h;
    public boolean i;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3218g;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f3218g ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3217j) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f497d);
        setChecked(aVar.f6337f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f6337f = this.f3218g;
        return aVar;
    }

    public void setCheckable(boolean z8) {
        if (this.f3219h != z8) {
            this.f3219h = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (!this.f3219h || this.f3218g == z8) {
            return;
        }
        this.f3218g = z8;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z8) {
        this.i = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.i) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3218g);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ctwofficial.assistant.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3219h = true;
        this.i = true;
        v0.m(this, new f(2, this));
    }
}
