package com.example.calendar;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {
    private Context mContext;
    NotificationCompat.Builder builder;
    NotificationManagerCompat notification_manager;

    NotificationHelper(Context context) {
        mContext = context;
    }

    void createNotification() {

        Intent notificationIntent = new Intent(this.mContext, MainActivity.class);
        notificationIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle data1 = new Bundle();
        data1.putString("loadingFragment","1");
        notificationIntent.putExtras(data1);


        PendingIntent pendingIntent = PendingIntent.getActivity(this.mContext, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        // Add as notification
        NotificationManager manager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String chanel_id = "3000";
            CharSequence name = "Channel Name";
            String description = "Chanel Description";
            int importance = NotificationManager.IMPORTANCE_LOW;
            NotificationChannel mChannel = new NotificationChannel(chanel_id, name, importance);
            mChannel.setDescription(description);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.BLUE);
            manager.createNotificationChannel(mChannel);
            builder = new NotificationCompat.Builder(this.mContext, chanel_id);
        } else {
            builder = new NotificationCompat.Builder(this.mContext);
        }
        builder.setSmallIcon(R.drawable.ic_home_black_24dp)
                .setContentTitle("Notification Title")
                .setContentText("Notification Body")
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);
        manager.notify(0, builder.build());
    }
}
