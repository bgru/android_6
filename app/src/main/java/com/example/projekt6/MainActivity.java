package com.example.projekt6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View view) {
        Button button = (Button) view;
        Intent intent = makeintent(button.getText().toString());
        startActivity(intent);
    }

    private Intent makeintent(String txt) {
        switch (txt) {
            case "one_string_item": return new Intent(this, First.class);
            case "simple item layout": return new Intent(this, Second.class);
            case "two strings item": return new Intent(this, Third.class);
//            case "custom": return new Intent(this, Fourth.class);
        }
        return null;
    }
}