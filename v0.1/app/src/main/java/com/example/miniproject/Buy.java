package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Buy extends AppCompatActivity {
    ImageButton lap,smp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_buy);
        lap = findViewById(R.id.lap);
        lap.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Buy.this, Laptop.class));
            }
        });
        smp = findViewById(R.id.smp);
        smp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Buy.this, Phone.class));
            }
        });
    }
}