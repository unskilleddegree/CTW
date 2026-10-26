package com.google.android.gms.common.api;

import a4.u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b4.a;
import com.ctwofficial.assistant.CrashLog;
import com.ctwofficial.assistant.ui.setting.service.h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;
import java.util.Arrays;
import q2.e;
import r1.e0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new e0(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f3009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x3.a f3010g;

    public Status(int i, String str, PendingIntent pendingIntent, x3.a aVar) {
        this.f3007d = i;
        this.f3008e = str;
        this.f3009f = pendingIntent;
        this.f3010g = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3007d == status.f3007d && u.d(this.f3008e, status.f3008e) && u.d(this.f3009f, status.f3009f) && u.d(this.f3010g, status.f3010g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3007d), this.f3008e, this.f3009f, this.f3010g});
    }

    public final String toString() {
        e eVar = new e(this);
        String strL = this.f3008e;
        if (strL == null) {
            int i = this.f3007d;
            switch (i) {
                case -1:
                    strL = "SUCCESS_CACHE";
                    break;
                case 0:
                    strL = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strL = h.l(i, "unknown status code: ");
                    break;
                case 2:
                    strL = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strL = "SERVICE_DISABLED";
                    break;
                case 4:
                    strL = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strL = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strL = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strL = "NETWORK_ERROR";
                    break;
                case CrashLog.$stable /* 8 */:
                    strL = "INTERNAL_ERROR";
                    break;
                case 10:
                    strL = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strL = "ERROR";
                    break;
                case 14:
                    strL = "INTERRUPTED";
                    break;
                case 15:
                    strL = "TIMEOUT";
                    break;
                case 16:
                    strL = "CANCELED";
                    break;
                case 17:
                    strL = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strL = "DEAD_CLIENT";
                    break;
                case 19:
                    strL = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strL = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strL = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strL = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.b(strL, "statusCode");
        eVar.b(this.f3009f, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.E(parcel, 1, 4);
        parcel.writeInt(this.f3007d);
        b.z(parcel, 2, this.f3008e);
        b.y(parcel, 3, this.f3009f, i);
        b.y(parcel, 4, this.f3010g, i);
        b.D(parcel, iC);
    }
}
