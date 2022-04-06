package com.example.hellosensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button compassButton;
    Button accButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compassButton = (Button) findViewById(R.id.button1);
        compassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compass(v);
            }
        });

        accButton = (Button) findViewById(R.id.button2);
        accButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accelerometer(v);
            }
        });
    }

    /** Called when the user taps the Compass button */
    public void compass(View view){
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent); //Starts Compass class

    }

    public void accelerometer(View view){
        Intent intent = new Intent(this, Accelerometer.class); //Runtime binding between this and Accelerometer
        startActivity(intent); //Starts Accelerometer class with stats view
    }



}