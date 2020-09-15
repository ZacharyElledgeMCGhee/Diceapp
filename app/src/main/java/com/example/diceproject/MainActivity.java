package com.example.diceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import static com.example.diceproject.R.raw.diceroll;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewDice = findViewById(R.id.image_view_dice);
        final MediaPlayer mediaPlayer;
            mediaPlayer = MediaPlayer.create(this, R.raw.diceroll);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
        }


    private void rollDice() {

        int randomNumber = rng.nextInt(6) + 1;
        final MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.diceroll);

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
        }
    }
}