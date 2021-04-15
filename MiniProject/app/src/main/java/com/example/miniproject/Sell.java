package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sell extends AppCompatActivity {
TextView Name,Phone,Old,config,Price,Ram;
Button upload;
FirebaseDatabase rootNode;
DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sell);
        Name = findViewById(R.id.Name);
        config = findViewById(R.id.config);
        Ram = findViewById(R.id.Ram);
        Price = findViewById(R.id.Price);
        Old = findViewById(R.id.Old);
        Phone = findViewById(R.id.Phone);
        upload = findViewById(R.id.upload);
       upload.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view){
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                String name = Name.getText().toString();
               String Conf = config.getText().toString();
               String ram = Ram.getText().toString();
               String price = Price.getText().toString();
               String old = Old.getText().toString();
               String phone = Phone.getText().toString();
               if(phone.isEmpty()){
                   Phone.setError("field cannot be empty");
                return;
               }

                HelperClass helperClass = new HelperClass(name,Conf,ram,price,old,phone);
                reference.child(phone).setValue(helperClass);
           }
       });

}}