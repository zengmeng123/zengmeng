package com.example.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    private  final static String TAG = "FirstAcitivity";
    @Override
    protected  void  onActivityResult(int requestCode, int resultCode, @Nullable Intent date){
        super.onActivityResult(requestCode,resultCode,date);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                String msg = date.getStringExtra("msg");
                Log.d(TAG,"msg" + msg);
            }
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.main_layout);
//        Button button=findViewById(R.id.start_normal_activity);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                  Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                  startActivityForResult(intent, 1);
//            }
//        });

    }
}
