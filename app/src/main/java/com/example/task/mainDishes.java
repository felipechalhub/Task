package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class mainDishes extends AppCompatActivity {

    CheckBox Burger, Pizza, Lasagna, Shrimp, MacAndCheese, Steak;
    Button btSubmitDish;
    TextView tvOutputDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dishes);

        backButton();

        Burger = findViewById(R.id.cbburger);
        Pizza = findViewById(R.id.cbpizza);
        Lasagna = findViewById(R.id.cblasagna);
        Shrimp = findViewById(R.id.cbshrimp);
        MacAndCheese = findViewById(R.id.cbmac);
        Steak = findViewById(R.id.cbsteak);
        btSubmitDish = findViewById(R.id.submitDish);
        tvOutputDish = findViewById(R.id.outputDish);

        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Burger.isChecked()){
                    Burger.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Burger.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Pizza.isChecked()){
                    Pizza.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Pizza.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Lasagna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Lasagna.isChecked()){
                    Lasagna.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Lasagna.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Shrimp.isChecked()){
                    Shrimp.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Shrimp.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        MacAndCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MacAndCheese.isChecked()){
                    MacAndCheese.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    MacAndCheese.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        Steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Steak.isChecked()){
                    Steak.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    Steak.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });

        btSubmitDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(Burger.isChecked()){
                    s+="\n Burger";
                }
                if(Pizza.isChecked()){
                    s+="\n Pizza";
                }
                if(Lasagna.isChecked()){
                    s+="\n Lasagna";
                }
                if(Shrimp.isChecked()){
                    s+="\n Shrimp Pasta";
                }
                if(MacAndCheese.isChecked()){
                    s+="\n Mac and Cheese";
                }
                if(Steak.isChecked()){
                    s+="\n Steak";
                }
                tvOutputDish.setText(s);
            }
        });


    }
    public void backButton() {
        Button backButton = (Button) findViewById(R.id.mainBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
