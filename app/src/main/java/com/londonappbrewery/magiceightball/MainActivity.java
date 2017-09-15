package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button answerButton = (Button) findViewById(R.id.answerButton);
        final ImageView eightBall = (ImageView) findViewById(R.id.imageBall);

        final Random randomNumber = new Random();

        final int[] arrayEightBalls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = randomNumber.nextInt(5);

                eightBall.setImageResource(arrayEightBalls[i]);

            }
        });

    }
}
