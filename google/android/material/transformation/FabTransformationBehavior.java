package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import b5.c;
import com.ctwofficial.assistant.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d2.j;
import g6.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q2.e;
import r0.j0;
import r0.v0;
import s.i;
import v4.a;
import v4.d;
import v4.f;
import v4.g;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f3340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f3341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f3342h;
    public final int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3344k;

    public FabTransformationBehavior() {
        this.f3340f = new Rect();
        this.f3341g = new RectF();
        this.f3342h = new RectF();
        this.i = new int[2];
    }

    public static float B(e eVar, f fVar, float f7) {
        long j3 = fVar.f7902a;
        long j7 = fVar.f7903b;
        f fVarF = ((v4.e) eVar.f6708e).f("expansion");
        return a.a(f7, 0.0f, fVar.b().getInterpolation((((fVarF.f7902a + fVarF.f7903b) + 17) - j3) / j7));
    }

    public static Pair y(float f7, float f9, boolean z8, e eVar) {
        f fVarF;
        f fVarF2;
        if (f7 == 0.0f || f9 == 0.0f) {
            fVarF = ((v4.e) eVar.f6708e).f("translationXLinear");
            fVarF2 = ((v4.e) eVar.f6708e).f("translationYLinear");
        } else if ((!z8 || f9 >= 0.0f) && (z8 || f9 <= 0.0f)) {
            fVarF = ((v4.e) eVar.f6708e).f("translationXCurveDownwards");
            fVarF2 = ((v4.e) eVar.f6708e).f("translationYCurveDownwards");
        } else {
            fVarF = ((v4.e) eVar.f6708e).f("translationXCurveUpwards");
            fVarF2 = ((v4.e) eVar.f6708e).f("translationYCurveUpwards");
        }
        return new Pair(fVarF, fVarF2);
    }

    public final float A(View view, View view2, g gVar) {
        RectF rectF = this.f3341g;
        C(view, rectF);
        rectF.offset(this.f3343j, this.f3344k);
        RectF rectF2 = this.f3342h;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract e D(Context context, boolean z8);

    @Override // com.google.android.material.transformation.ExpandableBehavior, d0.b
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // d0.b
    public final void g(d0.e eVar) {
        if (eVar.f3391h == 0) {
            eVar.f3391h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0152  */
    /* JADX WARN: Code duplicated, block: B:97:0x0360  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z8, boolean z9) {
        ObjectAnimator objectAnimatorOfFloat;
        float f7;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        AnimatorSet animatorSetI;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        e eVarD = D(view2.getContext(), z8);
        if (z8) {
            this.f3343j = view.getTranslationX();
            this.f3344k = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = v0.f7028a;
        float fI = j0.i(view2) - j0.i(view);
        if (z8) {
            if (!z9) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        ((v4.e) eVarD.f6708e).f("elevation").a(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (g) eVarD.f6709f);
        float fA = A(view, view2, (g) eVarD.f6709f);
        Pair pairY = y(fZ, fA, z8, eVarD);
        f fVar = (f) pairY.first;
        f fVar2 = (f) pairY.second;
        RectF rectF = this.f3342h;
        Rect rect = this.f3340f;
        RectF rectF2 = this.f3341g;
        if (z8) {
            f7 = 0.0f;
            if (!z9) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(eVarD, fVar, -fZ);
            float fB2 = B(eVarD, fVar2, -fA);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            C(view2, rectF);
            rectF.offset(fB, fB2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f7 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        fVar.a(objectAnimatorOfFloat2);
        fVar2.a(objectAnimatorOfFloat3);
        arrayList2.add(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat3);
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fZ2 = z(view, view2, (g) eVarD.f6709f);
        float fA2 = A(view, view2, (g) eVarD.f6709f);
        Pair pairY2 = y(fZ2, fA2, z8, eVarD);
        f fVar3 = (f) pairY2.first;
        f fVar4 = (f) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z8) {
            fZ2 = this.f3343j;
        }
        float f9 = fA2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fZ2);
        Property property2 = View.TRANSLATION_Y;
        if (!z8) {
            f9 = this.f3344k;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f9);
        fVar3.a(objectAnimatorOfFloat7);
        fVar4.a(objectAnimatorOfFloat8);
        arrayList2.add(objectAnimatorOfFloat7);
        arrayList2.add(objectAnimatorOfFloat8);
        boolean z10 = view2 instanceof g5.f;
        if (z10 && (view instanceof ImageView)) {
            g5.f fVar5 = (g5.f) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList3;
            } else {
                drawable.mutate();
                if (z8) {
                    if (!z9) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, d.f7899a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, d.f7899a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new c(2, view2));
                ((v4.e) eVarD.f6708e).f("iconFade").a(objectAnimatorOfInt2);
                arrayList2.add(objectAnimatorOfInt2);
                j jVar = new j(fVar5, 1, drawable);
                arrayList = arrayList3;
                arrayList.add(jVar);
            }
        } else {
            arrayList = arrayList3;
        }
        if (z10) {
            g5.f fVar6 = (g5.f) view2;
            g gVar = (g) eVarD.f6709f;
            C(view, rectF2);
            rectF2.offset(this.f3343j, this.f3344k);
            C(view2, rectF);
            rectF.offset(-z(view, view2, gVar), f7);
            float fCenterX = rectF2.centerX() - rectF.left;
            g gVar2 = (g) eVarD.f6709f;
            C(view, rectF2);
            rectF2.offset(this.f3343j, this.f3344k);
            C(view2, rectF);
            rectF.offset(0.0f, -A(view, view2, gVar2));
            float fCenterY = rectF2.centerY() - rectF.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (floatingActionButton.isLaidOut()) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.j(rect);
            }
            float fWidth2 = rect.width() / 2.0f;
            f fVarF = ((v4.e) eVarD.f6708e).f("expansion");
            if (z8) {
                if (!z9) {
                    fVar6.setRevealInfo(new g5.e(fCenterX, fCenterY, fWidth2));
                }
                if (z9) {
                    fWidth2 = fVar6.getRevealInfo().f4227c;
                }
                animatorSetI = q2.f.i(fVar6, fCenterX, fCenterY, b.h(fCenterX, fCenterY, fWidth, fHeight));
                animatorSetI.addListener(new f6.c(fVar6, 0));
                long j3 = fVarF.f7902a;
                int i5 = (int) fCenterX;
                int i9 = (int) fCenterY;
                if (j3 > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i5, i9, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j3);
                    arrayList2.add(animatorCreateCircularReveal);
                }
            } else {
                float f10 = fVar6.getRevealInfo().f4227c;
                AnimatorSet animatorSetI2 = q2.f.i(fVar6, fCenterX, fCenterY, fWidth2);
                long j7 = fVarF.f7902a;
                int i10 = (int) fCenterX;
                int i11 = (int) fCenterY;
                if (j7 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i10, i11, f10, f10);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j7);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                long j8 = fVarF.f7902a;
                long j9 = fVarF.f7903b;
                i iVar = ((v4.e) eVarD.f6708e).f7900a;
                int i12 = iVar.f7332f;
                long jMax = 0;
                int i13 = 0;
                while (i13 < i12) {
                    i iVar2 = iVar;
                    f fVar7 = (f) iVar.j(i13);
                    jMax = Math.max(jMax, fVar7.f7902a + fVar7.f7903b);
                    i13++;
                    iVar = iVar2;
                    j8 = j8;
                }
                long j10 = j8 + j9;
                if (j10 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i10, i11, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j10);
                    animatorCreateCircularReveal3.setDuration(jMax - j10);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
                animatorSetI = animatorSetI2;
            }
            fVarF.a(animatorSetI);
            arrayList2.add(animatorSetI);
            arrayList.add(new f6.c(fVar6, 1));
        }
        if (z10) {
            g5.f fVar8 = (g5.f) view2;
            WeakHashMap weakHashMap2 = v0.f7028a;
            ColorStateList colorStateListG = j0.g(view);
            int colorForState = colorStateListG != null ? colorStateListG.getColorForState(view.getDrawableState(), colorStateListG.getDefaultColor()) : 0;
            int i14 = 16777215 & colorForState;
            if (z8) {
                if (!z9) {
                    fVar8.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(fVar8, g5.d.f4224a, i14);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(fVar8, g5.d.f4224a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(v4.b.f7897a);
            ((v4.e) eVarD.f6708e).f("color").a(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof f6.f) || (view2 instanceof f6.e)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i = 0;
            } else {
                if (z8) {
                    if (!z9) {
                        v4.c.f7898a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, v4.c.f7898a, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, v4.c.f7898a, 0.0f);
                }
                ((v4.e) eVarD.f6708e).f("contentFade").a(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
        } else {
            i = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.bumptech.glide.c.E(animatorSet, arrayList2);
        animatorSet.addListener(new f6.b(z8, view2, view));
        int size = arrayList.size();
        for (int i15 = i; i15 < size; i15++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i15));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, g gVar) {
        RectF rectF = this.f3341g;
        C(view, rectF);
        rectF.offset(this.f3343j, this.f3344k);
        RectF rectF2 = this.f3342h;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3340f = new Rect();
        this.f3341g = new RectF();
        this.f3342h = new RectF();
        this.i = new int[2];
    }
}
