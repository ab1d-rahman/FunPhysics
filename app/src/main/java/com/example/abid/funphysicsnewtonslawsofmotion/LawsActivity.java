package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LawsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);

        setTitle("Laws Of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.firstLawButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.secondLawButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.thirdLawButton);
        textView.setTypeface(typeFace);
    }

    public void onClickFirstLaw(View view){
        Intent i = new Intent(this, FirstLawActivity.class);
        startActivity(i);
    }

    public void onClickSecondLaw(View view){
        Intent i = new Intent(this, SecondLawActivity.class);
        startActivity(i);
    }

    public void onClickThirdLaw(View view){
        Intent i = new Intent(this, ThirdLawActivity.class);
        startActivity(i);
    }
}
