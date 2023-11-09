package com.rosselps.guia10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Animación de transición
        ViewGroup layout = findViewById(android.R.id.content);
        Animation slideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        layout.startAnimation(slideAnimation);
    }
}