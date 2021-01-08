package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Two extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ImageView imgview;
        imgview = (ImageView) findViewById(R.id.previous);
        imgview.bringToFront();
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Two.this,accueil.class);
                startActivity(myIntent);
            }
        });
        YoYo.with(Techniques.RotateIn)
                .duration(2000)
                .repeat(0)
                .playOn(findViewById(R.id.zero));
        YoYo.with(Techniques.RotateInUpRight)
                .duration(2000)
                .repeat(0)
                .playOn(findViewById(R.id.zero1));
    }
    public void play(View v){
        if (player==null){
            player = MediaPlayer.create(this, R.raw.a2);
        }
        player.start();
    }
    }

