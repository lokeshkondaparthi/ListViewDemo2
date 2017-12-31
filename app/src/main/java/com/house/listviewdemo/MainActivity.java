package com.house.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        listView = findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(this,list);
        listView.setAdapter(adapter);

    }

    private void createList() {
        list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(String.valueOf(i));
        }
    }
}
