package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.app.ProgressDialog.show;

public class entrainer extends AppCompatActivity {
    ImageView image;
    Button but,butnum;
    Random r;
    String tex,txt1;
    EditText txt;
    int dial;
    TextView tt;

    Integer[] images = {
            R.drawable.zero,
            R.drawable.one,
    R.drawable.two,
    R.drawable.three,
    R.drawable.four,
    R.drawable.five,
    R.drawable.six,
    R.drawable.seven,
    R.drawable.eight,
    R.drawable.nine
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrainer);
        image = (ImageView)findViewById(R.id.image);
        but = (Button)findViewById(R.id.spell);
        r=new Random();
        butnum= (Button)findViewById(R.id.num);
        txt=(EditText)findViewById(R.id.number);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=images[r.nextInt(images.length)];
               image.setImageResource(id);
               String name=getResources().getResourceName(id);
               String delete= "com.example.problem.drawable/";
               name= name.replaceAll(delete,"");
               tex=name;
            }
        });


        butnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });




        ImageView imgview10;
        imgview10 = (ImageView) findViewById(R.id.previous);
        imgview10.bringToFront();
        imgview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(entrainer.this,accueil.class);
                startActivity(myIntent);
            }
        });
        ImageView imgview1;
        imgview1 = (ImageView) findViewById(R.id.next);
        imgview1.bringToFront();
        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(entrainer.this,voice.class);
                startActivity(myIntent);
            }
        });


    }
    public void showDialog(){
        Dialog dialog=new Dialog(entrainer.this);
        dialog.requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        txt1=txt.getText().toString();
        if (txt1.equals(tex))  {
            dialog.setContentView(R.layout.dialog_right);
            Button right = dialog.findViewById(R.id.right);
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(entrainer.this, "Try again", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else  {
            dialog.setContentView(R.layout.dialog_wrong);
            Button right = dialog.findViewById(R.id.wrong);
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(entrainer.this, "Try again", Toast.LENGTH_SHORT).show();
                }
            });
        }
        dialog.show();


    }

}
