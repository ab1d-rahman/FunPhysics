package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstLawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_law);

        setTitle("First Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.firstLawAnimationButton);
        textView.setTypeface(typeFace);


        typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        textView = (TextView) findViewById(R.id.firstLawText);
        textView.setTypeface(typeFace);
        textView.setText("\"Every object in a state of uniform motion tends to remain in that state of motion unless an external force is applied to it.\"\n\n" +
                "This simply means that things cannot start, stop, or change direction all by themselves. It takes some force acting on them from the outside to cause such a change. This property of massive bodies to resist changes in their state of motion is called inertia.");
    }

    public void onClickFirstLawAnimation(View view){
        Intent i = new Intent(this, FirstLawAnimationActivity.class);
        startActivity(i);
    }
}
