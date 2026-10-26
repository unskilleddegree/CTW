package com.bumptech.glide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import m3.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements m3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f2187b;

    public m(n nVar, r rVar) {
        this.f2187b = nVar;
        this.f2186a = rVar;
    }

    @Override // m3.a
    public final void a(boolean z8) {
        if (z8) {
            synchronized (this.f2187b) {
                r rVar = this.f2186a;
                ArrayList arrayListE = t3.n.e((Set) rVar.f5700f);
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    p3.c cVar = (p3.c) obj;
                    if (!cVar.j() && !cVar.c()) {
                        cVar.clear();
                        if (rVar.f5699e) {
                            ((HashSet) rVar.f5701g).add(cVar);
                        } else {
                            cVar.g();
                        }
                    }
                }
            }
        }
    }
}
