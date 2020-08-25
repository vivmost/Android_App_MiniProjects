package com.example.myconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){
        Log.i("info" , "It's working!!");
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInDollars = editText.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInRsDouble = 75 * amountInDollarsDouble;
        String amountInRsString = String.format("%.2f" , amountInDollarsDouble);
        Toast.makeText(this, "$ " + amountInDollars + " is RS " + amountInRsDouble , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}