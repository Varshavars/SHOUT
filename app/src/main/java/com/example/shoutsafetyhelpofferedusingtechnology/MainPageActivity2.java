package com.example.shoutsafetyhelpofferedusingtechnology;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainPageActivity2 extends AppCompatActivity {

    private Button setUpPermissionButton, editContactListButton, falseAlarmMessageButton, historyOptionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);

        setUpPermissionButton = findViewById(R.id.btn_set_up_permission);
        editContactListButton = findViewById(R.id.btn_edit_contact_list);
        falseAlarmMessageButton = findViewById(R.id.btn_false_alarm_message);
        historyOptionsButton = findViewById(R.id.btn_history_options);

        // Set up permission button click listener
        setUpPermissionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Set Up Permission activity
                Intent intent = new Intent(MainPageActivity2.this, SetUpPermissionActivity.class);
                startActivity(intent);
            }
        });

        // Edit contact list button click listener
        editContactListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Edit Contact List activity
                Intent intent = new Intent(MainPageActivity2.this, EditContactListActivity.class);
                startActivity(intent);
            }
        });

        // False alarm message button click listener
        falseAlarmMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the False Alarm Message activity
                Intent intent = new Intent(MainPageActivity2.this, FalseAlarmMessageActivity.class);
                startActivity(intent);
            }
        });

        // History options button click listener
        historyOptionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the History Options activity
                Intent intent = new Intent(MainPageActivity2.this, HistoryOptionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
