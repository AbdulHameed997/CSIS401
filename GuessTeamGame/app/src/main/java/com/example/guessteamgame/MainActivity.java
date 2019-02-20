package com.example.guessteamgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        
        ImageView iv = findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.i1);

        String resource = " " + result;
        int id = getResources().getIdentifier(resource, "drawable", getPackageName());

    }
    public void guessBtn (View v) {

    }
}

/*
if (array ron = i1 ) {
    toast U GUESSED RONALDO RIGHT
}
 */