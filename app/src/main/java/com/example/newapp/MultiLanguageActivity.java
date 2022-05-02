package com.example.newapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MultiLanguageActivity extends AppCompatActivity
{

    Button btnchange;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_language);

       /* btnchange = (Button) findViewById(R.id.change);
        textView = (TextView) findViewById(R.id.textviewml);

        //private void changelanguage(){
            final String languages [] = {"English","Gujarati","Hindi"};
            AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(this);
            alertdialogbuilder.setTitle("Change Language");
            alertdialogbuilder.setSingleChoiceItems(languages, -1, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(i==0)
                    {
                        setLocale("");
                        recreate();
                    }
                    else if(i==1)
                    {
                        setLocale("gu");
                        recreate();
                    }
                    else if(i==2)
                    {
                        setLocale("hi");
                        recreate();
                    }
                }
                }
            });
            //alertdialogbuilder.create();
            //alertdialogbuilder.show();
        }
    }
    private void setLocale(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale=locale;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("app_language",language);
        editor.apply();
    }
    private void loadlocale()
    {
        SharedPreferences preferences = getSharedPreferences("Settings",MODE_PRIVATE);
        String language = preferences.getString("app_language","");
        setLocale(language);
    }*/
    }

}