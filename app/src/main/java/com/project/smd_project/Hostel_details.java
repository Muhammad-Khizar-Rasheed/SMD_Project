package com.project.smd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Hostel_details extends AppCompatActivity {
    ImageView back;
    Button enroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_details);
        back=findViewById(R.id.back);
        enroll=findViewById(R.id.enroll);

        enroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Hostel_details.this,"Request Sent Successfully",Toast.LENGTH_LONG).show();
                startActivity(new Intent(Hostel_details.this,Homepage.class));
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Hostel_details.this,Homepage.class));
            }
        });
    }
}