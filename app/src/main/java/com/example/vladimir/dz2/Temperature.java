package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Temperature extends Activity implements View.OnClickListener {

    Spinner spFromTemperature, spToTemperature;
    EditText etTemperature;
    Button bTemperature;
    String spInput, spOutput, etConvert;
    Transfer obj = new Transfer("bb", "bb", 25, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        setUpUI();
    }

    private void setUpUI() {
        this.spFromTemperature = (Spinner) findViewById(R.id.spFromTemperature);
        this.spToTemperature = (Spinner) findViewById(R.id.spToTemperature);
        this.etTemperature = (EditText) findViewById(R.id.etTemperature);
        this.bTemperature = (Button) findViewById(R.id.bTemperature);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.temperature,
                        android.R.layout.simple_spinner_item);

        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFromTemperature.setAdapter(staticAdapter);


        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spToTemperature.setAdapter(staticAdapter);

        this.bTemperature.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent result = new Intent(getApplicationContext(), Result.class);
        spInput = spFromTemperature.getSelectedItem().toString();
        spOutput = spToTemperature.getSelectedItem().toString();
        etConvert = etTemperature.getText().toString();

        Float Value = Float.parseFloat(etConvert);
        float Result = 0;

        obj.setUnitFrom(spInput);
        obj.setUnitTo(spOutput);
        obj.setData(Value);


        switch (spFromTemperature.getSelectedItemPosition()) {
            case 0:
                switch (spToTemperature.getSelectedItemPosition()) {
                    case 0:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;

                    case 1:
                        Result = Value + 273.15f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                    case 2:
                        Result = Value * 1.8f + 32;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 1:
                switch (spToTemperature.getSelectedItemPosition()) {
                    case 0:
                        Result = Value + (-273.15f);
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;

                    case 1:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                    case 2:
                        Result =  Value*1.8f-459.67f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 2:
                switch (spToTemperature.getSelectedItemPosition()) {
                    case 0:
                        Result = (Value - 32f) / 1.8f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;

                    case 1:
                        Result = (Value+459.67f)*0.5555556f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                    case 2:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                }
                break;

        }

    }
}
