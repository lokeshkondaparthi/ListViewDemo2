package com.house.listviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.house.listviewdemo.ListAdapter;
import com.house.listviewdemo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list;
    private ListView listV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listV = findViewById(R.id.listView);
        createList();
        ListAdapter adapter = new ListAdapter(this,list);
        listView.setAdapter(adapter);
        {
            System.out.print("lokesh");
            System.out.print("hello");
            System.out.print("hello  lokesh");
            System.out.print("hello  lokesh");
            System.out.print(" world lokesh");
            System.out.print("hello  lokesh");
            System.out.print("hello world");
        }
    }

    private void createList() {
        list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(String.valueOf(i));
        }
    }
}
