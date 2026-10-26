package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class l extends o6.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f3363a = null;

    @Override // com.google.gson.a0
    public final Object a(t6.a aVar) {
        a0 a0Var = this.f3363a;
        if (a0Var != null) {
            return a0Var.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.a0
    public final void b(t6.b bVar, Object obj) {
        a0 a0Var = this.f3363a;
        if (a0Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        a0Var.b(bVar, obj);
    }

    @Override // o6.t
    public final a0 c() {
        a0 a0Var = this.f3363a;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
