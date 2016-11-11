package com.example.abid.funphysicsnewtonslawsofmotion;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutNewtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_newton);

        setTitle("About Newton");

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");
        TextView textView;
        typeFace = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        textView = (TextView) findViewById(R.id.aboutNewtonText);
        textView.setTypeface(typeFace);
        textView.setText("Sir Isaac Newton ( 25 December 1642 – 20 March 1726) was an English physicist and mathematician who is widely recognized as one of the most influential scientists of all time and as a key figure in the scientific revolution.\n\n" +
                "Newton published his laws of motion in 1687, in his seminal work “Philosophiæ Naturalis Principia Mathematica” (Mathematical Principles of Natural Philosophy) in which he formalized the description of how massive bodies move under the influence of external forces.\n\n" +
                "Newton's laws of motion are three physical laws that, together, laid the foundation for classical mechanics. They describe the relationship between a body and the forces acting upon it, and its motion in response to those forces.\n");
    }
}
