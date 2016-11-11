package com.example.abid.funphysicsnewtonslawsofmotion;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstLawAnimationActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_law_animation);

        setTitle("First Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
                TextView textView;
        textView = (TextView) findViewById(R.id.firstLawAnimationText);
        textView.setTypeface(typeFace);
        textView.setText("Here we can see that a ball is in static position initially and no force is applied. It will hold or try to hold this position forever until an external force is applied." +
                        " When a force is applied, it starts to move towards the direction of the applied force. It will move or try to move forever until any external force is applied against its motion." +
                        " This is the fundamental concept of Newton’s 1st law.");

        img = (ImageView) findViewById(R.id.img);

        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }
}
