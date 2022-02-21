package com.example.listviewwithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[]  fruitname={"Mango","Banana","Watermelon","Grapes","Kiwi","Apple"};
    String[] desc={"This is mango","This is mango","This is mango","This is mango","This is mango","This is mango"};
    Integer[] imgid={R.drawable.banana,R.drawable.watermelon,R.drawable.grapes,R.drawable.kiwi,R.drawable.apple,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=findViewById(R.id.lst);

    }
}