package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.h f2179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f2181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f2182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f2183h;

    public l(d3.h hVar, int i) {
        this.f2179d = hVar;
        this.f2180e = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f2182g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2181f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2181f = null;
    }

    public final InputStream c(URL url, int i, URL url2, Map map) throws x2.c {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new x2.c("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new x2.c("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i5 = this.f2180e;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i5);
            httpURLConnection.setReadTimeout(i5);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2181f = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2182g = this.f2181f.getInputStream();
                if (this.f2183h) {
                    return null;
                }
                try {
                    responseCode = this.f2181f.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    responseCode = -1;
                }
                int i9 = responseCode / 100;
                if (i9 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2181f;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2182g = new t3.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f2182g = httpURLConnection2.getInputStream();
                        }
                        return this.f2182g;
                    } catch (IOException e4) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new x2.c("Failed to obtain InputStream", responseCode2, e4);
                    }
                }
                if (i9 != 3) {
                    if (responseCode == -1) {
                        throw new x2.c("Http request failed", responseCode, null);
                    }
                    try {
                        throw new x2.c(this.f2181f.getResponseMessage(), responseCode, null);
                    } catch (IOException e7) {
                        throw new x2.c("Failed to get a response message", responseCode, e7);
                    }
                }
                String headerField = this.f2181f.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new x2.c("Received empty or null redirect url", responseCode, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return c(url3, i + 1, url, map);
                } catch (MalformedURLException e9) {
                    throw new x2.c("Bad redirect url: " + headerField, responseCode, e9);
                }
            } catch (IOException e10) {
                try {
                    responseCode2 = this.f2181f.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new x2.c("Failed to connect or obtain data", responseCode2, e10);
            }
        } catch (IOException e11) {
            throw new x2.c("URL.openConnection threw", 0, e11);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f2183h = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int e() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, d dVar) {
        d3.h hVar = this.f2179d;
        int i = t3.h.f7616a;
        SystemClock.elapsedRealtimeNanos();
        try {
            dVar.d(c(hVar.d(), 0, null, hVar.f3578b.a()));
        } catch (IOException e4) {
            Log.isLoggable("HttpUrlFetcher", 3);
            dVar.c(e4);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
