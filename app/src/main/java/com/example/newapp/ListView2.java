package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        ListView simpleList;
        String country[] = {"India","newzeland","USA","UK","China"};

            simpleList = (ListView) findViewById(R.id.list1);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.custom_listview,R.id.tv,country);

            simpleList.setAdapter(arrayAdapter);
    }
}