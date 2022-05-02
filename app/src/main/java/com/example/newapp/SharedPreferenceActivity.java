package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class SharedPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        SharedPreferences sharedPreference = (SharedPreferences) getSharedPreferences("mySharedPreference",0);
        boolean dialogshown = sharedPreference.getBoolean("dialogshown",false);
        if(!dialogshown)
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "This is a message displayed in a Toast",
                    Toast.LENGTH_SHORT);

            toast.show();
            SharedPreferences.Editor editor = sharedPreference.edit();
            editor.putBoolean("dialogshown",true);
            editor.commit();
        }
    }
}