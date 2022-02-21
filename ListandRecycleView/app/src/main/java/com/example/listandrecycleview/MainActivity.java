package com.example.listandrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={ " Item 1","Item 2","Item 3","Item 4","Item 5"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   // Builtin Adapter
       listView=findViewById(R.id.listView);
      ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
     listView.setAdapter(ad);
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this, "Heell Hi"+position, Toast.LENGTH_SHORT).show();
         }
     });



    //Custom Adapter
 // BishalAdapter ad=new BishalAdapter(this,R.layout.mybishallayout,arr);
  //listView.setAdapter(ad);
    }
}