package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import g6.b;
import java.util.WeakHashMap;
import l5.a;
import n.d3;
import o5.n;
import r0.j0;
import r0.v0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends d3 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[][] f3285d0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final a W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f3286a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorStateList f3287b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f3288c0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f3286a0 == null) {
            int iJ = b.j(this, com.ctwofficial.assistant.R.attr.colorSurface);
            int iJ2 = b.j(this, com.ctwofficial.assistant.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.ctwofficial.assistant.R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.W;
            if (aVar.f5437a) {
                float fI = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = v0.f7028a;
                    fI += j0.i((View) parent);
                }
                dimension += fI;
            }
            int iA = aVar.a(iJ, dimension);
            this.f3286a0 = new ColorStateList(f3285d0, new int[]{b.q(iJ, iJ2, 1.0f), iA, b.q(iJ, iJ2, 0.38f), iA});
        }
        return this.f3286a0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f3287b0 == null) {
            int iJ = b.j(this, com.ctwofficial.assistant.R.attr.colorSurface);
            int iJ2 = b.j(this, com.ctwofficial.assistant.R.attr.colorControlActivated);
            int iJ3 = b.j(this, com.ctwofficial.assistant.R.attr.colorOnSurface);
            this.f3287b0 = new ColorStateList(f3285d0, new int[]{b.q(iJ, iJ2, 0.54f), b.q(iJ, iJ3, 0.32f), b.q(iJ, iJ2, 0.12f), b.q(iJ, iJ3, 0.12f)});
        }
        return this.f3287b0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3288c0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f3288c0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f3288c0 = z8;
        if (z8) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ctwofficial.assistant.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.W = new a(context2);
        n.b(context2, attributeSet, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = u4.a.J;
        n.c(context2, attributeSet, iArr, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.ctwofficial.assistant.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f3288c0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
