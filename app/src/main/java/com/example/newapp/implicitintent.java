package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Scanner;

public class implicitintent extends AppCompatActivity {


    Button implicit;
    Button implicit2;
    ImageButton ibtn1,ibtn2,ibtn3,ibtn4;
    EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicitintent);

        setTitle("PayTM");

        implicit = (Button)findViewById(R.id.implicit_button);
        implicit2 = (Button)findViewById(R.id.implicit_button2);

        ibtn1 = (ImageButton)findViewById(R.id.whatsapp);
        ibtn2 = (ImageButton)findViewById(R.id.facebook);
        ibtn3 = (ImageButton)findViewById(R.id.dial);
        ibtn4 = (ImageButton)findViewById(R.id.email);

        text1 = (EditText)findViewById(R.id.text1);


        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://paytm.com/"));
                startActivity(intent);
            }
        });

        implicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = text1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"Dostaro ne mokalo"));

            }
        });



        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Hello Dostaro";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                intent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"Dostaro ne mokalo"));

            }
        });

        ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Hello Dostaro";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.facebook");
                intent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"Dostaro ne mokalo"));
            }
        });

        ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "0987654321";
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
                startActivity(intent);
            }
        });

        ibtn4.setOnClickListener(new View.OnClickListener() {
            String recipents = "bhavya.thakkar01@gmail.com";
            String subject = "Regarding leave application";
            String body = "Please approve my leave";
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND,Uri.parse(("mailto:")));
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,recipents);
                //email.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                //email.putExtra((Intent.EXTRA_TEXT,body.getText().toString()));
                email.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(email,"Choose an email app"));
            }
        });

    }
}