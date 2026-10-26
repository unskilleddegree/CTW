package com.bumptech.glide;

import a4.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import q7.o;
import r0.h1;
import v6.q;
import y7.b0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f2122a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f2123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p4.d f2124c;

    public static void A(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i));
    }

    public static m7.a B(m7.c cVar, int i) {
        h7.h.e(cVar, "<this>");
        boolean z8 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z8) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i5 = cVar.f5706d;
        int i9 = cVar.f5707e;
        if (cVar.f5708f <= 0) {
            i = -i;
        }
        return new m7.a(i5, i9, i);
    }

    public static m7.c C(int i, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new m7.c(i, i5 - 1, 1);
        }
        m7.c cVar = m7.c.f5713g;
        return m7.c.f5713g;
    }

    public static int D(Parcel parcel) {
        int i = parcel.readInt();
        int iY = y(parcel, i);
        char c9 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new b4.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i5 = iY + iDataPosition;
        if (i5 < iDataPosition || i5 > parcel.dataSize()) {
            throw new b4.b(com.ctwofficial.assistant.ui.setting.service.h.k(iDataPosition, i5, "Size read is invalid start=", " end="), parcel);
        }
        return i5;
    }

    public static void E(File file, String str, Charset charset) throws IOException {
        h7.h.e(str, "text");
        h7.h.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            F(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.g(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void F(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        h7.h.e(str, "text");
        h7.h.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            h7.h.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        h7.h.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        h7.h.d(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i5 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i5, str.length() - i);
            int i9 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            h7.h.d(cArrArray, "array(...)");
            str.getChars(i, i9, cArrArray, i5);
            charBufferAllocate.limit(iMin + i5);
            i5 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i9 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i5 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i9;
        }
    }

    public static p4.d G(Context context) throws x3.f {
        u.b(context);
        "preferredRenderer: ".concat("null");
        p4.d dVar = f2124c;
        if (dVar != null) {
            return dVar;
        }
        AtomicBoolean atomicBoolean = x3.g.f8379a;
        int iA = x3.g.a(context, 13400000);
        if (iA != 0) {
            throw new x3.f(iA);
        }
        p4.d dVarK = K(context, 0);
        f2124c = dVarK;
        try {
            Parcel parcelD = dVarK.d(dVarK.f(), 9);
            int i = parcelD.readInt();
            parcelD.recycle();
            if (i == 2) {
                try {
                    p4.d dVar2 = f2124c;
                    g4.b bVar = new g4.b(J(context, 0));
                    Parcel parcelF = dVar2.f();
                    l4.d.c(parcelF, bVar);
                    dVar2.h(parcelF, 11);
                } catch (RemoteException e4) {
                    throw new b4.b(e4);
                } catch (UnsatisfiedLinkError unused) {
                    f2123b = null;
                    f2124c = K(context, 1);
                }
            }
            try {
                p4.d dVar3 = f2124c;
                Context contextJ = J(context, 0);
                Objects.requireNonNull(contextJ);
                g4.b bVar2 = new g4.b(contextJ.getResources());
                Parcel parcelF2 = dVar3.f();
                l4.d.c(parcelF2, bVar2);
                parcelF2.writeInt(19000000);
                dVar3.h(parcelF2, 6);
                return f2124c;
            } catch (RemoteException e7) {
                throw new b4.b(e7);
            }
        } catch (RemoteException e9) {
            throw new b4.b(e9);
        }
    }

    public static void H(Parcel parcel, int i) {
        if (i == 4) {
            return;
        }
        throw new b4.b("Expected size 4 got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static void I(Parcel parcel, int i, int i5) {
        int iY = y(parcel, i);
        if (iY == i5) {
            return;
        }
        String hexString = Integer.toHexString(iY);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(iY);
        sb.append(" (0x");
        throw new b4.b(com.ctwofficial.assistant.ui.setting.service.h.q(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public static Context J(Context context, int i) {
        Context contextCreatePackageContext;
        String str = "com.google.android.gms.maps_legacy_dynamite";
        Context context2 = f2123b;
        if (context2 != null) {
            return context2;
        }
        try {
            Class.forName("com.google.android.gms.maps.internal.UseLegacyRendererAsDefault");
            if (i == 0) {
                str = "com.google.android.gms.maps_dynamite";
            } else {
                int iA = v.e.a(i);
                if (iA != 0) {
                    if (iA != 1) {
                        str = "com.google.android.gms.maps_dynamite";
                    } else {
                        str = "com.google.android.gms.maps_core_dynamite";
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            if (i != 1) {
            }
        }
        try {
            contextCreatePackageContext = h4.d.a(context, h4.d.f4544b, str).f4554a;
        } catch (Exception unused2) {
            try {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    AtomicBoolean atomicBoolean = x3.g.f8379a;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        contextCreatePackageContext = h4.d.a(context, h4.d.f4544b, "com.google.android.gms.maps_dynamite").f4554a;
                    } catch (Exception unused3) {
                        AtomicBoolean atomicBoolean2 = x3.g.f8379a;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused4) {
                contextCreatePackageContext = null;
            }
        }
        f2123b = contextCreatePackageContext;
        return contextCreatePackageContext;
    }

    public static p4.d K(Context context, int i) {
        ClassLoader classLoader = J(context, i).getClassLoader();
        try {
            u.b(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return iInterfaceQueryLocalInterface instanceof p4.d ? (p4.d) iInterfaceQueryLocalInterface : new p4.d(iBinder, "com.google.android.gms.maps.internal.ICreator", 2);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e4);
            } catch (InstantiationException e7) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e7);
            }
        } catch (ClassNotFoundException e9) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e9);
        }
    }

    public static final ExecutorService a(boolean z8) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new h2.a(z8));
        h7.h.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static void e(int i, int i5, int i9) {
        if (i >= 0 && i5 <= i9) {
            if (i > i5) {
                throw new IllegalArgumentException(com.ctwofficial.assistant.ui.setting.service.h.k(i, i5, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i5 + ", size: " + i9);
    }

    public static int f(int i, int i5, int i9) {
        if (i5 <= i9) {
            if (i < i5) {
                return i5;
            }
            return i > i9 ? i9 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i5 + '.');
    }

    public static Parcelable g(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iY);
        return parcelable;
    }

    public static String h(Parcel parcel, int i) {
        int iY = y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iY);
        return string;
    }

    public static Object[] i(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new b4.b(com.ctwofficial.assistant.ui.setting.service.h.l(i, "Overread allowed size end="), parcel);
        }
    }

    public static y7.k l(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = q.f7923d;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        y7.g gVarC = y7.g.f8739b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        b0 b0VarK = q2.f.k(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? z7.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = z7.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new y7.k(b0VarK, gVarC, listK2, new m0(5, listK));
    }

    public static Drawable m(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f2122a) {
                return p(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e4;
            }
            return g0.a.b(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f2122a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = h0.n.f4489a;
        return h0.i.a(resources, i, theme);
    }

    public static x1.c n(i2.c cVar, SQLiteDatabase sQLiteDatabase) {
        h7.h.e(cVar, "refHolder");
        x1.c cVar2 = (x1.c) cVar.f4870e;
        if (cVar2 != null && cVar2.f8328d.equals(sQLiteDatabase)) {
            return cVar2;
        }
        x1.c cVar3 = new x1.c(sQLiteDatabase);
        cVar.f4870e = cVar3;
        return cVar3;
    }

    public static y6.d o(y6.d dVar) {
        h7.h.e(dVar, "<this>");
        a7.c cVar = dVar instanceof a7.c ? (a7.c) dVar : null;
        if (cVar == null || (dVar = cVar.f722f) != null) {
            return dVar;
        }
        y6.i iVar = cVar.f721e;
        h7.h.b(iVar);
        y6.f fVar = (y6.f) iVar.g(y6.e.f8700d);
        y6.d fVar2 = fVar != null ? new v7.f((o) fVar, cVar) : cVar;
        cVar.f722f = fVar2;
        return fVar2;
    }

    public static Drawable p(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            l.c cVar = new l.c(context);
            cVar.f5365b = theme;
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return g8.l.h(context, i);
    }

    public static boolean s(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte t(Parcel parcel, int i) {
        I(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float u(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float v(Parcel parcel, int i) {
        int iY = y(parcel, i);
        if (iY == 0) {
            return null;
        }
        H(parcel, iY);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder w(Parcel parcel, int i) {
        int iY = y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iY);
        return strongBinder;
    }

    public static int x(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt();
    }

    public static int y(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void z(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            h1.a(window, false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public abstract boolean b(u.g gVar, u.c cVar, u.c cVar2);

    public abstract boolean c(u.g gVar, Object obj, Object obj2);

    public abstract boolean d(u.g gVar, u.f fVar, u.f fVar2);

    public abstract void q(u.f fVar, u.f fVar2);

    public abstract void r(u.f fVar, Thread thread);
}
