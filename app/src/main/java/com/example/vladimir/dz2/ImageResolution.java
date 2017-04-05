package com.example.vladimir.dz2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ImageResolution extends Activity implements View.OnClickListener {

    Spinner spFromImgRes, spToImgRes;
    EditText etImgRes;
    Button bImgRes;
    String spInput, spOutput, etConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_resolution);
        setUpUI();
    }

    private void setUpUI() {

        this.spFromImgRes = (Spinner) findViewById(R.id.spFromImgRes);
        this.spToImgRes = (Spinner) findViewById(R.id.spToImgRes);
        this.etImgRes = (EditText) findViewById(R.id.etImgRes);
        this.bImgRes = (Button) findViewById(R.id.bImgRes);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.image_res,
                        android.R.layout.simple_spinner_item);

        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFromImgRes.setAdapter(staticAdapter);



        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spToImgRes.setAdapter(staticAdapter);

        this.bImgRes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
