package com.example.manyscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);

        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.EXTRA_NAME);

        textView.setText("Your good name is "+ name);


    }
public void opens(View v){
    Toast.makeText(this, "Basudeb saha", Toast.LENGTH_SHORT).show();
    Intent intent=new Intent(this,MainActivity4.class);
    startActivity(intent);
}






}