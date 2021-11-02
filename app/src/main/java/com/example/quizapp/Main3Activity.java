package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txt1 = (TextView) findViewById(R.id.txt1); //Text view to display score through it

        int score = getIntent().getIntExtra("score", 0); //To get score value from quiz mode activity
        txt1.setText("" + score +" / 5");
    }
    public void restart(View v){

        Intent myintent1 = new Intent(this,MainActivity.class); //To return to the registration activity and repeat the quiz
        startActivity(myintent1); //In order to move directly to the first activity (Registration activity).
    }
}
