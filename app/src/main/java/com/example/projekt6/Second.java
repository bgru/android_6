package com.example.projekt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second extends First {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillListView(R.layout.row_second);
    }
}