package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.renderscript.ScriptGroup;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.renderscript.ScriptGroup.*;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;
    SharedPreferences spf; //To store data of user


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        spf = getSharedPreferences("data" , Activity.MODE_PRIVATE); //Create share preference called data to store data of user

    }


            public void register(View v) { //When clicking Sign Up button
                String emailValue = txt1.getText().toString();
                String passValue = txt2.getText().toString();

                if(txt1.getText().length()<=0 || txt2.getText().length()<=0){ //If field is empty

                    Toast.makeText(this, "All field are required", Toast.LENGTH_LONG).show(); //Appear notification if field is empty
                }

                else if(!Patterns.EMAIL_ADDRESS.matcher(emailValue).matches()) { //To verify email, it should to be e.g "Example@email.com"
                    Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_LONG).show();
                }

                else{

                    SharedPreferences.Editor editor = spf.edit(); //Make a object editor to add data of user
                    editor.putString("email",emailValue); //Add email to file with key and value
                    editor.putString("password",passValue); //Add password to file with key and value
                    editor.commit();

                    txt1.setText(""); //To clear data from fields and write it again when entering to show the realism action :D
                    txt2.setText("");

                    Toast.makeText(this, "Registration completed successfully!", Toast.LENGTH_LONG).show();
                }



            }
            public void login(View v) {

                String emailValue = txt1.getText().toString();
                String passValue = txt2.getText().toString();
                String registeredEmail = spf.getString("email",""); //To get Registered data
                String registeredPassword = spf.getString("password","");

                if(emailValue.equals(registeredEmail) && passValue.equals((registeredPassword))){ //To compare registered data with the entered data

                    Intent myintent = new Intent(this,Main2Activity.class); //Create path to move to new activity (myintent) from this
                    startActivity(myintent); //In order to move directly to the new activity.
                    Toast.makeText(this, "Quiz mode has begun!", Toast.LENGTH_LONG).show();
                }

                else if(!Patterns.EMAIL_ADDRESS.matcher(registeredEmail).matches()) {
                    Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_LONG).show();
                }

                else if(txt1.getText().length()<=0 || txt2.getText().length()<=0){

                    Toast.makeText(this, "All field are required", Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(this, "Incorrect email or password", Toast.LENGTH_LONG).show();
                }


            }


    }

