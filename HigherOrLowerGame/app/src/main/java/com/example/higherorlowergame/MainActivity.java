package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void generateRandomVariable(){
        Random rand = new Random();
        randomNumber = rand.nextInt(25) +1;
    }

    public void click(View view){
        EditText editText = (EditText) findViewById(R.id.number);
        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;
        if(randomNumber > guessValue){
            message = "Guess Higher!!";
        }else if(guessValue > randomNumber){
            message = "Guess Lower!!";
        }else{
            message = "WOW !! YOU GOT IT , Try Again!!";
            generateRandomVariable();
        }
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
        Log.i("Entered number" , editText.getText().toString());
        Log.i("Random number", Integer.toString(randomNumber));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomVariable();
    }
}