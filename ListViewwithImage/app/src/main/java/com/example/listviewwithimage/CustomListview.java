package com.example.listviewwithimage;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListview  extends ArrayAdapter<String> {

    private String[]  fruitname;
    private String[]  desc;
    private Integer[]  imgid;
    private Activity context;
    public CustomListview(Activity Context,  String[]  fruitname, String[]  desc, Integer[]  imgid) {
        super(null, R.layout.lstview_layout,fruitname);

        this.context=context;
            this.fruitname=fruitname;
            this.desc=desc;
            this.imgid=imgid;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        ViewHolder viewHolder1 =null;
        View r;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.lstview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder=r.getTg();
        }
        viewHolder.textView.setImageResource(imgid([position]);

        return super.getView(position, convertView, parent);
    }
    class ViewHolder{

        TextView textView;
        TextView textView2;
        ImageView imageView;

        ViewHolder(View v){
            textView=v.findViewById(R.id.textView);
            textView2=v.findViewById(R.id.textView2);
            imageView=v.findViewById(R.id.imageView);

        }

    }
}
