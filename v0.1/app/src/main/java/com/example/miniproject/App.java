package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class App extends AppCompatActivity {

ImageButton sell;
ImageButton buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
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