package com.example.projekt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class First extends AppCompatActivity {

    protected ListView lvLanguages;
    protected String[] languages;
    protected Toast toastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        lvLanguages = findViewById(R.id.lvLanguages);
        languages = getResources().getStringArray(R.array.languages);

        fillListView(android.R.layout.simple_list_item_1);
        lvLanguages.setOnItemClickListener( (parent, v, pos, id) -> showToast(parent.getItemAtPosition(pos).toString()) );
    }

    protected void fillListView(int layout) {
        lvLanguages.setAdapter(new ArrayAdapter<>(
                this,
                layout,
                languages
        ));
    }

    protected void showToast(String text) {

        if (toastMessage!= null) {
            toastMessage.cancel();
        }
        toastMessage = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toastMessage.show();

    }
}