package com.example.dalalalmutawa.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int player1Score  , player2Score;
    TextView p2,p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1= (TextView) findViewById(R.id.player1Score);
        p2= (TextView) findViewById(R.id.player2Score);
        player1Score=0;
        player2Score=0;
    }

    public void Reset2 (View  view)
    {
        player2Score=0;
        p2.setText(player2Score+"");
    }

    public void Reset1 (View  view)
    {
        player1Score=0;
        p1.setText(player1Score+"");
    }
    public void inc2 (View  view)
    {
        p2.setText(++player2Score+"");
    }
    public void inc1 (View  view)
    {
        p1.setText(++player1Score+"");
    }
    public void des1 (View  view)
    {
        if (player1Score!=0)
        p1.setText(--player1Score+"");
    }
    public void des2 (View  view)
    {
        if (player2Score!=0)
            p2.setText(--player2Score+"");    }



}
