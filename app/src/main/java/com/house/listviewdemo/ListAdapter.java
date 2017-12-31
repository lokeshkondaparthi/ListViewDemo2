package com.house.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by welcome on 12/31/2017.
 */

public class ListAdapter extends BaseAdapter {

    private Context context;
    private List<String> stringList;
    private LayoutInflater inflater;

    public ListAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int i) {
        return stringList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        VH viewHolder;
        if (view == null) {
            view = inflater.inflate(R.layout.row_layout, null);
            viewHolder = new VH();
            viewHolder.textView = view.findViewById(R.id.textView);
            view.setTag(viewHolder);
            {
                System.out.print("Hi");
                System.out.print("Hi");
                System.out.print("Hi");
                System.out.print("Hi");

            }
        } else {
            viewHolder = (VH) view.getTag();
            viewHolder.textView.setText("" + stringList.get(i));
        }
        return view;
    }
    private class VH {
        private TextView textView;
    }
}
