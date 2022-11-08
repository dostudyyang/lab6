package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

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


    public void buttonClicked(View v){
        EditText principleView = (EditText)findViewById(R.id.principleBox);
        String pV = principleView.getText().toString();
        EditText amortView = (EditText)findViewById(R.id.amortBox);
        String aV = amortView.getText().toString();
        EditText interestView = (EditText)findViewById(R.id.interestBox);
        String iV = interestView.getText().toString();

        MortgageModel mortgageModel = new MortgageModel(pV,aV,iV);
        String answer = "$"+mortgageModel.computePayment();
        ((TextView)findViewById(R.id.monthlyPayResult)).setText(answer);
    }
}