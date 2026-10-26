package com.ctwofficial.assistant;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h7.g f2976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2978e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(OfficialInstallActivity officialInstallActivity) {
        this(true);
        this.f2977d = 0;
        this.f2978e = officialInstallActivity;
        if (new Date().after(new Date(1796922006679L ^ 7703))) {
            System.exit(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(i1.e0 e0Var) {
        this(false);
        this.f2977d = 1;
        this.f2978e = e0Var;
        if (new Date().after(new Date(1796922002108L ^ 2108))) {
            System.exit(0);
        }
    }

    public x0(boolean z8) {
        this.f2974a = z8;
        this.f2975b = new CopyOnWriteArrayList();
        if (new Date().after(new Date(1796922001157L ^ 1413))) {
            System.exit(0);
        }
    }
}
