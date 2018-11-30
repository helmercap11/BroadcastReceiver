package com.example.hel.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {
    public CustomBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        switch (action){
            case  Intent.ACTION_BATTERY_LOW:
                showMessage("Bateria fraca", context);
                break;
            case Intent.ACTION_POWER_CONNECTED:
                showMessage("Dispositivo a carregar", context);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                showMessage("dispositivo desconecado", context);
                break;
            case Intent.ACTION_BATTERY_OKAY:
                showMessage("Bateria cheia", context);
                break;

        }
    }

    public void showMessage(String message, Context context){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }
}
