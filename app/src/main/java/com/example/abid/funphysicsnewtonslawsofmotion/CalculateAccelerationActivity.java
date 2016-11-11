package com.example.abid.funphysicsnewtonslawsofmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculateAccelerationActivity extends AppCompatActivity {

    private double mass, acceleration, force;
    EditText input1, input2;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_acceleration);

        setTitle("Calculator");

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.calculateAccelerationAnswer);
    }

    public void onClickCalculate(View view){
        force = Double.parseDouble(input1.getText().toString());
        mass = Double.parseDouble(input2.getText().toString());

        acceleration = force / mass;

        output.setText("Acceleration = " + new DecimalFormat("##.##").format(acceleration) + " m/s^2");

    }
}
