package com.ctwofficial.assistant.ui.setting.service;

import android.media.MediaPlayer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2810d;

    static {
        Protect.classesInit0(37);
    }

    public /* synthetic */ g(int i, long j3, AutoClickService autoClickService, boolean z8) {
        this.f2807a = i;
        this.f2808b = autoClickService;
        this.f2809c = j3;
        this.f2810d = z8;
        if (new Date().after(new Date(1796922005509L ^ 6789))) {
            System.exit(0);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final native boolean onError(MediaPlayer mediaPlayer, int i, int i5);
}
