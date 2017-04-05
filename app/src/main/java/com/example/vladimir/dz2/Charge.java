package com.example.vladimir.dz2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Charge extends Activity implements View.OnClickListener {
    Spinner spFrom, spTo;
    EditText etCharge;
    Button bCharge;
    String spInput, spOutput, etConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge);

        setUpUI();
    }

    private void setUpUI() {
        this.spFrom = (Spinner) findViewById(R.id.spFrom);
        this.spTo = (Spinner) findViewById(R.id.spTo);
        this.etCharge = (EditText) findViewById(R.id.etCharge);
        this.bCharge = (Button) findViewById(R.id.bCharge);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.charge,
                        android.R.layout.simple_spinner_item);

        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFrom.setAdapter(staticAdapter);



        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTo.setAdapter(staticAdapter);

        this.bCharge.setOnClickListener(this);
    }

    public void onClick(View v) {

        spInput = spFrom.getSelectedItem().toString(); //pretvaranje spinnera u string
        spOutput = spTo.getSelectedItem().toString();
        etConvert = etCharge.getText().toString();

        float Value = Float.parseFloat(etConvert);


    }


}
