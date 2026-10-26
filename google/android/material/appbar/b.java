package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s0.h;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3075f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f3075f = baseBehavior;
        this.f3073d = appBarLayout;
        this.f3074e = coordinatorLayout;
    }

    @Override // r0.b
    public final void d(View view, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f7353a;
        this.f6940a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        AppBarLayout appBarLayout = this.f3073d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f3074e;
        AppBarLayout.BaseBehavior baseBehavior = this.f3075f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((w4.b) appBarLayout.getChildAt(i).getLayoutParams()).f8106a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    hVar.a(s0.c.f7341f);
                    hVar.k();
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        hVar.a(s0.c.f7342g);
                        hVar.k();
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            hVar.a(s0.c.f7342g);
                            hVar.k();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // r0.b
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f3073d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f3075f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f3074e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i5 = -appBarLayout.getDownNestedPreScrollRange();
            if (i5 != 0) {
                baseBehavior.E(coordinatorLayout, this.f3073d, viewB, i5, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
