package com.example.newapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class batteryreceiver extends BroadcastReceiver {

    TextView tv;
    batteryreceiver(TextView tv)
    {
        this.tv = tv;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage = intent.getIntExtra("level",0);
        if(percentage!=0)
        {
            tv.setText(percentage+"%");
        }
    }
}
