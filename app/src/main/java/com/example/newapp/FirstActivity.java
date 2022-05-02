package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class FirstActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button display_btn,startbtn,stopbtn;
    ImageView iv;
    LinearLayout ll;
    TextView tv;
    batteryreceiver br;
    String[] bankNames = {"SBI","HDFC","BOI","PNB"};

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(br);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        display_btn= findViewById(R.id.display_button);
        ll = findViewById(R.id.ll_id);
        startbtn= findViewById(R.id.start);
        stopbtn = findViewById(R.id.stop);
        iv = findViewById(R.id.imagevie);

        Spinner spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter aa= new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        Intent i = getIntent();
        String action = i.getAction();
        String type = i.getType();
        if(Intent.ACTION_SEND.equals(action) && type!=null)
        {
            iv.setImageURI(i.getParcelableExtra(Intent.EXTRA_STREAM));
        }

        tv = (TextView)findViewById(R.id.textView4);
        br = new batteryreceiver(tv);
        registerReceiver(br,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(),NewService.class));
            }
        });


        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),NewService.class));
            }
        });

        display_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();
                Snackbar snackbar = Snackbar.make(ll,"button clicked",Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Cancel", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar = Snackbar.make(ll,"Welcome back",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
                });
                snackbar.show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),bankNames[position],Toast.LENGTH_LONG);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}