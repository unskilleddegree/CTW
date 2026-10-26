package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import g3.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m3.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p3.a {
    public k A;
    public k B;
    public final boolean C = true;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f2152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n f2153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Class f2154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f2155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f2156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f2157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f2158z;

    static {
    }

    public k(b bVar, n nVar, Class cls, Context context) {
        p3.e eVar;
        this.f2153u = nVar;
        this.f2154v = cls;
        this.f2152t = context;
        s.e eVar2 = nVar.f2189d.f2107f.f2131f;
        a aVar = (a) eVar2.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : (n6.m) eVar2.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f2156x = aVar == null ? e.f2125k : aVar;
        this.f2155w = bVar.f2107f;
        Iterator it = nVar.f2196l.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            r();
        }
        synchronized (nVar) {
            eVar = nVar.f2197m;
        }
        a(eVar);
    }

    @Override // p3.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return super.equals(kVar) && Objects.equals(this.f2154v, kVar.f2154v) && this.f2156x.equals(kVar.f2156x) && Objects.equals(this.f2157y, kVar.f2157y) && Objects.equals(this.f2158z, kVar.f2158z) && Objects.equals(this.A, kVar.A) && Objects.equals(this.B, kVar.B) && this.C == kVar.C && this.D == kVar.D;
    }

    @Override // p3.a
    public final int hashCode() {
        return t3.n.g(this.D ? 1 : 0, t3.n.g(this.C ? 1 : 0, t3.n.h(t3.n.h(t3.n.h(t3.n.h(t3.n.h(t3.n.h(t3.n.h(super.hashCode(), this.f2154v), this.f2156x), this.f2157y), this.f2158z), this.A), this.B), null)));
    }

    public final k r() {
        if (this.f6635q) {
            return clone().r();
        }
        k();
        return this;
    }

    @Override // p3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final k a(p3.a aVar) {
        t3.f.b(aVar);
        return (k) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final p3.c t(Object obj, q3.f fVar, p3.d dVar, a aVar, g gVar, int i, int i5, p3.a aVar2) {
        p3.d dVar2;
        p3.d bVar;
        p3.a aVar3;
        p3.c fVar2;
        g gVar2;
        if (this.B != null) {
            bVar = new p3.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        k kVar = this.A;
        if (kVar == null) {
            Context context = this.f2152t;
            e eVar = this.f2155w;
            aVar3 = aVar2;
            fVar2 = new p3.f(context, eVar, obj, this.f2157y, this.f2154v, aVar3, i, i5, gVar, fVar, this.f2158z, bVar, eVar.f2132g, aVar.f2102d);
        } else {
            if (this.E) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = kVar.C ? aVar : kVar.f2156x;
            if (p3.a.f(kVar.f6623d, 8)) {
                gVar2 = this.A.f6625f;
            } else {
                int iOrdinal = gVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    gVar2 = g.f2136d;
                } else if (iOrdinal == 2) {
                    gVar2 = g.f2137e;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f6625f);
                    }
                    gVar2 = g.f2138f;
                }
            }
            g gVar3 = gVar2;
            k kVar2 = this.A;
            int i9 = kVar2.f6628j;
            int i10 = kVar2.i;
            if (t3.n.i(i, i5)) {
                k kVar3 = this.A;
                if (!t3.n.i(kVar3.f6628j, kVar3.i)) {
                    i9 = aVar2.f6628j;
                    i10 = aVar2.i;
                }
            }
            int i11 = i10;
            p3.g gVar4 = new p3.g(obj, bVar);
            Context context2 = this.f2152t;
            p3.g gVar5 = gVar4;
            e eVar2 = this.f2155w;
            p3.f fVar3 = new p3.f(context2, eVar2, obj, this.f2157y, this.f2154v, aVar2, i, i5, gVar, fVar, this.f2158z, gVar5, eVar2.f2132g, aVar.f2102d);
            this.E = true;
            k kVar4 = this.A;
            p3.c cVarT = kVar4.t(obj, fVar, gVar5, aVar4, gVar3, i9, i11, kVar4);
            this.E = false;
            gVar5.f6671c = fVar3;
            gVar5.f6672d = cVarT;
            aVar3 = aVar2;
            fVar2 = gVar5;
        }
        if (dVar2 == null) {
            return fVar2;
        }
        k kVar5 = this.B;
        int i12 = kVar5.f6628j;
        int i13 = kVar5.i;
        if (t3.n.i(i, i5)) {
            k kVar6 = this.B;
            if (!t3.n.i(kVar6.f6628j, kVar6.i)) {
                i12 = aVar3.f6628j;
                i13 = aVar3.i;
            }
        }
        int i14 = i13;
        k kVar7 = this.B;
        p3.b bVar2 = dVar2;
        p3.c cVarT2 = kVar7.t(obj, fVar, bVar2, kVar7.f2156x, kVar7.f6625f, i12, i14, kVar7);
        bVar2.f6640c = fVar2;
        bVar2.f6641d = cVarT2;
        return bVar2;
    }

    @Override // p3.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k kVar = (k) super.clone();
        kVar.f2156x = kVar.f2156x.clone();
        if (kVar.f2158z != null) {
            kVar.f2158z = new ArrayList(kVar.f2158z);
        }
        k kVar2 = kVar.A;
        if (kVar2 != null) {
            kVar.A = kVar2.clone();
        }
        k kVar3 = kVar.B;
        if (kVar3 != null) {
            kVar.B = kVar3.clone();
        }
        return kVar;
    }

    public final void v(ImageView imageView) {
        p3.a aVarG;
        q3.f aVar;
        t3.n.a();
        t3.f.b(imageView);
        if (!p3.a.f(this.f6623d, 2048) && imageView.getScaleType() != null) {
            switch (j.f2150a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarG = clone().g(g3.m.f4167d, new g3.g());
                    break;
                case 2:
                    aVarG = clone().g(g3.m.f4166c, new g3.h());
                    aVarG.f6636r = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarG = clone().g(g3.m.f4165b, new t());
                    aVarG.f6636r = true;
                    break;
                case 6:
                    aVarG = clone().g(g3.m.f4166c, new g3.h());
                    aVarG.f6636r = true;
                    break;
                default:
                    aVarG = this;
                    break;
            }
        } else {
            aVarG = this;
        }
        this.f2155w.f2128c.getClass();
        Class cls = this.f2154v;
        if (Bitmap.class.equals(cls)) {
            aVar = new q3.a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            aVar = new q3.a(imageView, 1);
        }
        w(aVar, aVarG);
    }

    public final void w(q3.f fVar, p3.a aVar) {
        t3.f.b(fVar);
        if (!this.D) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        p3.c cVarT = t(new Object(), fVar, null, this.f2156x, aVar.f6625f, aVar.f6628j, aVar.i, aVar);
        p3.c cVarG = fVar.g();
        if (cVarT.i(cVarG) && (aVar.f6627h || !cVarG.j())) {
            t3.f.c(cVarG, "Argument must not be null");
            if (cVarG.isRunning()) {
                return;
            }
            cVarG.g();
            return;
        }
        this.f2153u.l(fVar);
        fVar.c(cVarT);
        n nVar = this.f2153u;
        synchronized (nVar) {
            nVar.i.f5702d.add(fVar);
            r rVar = nVar.f2192g;
            ((Set) rVar.f5700f).add(cVarT);
            if (rVar.f5699e) {
                cVarT.clear();
                Log.isLoggable("RequestTracker", 2);
                ((HashSet) rVar.f5701g).add(cVarT);
            } else {
                cVarT.g();
            }
        }
    }

    public final k x(Object obj) {
        if (this.f6635q) {
            return clone().x(obj);
        }
        this.f2157y = obj;
        this.D = true;
        k();
        return this;
    }
}
