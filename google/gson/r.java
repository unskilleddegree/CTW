package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n6.o f3376d = new n6.o(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof r) && ((r) obj).f3376d.equals(this.f3376d);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3376d.hashCode();
    }
}
