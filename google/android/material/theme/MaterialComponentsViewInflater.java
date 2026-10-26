package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import c6.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import h.i0;
import n.a1;
import n.d0;
import n.q;
import n.r;
import t5.a;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends i0 {
    @Override // h.i0
    public final q a(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    @Override // h.i0
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.i0
    public final r c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // h.i0
    public final d0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // h.i0
    public final a1 e(Context context, AttributeSet attributeSet) {
        return new d6.a(context, attributeSet);
    }
}
