package com.google.android.gms.common.api.internal;

import a4.u;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import h.k;
import i1.a;
import i1.e0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z3.d;
import z3.e;
import z3.y;
import z3.z;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3011d;

    public LifecycleCallback(e eVar) {
        this.f3011d = eVar;
    }

    public static e b(Activity activity) {
        y yVar;
        z zVar;
        u.c(activity, "Activity must not be null");
        if (!(activity instanceof k)) {
            WeakHashMap weakHashMap = y.f9178g;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (yVar = (y) weakReference.get()) != null) {
                return yVar;
            }
            try {
                y yVar2 = (y) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (yVar2 == null || yVar2.isRemoving()) {
                    yVar2 = new y();
                    activity.getFragmentManager().beginTransaction().add(yVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(yVar2));
                return yVar2;
            } catch (ClassCastException e4) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
            }
        }
        k kVar = (k) activity;
        WeakHashMap weakHashMap2 = z.Z;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(kVar);
        if (weakReference2 != null && (zVar = (z) weakReference2.get()) != null) {
            return zVar;
        }
        try {
            z zVar2 = (z) kVar.k().B("SupportLifecycleFragmentImpl");
            if (zVar2 == null || zVar2.f4819o) {
                zVar2 = new z();
                e0 e0VarK = kVar.k();
                e0VarK.getClass();
                a aVar = new a(e0VarK);
                aVar.e(0, zVar2, "SupportLifecycleFragmentImpl", 1);
                aVar.d(true);
            }
            weakHashMap2.put(kVar, new WeakReference(zVar2));
            return zVar2;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Keep
    private static e getChimeraLifecycleFragmentImpl(d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z3.e] */
    public final Activity a() {
        Activity activityF = this.f3011d.f();
        u.b(activityF);
        return activityF;
    }

    public void c(int i, int i5, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void e() {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }
}
