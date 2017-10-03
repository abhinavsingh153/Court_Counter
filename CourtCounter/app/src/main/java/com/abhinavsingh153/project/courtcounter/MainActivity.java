package com.abhinavsingh153.project.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
       int points=0;
    int pointsB=0;


        public void add1ForTeamA (View v)
    {
         points=points+1;
        displayForTeamA(points);

    }

    public void add2ForTeamA (View v)
    {
        points=points+2;
        displayForTeamA(points);

    }

    public void add3ForTeamA (View v)
    {
       points=points+3;
        displayForTeamA(points);

    }

    public void displayForTeamA (int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //methods for team B

     public void add1ForTeamB(View v)
     {
         pointsB=pointsB+1;
         displayForTeamB(pointsB);
     }

     public void add2ForTeamB(View v)
    {
        pointsB = pointsB + 2;
        displayForTeamB (pointsB);
    }

    public void add3ForTeamB(View v)
    {
        pointsB = pointsB + 3;
        displayForTeamB(pointsB);
    }

    public void displayForTeamB(int scoreb)
    {
        TextView scoreViewB= (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreb));
    }

    //method for reset button
    public void resetButton(View view)
    {
        //for team A
        points=0;
        displayForTeamA(points);

        //for team b

        pointsB = 0;
        displayForTeamB(pointsB);

    }
}


