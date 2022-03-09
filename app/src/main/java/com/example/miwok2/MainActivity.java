package com.example.miwok2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView number=(TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener()
                                  {

                                      @Override
                                      public  void  onClick(View view)
                                      {
                                          Intent numberIntent=new Intent(MainActivity.this,NumbersActivity.class);
                                          startActivity(numberIntent);
                                      }
                                  }
        );
        TextView  colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView family=( TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }


}
