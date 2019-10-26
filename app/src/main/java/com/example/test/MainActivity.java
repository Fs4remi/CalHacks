package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign_up_button(android.view.View view){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void get_notes(android.view.View view){
        //Intent intent = new Intent(this, signup.class);
        //startActivity(intent);
    }


}
