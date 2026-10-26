package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.x;
import h2.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.r;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ComponentCallbacks2, m3.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p3.e f2188n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.g f2191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f2192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.m f2193h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f2194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.b f2195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f2196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3.e f2197m;

    static {
        p3.e eVar = (p3.e) new p3.e().c(Bitmap.class);
        eVar.f6634p = true;
        f2188n = eVar;
        ((p3.e) new p3.e().c(k3.b.class)).f6634p = true;
    }

    public n(b bVar, m3.g gVar, m3.m mVar, Context context) {
        p3.e eVar;
        r rVar = new r(2);
        x3.h hVar = bVar.i;
        this.i = new s();
        x xVar = new x(5, this);
        this.f2194j = xVar;
        this.f2189d = bVar;
        this.f2191f = gVar;
        this.f2193h = mVar;
        this.f2192g = rVar;
        this.f2190e = context;
        Context applicationContext = context.getApplicationContext();
        m mVar2 = new m(this, rVar);
        hVar.getClass();
        boolean z8 = v.g(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        m3.b cVar = z8 ? new m3.c(applicationContext, mVar2) : new m3.k();
        this.f2195k = cVar;
        synchronized (bVar.f2110j) {
            if (bVar.f2110j.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f2110j.add(this);
        }
        char[] cArr = t3.n.f7627a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.b(this);
        } else {
            t3.n.f().post(xVar);
        }
        gVar.b(cVar);
        this.f2196l = new CopyOnWriteArrayList(bVar.f2107f.f2130e);
        e eVar2 = bVar.f2107f;
        synchronized (eVar2) {
            try {
                if (eVar2.f2134j == null) {
                    eVar2.f2129d.getClass();
                    p3.e eVar3 = new p3.e();
                    eVar3.f6634p = true;
                    eVar2.f2134j = eVar3;
                }
                eVar = eVar2.f2134j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            p3.e eVar4 = (p3.e) eVar.clone();
            if (eVar4.f6634p && !eVar4.f6635q) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.f6635q = true;
            eVar4.f6634p = true;
            this.f2197m = eVar4;
        }
    }

    @Override // m3.i
    public final synchronized void b() {
        synchronized (this) {
            this.i.b();
            m();
        }
    }

    public void clear(View view) {
        l(new l(view));
    }

    @Override // m3.i
    public final synchronized void j() {
        n();
        this.i.j();
    }

    @Override // m3.i
    public final synchronized void k() {
        int i;
        this.i.k();
        synchronized (this) {
            try {
                ArrayList arrayListE = t3.n.e(this.i.f5702d);
                int size = arrayListE.size();
                i = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayListE.get(i5);
                    i5++;
                    l((q3.f) obj);
                }
                this.i.f5702d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        r rVar = this.f2192g;
        ArrayList arrayListE2 = t3.n.e((Set) rVar.f5700f);
        int size2 = arrayListE2.size();
        while (i < size2) {
            Object obj2 = arrayListE2.get(i);
            i++;
            rVar.a((p3.c) obj2);
        }
        ((HashSet) rVar.f5701g).clear();
        this.f2191f.l(this);
        this.f2191f.l(this.f2195k);
        t3.n.f().removeCallbacks(this.f2194j);
        b bVar = this.f2189d;
        synchronized (bVar.f2110j) {
            if (!bVar.f2110j.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f2110j.remove(this);
        }
    }

    public final void l(q3.f fVar) {
        if (fVar == null) {
            return;
        }
        boolean zO = o(fVar);
        p3.c cVarG = fVar.g();
        if (zO) {
            return;
        }
        b bVar = this.f2189d;
        synchronized (bVar.f2110j) {
            try {
                ArrayList arrayList = bVar.f2110j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((n) obj).o(fVar)) {
                        return;
                    }
                }
                if (cVarG != null) {
                    fVar.c(null);
                    cVarG.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        r rVar = this.f2192g;
        rVar.f5699e = true;
        ArrayList arrayListE = t3.n.e((Set) rVar.f5700f);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            p3.c cVar = (p3.c) obj;
            if (cVar.isRunning()) {
                cVar.f();
                ((HashSet) rVar.f5701g).add(cVar);
            }
        }
    }

    public final synchronized void n() {
        r rVar = this.f2192g;
        int i = 0;
        rVar.f5699e = false;
        ArrayList arrayListE = t3.n.e((Set) rVar.f5700f);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            p3.c cVar = (p3.c) obj;
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.g();
            }
        }
        ((HashSet) rVar.f5701g).clear();
    }

    public final synchronized boolean o(q3.f fVar) {
        p3.c cVarG = fVar.g();
        if (cVarG == null) {
            return true;
        }
        if (!this.f2192g.a(cVarG)) {
            return false;
        }
        this.i.f5702d.remove(fVar);
        fVar.c(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2192g + ", treeNode=" + this.f2193h + "}";
    }
}
