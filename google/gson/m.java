package com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import o6.a1;
import o6.n0;
import o6.q0;
import o6.r0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f3364h = i.f3356d;
    public static final a i = h.f3354d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f3365j = z.f3378d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w f3366k = z.f3379e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6.g f3369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o6.i f3370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f3373g;

    public m() {
        n6.i iVar = n6.i.f6240f;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f3367a = new ThreadLocal();
        this.f3368b = new ConcurrentHashMap();
        n6.g gVar = new n6.g(0);
        this.f3369c = gVar;
        this.f3372f = true;
        this.f3373g = f3364h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a1.A);
        v vVar = z.f3378d;
        v vVar2 = f3365j;
        arrayList.add(vVar2 == vVar ? o6.m.f6460c : new o6.k(1, vVar2));
        arrayList.add(iVar);
        arrayList.addAll(list);
        arrayList.add(a1.f6426p);
        arrayList.add(a1.f6418g);
        arrayList.add(a1.f6415d);
        arrayList.add(a1.f6416e);
        arrayList.add(a1.f6417f);
        o6.v vVar3 = a1.f6421k;
        arrayList.add(new r0(Long.TYPE, Long.class, vVar3));
        arrayList.add(new r0(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new r0(Float.TYPE, Float.class, new j(1)));
        w wVar = z.f3379e;
        w wVar2 = f3366k;
        arrayList.add(wVar2 == wVar ? o6.l.f6458b : new o6.k(0, new o6.l(wVar2)));
        arrayList.add(a1.f6419h);
        arrayList.add(a1.i);
        arrayList.add(new q0(AtomicLong.class, new k(new k(vVar3, 0), 2), 0));
        int i5 = 0;
        arrayList.add(new q0(AtomicLongArray.class, new k(new k(vVar3, 1), 2), i5));
        arrayList.add(a1.f6420j);
        arrayList.add(a1.f6422l);
        arrayList.add(a1.f6427q);
        arrayList.add(a1.f6428r);
        arrayList.add(new q0(BigDecimal.class, a1.f6423m, i5));
        arrayList.add(new q0(BigInteger.class, a1.f6424n, i5));
        arrayList.add(new q0(n6.k.class, a1.f6425o, i5));
        arrayList.add(a1.f6429s);
        arrayList.add(a1.f6430t);
        arrayList.add(a1.f6432v);
        arrayList.add(a1.f6433w);
        arrayList.add(a1.f6435y);
        arrayList.add(a1.f6431u);
        arrayList.add(a1.f6413b);
        arrayList.add(o6.g.f6446c);
        arrayList.add(a1.f6434x);
        if (r6.e.f7298a) {
            arrayList.add(r6.e.f7300c);
            arrayList.add(r6.e.f7299b);
            arrayList.add(r6.e.f7301d);
        }
        arrayList.add(o6.b.f6437c);
        arrayList.add(a1.f6412a);
        arrayList.add(new o6.d(gVar, 0));
        arrayList.add(new o6.d(gVar, 1));
        o6.i iVar2 = new o6.i(gVar);
        this.f3370d = iVar2;
        arrayList.add(iVar2);
        arrayList.add(a1.B);
        arrayList.add(new o6.s(gVar, i, iVar, iVar2));
        this.f3371e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d9) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(d9 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, Type type) {
        s6.a aVar = new s6.a(type);
        Object objA = null;
        if (str == null) {
            return null;
        }
        t6.a aVar2 = new t6.a(new StringReader(str));
        aVar2.f7652r = 2;
        boolean z8 = true;
        aVar2.f7652r = 1;
        try {
            try {
                try {
                    aVar2.S();
                    z8 = false;
                    objA = c(aVar).a(aVar2);
                } catch (IOException e4) {
                    throw new u(e4);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
                }
            } catch (EOFException e9) {
                if (!z8) {
                    throw new u(e9);
                }
            } catch (IllegalStateException e10) {
                throw new u(e10);
            }
            aVar2.f7652r = 2;
            if (objA != null) {
                try {
                    if (aVar2.S() != 10) {
                        throw new u("JSON document was not fully consumed.");
                    }
                } catch (t6.c e11) {
                    throw new u(e11);
                } catch (IOException e12) {
                    throw new p(e12);
                }
            }
            return objA;
        } catch (Throwable th) {
            aVar2.f7652r = 2;
            throw th;
        }
    }

    public final a0 c(s6.a aVar) {
        boolean z8;
        ConcurrentHashMap concurrentHashMap = this.f3368b;
        a0 a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal threadLocal = this.f3367a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z8 = true;
        } else {
            a0 a0Var2 = (a0) map.get(aVar);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z8 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f3371e.iterator();
            a0 a0VarA = null;
            while (it.hasNext()) {
                a0VarA = ((b0) it.next()).a(this, aVar);
                if (a0VarA != null) {
                    if (lVar.f3363a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f3363a = a0VarA;
                    map.put(aVar, a0VarA);
                    break;
                }
            }
            if (z8) {
                threadLocal.remove();
            }
            if (a0VarA != null) {
                if (z8) {
                    concurrentHashMap.putAll(map);
                }
                return a0VarA;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z8) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final t6.b d(Writer writer) {
        t6.b bVar = new t6.b(writer);
        bVar.H(this.f3373g);
        bVar.f7663l = this.f3372f;
        bVar.I(2);
        bVar.f7665n = false;
        return bVar;
    }

    public final String e(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e4) {
                throw new p(e4);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(obj, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e7) {
            throw new p(e7);
        }
    }

    public final void f(Object obj, Class cls, t6.b bVar) {
        a0 a0VarC = c(new s6.a(cls));
        int i5 = bVar.f7662k;
        if (i5 == 2) {
            bVar.f7662k = 1;
        }
        boolean z8 = bVar.f7663l;
        boolean z9 = bVar.f7665n;
        bVar.f7663l = this.f3372f;
        bVar.f7665n = false;
        try {
            try {
                a0VarC.b(bVar, obj);
                bVar.I(i5);
                bVar.f7663l = z8;
                bVar.f7665n = z9;
            } catch (IOException e4) {
                throw new p(e4);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } catch (Throwable th) {
            bVar.I(i5);
            bVar.f7663l = z8;
            bVar.f7665n = z9;
            throw th;
        }
    }

    public final void g(t6.b bVar) {
        q qVar = q.f3375d;
        int i5 = bVar.f7662k;
        boolean z8 = bVar.f7663l;
        boolean z9 = bVar.f7665n;
        bVar.f7663l = this.f3372f;
        bVar.f7665n = false;
        if (i5 == 2) {
            bVar.f7662k = 1;
        }
        try {
            try {
                a1.f6436z.getClass();
                n0.d(bVar, qVar);
                bVar.I(i5);
                bVar.f7663l = z8;
                bVar.f7665n = z9;
            } catch (IOException e4) {
                throw new p(e4);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } catch (Throwable th) {
            bVar.I(i5);
            bVar.f7663l = z8;
            bVar.f7665n = z9;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f3371e + ",instanceCreators:" + this.f3369c + "}";
    }
}
