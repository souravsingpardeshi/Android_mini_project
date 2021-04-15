package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Laptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).commit();
    }
}