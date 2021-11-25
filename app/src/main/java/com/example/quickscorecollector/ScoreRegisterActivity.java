package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreRegisterActivity extends AppCompatActivity {


    private ImageView localImg;
    private ImageView visitanteImg;
    private TextView localTeamText;
    private TextView awayTeamText;
    private EditText localScore;
    private EditText awayScore;
    private String homeTeam;
    private String awayTeam;
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

        homeTeam=getIntent().getExtras().getString("home");
        awayTeam=getIntent().getExtras().getString("away");

        switch (homeTeam){
            case "cafeteros":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                localTeamText.setText("cafeteros");
                break;
            case "motilones":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                localTeamText.setText("motilones");
                break;
            case "team cali":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                localTeamText.setText("team cali");
                break;
            case "caribbean":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                localTeamText.setText("caribbean");
                break;
            case "titanes":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                localTeamText.setText("titanes");
                break;
            case "cimarrones":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                localTeamText.setText("cimarrones");
                break;
            case "sabios":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                localTeamText.setText("sabios");
                break;
            case "tigrillos":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                localTeamText.setText("tigrillos");
                break;
            case "bucaros":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                localTeamText.setText("bucaros");
                break;
            case "corsarios":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                localTeamText.setText("corsarios");
                break;
            case "condores":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                localTeamText.setText("condores");
                break;
            case "piratas":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                localTeamText.setText("piratas");
                break;
           
        }

        switch (awayTeam){
            case "cafeteros":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros,null));
                awayTeamText.setText("cafeteros");
                break;
            case "motilones":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones,null));
                awayTeamText.setText("motilones");
                break;
            case "team cali":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali,null));
                awayTeamText.setText("team cali");
                break;
            case "caribbean":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean,null));
                awayTeamText.setText("caribbean");
                break;
            case "titanes":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes,null));
                awayTeamText.setText("titanes");
                break;
            case "cimarrones":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones,null));
                awayTeamText.setText("cimarrones");
                break;
            case "sabios":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios,null));
                awayTeamText.setText("sabios");
                break;
            case "tigrillos":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos,null));
                awayTeamText.setText("tigrillos");
                break;
            case "bucaros":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros,null));
                awayTeamText.setText("bucaros");
                break;
            case "corsarios":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios,null));
                awayTeamText.setText("corsarios");
                break;
            case "condores":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.condores,null));
                awayTeamText.setText("condores");
                break;
            case "piratas":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas,null));
                awayTeamText.setText("piratas");
                break;
            
        }


        registerBtn.setOnClickListener(view -> {
            if(localScore.getText().toString().isEmpty() || awayScore.getText().toString().isEmpty()){
                runOnUiThread(()->{
                    Toast.makeText(this, "Por favor llenar los marcadores", Toast.LENGTH_SHORT).show();
                });
            }else{
                //enviar a db
                Intent i=new Intent (this, SuccessfulRegisterActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}