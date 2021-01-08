package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import static com.example.problem.R.*;

public class Zero extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_zero);
        ImageView imgview;
        imgview = (ImageView) findViewById(id.previous);
        imgview.bringToFront();
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Zero.this,accueil.class);
                startActivity(myIntent);
            }
        });
        YoYo.with(Techniques.RotateIn)
                .duration(2000)
                .repeat(0)
                .playOn(findViewById(id.zero));
        YoYo.with(Techniques.RotateInUpRight)
                .duration(2000)
                .repeat(0)
                .playOn(findViewById(id.zero1));

    }
    public void play(View v){
        if (player==null){
            player = MediaPlayer.create(this, raw.a0);
        }
        player.start();
    }
    }

