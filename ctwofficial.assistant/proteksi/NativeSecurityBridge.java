package com.ctwofficial.assistant.proteksi;

import com.ctwofficial.assistant.ui.setting.level;

/* JADX INFO: loaded from: classes.dex */
public final class NativeSecurityBridge {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f41short = {1857, 1872, 1880, 1859, 1880, 1857, 1874, 1886, 1859, 1876};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NativeSecurityBridge f2425a = new NativeSecurityBridge();

    static {
        System.loadLibrary(level.touch(f41short, 0, 10, 1841));
    }

    public final native void nativeAbort(int i);

    public final native int nativeGetSecurityState();

    public final native int nativeValidateAppIdentity(String str, String str2, String str3, String str4, long j3, String str5, String str6, long j7, String str7, boolean z8, boolean z9);
}
