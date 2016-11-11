package com.example.abid.funphysicsnewtonslawsofmotion;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondLawForceAnimationActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_law_force_animation);

        setTitle("Second Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        TextView textView;
        textView = (TextView) findViewById(R.id.secondLawForceAnimationText);
        textView.setTypeface(typeFace);
        textView.setText("There are two balls of equal mass in the animation." +
                        " According to Newton’s 2nd law of motion, accelerations of the balls will be proportional to the applied force as mass is constant here." +
                        " The 2nd ball gets more force than the 1st ball. So the 2nd ball gains more acceleration.");

        img = (ImageView) findViewById(R.id.img);

        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }
}
