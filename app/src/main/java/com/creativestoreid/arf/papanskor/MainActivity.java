package com.creativestoreid.arf.papanskor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int countHTIMA = 0;
    private int countHTIMB = 0;

    private TextView showCountTIMA, showCountTIMB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCountTIMA = findViewById(R.id.show_sTimA);
        showCountTIMB = findViewById(R.id.show_sTimB);
    }

    public void HitungTimA(View view) {
        countHTIMA++;
        if(showCountTIMA != null){
            showCountTIMA.setText(Integer.toString(countHTIMA));
        }
    }

    public void HitungTimB(View view) {
        countHTIMB++;
        if(showCountTIMB != null){
            showCountTIMB.setText(Integer.toString(countHTIMB));
        }
    }

    public void ResetHitung(View view) {
        countHTIMA = 0;
        countHTIMB = 0;
        showCountTIMA.setText(Integer.toString(countHTIMA));
        showCountTIMB.setText(Integer.toString(countHTIMB));
    }
}
