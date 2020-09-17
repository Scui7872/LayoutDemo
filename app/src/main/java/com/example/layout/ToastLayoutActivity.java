package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ToastLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_layout);
    }
    public void clickMe(View source){
        Toast.makeText(ToastLayoutActivity.this,"点击了", Toast.LENGTH_SHORT).show();
    }
}