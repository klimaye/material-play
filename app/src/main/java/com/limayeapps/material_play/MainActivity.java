package com.limayeapps.material_play;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int green;
    int white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView)findViewById(R.id.textView);
        green = getResources().getColor(android.R.color.holo_green_dark);
        white = getResources().getColor(android.R.color.white);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //check if effect already in place
                boolean isVeggie = ((ColorDrawable)view.getBackground()) != null &&
                        ((ColorDrawable)view.getBackground()).getColor() == green;

                //the true radius of the ripple is the hypotenus of half width & height.
                int finalRadius = (int)Math.hypot(view.getWidth()/2,view.getHeight()/2);

                if (isVeggie) {
                    //reset
                    view.setBackgroundColor(white);
                    tv.setText("Hello World");
                }
                else {
                    //viewToAnimate: view
                    //centerX = width/2
                    //centerY = height/2
                    //startRadius = 0
                    //endRadius = calculated above.
                    Animator anim = ViewAnimationUtils.createCircularReveal(view,
                            (int)view.getWidth()/2,
                            (int)view.getHeight()/2,
                            0,
                            finalRadius);
                    tv.setText("Hello Green World");
                    view.setBackgroundColor(green);
                    anim.start();
                }
            }
        });

        final FloatingActionButton floatingButton = (FloatingActionButton)findViewById(R.id.fab);
        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }
}
