package com.example.abid.funphysicsnewtonslawsofmotion;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdLawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_law);

        setTitle("Third Law of Motion");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");

        TextView textView;
        textView = (TextView) findViewById(R.id.thirdLawAnimationButton);
        textView.setTypeface(typeFace);

        typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        textView = (TextView) findViewById(R.id.thirdLawText);
        textView.setTypeface(typeFace);
        textView.setText("\"For every action there is an equal and opposite reaction.\"\n\n" +
                "This law describes what happens to a body when it exerts a force on another body. Forces always occur in pairs, so when one body pushes against another, the second body pushes back just as hard.\n\n" +
                "For example, when gravity pulls you down against the ground, the ground pushes up against your feet.\n");

    }

    public void onClickThirdLawAnimation(View view){
        Intent i = new Intent(this, ThirdLawAnimationActivity.class);
        startActivity(i);
    }
}
