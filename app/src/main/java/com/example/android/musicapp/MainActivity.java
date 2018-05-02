package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SUITUP ACTIVITY
        TextView suitUpButton = (TextView) findViewById(R.id.suit_up_view);
        suitUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suitUpIntent = new Intent(MainActivity.this, SuitUpActivity.class);
                startActivity(suitUpIntent);
            }
        });

        //YELLOW UMBRELLA ACTIVITY
        TextView yellowUmbrellaButton = (TextView) findViewById(R.id.yellow_umbrella_view);
        yellowUmbrellaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yellowUmbrellaIntent = new Intent(MainActivity.this, YellowUmbrellaActivity.class);
                startActivity(yellowUmbrellaIntent);
            }
        });

        //FRENCH BLUE HORN ACTIVITY
        TextView blueHornButton = (TextView) findViewById(R.id.blue_horn_view);
        blueHornButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blueHornIntent = new Intent(MainActivity.this, BlueHornActivity.class);
                startActivity(blueHornIntent);
            }
        });

        //LEGENDARY ACTIVITY
        TextView legendaryButton = (TextView) findViewById(R.id.legen_dary_view);
        legendaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent legendaryIntent = new Intent(MainActivity.this, LegendaryActivity.class);
                startActivity(legendaryIntent);
            }
        });
    }


}
