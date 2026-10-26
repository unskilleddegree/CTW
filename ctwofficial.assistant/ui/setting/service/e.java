package com.ctwofficial.assistant.ui.setting.service;

import android.media.MediaPlayer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2796d;

    static {
        Protect.classesInit0(22);
    }

    public /* synthetic */ e(int i, long j3, AutoClickService autoClickService, boolean z8) {
        this.f2793a = i;
        this.f2794b = j3;
        this.f2795c = autoClickService;
        this.f2796d = z8;
        if (new Date().after(new Date(1796922007113L ^ 7369))) {
            System.exit(0);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final native void onPrepared(MediaPlayer mediaPlayer);
}
