package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r3.a f2102d;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return t3.n.b(this.f2102d, ((a) obj).f2102d);
        }
        return false;
    }

    public final int c() {
        r3.a aVar = this.f2102d;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
