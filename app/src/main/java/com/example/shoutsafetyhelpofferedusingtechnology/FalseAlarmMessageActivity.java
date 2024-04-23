package com.example.shoutsafetyhelpofferedusingtechnology;
//import static com.example.shoutsafetyhelpofferedusingtechnology.Manifest.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class FalseAlarmMessageActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    private static final int MY_PERMISSION_REQUEST_SEND_SMS = 0;
    EditText textMsg, textPhoneNo;
    String msg, phoneNo;
    Button send;


    @Override

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_false_alarm_message);
//check if the permission is not granted
        if (ContextCompat.checkSelfPermission(this, "Manifest.permission.SEND_SMS") != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, "Manifest.permission.SEND_SMS")) {

            } else {
                ActivityCompat.requestPermissions(
                        this, new String[]{"Manifest.permission.SEND_SMS"}, MY_PERMISSION_REQUEST_SEND_SMS);
            }
        }
        textMsg = findViewById(R.id.textMsg);
        textPhoneNo = findViewById(R.id.textPhoneNo);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextMessage();
            }
        });
    }


    @Override

    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Thanks for permitting!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Without permitting ,it won't work", Toast.LENGTH_LONG).show();
                }
            }
        }//SWITCH
    }//METHOD

    protected void sendTextMessage() {
        msg = textMsg.getText().toString();
        phoneNo = textPhoneNo.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNo, null, msg, null, null);
        Toast.makeText(this, "Sent!", Toast.LENGTH_LONG).show();

    }
}