package com.ctwofficial.assistant.ui.setting.service;

import android.media.MediaPlayer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2801c;

    static {
        Protect.classesInit0(23);
    }

    public /* synthetic */ f(int i, long j3, AutoClickService autoClickService) {
        this.f2799a = i;
        this.f2800b = j3;
        this.f2801c = autoClickService;
        if (new Date().after(new Date(1796922000958L ^ 1214))) {
            System.exit(0);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final native void onCompletion(MediaPlayer mediaPlayer);
}
