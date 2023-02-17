package com.mirea.rebrov.task67_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button3);
        TextView textview = (TextView) findViewById(R.id.textview1);
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        View.OnClickListener clicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("Shi jie!");
                checkbox.setChecked(true);
            }
        };
        button.setOnClickListener(clicked);
    }

    public void linked(View view) {
        TextView textview = (TextView) findViewById((R.id.textview1));
        textview.setText("Nan ren!");
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox.setChecked(false);

    }
}