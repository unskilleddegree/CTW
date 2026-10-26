package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ctwofficial.assistant.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d0.e;
import o5.t;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f3119a;

    public a(BottomAppBar.Behavior behavior) {
        this.f3119a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i5, int i9, int i10, int i11, int i12, int i13, int i14) {
        BottomAppBar.Behavior behavior = this.f3119a;
        Rect rect = behavior.f3115m;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f3116n.get();
        if (bottomAppBar != null) {
            int i15 = bottomAppBar.f3100e0;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.j(rect);
                    int iHeight = rect.height();
                    bottomAppBar.H(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f8650e.a(new RectF(rect)));
                    height = iHeight;
                }
                e eVar = (e) view.getLayoutParams();
                if (behavior.f3117o == 0) {
                    if (bottomAppBar.f3099d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (t.c(view)) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i15;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i15;
                    }
                }
                int i16 = BottomAppBar.f3095u0;
                bottomAppBar.G();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
