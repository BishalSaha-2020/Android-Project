package com.example.imagecalllog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    @NonNull

    private List<ModelClass> userlist;
    public Adapter (List<ModelClass>userList) {this.userlist=userList;}


    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        int resoure=userlist.get(position).getImageview1();
        String name=userlist.get(position).getTextview1();
        String time=userlist.get(position).getTextview2();
        String message=userlist.get(position).getTextview3();

        holder.setData(resoure,name,time,message);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView1;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;


        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            imageView1=itemView.findViewById(R.id.imageView1);
            textView1=itemView.findViewById(R.id.textView1);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);
        }

        public void setData(int resoure, String name, String time, String message) {
            imageView1.setImageResource(resoure);
            textView1.setText(name);
            textView2.setText(time);
            textView3.setText(message);

        }
    }
}
