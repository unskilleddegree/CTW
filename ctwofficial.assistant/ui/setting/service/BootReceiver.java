package com.ctwofficial.assistant.ui.setting.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f106short;

    static {
        Protect.classesInit0(131);
        f106short = new short[]{3316, 3320, 3321, 3299, 3314, 3311, 3299, 663, 656, 650, 667, 656, 650, 315, 308, 318, 296, 309, 307, 318, 372, 307, 308, 302, 319, 308, 302, 372, 315, 313, 302, 307, 309, 308, 372, 280, 277, 277, 270, 261, 281, 277, 279, 266, 278, 287, 270, 287, 286, 551, 552, 546, 564, 553, 559, 546, 616, 559, 552, 562, 547, 552, 562, 616, 551, 549, 562, 559, 553, 552, 616, 522, 521, 517, 525, 515, 514, 537, 516, 521, 521, 530, 537, 517, 521, 523, 534, 522, 515, 530, 515, 514};
    }

    public BootReceiver() {
        if (new Date().after(new Date(1796922009531L ^ 9531))) {
            System.exit(0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
