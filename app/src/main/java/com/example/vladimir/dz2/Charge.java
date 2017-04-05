package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
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

    Transfer obj = new Transfer("bb","bb",25,0);

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
        Intent result = new Intent(getApplicationContext(),Result.class);
        spInput = spFrom.getSelectedItem().toString();
        spOutput = spTo.getSelectedItem().toString();
        etConvert = etCharge.getText().toString();

        Float Value = Float.parseFloat(etConvert);
        float Result = 0;

        obj.setUnitFrom(spInput);
        obj.setUnitTo(spOutput);
        obj.setData(Value);

        switch (spFrom.getSelectedItemPosition()){
            case 0:
                switch(spTo.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                    case 1:
                        double res;
                        double val = (double) Value;
                       res = val*299792.4580E4;

                        float res1 = (float) res;
                        obj.setResult(res1);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                    case 2:


                }
                break;
            case 1:
                switch(spTo.getSelectedItemPosition()){

                }
                break;
        }


    }


}
