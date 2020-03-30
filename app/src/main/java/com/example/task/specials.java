package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class specials extends AppCompatActivity {
    CheckBox dsoup, dsalad, dpasta;
    Button btSubmitDish;
    TextView tvOutputDish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specials);

        backButton4();

        dsoup = findViewById(R.id.dsoup);
        dsalad = findViewById(R.id.dsalad);
        dpasta = findViewById(R.id.dpasta);
        btSubmitDish = findViewById(R.id.submitDish);
        tvOutputDish = findViewById(R.id.outputDish);

        dsoup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dsoup.isChecked()){
                    dsoup.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    dsoup.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        dsalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dsalad.isChecked()){
                    dsalad.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    dsalad.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        dpasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dpasta.isChecked()){
                    dpasta.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    dpasta.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });

        btSubmitDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(dsoup.isChecked()){
                    s+="\n Daily Soup";
                }
                if(dsalad.isChecked()){
                    s+="\n Daily Salad";
                }
                if(dpasta.isChecked()){
                    s+="\n Daily Pasta";
                }
                tvOutputDish.setText(s);
            }
        });


    }
    public void backButton4() {
        Button backButton = (Button) findViewById(R.id.mainBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    }
