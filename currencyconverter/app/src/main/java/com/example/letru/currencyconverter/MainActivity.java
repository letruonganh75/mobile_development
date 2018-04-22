package com.example.letru.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void vndToUsd() {
        EditText vnd = (EditText) findViewById(R.id.editTextVND);
        vnd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText usd = (EditText) findViewById(R.id.editTextUSD);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        double innum = Integer.parseInt(vnd.getText().toString());
        double outnum = innum / 25000;
        usd.setText(String.valueOf(outnum));
    }

    void usdToVnd() {
        EditText usd = (EditText) findViewById(R.id.editTextUSD);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText vnd = (EditText) findViewById(R.id.editTextVND);
        vnd.setInputType(InputType.TYPE_CLASS_NUMBER);
        double innum = Integer.parseInt(usd.getText().toString());
        double outnum = innum * 25000;
        vnd.setText(String.valueOf(outnum));
    }

    public void click(View view) {
        vndToUsd();
        Button b1 = (Button) findViewById(R.id.buttonVND);
        Button b2 = (Button) findViewById(R.id.buttonUSD);
        b2.setEnabled(false);
    }

    public void click2(View view) {
        Button b2 = (Button) findViewById((R.id.buttonUSD));
        Button b1 = (Button) findViewById(R.id.buttonVND);
        b1.setEnabled(false);
        usdToVnd();
    }

    public void reset(View view) {
        Button b1 = (Button) findViewById(R.id.buttonVND);
        b1.setEnabled(true);
        Button b2 = (Button) findViewById(R.id.buttonUSD);
        b2.setEnabled(true);
        EditText vnd = (EditText) findViewById(R.id.editTextVND);
        EditText usd = (EditText) findViewById(R.id.editTextUSD);
        vnd.setText("");
        usd.setText("");
    }

    @Override
    public void onClick(View v) {

    }
}
