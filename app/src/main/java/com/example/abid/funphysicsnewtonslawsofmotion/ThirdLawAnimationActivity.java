package com.example.abid.funphysicsnewtonslawsofmotion;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdLawAnimationActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_law_animation);

        setTitle("Third Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        TextView textView;
        textView = (TextView) findViewById(R.id.thirdLawAnimationText);
        textView.setTypeface(typeFace);
        textView.setText("Here the 1st ball (at left side) has more acceleration than the 2nd ball (at right side) but it has less mass than the 2nd ball. " +
                        "So the force they apply to each other when they collide is almost the same. " +
                        "According to Newton's third law, both of them will receive the same force they applied to each other but in opposite direction. " +
                        "As a result, they accelerate towards the direction of the newly applied force and as the 1st ball has less mass than the 2nd ball, it accelerates faster than the 2nd ball.");

        img = (ImageView) findViewById(R.id.img);

        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }
}
