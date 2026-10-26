package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3374d = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f3374d.equals(this.f3374d);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3374d.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3374d.iterator();
    }
}
