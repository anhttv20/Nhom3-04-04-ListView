package com.example.nhom3_04_04_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nhom3_04_04_listview.model.Technology;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        adapter=new ListViewAdapter(this,getAll());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,
                        "Select "+adapter.getItem(position).getTitle(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<Technology> getAll(){
        List<Technology> t=new ArrayList<>();
        t.add(new Technology(R.drawable.android_logo,"android_logo","Sub android_logo",
                "Content 1"));
        t.add(new Technology(R.drawable.ios_logo,"ios_logo","Sub ios_logo",
                "Content 2"));
        t.add(new Technology(R.drawable.blackberry_logo,"blackberry_logo",
                "Sub blackberry_logo",
                "Content 3"));
        t.add(new Technology(R.drawable.windowsmobile_logo,"windowsmobile_logo",
                "Sub windowsmobile_logo",
                "Content 4"));

        return t;
    }
}
