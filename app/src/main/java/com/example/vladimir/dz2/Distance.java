package com.example.vladimir.dz2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Distance extends Activity implements View.OnClickListener {

    Spinner spFromDistance, spToDistance;
    EditText etDistance;
    Button bDistance;
    String spInput, spOutput, etConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        setUpUI();
    }

    private void setUpUI() {
        this.spFromDistance = (Spinner) findViewById(R.id.spFromDistance);
        this.spToDistance = (Spinner) findViewById(R.id.spToDistance);
        this.etDistance = (EditText) findViewById(R.id.etDistance);
        this.bDistance = (Button) findViewById(R.id.bDistance);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.distance,
                        android.R.layout.simple_spinner_item);

        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFromDistance.setAdapter(staticAdapter);



        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spToDistance.setAdapter(staticAdapter);

        this.bDistance.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
    }
}
