package com.example.miwok2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout);

            ArrayList<Word> words= new ArrayList<Word>();
            words.add(new Word("where are you going?","minto wuksus"));
            words.add(new Word("what is your name","tinna oyaasina"));
            words.add(new Word("my name is","oyassia"));
            words.add(new Word("how are you feeling","michaksas"));
            words.add(new Word("i'm feeling good","kuchi achit"));
            words.add(new Word("Are you coming","aanas'aa"));
            words.add(new Word("yes ,i'am coming","haa'aanam"));
            words.add((new Word("i'm coming ","aanam")));

            WordAdapter Adapter=new WordAdapter(this,words);
            ListView lv=(ListView) findViewById(R.id.list);
            lv.setAdapter(Adapter);
        }
    }
