package com.pascal.p0081viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("New text in TextView");

        Button myBtn = (Button)findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);
    }
}
