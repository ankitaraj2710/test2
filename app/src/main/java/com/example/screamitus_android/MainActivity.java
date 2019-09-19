package com.example.screamitus_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View view) {

        TextView resultsLabel = findViewById(R.id.resultsLabel);
        EditText tbDays = findViewById(R.id.daysTextBox);

        int days = Integer.parseInt(tbDays.getText().toString());

//        // uncomment this code when you do your UI tests
//        Infection infection = new Infection();
//        int numInfected = infection.calculateTotalInfected(days);
//        resultsLabel.setText(String.valueOf(numInfected) + " instructors infected");

    }
}
