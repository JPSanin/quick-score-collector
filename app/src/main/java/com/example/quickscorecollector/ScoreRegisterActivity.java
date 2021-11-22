package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreRegisterActivity extends AppCompatActivity {


    private ImageView localImg;
    private ImageView visitanteImg;
    private TextView localTeamText;
    private TextView awayTeamText;
    private EditText localScore;
    private EditText awayScore;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_register);
        getSupportActionBar().hide();

        localImg= findViewById(R.id.localImg);
        visitanteImg= findViewById(R.id.visitanteImg);
        localTeamText= findViewById(R.id.localTeamText);
        awayTeamText= findViewById(R.id.awayTeamText);
        localScore= findViewById(R.id.localScore);
        awayScore= findViewById(R.id.awayScore);
        registerBtn= findViewById(R.id.registerBtn);



    }
}