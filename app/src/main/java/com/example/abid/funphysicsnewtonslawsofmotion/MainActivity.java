package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.lawsButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.aboutNewtonButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.creditsButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.calculatorButton);
        textView.setTypeface(typeFace);
    }

    public void onClickLaws(View view){
        Intent i = new Intent(this, LawsActivity.class);
        startActivity(i);
    }

    public void onClickAboutNewton(View view){
        Intent i = new Intent(this, AboutNewtonActivity.class);
        startActivity(i);
    }

    public void onClickCredits(View view){
        Intent i = new Intent(this, CreditsActivity.class);
        startActivity(i);
    }

    public void onClickCalculator(View view){
        Intent i = new Intent(this, CalculatorActivity.class);
        startActivity(i);
    }

}
