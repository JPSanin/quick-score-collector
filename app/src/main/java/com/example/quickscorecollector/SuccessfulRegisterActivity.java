package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SuccessfulRegisterActivity extends AppCompatActivity {

    private Button registerBtn2;
    private Button logoutBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_register);

        getSupportActionBar().hide();

        registerBtn2= findViewById(R.id.registerBtn2);
        logoutBtn= findViewById(R.id.logoutBtn);

    }
}