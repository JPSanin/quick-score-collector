package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TeamSelectActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView selectHomeImg;
    private ImageView selectAwayImg;
    private ImageView homeImg;
    private ImageView awayImg;
    private String homeTeam;
    private String awayTeam;
    private Button continueBtn1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_select);
        getSupportActionBar().hide();

        selectHomeImg= findViewById(R.id.selectHomeImg);
        selectAwayImg= findViewById(R.id.selectAwayImg);
        homeImg= findViewById(R.id.homeImg);
        awayImg= findViewById(R.id.awayImg);
        continueBtn1= findViewById(R.id.continueBtn1);

        homeTeam=getIntent().getExtras().getString("home");
        awayTeam=getIntent().getExtras().getString("away");

        //Toast.makeText(this, homeTeam+";"+awayTeam, Toast.LENGTH_LONG).show();

        switch (homeTeam){
            case "cafeteros":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                break;
            case "motilones":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                break;
            case "team cali":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                break;
            case "caribbean":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                break;
            case "titanes":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                break;
            case "cimarrones":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                break;
            case "sabios":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                break;
            case "tigrillos":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                break;
            case "bucaros":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                break;
            case "corsarios":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                break;
            case "condores":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                break;
            case "piratas":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                break;
            case "none":
                homeImg.setImageDrawable(getResources().getDrawable(R.drawable.local_ball,null));
                break;
        }

        switch (awayTeam){
            case "cafeteros":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                break;
            case "motilones":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                break;
            case "team cali":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                break;
            case "caribbean":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                break;
            case "titanes":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                break;
            case "cimarrones":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                break;
            case "sabios":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                break;
            case "tigrillos":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                break;
            case "bucaros":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                break;
            case "corsarios":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                break;
            case "condores":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                break;
            case "piratas":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                break;
            case "none":
                awayImg.setImageDrawable(getResources().getDrawable(R.drawable.vistante_ball,null));
                break;
        }

        if(!homeTeam.equals("none") && !awayTeam.equals("none")){
            continueBtn1.setVisibility(View.VISIBLE);
        }

        selectHomeImg.setOnClickListener(this);
        selectAwayImg.setOnClickListener(this);
        continueBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.selectHomeImg:
                Intent i=new Intent (this, TeamPickerActivity.class);
                i.putExtra("select", "Local");
                i.putExtra("home", homeTeam);
                i.putExtra("away", awayTeam);
                startActivity(i);
                finish();


                break;

            case R.id.selectAwayImg:
                Intent i2=new Intent (this, TeamPickerActivity.class);
                i2.putExtra("select", "Visitante");
                i2.putExtra("home", homeTeam);
                i2.putExtra("away", awayTeam);
                startActivity(i2);
                finish();



                break;

            case R.id.continueBtn1:
                Intent i3=new Intent (this, ScoreRegisterActivity.class);
                i3.putExtra("home", homeTeam);
                i3.putExtra("away", awayTeam);
                startActivity(i3);
                finish();
                break;

        }
    }
}