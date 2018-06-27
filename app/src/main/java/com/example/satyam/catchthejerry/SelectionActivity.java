package com.example.satyam.catchthejerry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    int difficultyLevel, numberOfClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }


    public void easyPage(View v) {
        numberOfClick = 0;
        difficultyLevel = 1;
        Intent goToEasy = new Intent();
        goToEasy.setClass(this, Easy.class);
        goToEasy.putExtra("level",difficultyLevel);
        goToEasy.putExtra("clicks",numberOfClick);
        startActivity(goToEasy);
    }

    public void hardPage(View v) {
        numberOfClick = 0;
        difficultyLevel = 3;
        Intent goToHard = new Intent();
        goToHard.setClass(this, Hard.class);
        goToHard.putExtra("level",difficultyLevel);
        goToHard.putExtra("clicks",numberOfClick);
        startActivity(goToHard);

    }
}
