package com.seriouscompany.animationtest2;

import android.animation.LayoutTransition;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public void addView(View view) {
        RelativeLayout container = (RelativeLayout) findViewById(R.id.container);
        container.addView(new Button(this));

    }

    public void launchNextActivity(View view) {
        Intent intent = new Intent(this, NextActivity.class);

        ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0, 0, view.getWidth(), view.getHeight());
        startActivity(intent, options.toBundle());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayoutTransition();
    }

    private void setLayoutTransition() {
        LayoutTransition transition = new LayoutTransition();
        transition.enableTransitionType(LayoutTransition.CHANGING);


        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        container.setLayoutTransition(transition);
    }
}
