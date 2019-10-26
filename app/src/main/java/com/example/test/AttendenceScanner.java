package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AttendenceScanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence_scanner);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
        if (bluetooth == null) {
            // Device doesn't support Bluetooth
            //android:id="@+id/scanning"
            TextView label = this.findViewById(R.id.scanning);
            label.setText("Bluetooth not working!");
            Button exit = this.findViewById(R.id.button);
            exit.setText("Return");
            //delete progress bar?
            //ProgressBar bar = this.findViewById(R.id.progressBar);
        }else{

        }

    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    public void end(android.view.View v){
        //save bluetooth info?
        //exit bluetooth things
        finish();
    }
}
