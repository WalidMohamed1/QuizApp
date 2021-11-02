package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    RadioGroup group1;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    RadioGroup group2;
    RadioButton r11;
    RadioButton r22;
    RadioButton r33;
    RadioButton r44;
    RadioGroup group3;
    RadioButton r111;
    RadioButton r222;
    RadioButton r333;
    RadioButton r444;
    RadioGroup group4;
    RadioButton r1111;
    RadioButton r2222;
    RadioButton r3333;
    RadioButton r4444;
    RadioGroup group5;
    RadioButton r11111;
    RadioButton r22222;
    RadioButton r33333;
    RadioButton r44444;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        group1 = (RadioGroup) findViewById(R.id.group1);
        r1 = (RadioButton) findViewById(R.id.r1); //First answer of Q1
        r2 = (RadioButton) findViewById(R.id.r2); //Second answer of Q1
        r3 = (RadioButton) findViewById(R.id.r3); //Third answer of Q1
        r4 = (RadioButton) findViewById(R.id.r4); //Fourth answer of Q1
        group2 = (RadioGroup) findViewById(R.id.group2);
        r11 = (RadioButton) findViewById(R.id.r11); //First answer of Q2
        r22 = (RadioButton) findViewById(R.id.r22); //First answer of Q2
        r33= (RadioButton) findViewById(R.id.r33);  //And so on ..
        r44 = (RadioButton) findViewById(R.id.r44);
        group3 = (RadioGroup) findViewById(R.id.group3);
        r111 = (RadioButton) findViewById(R.id.r111);
        r222 = (RadioButton) findViewById(R.id.r222);
        r333= (RadioButton) findViewById(R.id.r333);
        r444 = (RadioButton) findViewById(R.id.r444);
        group4 = (RadioGroup) findViewById(R.id.group4);
        r1111 = (RadioButton) findViewById(R.id.r1111);
        r2222 = (RadioButton) findViewById(R.id.r2222);
        r3333= (RadioButton) findViewById(R.id.r3333);
        r4444 = (RadioButton) findViewById(R.id.r4444);
        group5 = (RadioGroup) findViewById(R.id.group4);
        r11111 = (RadioButton) findViewById(R.id.r11111);
        r22222 = (RadioButton) findViewById(R.id.r22222);
        r33333= (RadioButton) findViewById(R.id.r33333);
        r44444 = (RadioButton) findViewById(R.id.r44444);

    }

    public void score(View v){

        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int q5 = 0;


    //--------------First Question--------------
        if(r2.isChecked()==true) //To check if user chose a correct answer (r2) give point if not don’t give point
        {
            q1 = 1; //Correct answer
        }
        else{
            q1 = 0; //Wrong answer
        }

    //--------------Second Question--------------
        if (r44.isChecked()==true){
            q2 = 1;
        }
        else{
            q2 = 0;
        }

    //--------------Third Question--------------
        if (r111.isChecked()==true){
            q3 = 1;
        }
        else{
            q3 = 0;
        }

    //--------------Fourth Question--------------
        if (r4444.isChecked()==true){
            q4 = 1;
        }
        else{
            q4 = 0;
        }

    //--------------Fifth Question--------------
        if (r33333.isChecked()==true){
            q5 = 1;
        }
        else{
            q5 = 0;
        }

        Toast.makeText(this, "You have finished the quiz!", Toast.LENGTH_LONG).show();

        int score=q1+q2+q3+q4+q5; //Variable to sum score of user

        Intent myintent1 = new Intent(this,Main3Activity.class); //Create path to move to new activity (myintent1) from this activity
        myintent1.putExtra("score",score); //To transfer score value from this activity to new activity
        startActivity(myintent1); //In order to move directly to the new activity.

    }


}
