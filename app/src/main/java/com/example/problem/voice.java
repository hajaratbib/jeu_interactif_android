package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class voice extends AppCompatActivity {
    ImageView image;
    Button but,butnum;
    Random r;
    String tex,txt1;
    EditText txt;
    private TextView txvResult;
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
        setContentView(R.layout.activity_voice);
        txvResult = (TextView) findViewById(R.id.text);
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
                Intent myIntent = new Intent(voice.this,accueil.class);
                startActivity(myIntent);
            }
        });





    }
    public void getSpeechInput(View view) {

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 10);
        } else {
            Toast.makeText(this, "Your Device Don't Support Speech Input", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txvResult.setText(result.get(0));
                }
                break;
        }
    }
    public void showDialog(){
        Dialog dialog=new Dialog(voice.this);
        dialog.requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        txt1= txvResult.getText().toString();
        if (txt1.equals("0") || txt1.equals("1") || txt1.equals("2") || txt1.equals("3")|| txt1.equals("4") || txt1.equals("5") || txt1.equals("6") || txt1.equals("7") || txt1.equals("8")|| txt1.equals("9")){
            if (txt1.equals("0"))txt1="zero";
            if (txt1.equals("1"))txt1="one";
            if (txt1.equals("2"))txt1="two";
            if (txt1.equals("3"))txt1="three";
            if (txt1.equals("4"))txt1="four";
            if (txt1.equals("5"))txt1="five";
            if (txt1.equals("6"))txt1="six";
            if (txt1.equals("7"))txt1="seven";
            if (txt1.equals("8"))txt1="eight";
            if (txt1.equals("9"))txt1="nine";
        }
        if (txt1.equals(tex))  {
            dialog.setContentView(R.layout.dialog_right);
            Button right = dialog.findViewById(R.id.right);
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(voice.this, "Try again", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else  {
            dialog.setContentView(R.layout.dialog_wrong);
            Button right = dialog.findViewById(R.id.wrong);
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(voice.this, "Try again", Toast.LENGTH_SHORT).show();
                }
            });
        }
        dialog.show();


    }

}
