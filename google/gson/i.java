package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f3356d = new i("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3359c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z8) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f3357a = str;
        this.f3358b = str2;
        this.f3359c = z8;
    }
}
