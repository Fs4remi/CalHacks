package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.UUID;

public class AttendenceScanner extends AppCompatActivity {
    byte[] uuidgen = {50, 42, 122};
    UUID uuid =  UUID.nameUUIDFromBytes(uuidgen);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence_scanner);


        BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
        if (bluetooth == null) {
            // Device doesn't support Bluetooth
            TextView label = this.findViewById(R.id.scanning);
            label.setText("Bluetooth not working!");
            Button exit = this.findViewById(R.id.button);
            exit.setText("Return");
        }else{
            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            intent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 600);
            startActivity(intent);
            try{
                bluetooth.listenUsingRfcommWithServiceRecord("Glorious Leader", uuid);
            }catch(java.io.IOException e){
                finish();
            }
        }
    }

    @Override
    protected void onDestroy() {
        Intent intent = new Intent(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        startActivity(intent);

        super.onDestroy();
    }

    public void end(android.view.View v){
        //save bluetooth info?
        //exit bluetooth things
        this.onDestroy();
    }
}
