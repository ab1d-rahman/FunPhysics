package com.example.abid.funphysicsnewtonslawsofmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculateForceActivity extends AppCompatActivity {

    private double mass, acceleration, force;
    EditText input1, input2;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_force);

        setTitle("Calculator");

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.calculateForceAnswer);
    }

    public void onClickCalculate(View view){
        acceleration = Double.parseDouble(input1.getText().toString());
        mass = Double.parseDouble(input2.getText().toString());

        force = mass * acceleration;

        output.setText("Force = " + new DecimalFormat("##.##").format(force) + " N");

    }
}
