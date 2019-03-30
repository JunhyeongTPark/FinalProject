package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CM_FT extends AppCompatActivity {

    private Button buttonCF = null;
    private Button buttonFC = null;
    private Button buttonHome = null;

    private TextView textNum = null;
    private TextView textAnswer = null;

    //@Override
    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cm_ft);

        this.textNum = (TextView) findViewById(R.id.textNum);
        this.textAnswer = (TextView) findViewById(R.id.textAnswer);

        this.buttonCF = (Button) findViewById(R.id.buttonCF);
        this.buttonCF.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String val = textNum.getText().toString();

                if (isPositiveDouble(val)){
                    textAnswer.setText(cmToFT(val));
                }
                else{ textAnswer.setText("Error: Did not enter a positive number");}

            }
        });

        this.buttonFC = (Button) findViewById(R.id.buttonFC);
        this.buttonFC.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String val = textNum.getText().toString();

                if (isPositiveDouble(val)){
                    textAnswer.setText(ftToCM(val));
                }
                else{ textAnswer.setText("Error: Did not enter a positive number");}

            }
        });

        this.buttonHome = (Button) findViewById(R.id.buttonHome);
        this.buttonHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CM_FT.this, com.example.myapplication.MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private String cmToFT(String val){
        double num = Double.parseDouble(val);
        double result = 0;
        result = num * 0.0328084;

        return Double.toString(result);
    }

    private String ftToCM(String val){
        double num = Double.parseDouble(val);
        double result = 0;
        result = num / 0.0328084;

        return Double.toString(result);
    }

    public static boolean isPositiveDouble(String str) {
        try {
            Double.parseDouble(str);
            if (Double.parseDouble(str) >= 0){ return true;}
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
