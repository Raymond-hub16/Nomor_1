package com.example.nomor_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bttnDB;
    Button bttnprofile, bttnaboutMe,bttnCallMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnprofile = findViewById(R.id.bttnprofile);
        bttnCallMe = findViewById(R.id.bttnCallMe);
        bttnaboutMe = findViewById(R.id.bttnaboutMe);

            bttnprofile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(i);

                }
            });

            bttnaboutMe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, AboutMe.class);
                    startActivity(i);
                }
            });


    }
}