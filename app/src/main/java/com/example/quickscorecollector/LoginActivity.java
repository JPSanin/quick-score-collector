package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText emailTextField;
    private EditText passwordTextField;
    private Button loginButton;
    private FirebaseAuth auth;
    //private FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        emailTextField= findViewById(R.id.emailTextField);
        passwordTextField= findViewById(R.id.passwordTextField);
        loginButton= findViewById(R.id.loginButton);
        auth= FirebaseAuth.getInstance();
        //db= FirebaseDatabase.getInstance();

        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        /*
        User: email: ceoqs@gmail.com
                pw: 123456
         */
        switch (v.getId()){
            case R.id.loginButton:
                if(!emailTextField.getText().toString().isEmpty() && !passwordTextField.getText().toString().isEmpty()){
                    auth.signInWithEmailAndPassword(emailTextField.getText().toString(), passwordTextField.getText().toString()).addOnCompleteListener(
                            task -> {
                                if(task.isSuccessful()){
                                    Intent i=new Intent (this, TeamSelectActivity.class);
                                    i.putExtra("home", "none");
                                    i.putExtra("away", "none");
                                    startActivity(i);
                                    finish();
                                }else{
                                    Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                    );
                }

               /* Intent i=new Intent (this, TeamSelectActivity.class);
                i.putExtra("home", "none");
                i.putExtra("away", "none");
                startActivity(i);
                finish();*/


              /*  Insert Teams into FirebaseDatabase
              Team[] teams= new Team[12];
               teams[0]= new Team("", "Cafeteros de Armenia", "Cafeteros",
                        0,0,0,0,0,0,0,0,0);
               teams[1]= new Team("", "Motilones del Norte", "Motilones",
                        0,0,0,0,0,0,0,0,0);
               teams[2]= new Team("", "Team Cali", "Team Cali",
                        0,0,0,0,0,0,0,0,0);
                teams[3]= new Team("", "Caribbean Storm Islands", "Storm",
                        0,0,0,0,0,0,0,0,0);
                teams[4]= new Team("", "Titanes de Barranquilla", "Titanes",
                        0,0,0,0,0,0,0,0,0);
                teams[5]= new Team("", "Cimarrones del Choco", "Cimarrones",
                        0,0,0,0,0,0,0,0,0);
                teams[6]= new Team("", "Sabios de Manizales", "Sabios",
                        0,0,0,0,0,0,0,0,0);
                teams[7]= new Team("", "Tigrillos de Antioquia", "Tigrillos",
                        0,0,0,0,0,0,0,0,0);
                teams[8]= new Team("", "Bucaros de Bucaramanga", "Bucaros",
                        0,0,0,0,0,0,0,0,0);
                teams[9]= new Team("", "Corsarios de Cartagena", "Corsarios",
                        0,0,0,0,0,0,0,0,0);
                teams[10]= new Team("", "Condores de Cundinamarca", "Condores",
                        0,0,0,0,0,0,0,0,0);
                teams[11]= new Team("", "Piratas de Bogota", "Piratas",
                        0,0,0,0,0,0,0,0,0);


                for (int i=0; i<12; i++){
                    String id= UUID.randomUUID().toString();
                    DatabaseReference ref=db.getReference().child("teams").child(id);
                    teams[i].setTeamId(id);
                    ref.setValue(teams[i]);
                }*/


                break;
        }
    }
}