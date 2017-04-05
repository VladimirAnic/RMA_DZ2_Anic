package com.example.vladimir.dz2;

import android.app.Activity;
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

    }
}
