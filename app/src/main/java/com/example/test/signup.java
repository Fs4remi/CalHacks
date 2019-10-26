package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    public void go_back(android.view.View view) {
        EditText net_id = this.findViewById(R.id.net_idEditText);
        String id = net_id.getText().toString();
        //java.lang.System.out.println("bluh");
        if(id.length() != 6) {
            net_id.setError("Please enter your full NetID");
        }else{
            //save the text?
            finish();
        }
    }
}
