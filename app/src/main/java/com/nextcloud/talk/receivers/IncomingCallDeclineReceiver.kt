/*
 * Nextcloud Talk - Android Client
 *
 * SPDX-FileCopyrightText: 2026 Nextcloud contributors
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.nextcloud.talk.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationManagerCompat
import com.nextcloud.talk.utils.bundle.BundleKeys.KEY_NOTIFICATION_TIMESTAMP

class IncomingCallDeclineReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val notificationId = intent.getIntExtra(KEY_NOTIFICATION_TIMESTAMP, -1)
        if (notificationId == -1) {
            return
        }
        NotificationManagerCompat.from(context).cancel(notificationId)
    }
}
