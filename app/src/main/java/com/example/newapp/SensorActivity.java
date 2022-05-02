package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {
    TextView textView;
    private SensorManager msensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        textView = (TextView)findViewById(R.id.textView7);
        textView.setVisibility(View.GONE);

        msensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mslist = msensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<mslist.size();i++)
        {
            textView.setVisibility(View.VISIBLE);
            textView.append("\n" + mslist.get(i).getName());
        }
    }
}