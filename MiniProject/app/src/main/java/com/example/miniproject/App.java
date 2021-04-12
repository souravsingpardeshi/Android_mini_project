package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class App extends AppCompatActivity {
ImageButton sell;
ImageButton buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        sell = findViewById(R.id.Sell);
        sell.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(App.this, Sell.class));
            }
        });
        buy = findViewById(R.id.Buy);
        buy.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(App.this, Buy.class));
            }
        });
    }
}