package com.example.miwok2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("red","wetetti",R.drawable.color_red));
        words.add(new Word("mustard yellow","chiwiita",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow","topiisa",R.drawable.color_dusty_yellow));
        words.add(new Word("green","chokokki",R.drawable.color_green));
        words.add(new Word("brown","takaaki",R.drawable.color_brown));
        words.add(new Word("grey","topoppi",R.drawable.color_gray));
        words.add(new Word("black","kululli",R.drawable.color_black));
        words.add(new Word("white","kelilli",R.drawable.color_white));

        WordAdapter Adapter =new WordAdapter(this,words);
        ListView lv=(ListView) findViewById(R.id.list);
        lv.setAdapter(Adapter);
    }
}