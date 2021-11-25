package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


        registerBtn2.setOnClickListener(view -> {
            Intent i=new Intent (this, TeamSelectActivity.class);
            i.putExtra("home", "none");
            i.putExtra("away", "none");
            startActivity(i);
            finish();
        });

        logoutBtn.setOnClickListener(view -> {
            //logout db

            Intent i=new Intent (this, LoginActivity.class);
            startActivity(i);
            finish();
        });

    }
}