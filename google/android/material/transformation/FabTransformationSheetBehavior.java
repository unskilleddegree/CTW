package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ctwofficial.assistant.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import q2.e;
import r0.v0;
import v4.g;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f3347l;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final e D(Context context, boolean z8) {
        int i = z8 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        e eVar = new e(4, false);
        eVar.f6708e = v4.e.b(context, i);
        eVar.f6709f = new g();
        return eVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z8, boolean z9) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                this.f3347l = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z10 = (childAt.getLayoutParams() instanceof d0.e) && (((d0.e) childAt.getLayoutParams()).f3384a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z10) {
                    if (z8) {
                        this.f3347l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = v0.f7028a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f3347l;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f3347l.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = v0.f7028a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z8) {
                this.f3347l = null;
            }
        }
        super.w(view, view2, z8, z9);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
