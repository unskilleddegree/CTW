package com.google.android.play.core.install;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3353e;

    public zza(int i, long j3, long j7, int i5, String str) {
        this.f3349a = i;
        this.f3350b = j3;
        this.f3351c = j7;
        this.f3352d = i5;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f3353e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f3349a == zzaVar.f3349a && this.f3350b == zzaVar.f3350b && this.f3351c == zzaVar.f3351c && this.f3352d == zzaVar.f3352d && this.f3353e.equals(zzaVar.f3353e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3349a ^ 1000003;
        long j3 = this.f3350b;
        long j7 = this.f3351c;
        return (((((((i * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f3352d) * 1000003) ^ this.f3353e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f3349a + ", bytesDownloaded=" + this.f3350b + ", totalBytesToDownload=" + this.f3351c + ", installErrorCode=" + this.f3352d + ", packageName=" + this.f3353e + "}";
    }
}
