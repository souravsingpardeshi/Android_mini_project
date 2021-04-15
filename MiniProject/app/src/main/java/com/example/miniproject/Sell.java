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
        Phone = findViewById(R.id.Phone);
        Old = findViewById(R.id.Old);
        config = findViewById(R.id.config);
        Price = findViewById(R.id.Price);
        Ram = findViewById(R.id.Ram);
        upload = findViewById(R.id.upload);
       upload.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view){
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                String name = Name.getText().toString();
               String phone = Phone.getText().toString();
               if(phone.isEmpty()){
                   Phone.setError("field cannot be empty");
                return;
               }
               String old = Old.getText().toString();
               String price = Price.getText().toString();
               String Conf = config.getText().toString();
               String ram = Ram.getText().toString();
                HelperClass helperClass = new HelperClass(name,Conf,phone,old,price,ram);
                reference.child(phone).setValue(helperClass);
           }
       });

}}