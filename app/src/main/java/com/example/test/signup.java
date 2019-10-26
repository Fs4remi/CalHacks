package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    public void go_back(android.view.View view){
        finish();
    }
}
