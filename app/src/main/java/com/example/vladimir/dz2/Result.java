package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity {

    TextView tvResultFromWhat, tvResultFromData, tvResultToWhat, tvResultToData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setUpUI();
    }

    private void setUpUI() {
        tvResultFromWhat = (TextView) findViewById(R.id.tvResultFromWhat);
        tvResultFromData = (TextView) findViewById(R.id.tvResultFromData);
        tvResultToWhat = (TextView) findViewById(R.id.tvResultToWhat);
        tvResultToData = (TextView) findViewById(R.id.tvResultToData);

        Intent result = getIntent();
        Transfer obj = result.getParcelableExtra("myCustomerObj");

        tvResultFromData.setText(String.valueOf(obj.getData()));
        tvResultFromWhat.setText(obj.getUnitFrom());
        tvResultToData.setText(String.valueOf(obj.getResult()));
        tvResultToWhat.setText(obj.getUnitTo());

    }
}
