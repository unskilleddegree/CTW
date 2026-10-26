package com.google.android.gms.maps.model;

import a4.m;
import android.os.Parcel;
import android.os.Parcelable;
import b4.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new m(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f3036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f3037e;

    public LatLng(double d9, double d10) {
        if (d10 < -180.0d || d10 >= 180.0d) {
            this.f3037e = ((((d10 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f3037e = d10;
        }
        this.f3036d = Math.max(-90.0d, Math.min(90.0d, d9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f3036d) == Double.doubleToLongBits(latLng.f3036d) && Double.doubleToLongBits(this.f3037e) == Double.doubleToLongBits(latLng.f3037e);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3036d);
        long j3 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3037e);
        return ((((int) j3) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f3036d + "," + this.f3037e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.E(parcel, 2, 8);
        parcel.writeDouble(this.f3036d);
        b.E(parcel, 3, 8);
        parcel.writeDouble(this.f3037e);
        b.D(parcel, iC);
    }
}
