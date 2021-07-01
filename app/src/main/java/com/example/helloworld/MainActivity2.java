package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    EditText et; //변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = findViewById(R.id.etYear);
    }

    public void OnAge(View view){
        //생년 가져오기-나이로 바꾸기-토스트로 띄우기
        String year =et.getText().toString();
        int iyear = Integer.parseInt(year);

        int age = 2021 - iyear +1;

        Toast.makeText(this, "당신의 나이는 "+ age + "살 입니다.", Toast.LENGTH_SHORT).show();


    }
}