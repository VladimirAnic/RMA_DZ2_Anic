package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
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

    Transfer obj = new Transfer("bb", "bb", 25, 0);

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

        Intent result = new Intent(getApplicationContext(), Result.class);
        spInput = spFromImgRes.getSelectedItem().toString();
        spOutput = spToImgRes.getSelectedItem().toString();
        etConvert = etImgRes.getText().toString();

        Float Value = Float.parseFloat(etConvert);
        float Result = 0;

        obj.setUnitFrom(spInput);
        obj.setUnitTo(spOutput);
        obj.setData(Value);


        switch (spFromImgRes.getSelectedItemPosition()) {
            case 0:
                switch (spToImgRes.getSelectedItemPosition()) {
                    case 0:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;

                    case 1:
                        Result = Value * 0.001f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                    case 2:
                        Result = Value * 0.0254f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 1:
                switch (spToImgRes.getSelectedItemPosition()) {
                    case 0:
                        Result = Value * 1000f;
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
                        Result = Value * 25.4f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 2:
                switch (spToImgRes.getSelectedItemPosition()) {
                    case 0:
                        Result = Value * 39.37007874f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj", obj);
                        this.startActivity(result);
                        break;

                    case 1:
                        Result = Value * 0.0393700787f;
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

