package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        setTitle("Calculator");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.button1);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.button2);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.button3);
        textView.setTypeface(typeFace);
    }

    public void onClickCalculateAcceleration(View view){
        Intent i = new Intent(this, CalculateAccelerationActivity.class);
        startActivity(i);
    }

    public void onClickCalculateForce(View view){
        Intent i = new Intent(this, CalculateForceActivity.class);
        startActivity(i);
    }

    public void onClickCalculateMass(View view){
        Intent i = new Intent(this, CalculateMassActivity.class);
        startActivity(i);
    }
}
