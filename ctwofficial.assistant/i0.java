package com.ctwofficial.assistant;

import android.media.MediaPlayer;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2363a;

    static {
        Protect.classesInit0(98);
    }

    public /* synthetic */ i0(MainActivity mainActivity) {
        this.f2363a = mainActivity;
        if (new Date().after(new Date(1796922001641L ^ 2665))) {
            System.exit(0);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final native void onCompletion(MediaPlayer mediaPlayer);
}
