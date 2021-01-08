package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        ImageView imgview;
        imgview = (ImageView) findViewById(R.id.im2);
        imgview.bringToFront();
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Zero.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview1;
        imgview1 = (ImageView) findViewById(R.id.im3);
        imgview1.bringToFront();
        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,One.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview2;
        imgview2 = (ImageView) findViewById(R.id.im4);
        imgview2.bringToFront();
        imgview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Two.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview3;
        imgview3 = (ImageView) findViewById(R.id.im5);
        imgview3.bringToFront();
        imgview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Three.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview4;
        imgview4 = (ImageView) findViewById(R.id.im6);
        imgview4.bringToFront();
        imgview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Four.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview5;
        imgview5 = (ImageView) findViewById(R.id.im7);
        imgview5.bringToFront();
        imgview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Five.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview6;
        imgview6 = (ImageView) findViewById(R.id.im8);
        imgview6.bringToFront();
        imgview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Six.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview7;
        imgview7 = (ImageView) findViewById(R.id.im9);
        imgview7.bringToFront();
        imgview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Seven.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview8;
        imgview8 = (ImageView) findViewById(R.id.im10);
        imgview8.bringToFront();
        imgview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Eight.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview9;
        imgview9 = (ImageView) findViewById(R.id.im11);
        imgview9.bringToFront();
        imgview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,Nine.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview10;
        imgview10 = (ImageView) findViewById(R.id.previous);
        imgview10.bringToFront();
        imgview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview11;
        imgview11 = (ImageView) findViewById(R.id.next);
        imgview11.bringToFront();
        imgview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(accueil.this,entrainer.class);
                startActivity(myIntent);
            }
        });
    }
    }

