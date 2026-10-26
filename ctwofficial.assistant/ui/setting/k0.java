package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.AdapterView;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedSettingsActivity f2649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f2650e;

    static {
        Protect.classesInit0(95);
    }

    public k0(SharedSettingsActivity sharedSettingsActivity, String[] strArr) {
        this.f2649d = sharedSettingsActivity;
        this.f2650e = strArr;
        if (new Date().after(new Date(1796922002706L ^ 3986))) {
            System.exit(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onItemSelected(AdapterView adapterView, View view, int i, long j3);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onNothingSelected(AdapterView adapterView);
}
