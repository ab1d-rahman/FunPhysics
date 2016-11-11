package com.example.abid.funphysicsnewtonslawsofmotion;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondLawMassAnimationActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_law_mass_animation);

        setTitle("Second Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        TextView textView;
        textView = (TextView) findViewById(R.id.secondLawMassAnimationText);
        textView.setTypeface(typeFace);
        textView.setText("Here the 2nd ball has more mass than the 1st one. " +
                        "According to Newton’s 2nd law of motion, acceleration will be inversely proportional to mass as same force is applied. " +
                        "Hence the 2nd ball will accelerate slowly than the 1st one as it has more mass than the 1st one.");

        img = (ImageView) findViewById(R.id.img);

        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }
}
