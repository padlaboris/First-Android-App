package com.example.padlabear.hellokitty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView imageButtonTextView;
    private EditText mNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButtonTextView = (TextView) findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);
    }

    @SuppressLint("SetTextI18n")
    public void imageButtonClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            imageButtonTextView.setText("Hello Kitty");
        } else {
            imageButtonTextView.setText("Привет, " + mNameEditText.getText());
        }
    }
}