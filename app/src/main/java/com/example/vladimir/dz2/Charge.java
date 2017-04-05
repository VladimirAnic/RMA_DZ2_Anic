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

                       Result = Value*299792.4580E4f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value*0.000278f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value*6241506363094001000f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 1:
                    switch(spTo.getSelectedItemPosition())
                    {
                        case 0:
                            Result = Value*3.335640951E-10f;
                            obj.setResult(Result);
                            result.putExtra("myCustomerObj",obj);
                            this.startActivity(result);
                            break;

                        case 1:

                            Result = Value;
                            obj.setResult(Result);
                            result.putExtra("myCustomerObj",obj);
                            this.startActivity(result);
                            break;

                        case 2:

                            Result = Value*9.265669311E-14f;
                            obj.setResult(Result);
                            result.putExtra("myCustomerObj",obj);
                            this.startActivity(result);
                            break;

                        case 3:
                            Result = Value*2081942422.7f;
                            obj.setResult(Result);
                            result.putExtra("myCustomerObj",obj);
                            this.startActivity(result);
                            break;
                    }

                break;

            case 2:
                switch(spTo.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*3600f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*10792528487998f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value*2.24694229E22f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }

                break;


            case 3:
                switch(spTo.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*1.60217733E-19f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*4.803206799E-10f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value*4.450492583E-23f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }

                break;
        }


    }


}
