package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import h2.v;
import i1.e0;
import i1.p;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m3.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile b f2103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f2104l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3.b f2105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b3.f f2106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f2107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3.g f2108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.l f2109h;
    public final x3.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2110j = new ArrayList();

    public b(Context context, z2.m mVar, b3.f fVar, a3.b bVar, a3.g gVar, m3.l lVar, x3.h hVar, y5.e eVar, s.e eVar2, List list, ArrayList arrayList, g8.l lVar2, a6.e eVar3) {
        this.f2105d = bVar;
        this.f2108g = gVar;
        this.f2106e = fVar;
        this.f2109h = lVar;
        this.i = hVar;
        this.f2107f = new e(context, gVar, new r(this, arrayList, lVar2), new n6.g(4), eVar, eVar2, list, mVar, eVar3);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2103k == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (InstantiationException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            }
            synchronized (b.class) {
                if (f2103k == null) {
                    if (f2104l) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f2104l = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f2104l = false;
                    } catch (Throwable th) {
                        f2104l = false;
                        throw th;
                    }
                }
            }
        }
        return f2103k;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        s.e eVar = new s.e(0);
        f fVar = new f(0);
        y5.e eVar2 = new y5.e(7);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        v.n(str);
                        throw null;
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw com.ctwofficial.assistant.ui.setting.service.h.j(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw com.ctwofficial.assistant.ui.setting.service.h.j(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw com.ctwofficial.assistant.ui.setting.service.h.j(it3);
        }
        c3.b bVar = new c3.b();
        if (c3.f.f1849f == 0) {
            c3.f.f1849f = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = c3.f.f1849f;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3.f fVar2 = new c3.f(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new c3.d(bVar, "source", false)));
        c3.b bVar2 = new c3.b();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        c3.f fVar3 = new c3.f(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new c3.d(bVar2, "disk-cache", true)));
        if (c3.f.f1849f == 0) {
            c3.f.f1849f = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i5 = c3.f.f1849f >= 4 ? 2 : 1;
        c3.b bVar3 = new c3.b();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        c3.f fVar4 = new c3.f(new ThreadPoolExecutor(i5, i5, 0L, timeUnit, new PriorityBlockingQueue(), new c3.d(bVar3, "animation", true)));
        b3.g gVar = new b3.g(applicationContext);
        b3.h hVar = new b3.h();
        Context context2 = gVar.f1652a;
        float f7 = gVar.f1655d;
        ActivityManager activityManager = gVar.f1653b;
        int i9 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        hVar.f1658c = i9;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) gVar.f1654c.f670e;
        float f9 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f9 * f7);
        int iRound3 = Math.round(f9 * 2.0f);
        int i10 = iRound - i9;
        if (iRound3 + iRound2 <= i10) {
            hVar.f1657b = iRound3;
            hVar.f1656a = iRound2;
        } else {
            float f10 = i10 / (f7 + 2.0f);
            hVar.f1657b = Math.round(2.0f * f10);
            hVar.f1656a = Math.round(f10 * f7);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context2, hVar.f1657b);
            Formatter.formatFileSize(context2, hVar.f1656a);
            Formatter.formatFileSize(context2, i9);
            Formatter.formatFileSize(context2, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
        x3.h hVar2 = new x3.h(23);
        int i11 = hVar.f1656a;
        a3.b iVar = i11 > 0 ? new a3.i(i11) : new x3.h(2);
        a3.g gVar2 = new a3.g(hVar.f1658c);
        b3.f fVar5 = new b3.f(hVar.f1657b);
        b bVar4 = new b(applicationContext, new z2.m(fVar5, new a6.e(applicationContext), fVar3, fVar2, new c3.f(new ThreadPoolExecutor(0, Integer.MAX_VALUE, c3.f.f1848e, timeUnit, new SynchronousQueue(), new c3.d(new c3.b(), "source-unlimited", false))), fVar4), fVar5, iVar, gVar2, new m3.l(), hVar2, eVar2, eVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new a6.e(fVar));
        applicationContext.registerComponentCallbacks(bVar4);
        f2103k = bVar4;
    }

    public static n c(View view) {
        View view2;
        Context context = view.getContext();
        t3.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m3.l lVar = a(context).f2109h;
        lVar.getClass();
        char[] cArr = t3.n.f7627a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        t3.f.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = m3.l.a(view.getContext());
        if (activityA == null) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof h.k)) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        h.k kVar = (h.k) activityA;
        s.e eVar = lVar.f5685b;
        eVar.clear();
        m3.l.b(kVar.k().f4706c.n(), eVar);
        View viewFindViewById = kVar.findViewById(R.id.content);
        p pVar = null;
        while (!view.equals(viewFindViewById) && (pVar = (p) eVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        eVar.clear();
        if (pVar == null) {
            return lVar.d(kVar);
        }
        t3.f.c(pVar.l(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return lVar.c(pVar.l().getApplicationContext());
        }
        i1.r rVar = pVar.f4826v;
        if ((rVar == null ? null : rVar.f4844e) != null) {
            lVar.f5686c.n(rVar != null ? rVar.f4844e : null);
        }
        e0 e0VarK = pVar.k();
        Context contextL = pVar.l();
        return lVar.f5687d.l(contextL, a(contextL.getApplicationContext()), pVar.P, e0VarK, (!pVar.q() || pVar.r() || (view2 = pVar.H) == null || view2.getWindowToken() == null || pVar.H.getVisibility() != 0) ? false : true);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        t3.n.a();
        this.f2106e.e(0L);
        this.f2105d.f();
        a3.g gVar = this.f2108g;
        synchronized (gVar) {
            gVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j3;
        t3.n.a();
        synchronized (this.f2110j) {
            try {
                ArrayList arrayList = this.f2110j;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((n) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b3.f fVar = this.f2106e;
        fVar.getClass();
        if (i >= 40) {
            fVar.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (fVar) {
                j3 = fVar.f7620b;
            }
            fVar.e(j3 / 2);
        }
        this.f2105d.e(i);
        a3.g gVar = this.f2108g;
        synchronized (gVar) {
            try {
                if (i >= 40) {
                    synchronized (gVar) {
                        gVar.b(0);
                    }
                } else if (i >= 20 || i == 15) {
                    gVar.b(gVar.f513e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
