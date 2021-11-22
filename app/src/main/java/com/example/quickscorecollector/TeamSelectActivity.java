package com.example.quickscorecollector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TeamSelectActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView selectHomeImg;
    private ImageView selectAwayImg;
    private ImageView homeImg;
    private ImageView awayImg;
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

        selectHomeImg.setOnClickListener(this);
        selectAwayImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.selectHomeImg:
                Intent i=new Intent (this, TeamPickerActivity.class);
                i.putExtra("select", "Local");
                startActivity(i);

                break;

            case R.id.selectAwayImg:
                Intent i2=new Intent (this, TeamPickerActivity.class);
                i2.putExtra("select", "Visitante");
                startActivity(i2);

                break;

            case R.id.continueBtn1:

                break;

        }
    }
}