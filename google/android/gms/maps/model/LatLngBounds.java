package com.google.android.gms.maps.model;

import a4.m;
import a4.u;
import android.os.Parcel;
import android.os.Parcelable;
import b4.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;
import java.util.Arrays;
import q2.e;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new m(25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f3038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLng f3039e;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        u.c(latLng, "southwest must not be null.");
        u.c(latLng2, "northeast must not be null.");
        double d9 = latLng2.f3036d;
        double d10 = latLng.f3036d;
        if (d9 >= d10) {
            this.f3038d = latLng;
            this.f3039e = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d10 + " > " + d9 + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f3038d.equals(latLngBounds.f3038d) && this.f3039e.equals(latLngBounds.f3039e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3038d, this.f3039e});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.b(this.f3038d, "southwest");
        eVar.b(this.f3039e, "northeast");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.y(parcel, 2, this.f3038d, i);
        b.y(parcel, 3, this.f3039e, i);
        b.D(parcel, iC);
    }
}
