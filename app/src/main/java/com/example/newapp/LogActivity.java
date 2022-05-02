package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//private static final String LOG_TAG = "LogActivity";

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        setTitle("Log Activity");

        Log.v("LogActivity","this is verbose mode");

        Log.d("LogActivity","this is debug mode");

        Log.i("LogActivity","this is info mode");

        Log.w("LogActivity","this is warn mode");

        Log.e("LogActivity","this is error mode");
    }
}