package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class DailySessionButton extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_session_button);

        btn1 = (Button)findViewById(R.id.firstactivity);
        btn2 = (Button)findViewById(R.id.bmiactivity);
        btn3 = (Button)findViewById(R.id.battery);
        btn4 = (Button)findViewById(R.id.Customadap);
        btn5 = (Button)findViewById(R.id.implicit);
        btn6 = (Button)findViewById(R.id.listview);
        btn7 = (Button)findViewById(R.id.main);
        btn8 = (Button)findViewById(R.id.log);
        btn9 = (Button)findViewById(R.id.maps);
        btn10 = (Button)findViewById(R.id.multilanguage);
        btn11 = (Button)findViewById(R.id.broadcast);
        btn12 = (Button)findViewById(R.id.navigation);
        btn13 = (Button)findViewById(R.id.newservice);
        btn14 = (Button)findViewById(R.id.proximity);
        btn15 = (Button)findViewById(R.id.recycler);
        btn16 = (Button)findViewById(R.id.sesor);
        btn17 = (Button)findViewById(R.id.sharedpreference);
        btn18 = (Button)findViewById(R.id.tablayout);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),FirstActivity.class);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),BmiActivity.class);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(),batteryreceiver.class);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(),CustomAdapter.class);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplicationContext(),implicitintent.class);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(),ListView2.class);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getApplicationContext(),MainActivity.class);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getApplicationContext(),LogActivity.class);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getApplicationContext(),MapsActivitytraining.class);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getApplicationContext(),MultiLanguageActivity.class);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getApplicationContext(), BroadcastReceiver.class);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getApplicationContext(),navigationdrawer.class);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getApplicationContext(),NewService.class);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getApplicationContext(),ProximityActivity.class);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(getApplicationContext(),RecyclerViewActivity.class);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(getApplicationContext(),SensorActivity.class);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(getApplicationContext(),SharedPreferenceActivity.class);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(getApplicationContext(), tab_layout.class);
            }
        });
    }
}