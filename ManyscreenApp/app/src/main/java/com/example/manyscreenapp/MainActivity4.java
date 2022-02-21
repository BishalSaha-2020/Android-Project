package com.example.manyscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    
    public void next(View v){
        Toast.makeText(this, "Wowwwww wwwww wwwww", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}