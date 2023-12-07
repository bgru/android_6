package com.example.projekt6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.LinkedList;

public class Third extends First {
    protected String[] hellos;
    protected LinkedList<String[]> theList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hellos = getResources().getStringArray(R.array.hello_phrases);
        makeList();

        fillListView(android.R.layout.simple_list_item_2, android.R.id.text1, android.R.id.text2);
    }

    protected void makeList() {
        for (int i = 0; i < languages.length; i++) {
            theList.add(new String[]{languages[i], hellos[i]});
        }
    }

    protected void fillListView(int layout, int row1, int row2) {
        lvLanguages.setAdapter(new ArrayAdapter<String[]>(
                this,
                layout,
                row1,
                theList
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String[] entry = theList.get(position);
                TextView text1 = view.findViewById(row1);
                TextView text2 = view.findViewById(row2);
                text1.setText(entry[0]);
                text2.setText(entry[1]);
                view.setOnClickListener(v -> showToast(entry[0] + "\n" + entry[1]));
                return view;
            }
        });


    }


}