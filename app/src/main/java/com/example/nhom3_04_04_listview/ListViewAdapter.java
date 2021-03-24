package com.example.nhom3_04_04_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nhom3_04_04_listview.model.Technology;

import java.util.List;

public class ListViewAdapter extends
        ArrayAdapter<Technology> {
    private Activity activity;
    private List<Technology> mlist;
    public ListViewAdapter(@NonNull Activity context,
                           List<Technology> list) {
        super(context, R.layout.list_item1,list);
        this.activity=context;
        this.mlist=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item1,parent,false);
        ImageView i=v.findViewById(R.id.img);
        TextView txt1=v.findViewById(R.id.title);
        TextView txt2=v.findViewById(R.id.sub);
        TextView txt3=v.findViewById(R.id.content);

        Technology t=mlist.get(position);
        i.setImageResource(t.getResouceImg());
        txt1.setText(t.getTitle());
        txt2.setText(t.getSub());
        txt3.setText(t.getContent());

        return v;
    }
    public Technology getItem(int pos){
        return mlist.get(pos);
    }
}
