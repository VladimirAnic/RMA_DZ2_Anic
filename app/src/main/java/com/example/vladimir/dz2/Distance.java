package com.example.vladimir.dz2;

import android.app.Activity;
import android.content.Intent;
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
    Transfer obj = new Transfer("bb", "bb", 25, 0);

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

        Intent result = new Intent(getApplicationContext(),Result.class);
        spInput = spFromDistance.getSelectedItem().toString();
        spOutput = spToDistance.getSelectedItem().toString();
        etConvert = etDistance.getText().toString();

        Float Value = Float.parseFloat(etConvert);
        float Result = 0;

        obj.setUnitFrom(spInput);
        obj.setUnitTo(spOutput);
        obj.setData(Value);

        switch (spFromDistance.getSelectedItemPosition()){
            case 0:
                switch(spToDistance.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*1000f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value*100f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value*39.37007874f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                    case 4:
                        Result = Value*3.280839895f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }
                break;


            case 1:
                switch(spToDistance.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*0.001f;
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

                        Result = Value*0.1f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value*0.0393700787f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 4:
                        Result = Value*0.0032808399f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }

                break;

            case 2:
                switch(spToDistance.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*0.01f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*10f;
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
                        Result = Value*0.3937007874f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 4:
                        Result = Value*0.032808399f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }

                break;


            case 3:
                switch(spToDistance.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*0.0254f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*25.4f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value*2.54f;
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

                    case 4:
                        Result = Value*0.0833333333f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;
                }

                break;

            case 4:
                switch(spToDistance.getSelectedItemPosition())
                {
                    case 0:
                        Result = Value*0.3048f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 1:

                        Result = Value*304.8f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 2:

                        Result = Value*30.48f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 3:
                        Result = Value*12f;
                        obj.setResult(Result);
                        result.putExtra("myCustomerObj",obj);
                        this.startActivity(result);
                        break;

                    case 4:
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
