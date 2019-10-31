package com.example.builditbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class JokeLibraryActivity extends AppCompatActivity {

    public static String key_API="JOKE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_library);
        ImageView imageView=findViewById(R.id.img_funny);
        int ran=new Random().nextInt(4);
        switch (ran){
            case 0:
                imageView.setImageResource(R.drawable.funnyfirst);
                break;
            case 1:
                imageView.setImageResource(R.drawable.funnysecond);

                break;
            case 3:
                imageView.setImageResource(R.drawable.funnythird);

        }
           Intent intent=getIntent();
        if(intent!=null&&intent.hasExtra(key_API)){
            TextView txt_joke=findViewById(R.id.txt_joke);
            txt_joke.setText(intent.getStringExtra(key_API));
        }
    }
}
