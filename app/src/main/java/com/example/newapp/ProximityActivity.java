package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ProximityActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager msensorManager;
    TextView tv = (TextView) findViewById(R.id.textView8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);

        msensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        if(msensorManager!=null)
        {
            Sensor proximitySensor = msensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if(proximitySensor!=null)
            {
                msensorManager.registerListener(this,proximitySensor,msensorManager.SENSOR_DELAY_NORMAL);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Service not detected",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_PROXIMITY)
        {
            tv.setText("Proximity : "+sensorEvent.values[0]);
        }
        if(sensorEvent.values[0]>0)
        {
            Toast.makeText(getApplicationContext(),"Object is far",Toast.LENGTH_SHORT).show();
            /*WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = -1;
            getWindow().setAttributes(params);*/
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Object is Near",Toast.LENGTH_SHORT).show();
            /*WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = 1;
            getWindow().setAttributes(params);*/
        }

    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}