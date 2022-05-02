package com.example.newapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn_start,btn_stop;


    private static final String l = "LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(l,"onCreateMethod Called");
        showdialoge();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(l,"onStart Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(l,"onStopMethod Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(l,"onPauseMethod Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(l,"onResumeMethod Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(l,"onRestartMethod Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(l,"onDestroyMethod Called");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Bas Javuj che?");
        dialog.setIcon(R.drawable.ic_baseline_arrow_24);
        dialog.setMessage("Pakku?");
        dialog.setPositiveButton("Ha", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        dialog.setNegativeButton("Na", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Pacha aai gaya!, are vaah",Toast.LENGTH_LONG);
            }
        });
        dialog.setNeutralButton("cancle cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Kasu j nathi karyu tame",Toast.LENGTH_LONG);
            }
        });
        AlertDialog alertDialog =dialog.create();
        alertDialog.show();
    }
    public void showdialoge()
    {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.warning);

        Button btn = (Button) dialog.findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();


    }


}