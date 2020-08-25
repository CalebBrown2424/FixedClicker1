package com.example.fixedclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Counter count;
//private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       count = new Counter();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView3);
    }


    public void incrementCount(View view) {
        count.increaseCount();
        text.setText((CharSequence) count.getCount().toString());
    }

    public void decrementCount(View view) {
        count.decreaseValue();
        text.setText((CharSequence) count.getCount().toString());
    }

    public void doubleCount(View view) {
        count.doubleValue();
        text.setText((CharSequence) count.getCount().toString());
    }

    public void resetButton(View view) {
        count.reset();
        text.setText((CharSequence) count.getCount().toString());
    }


}