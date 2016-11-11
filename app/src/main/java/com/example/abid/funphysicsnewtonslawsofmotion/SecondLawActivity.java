package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondLawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_law);

        setTitle("Second Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.secondLawForceButton);
        textView.setTypeface(typeFace);

        textView = (TextView) findViewById(R.id.secondLawMassButton);
        textView.setTypeface(typeFace);

        typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        textView = (TextView) findViewById(R.id.secondLawText);
        textView.setTypeface(typeFace);
        textView.setText("\"The force acting on an object is equal to the mass of that object times its acceleration\"\n\n" +
                "This is written in mathematical form as F = ma, where F is force, m is mass, and a is acceleration.\n\n" +
                "There are two scenarios in which this law can be applied.\n");
    }

    public void onClickSecondLawForceAnimation(View view){
        Intent i = new Intent(this, SecondLawForceAnimationActivity.class);
        startActivity(i);
    }

    public void onClickSecondLawMassAnimation(View view){
        Intent i = new Intent(this, SecondLawMassAnimationActivity.class);
        startActivity(i);
    }
}
