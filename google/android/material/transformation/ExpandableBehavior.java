package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d0.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m5.a;
import r0.v0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3338d = 0;

    public ExpandableBehavior() {
    }

    @Override // d0.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z8 = ((FloatingActionButton) obj).f3212r.f5704b;
        if (z8) {
            int i = this.f3338d;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f3338d != 1) {
            return false;
        }
        this.f3338d = z8 ? 1 : 2;
        w((View) obj, view, z8, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d0.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        a aVar;
        int i5;
        WeakHashMap weakHashMap = v0.f7028a;
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListJ.get(i9);
                if (f(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i9++;
            }
            if (aVar != null) {
                boolean z8 = ((FloatingActionButton) aVar).f3212r.f5704b;
                if (!z8 ? this.f3338d == 1 : !((i5 = this.f3338d) != 0 && i5 != 2)) {
                    int i10 = z8 ? 1 : 2;
                    this.f3338d = i10;
                    view.getViewTreeObserver().addOnPreDrawListener(new f6.a(this, view, i10, aVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z8, boolean z9);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
