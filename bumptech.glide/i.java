package com.bumptech.glide;

import d3.s;
import d3.t;
import d3.u;
import d3.w;
import d3.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q2.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3.c f2142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.c f2143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3.c f2144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f2145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3.c f2146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l3.c f2147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f2148h = new r(10);
    public final o3.b i = new o3.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q2.m f2149j;

    public i() {
        q2.m mVar = new q2.m(new q0.d(20), new n6.e(), new n6.g(8), 23, false);
        this.f2149j = mVar;
        this.f2141a = new u(mVar);
        this.f2142b = new l3.c(1);
        this.f2143c = new q2.c(11);
        this.f2144d = new l3.c(3);
        this.f2145e = new com.bumptech.glide.load.data.i();
        this.f2146f = new l3.c(0);
        this.f2147g = new l3.c(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        q2.c cVar = this.f2143c;
        synchronized (cVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) cVar.f6703e);
                ((ArrayList) cVar.f6703e).clear();
                int size = arrayList.size();
                int i = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((ArrayList) cVar.f6703e).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) cVar.f6703e).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, s sVar) {
        u uVar = this.f2141a;
        synchronized (uVar) {
            x xVar = uVar.f3602a;
            synchronized (xVar) {
                try {
                    w wVar = new w(cls, cls2, sVar);
                    ArrayList arrayList = xVar.f3615a;
                    arrayList.add(arrayList.size(), wVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            uVar.f3603b.f2135a.clear();
        }
    }

    public final void b(Class cls, x2.b bVar) {
        l3.c cVar = this.f2142b;
        synchronized (cVar) {
            cVar.f5430a.add(new o3.a(cls, bVar));
        }
    }

    public final void c(Class cls, x2.l lVar) {
        l3.c cVar = this.f2144d;
        synchronized (cVar) {
            cVar.f5430a.add(new o3.d(cls, lVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, x2.k kVar) {
        q2.c cVar = this.f2143c;
        synchronized (cVar) {
            cVar.k(str).add(new o3.c(cls, cls2, kVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        l3.c cVar = this.f2147g;
        synchronized (cVar) {
            arrayList = cVar.f5430a;
        }
        if (arrayList.isEmpty()) {
            throw new h("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        u uVar = this.f2141a;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            t tVar = (t) uVar.f3603b.f2135a.get(cls);
            listUnmodifiableList = tVar == null ? null : tVar.f3601a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(uVar.f3602a.b(cls));
                if (((t) uVar.f3603b.f2135a.put(cls, new t(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new h("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z8 = true;
        for (int i = 0; i < size; i++) {
            d3.r rVar = (d3.r) listUnmodifiableList.get(i);
            if (rVar.a(obj)) {
                if (z8) {
                    arrayList = new ArrayList(size - i);
                    z8 = false;
                }
                arrayList.add(rVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new h("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g gVarB;
        com.bumptech.glide.load.data.i iVar = this.f2145e;
        synchronized (iVar) {
            try {
                t3.f.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) iVar.f2173e).get(obj.getClass());
                if (fVar == null) {
                    for (com.bumptech.glide.load.data.f fVar2 : ((HashMap) iVar.f2173e).values()) {
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.f2171f;
                }
                gVarB = fVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVarB;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f2145e;
        synchronized (iVar) {
            ((HashMap) iVar.f2173e).put(fVar.a(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, l3.a aVar) {
        l3.c cVar = this.f2146f;
        synchronized (cVar) {
            cVar.f5430a.add(new l3.b(cls, cls2, aVar));
        }
    }
}
