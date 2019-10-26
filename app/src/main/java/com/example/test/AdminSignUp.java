package com.example.test;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AdminSignUp extends AppCompatActivity {

    public Boolean authorized(String password){
        String correct_pass = "0";
        return password == correct_pass;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_up);
    }
    @SuppressWarnings("ApplySharedPref")
    public void go_back_adminButton(android.view.View view) {
        //edit this:
        EditText email = this.findViewById(R.id.emailEditText);
        String email_string = email.getText().toString();

        EditText athentication_code = this.findViewById(R.id.authenticationEditText);
        String athentication_code_string = athentication_code.getText().toString();

        EditText password = this.findViewById(R.id.personalPasswordEditText);
        String password_string = password.getText().toString();

        if(!authorized(athentication_code_string)){
            athentication_code.setError("Incorrect authentication password");
        }
        else{
            SharedPreferences app_data = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor data = app_data.edit();
            data.putString("EMAIL", email_string);
            data.putString("PASSWORD", password_string);
            data.commit();
            //and go back:
            finish();
        }


    }
}
