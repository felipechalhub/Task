package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class starters extends AppCompatActivity {
    CheckBox fishTacos, chickenWings, onionRings, pulledPorkNachos, starterCaesarSalad,
            potatoSkins;
    Button btSubmit;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        backButton();

        fishTacos = findViewById(R.id.checkBox);
        chickenWings = findViewById(R.id.checkBox2);
        onionRings = findViewById(R.id.checkBox3);
        pulledPorkNachos = findViewById(R.id.checkBox4);
        starterCaesarSalad = findViewById(R.id.checkBox5);
        potatoSkins = findViewById(R.id.checkBox6);
        btSubmit = findViewById(R.id.submit);
        tvOutput  = findViewById(R.id.output);

        fishTacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fishTacos.isChecked()){
                    fishTacos.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    fishTacos.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        chickenWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chickenWings.isChecked()){
                    chickenWings.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    chickenWings.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        onionRings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onionRings.isChecked()){
                    onionRings.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    onionRings.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        pulledPorkNachos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pulledPorkNachos.isChecked()){
                    pulledPorkNachos.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    pulledPorkNachos.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        starterCaesarSalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(starterCaesarSalad.isChecked()){
                    starterCaesarSalad.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    starterCaesarSalad.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });
        potatoSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(potatoSkins.isChecked()){
                    potatoSkins.setTextColor(getResources().getColor(R.color.colorAccent));
                }else{
                    potatoSkins.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(fishTacos.isChecked()){
                    s+="\n Fish Tacos";
                }
                if(chickenWings.isChecked()){
                    s+="\n Chicken Wings";
                }
                if(onionRings.isChecked()){
                    s+="\n Onion Rings";
                }
                if(pulledPorkNachos.isChecked()){
                    s+="\n Pulled Pork Nachos";
                }
                if(starterCaesarSalad.isChecked()){
                    s+="\n Starter Caesar Salad";
                }
                if(potatoSkins.isChecked()){
                    s+="\n Potato Skins";
                }
                tvOutput.setText(s);
            }
        });


    }

    public void backButton() {
        Button backButton = (Button) findViewById(R.id.starterBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
