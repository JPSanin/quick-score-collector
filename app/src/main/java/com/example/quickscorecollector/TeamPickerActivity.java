package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamPickerActivity extends AppCompatActivity implements View.OnClickListener{

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
    private String homeTeam;
    private String awayTeam;
    private Button continueBtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_picker);
        getSupportActionBar().hide();

        //Hacer un switch con selected home and away

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
        homeTeam="";
        awayTeam="";

        selectText.setText(getIntent().getExtras().getString("select"));

        cafeterosImg.setOnClickListener(this);
        motilonesImg.setOnClickListener(this);
        teamCaliImg.setOnClickListener(this);
        caribbeanImg.setOnClickListener(this);
        titanesImg.setOnClickListener(this);
        cimarronesImg.setOnClickListener(this);
        sabiosImg.setOnClickListener(this);
        tigrillosImg.setOnClickListener(this);
        bucarosImg.setOnClickListener(this);
        corsariosImg.setOnClickListener(this);
        condoresImg.setOnClickListener(this);
        piratasImg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cafeterosImg:

                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("cafeteros")){
                        homeTeam="";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                        continueBtn2.setEnabled(false);
                    }else{
                        homeTeam="cafeteros";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){

                    if(awayTeam.equals("cafeteros")){
                        awayTeam="";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                        continueBtn2.setEnabled(false);
                    }else{
                        awayTeam="cafeteros";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }


                break;

            case R.id.selectAwayImg:


                break;

            case R.id.continueBtn2:

                break;

        }
    }
}