package com.example.nhom3_04_04_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        String[] st=getResources().getStringArray(R.array.Tech);
        final ArrayAdapter adapter=new ArrayAdapter(this,
                R.layout.list_item,st);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                for (int i=0;i<adapter.getCount();i++){
                    parent.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                }
                parent.getChildAt(position).setBackgroundColor(Color.YELLOW);
                Toast.makeText(MainActivity.this,
                        "Select "+adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
