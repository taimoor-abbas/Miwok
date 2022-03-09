package com.example.miwok2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout);

            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("one", "lutti", R.drawable.number_one));
            words.add(new Word("two", "otikio", R.drawable.number_two));
            words.add(new Word("three", "tolo", R.drawable.number_three));
            words.add(new Word("four", "oyysi", R.drawable.number_four));
            words.add(new Word("five", "masso", R.drawable.number_five));
            words.add(new Word("six", "temmok", R.drawable.number_six));
            words.add(new Word("seven", "kene", R.drawable.number_seven));
            words.add(new Word("eight", "kawi", R.drawable.number_eight));
            words.add(new Word("nine", "wo'o", R.drawable.number_nine));
            words.add(new Word("ten", "na'aac", R.drawable.number_ten));

            WordAdapter Adapter = new WordAdapter(this, words);
            ListView lv = (ListView) findViewById(R.id.list);
            lv.setAdapter(Adapter);
        }

    }
