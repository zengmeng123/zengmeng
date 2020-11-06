package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        Button button2 = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent = new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
