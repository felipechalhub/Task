package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class drinks extends AppCompatActivity {
    CheckBox Soda, Juice, SparklingWater, Beer, Wine, Gin;
    Button btSubmitDish;
    TextView tvOutputDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        backButton3();

        Soda = findViewById(R.id.soda);
        Juice = findViewById(R.id.juice);
        SparklingWater = findViewById(R.id.sparklingWater);
        Beer = findViewById(R.id.beer);
        Wine = findViewById(R.id.wine);
        Gin = findViewById(R.id.gin);
        btSubmitDish = findViewById(R.id.submitDish);
        tvOutputDish = findViewById(R.id.outputDish);

        Soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Soda.isChecked()){
                    Soda.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Soda.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Juice.isChecked()){
                    Juice.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Juice.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        SparklingWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SparklingWater.isChecked()){
                    SparklingWater.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    SparklingWater.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Beer.isChecked()){
                    Beer.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Beer.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Wine.isChecked()){
                    Wine.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Wine.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Gin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Gin.isChecked()){
                    Gin.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Gin.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });

        btSubmitDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(Soda.isChecked()){
                    s+="\n Soda";
                }
                if(Juice.isChecked()){
                    s+="\n Juice";
                }
                if(SparklingWater.isChecked()){
                    s+="\n Sparkling Water";
                }
                if(Beer.isChecked()){
                    s+="\n Beer";
                }
                if(Wine.isChecked()){
                    s+="\n Wine";
                }
                if(Gin.isChecked()){
                    s+="\n Gin";
                }
                tvOutputDish.setText(s);
            }
        });


    }
    public void backButton3() {
        Button backButton = (Button) findViewById(R.id.mainBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
