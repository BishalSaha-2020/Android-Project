package com.example.manyscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void so(View v){
        Toast.makeText(this, "Beautiful Toast", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}