package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AttendenceScanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence_scanner);
    }

    public void end(android.view.View v){
        //save bluetooth info?
        //exit bluetooth things
        finish();
    }
}
