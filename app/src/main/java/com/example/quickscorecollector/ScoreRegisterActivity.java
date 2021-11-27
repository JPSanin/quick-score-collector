package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

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
    private FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_register);
        getSupportActionBar().hide();

        localImg = findViewById(R.id.localImg);
        visitanteImg = findViewById(R.id.visitanteImg);
        localTeamText = findViewById(R.id.localTeamText);
        awayTeamText = findViewById(R.id.awayTeamText);
        localScore = findViewById(R.id.localScore);
        awayScore = findViewById(R.id.awayScore);
        registerBtn = findViewById(R.id.registerBtn);
        db= FirebaseDatabase.getInstance();

        homeTeam = getIntent().getExtras().getString("home");
        awayTeam = getIntent().getExtras().getString("away");

        switch (homeTeam) {
            case "cafeteros":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros, null));
                localTeamText.setText("cafeteros");
                break;
            case "motilones":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones, null));
                localTeamText.setText("motilones");
                break;
            case "team cali":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali, null));
                localTeamText.setText("team cali");
                break;
            case "caribbean":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean, null));
                localTeamText.setText("caribbean");
                break;
            case "titanes":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes, null));
                localTeamText.setText("titanes");
                break;
            case "cimarrones":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones, null));
                localTeamText.setText("cimarrones");
                break;
            case "sabios":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios, null));
                localTeamText.setText("sabios");
                break;
            case "tigrillos":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos, null));
                localTeamText.setText("tigrillos");
                break;
            case "bucaros":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros, null));
                localTeamText.setText("bucaros");
                break;
            case "corsarios":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios, null));
                localTeamText.setText("corsarios");
                break;
            case "condores":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.condores, null));
                localTeamText.setText("condores");
                break;
            case "piratas":
                localImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas, null));
                localTeamText.setText("piratas");
                break;

        }

        switch (awayTeam) {
            case "cafeteros":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.cafeteros, null));
                awayTeamText.setText("cafeteros");
                break;
            case "motilones":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.motilones, null));
                awayTeamText.setText("motilones");
                break;
            case "team cali":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.teamcali, null));
                awayTeamText.setText("team cali");
                break;
            case "caribbean":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.caribbean, null));
                awayTeamText.setText("caribbean");
                break;
            case "titanes":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.titanes, null));
                awayTeamText.setText("titanes");
                break;
            case "cimarrones":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.cimarrones, null));
                awayTeamText.setText("cimarrones");
                break;
            case "sabios":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.sabios, null));
                awayTeamText.setText("sabios");
                break;
            case "tigrillos":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.tigrillos, null));
                awayTeamText.setText("tigrillos");
                break;
            case "bucaros":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.bucaros, null));
                awayTeamText.setText("bucaros");
                break;
            case "corsarios":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.corsarios, null));
                awayTeamText.setText("corsarios");
                break;
            case "condores":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.condores, null));
                awayTeamText.setText("condores");
                break;
            case "piratas":
                visitanteImg.setImageDrawable(getResources().getDrawable(R.drawable.piratas, null));
                awayTeamText.setText("piratas");
                break;

        }


        registerBtn.setOnClickListener(view -> {
            if (localScore.getText().toString().isEmpty() || awayScore.getText().toString().isEmpty()) {
                runOnUiThread(() -> {
                    Toast.makeText(this, "Por favor llenar los marcadores", Toast.LENGTH_SHORT).show();
                });
            } else if (Integer.parseInt(localScore.getText().toString()) == Integer.parseInt(awayScore.getText().toString())) {
                runOnUiThread(() -> {
                    Toast.makeText(this, "Los marcadores no pueden ser iguales", Toast.LENGTH_SHORT).show();
                });
            } else {
                //Subir marcador
                String id = UUID.randomUUID().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
                Calendar calendar = Calendar.getInstance();
                String date = sdf.format(calendar.getTime());
                DatabaseReference ref = db.getReference().child("scores").child(id);
                Score s = new Score(id, homeTeam, Integer.parseInt(localScore.getText().toString()), awayTeam, Integer.parseInt(awayScore.getText().toString()), date);
                ref.setValue(s);
                localScore.setText("");
                awayScore.setText("");

                //actualizar equipos en db
                DatabaseReference ref2 = db.getReference().child("teams");
                ref2.addListenerForSingleValueEvent(//once
                        new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot data) {
                                for (DataSnapshot child : data.getChildren()) {
                                    Team t = child.getValue(Team.class);
                                    if (homeTeam.equals(t.getTeamNameShort())) {
                                        Team t1;
                                        if (homeTeam.equals(s.getWinner())) {
                                            t1 = new Team(
                                                    t.getTeamId(),
                                                    t.getTeamName(), t.getTeamNameShort(),
                                                    t.getPlayedGames() + 1,
                                                    t.getGamesWon() + 1,
                                                    t.getGamesLost(),
                                                    t.getTablePoints() + 2,
                                                    t.getPointsScored() + s.getHomeTeamScore(),
                                                    t.getPointsConceded() + s.getAwayTeamScore(),
                                                    (t.getPointsScored() + s.getHomeTeamScore()) / (t.getPlayedGames() + 1),
                                                    t.getPointsDifference() + s.getHomeTeamScore() - s.getAwayTeamScore(),
                                                    t.getStreak() + 1
                                            );

                                        }else{
                                            t1 = new Team(
                                                    t.getTeamId(),
                                                    t.getTeamName(), t.getTeamNameShort(),
                                                    t.getPlayedGames() + 1,
                                                    t.getGamesWon(),
                                                    t.getGamesLost() + 1,
                                                    t.getTablePoints() + 1,
                                                    t.getPointsScored() + s.getHomeTeamScore(),
                                                    t.getPointsConceded() + s.getAwayTeamScore(),
                                                    (t.getPointsScored() + s.getHomeTeamScore()) / (t.getPlayedGames() + 1),
                                                    t.getPointsDifference() + s.getHomeTeamScore() - s.getAwayTeamScore(),
                                                    t.getStreak() - 1
                                            );

                                        }
                                        DatabaseReference modRef=  db.getReference().child("teams").child(t.getTeamId());
                                        modRef.setValue(t1);
                                    }

                                    if (awayTeam.equals(t.getTeamNameShort())) {
                                        Team t1;
                                        if (awayTeam.equals(s.getWinner())) {
                                            t1 = new Team(
                                                    t.getTeamId(),
                                                    t.getTeamName(), t.getTeamNameShort(),
                                                    t.getPlayedGames() + 1,
                                                    t.getGamesWon() + 1,
                                                    t.getGamesLost(),
                                                    t.getTablePoints() + 2,
                                                    t.getPointsScored() +  s.getAwayTeamScore(),
                                                    t.getPointsConceded() +s.getHomeTeamScore(),
                                                    (t.getPointsScored() + s.getAwayTeamScore()) / (t.getPlayedGames() + 1),
                                                    t.getPointsDifference() + s.getAwayTeamScore() - s.getHomeTeamScore(),
                                                    t.getStreak() + 1
                                            );

                                        }else{
                                            t1 = new Team(
                                                    t.getTeamId(),
                                                    t.getTeamName(), t.getTeamNameShort(),
                                                    t.getPlayedGames() + 1,
                                                    t.getGamesWon(),
                                                    t.getGamesLost()+ 1,
                                                    t.getTablePoints() + 1,
                                                    t.getPointsScored() +  s.getAwayTeamScore(),
                                                    t.getPointsConceded() +s.getHomeTeamScore(),
                                                    (t.getPointsScored() + s.getAwayTeamScore()) / (t.getPlayedGames() + 1),
                                                    t.getPointsDifference() + s.getAwayTeamScore() - s.getHomeTeamScore(),
                                                    t.getStreak() -1
                                            );

                                        }
                                        DatabaseReference modRef=  db.getReference().child("teams").child(t.getTeamId());
                                        modRef.setValue(t1);
                                    }
                                }

                            }

                            @Override
                            public void onCancelled(DatabaseError error) {

                            }
                        }
                );

                Intent i = new Intent(this, SuccessfulRegisterActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}