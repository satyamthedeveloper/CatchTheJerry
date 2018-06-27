package com.example.satyam.catchthejerry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Hard extends AppCompatActivity {

    int choice, randomHouse;
    Random rand = new Random();
    int difficultyLevel, noOfClicks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
        Intent caller = getIntent();
        difficultyLevel = caller.getIntExtra("level", 3);
        noOfClicks = caller.getIntExtra("clicks", 0);
    }

    public void selectedHouse1(View v) {
        choice = 0;
        nextPage();
    }

    public void selectedHouse2(View v) {
        choice = 1;
        nextPage();
    }

    public void selectedHouse3(View v) {
        choice = 2;
        nextPage();
    }

    public void selectedHouse4(View v) {
        choice = 3;
        nextPage();
    }

    public void selectedHouse5(View v) {
        choice = 4;
        nextPage();
    }

    public void selectedHouse6(View v) {
        choice = 5;
        nextPage();
    }

    public void selectedHouse7(View v) {
        choice = 6;
        nextPage();
    }

    public void selectedHouse8(View v) {
        choice = 7;
        nextPage();
    }

    public void selectedHouse9(View v) {
        choice = 8;
        nextPage();
    }

    public void nextPage() {

        randomHouse = rand.nextInt(9);
        noOfClicks += 1;

        if(choice == randomHouse) {
            Intent success = new Intent();
            success.setClass(this, SuccessActivity.class);
            success.putExtra("clicks", noOfClicks);
            success.putExtra("level",difficultyLevel);
            startActivity(success);
            finish();
        }

        else {
            Intent failure = new Intent();
            failure.setClass(this, FailureActivity.class);
            failure.putExtra("clicks",noOfClicks);
            failure.putExtra("level",difficultyLevel);
            startActivity(failure);
            finish();
        }
    }
}
