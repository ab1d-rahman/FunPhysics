package com.example.abid.funphysicsnewtonslawsofmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculateMassActivity extends AppCompatActivity {

    private double mass, acceleration, force;
    EditText input1, input2;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_mass);

        setTitle("Calculator");

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.calculateMassAnswer);
    }

    public void onClickCalculate(View view){
        acceleration = Double.parseDouble(input1.getText().toString());
        force = Double.parseDouble(input2.getText().toString());

        mass = force / acceleration;

        output.setText("Mass = " + new DecimalFormat("##.##").format(mass) + " kg");

    }
}
