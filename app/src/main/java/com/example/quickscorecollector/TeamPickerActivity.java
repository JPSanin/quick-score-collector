package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamPickerActivity extends AppCompatActivity {

    private TextView selectText;
    private ImageView cafeterosImg;
    private ImageView motilonesImg;
    private ImageView teamCaliImg;
    private ImageView caribbeanImg;
    private ImageView titanesImg;
    private ImageView cimarronesImg;
    private ImageView sabiosImg;
    private ImageView tigrillosImg;
    private ImageView bucarosImg;
    private ImageView corsariosImg;
    private ImageView condoresImg;
    private ImageView piratasImg;
    private Button continueBtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_picker);
        getSupportActionBar().hide();

        selectText= findViewById(R.id.selectText);
        cafeterosImg= findViewById(R.id.cafeterosImg);
        motilonesImg= findViewById(R.id.motilonesImg);
        teamCaliImg= findViewById(R.id.teamCaliImg);
        caribbeanImg= findViewById(R.id.caribbeanImg);
        titanesImg= findViewById(R.id.titanesImg);
        cimarronesImg= findViewById(R.id.cimarronesImg);
        sabiosImg= findViewById(R.id.sabiosImg);
        tigrillosImg= findViewById(R.id.tigrillosImg);
        bucarosImg= findViewById(R.id.bucarosImg);
        corsariosImg= findViewById(R.id.corsariosImg);
        condoresImg= findViewById(R.id.condoresImg);
        piratasImg= findViewById(R.id.piratasImg);
        continueBtn2= findViewById(R.id.continueBtn2);


        selectText.setText(getIntent().getExtras().getString("select"));

        continueBtn2.setEnabled(false);




    }
}