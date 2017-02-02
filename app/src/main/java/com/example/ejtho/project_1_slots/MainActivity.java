package com.example.ejtho.project_1_slots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.onClick;
import static android.R.attr.resource;
import static com.example.ejtho.project_1_slots.R.id.dollarAmount;
import static com.example.ejtho.project_1_slots.R.id.goButton;

public class MainActivity extends AppCompatActivity {

    private int dollarAmount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goButton= (Button) findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int rewardAmount = 0;
                TextView dollarCount = (TextView) findViewById(R.id.dollarAmount);

                //TODO This needs to subtract $1 from the dollarAmount
                dollarAmount--;
                dollarCount.setText(dollarAmount);

                //TODO This needs to randomize the flower images

                //TODO This needs to determine the reward money based on flower images

                //TODO add reward value to dollarAmount
                dollarAmount += rewardAmount;
                dollarCount.setText(dollarAmount);
            }
        });

        Button resetButton= (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("You have clicked the reset button");
                //TODO Reset dollarAmount to $5
                //TODO Reset all flower images to default purple f1 flower.
            }
        });
    }

}
