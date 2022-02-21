package com.example.imagecalllog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initData();
       initRecyclerview();
    }

    private void initData() {

        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.nobita,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));
        userList.add(new ModelClass(R.drawable.bishal,"Bishal","10;45am","How are you"));

    }

    private void initRecyclerview() {

        recyclerView=findViewById(R.id.recycleView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}