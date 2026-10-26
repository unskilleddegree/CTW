package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b4.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;
import r1.e0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new e0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3006e;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f3005d = i;
        this.f3006e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3006e.equals(((Scope) obj).f3006e);
    }

    public final int hashCode() {
        return this.f3006e.hashCode();
    }

    public final String toString() {
        return this.f3006e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.E(parcel, 1, 4);
        parcel.writeInt(this.f3005d);
        b.z(parcel, 2, this.f3006e);
        b.D(parcel, iC);
    }
}
