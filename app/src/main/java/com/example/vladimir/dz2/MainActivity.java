package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button bCharge, bImageRes, bDistance, bTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setUpUI();
    }

    private void setUpUI() {
        this.bCharge = (Button) findViewById(R.id.bCharge);
        this.bImageRes = (Button) findViewById(R.id.bImageRes);
        this.bDistance = (Button) findViewById(R.id.bDistance);
        this.bTemperature = (Button) findViewById(R.id.bTemperature);

        this.bCharge.setOnClickListener(this);
        this.bImageRes.setOnClickListener(this);
        this.bDistance.setOnClickListener(this);
        this.bTemperature.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent explicitIntent = null;
        switch (v.getId())
        {
            case(R.id.bCharge):
                explicitIntent = new Intent(getApplicationContext(),Charge.class);
                this.startActivity(explicitIntent);
                break;
            case(R.id.bImageRes):
                explicitIntent = new Intent(getApplicationContext(),ImageResolution.class);
                this.startActivity(explicitIntent);
                break;
            case(R.id.bDistance):
                explicitIntent = new Intent(getApplicationContext(),Distance.class);
                this.startActivity(explicitIntent);
                break;
            case(R.id.bTemperature):
                explicitIntent = new Intent(getApplicationContext(),Temperature.class);
                this.startActivity(explicitIntent);
                break;

        }


    }
}
