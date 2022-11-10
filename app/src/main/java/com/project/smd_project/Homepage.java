package com.project.smd_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    ImageView profile,logout,search;
    DrawerLayout drwr;
    Button details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        profile=findViewById(R.id.profile);
        drwr=findViewById(R.id.drwr);
        details=findViewById(R.id.details);
        logout=findViewById(R.id.logout);
        search=findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(Homepage.this,search_class_name_here.class); //please write the class name
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this,"Logging out",Toast.LENGTH_LONG).show();
                //startActivity(Homepage.this,signin_class_name_here.class); //please write the class name
            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,Hostel_details.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drwr.isDrawerOpen(Gravity.LEFT))
                {
                    drwr.closeDrawer(Gravity.LEFT);
                }
                else
                {
                    drwr.openDrawer(Gravity.LEFT);
                }
            }
        });

    }
}