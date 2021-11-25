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
        homeTeam=getIntent().getExtras().getString("home");
        awayTeam=getIntent().getExtras().getString("away");

        selectText.setText(getIntent().getExtras().getString("select"));

        switch (homeTeam){
            case "cafeteros":
                cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "motilones":
                motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "team cali":
                teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "caribbean":
                caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "titanes":
                titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "cimarrones":
                cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "sabios":
                sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "tigrillos":
                tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "bucaros":
                bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "corsarios":
                corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "condores":
                condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;
            case "piratas":
                piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                break;

        }

        switch (awayTeam){
            case "cafeteros":
                cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "motilones":
                motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "team cali":
                teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "caribbean":
                caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "titanes":
                titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "cimarrones":
                cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "sabios":
                sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "tigrillos":
                tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "bucaros":
                bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "corsarios":
                corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "condores":
                condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;
            case "piratas":
                piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                break;

        }

        if(!homeTeam.equals("none") && !awayTeam.equals("none")){
            continueBtn2.setEnabled(true);
        }


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
        continueBtn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cafeterosImg:

                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("cafeteros")){
                        homeTeam="none";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("cafeteros")){
                        resetImage(homeTeam);
                        homeTeam="cafeteros";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("cafeteros")){
                        awayTeam="none";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("cafeteros")){
                        resetImage(awayTeam);
                        awayTeam="cafeteros";
                        cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;

            case R.id.motilonesImg:

                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("motilones")){
                        homeTeam="none";
                        motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("motilones")){
                        resetImage(homeTeam);
                        homeTeam="motilones";
                        motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("motilones")){
                        awayTeam="none";
                        motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("motilones")){
                        resetImage(awayTeam);
                        awayTeam="motilones";
                        motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }

                break;
            case R.id.teamCaliImg:

                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("team cali")){
                        homeTeam="none";
                        teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("team cali")){
                        resetImage(homeTeam);
                        homeTeam="team cali";
                        teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("team cali")){
                        homeTeam="none";
                        teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("team cali")){
                        resetImage(awayTeam);
                        awayTeam="team cali";
                        teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }

                break;
            case R.id.caribbeanImg:

                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("caribbean")){
                        homeTeam="none";
                        caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("caribbean")){
                        resetImage(homeTeam);
                        homeTeam="caribbean";
                        caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("caribbean")){
                        awayTeam="none";
                        caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("caribbean")){
                        resetImage(awayTeam);
                        awayTeam="caribbean";
                        caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;

            case R.id.titanesImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("titanes")){
                        homeTeam="none";
                        titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("titanes")){
                        resetImage(homeTeam);
                        homeTeam="titanes";
                        titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("titanes")){
                        awayTeam="none";
                        titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("titanes")){
                        resetImage(awayTeam);
                        awayTeam="titanes";
                        titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.cimarronesImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("cimarrones")){
                        homeTeam="none";
                        cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("cimarrones")){
                        resetImage(homeTeam);
                        homeTeam="cimarrones";
                        cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("cimarrones")){
                        awayTeam="none";
                        cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("cimarrones")){
                        resetImage(awayTeam);
                        awayTeam="cimarrones";
                        cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.sabiosImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("sabios")){
                        homeTeam="none";
                        sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("sabios")){
                        resetImage(homeTeam);
                        homeTeam="sabios";
                        sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("sabios")){
                        awayTeam="none";
                        sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("sabios")){
                        resetImage(awayTeam);
                        awayTeam="sabios";
                        sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.tigrillosImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("tigrillos")){
                        homeTeam="none";
                        tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("tigrillos")){
                        resetImage(homeTeam);
                        homeTeam="tigrillos";
                        tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("tigrillos")){
                        awayTeam="none";
                        tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("tigrillos")){
                        resetImage(awayTeam);
                        awayTeam="tigrillos";
                        tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.bucarosImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("bucaros")){
                        homeTeam="none";
                        bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("bucaros")){
                        resetImage(homeTeam);
                        homeTeam="bucaros";
                        bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("bucaros")){
                        awayTeam="none";
                        bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("bucaros")){
                        resetImage(awayTeam);
                        awayTeam="bucaros";
                        bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.corsariosImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("corsarios")){
                        homeTeam="none";
                        corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("corsarios")){
                        resetImage(homeTeam);
                        homeTeam="corsarios";
                        corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("corsarios")){
                        awayTeam="none";
                        corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                        continueBtn2.setEnabled(false);
                    }else  if (!homeTeam.equals("corsarios")){
                        resetImage(awayTeam);
                        awayTeam="corsarios";
                        corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.condoresImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("condores")){
                        homeTeam="none";
                        condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("condores")){
                        resetImage(homeTeam);
                        homeTeam="condores";
                        condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("condores")){
                        awayTeam="none";
                        condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("condores")){
                        resetImage(awayTeam);
                        awayTeam="condores";
                        condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;
            case R.id.piratasImg:
                if(selectText.getText().toString().equals("Local")){
                    if(homeTeam.equals("piratas")){
                        homeTeam="none";
                        piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                        continueBtn2.setEnabled(false);
                    }else if (!awayTeam.equals("piratas")){
                        resetImage(homeTeam);
                        homeTeam="piratas";
                        piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.checkhome,null));
                        continueBtn2.setEnabled(true);
                    }

                }

                if(selectText.getText().toString().equals("Visitante")){
                    if(awayTeam.equals("piratas")){
                        awayTeam="none";
                        piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                        continueBtn2.setEnabled(false);
                    }else if (!homeTeam.equals("piratas")){
                        resetImage(awayTeam);
                        awayTeam="piratas";
                        piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.checkaway,null));
                        continueBtn2.setEnabled(true);
                    }
                }
                break;



            case R.id.continueBtn2:
                Intent i=new Intent (this, TeamSelectActivity.class);
                i.putExtra("home", homeTeam);
                i.putExtra("away", awayTeam);
                startActivity(i);
                finish();


                break;

        }
    }

    private void resetImage(String team) {
        switch (team){
            case "cafeteros":
                cafeterosImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                break;
            case "motilones":
                motilonesImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                break;
            case "team cali":
                teamCaliImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                break;
            case "caribbean":
                caribbeanImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                break;
            case "titanes":
                titanesImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                break;
            case "cimarrones":
                cimarronesImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                break;
            case "sabios":
                sabiosImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                break;
            case "tigrillos":
                tigrillosImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                break;
            case "bucaros":
                bucarosImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                break;
            case "corsarios":
                corsariosImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                break;
            case "condores":
                condoresImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                break;
            case "piratas":
                piratasImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                break;

        }
    }
}