package com.example.quickscorecollector;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SuccessfulRegisterActivity extends AppCompatActivity {

    private Button registerBtn2;
    private Button logoutBtn;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_register);

        getSupportActionBar().hide();
        auth= FirebaseAuth.getInstance();
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
            AlertDialog.Builder builder= new AlertDialog.Builder(this)
                    .setTitle("Cerrar sesión")
                    .setMessage("¿Esta seguro que desea cerrar sesión?")
                    .setNegativeButton("No", (dialog, id)->{
                        dialog.dismiss();
                    })
                    .setPositiveButton("Si",(dialog, id)->{
                        auth.signOut();
                        Intent i=new Intent (this, LoginActivity.class);
                        startActivity(i);
                        finish();
                    });
            builder.show();


        });

    }
}