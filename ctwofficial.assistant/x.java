package com.ctwofficial.assistant;

import android.content.SharedPreferences;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements SharedPreferences.OnSharedPreferenceChangeListener {
    static {
        Protect.classesInit0(187);
    }

    public /* synthetic */ x() {
        if (new Date().after(new Date(1796922007523L ^ 7523))) {
            System.exit(0);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final native void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str);
}
