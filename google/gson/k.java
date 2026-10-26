package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3362b;

    public /* synthetic */ k(a0 a0Var, int i) {
        this.f3361a = i;
        this.f3362b = a0Var;
    }

    @Override // com.google.gson.a0
    public final Object a(t6.a aVar) throws IOException {
        switch (this.f3361a) {
            case 0:
                return new AtomicLong(((Number) this.f3362b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.F()) {
                    arrayList.add(Long.valueOf(((Number) this.f3362b.a(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.S() != 9) {
                    return this.f3362b.a(aVar);
                }
                aVar.O();
                return null;
        }
    }

    @Override // com.google.gson.a0
    public final void b(t6.b bVar, Object obj) throws IOException {
        switch (this.f3361a) {
            case 0:
                this.f3362b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.c();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f3362b.b(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.i();
                break;
            default:
                if (obj == null) {
                    bVar.F();
                } else {
                    this.f3362b.b(bVar, obj);
                }
                break;
        }
    }
}
