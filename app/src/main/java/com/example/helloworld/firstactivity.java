package com.example.helloworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class firstactivity extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1, e2;
    TextView tv1;

    private final static int REQUEST_CODE_1 =1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity);

        b1 = findViewById(R.id.bu1); //버튼 동작
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallSecondActivity();
            }
        });



        b2 = findViewById(R.id.bu2);
        e1 = findViewById(R.id.etvm);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallSecondActivityWithMsg();
            }
        });

        b3 = findViewById(R.id.bu3); //버튼 동작
        e2 = findViewById(R.id.etvm2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallSecondActivityWithMsg3(); // 새로운 함수 생성
            }
        });

    }

    private void CallSecondActivityWithMsg3() {
        Intent intent = new Intent(this, secondact.class); //private 함수여서 this 사용 가능
        intent.putExtra("msg", e2.getText().toString());
        startActivityForResult(intent, REQUEST_CODE_1); //requestcode도 같이 보냄
    }

    private void CallSecondActivityWithMsg() {
        Intent intent = new Intent(this, secondact.class);
        intent.putExtra("msg", e1.getText().toString());
        startActivity(intent);
    }


    private void CallSecondActivity(){
        Intent intent = new Intent(this, secondact.class); //private 함수여서 this 사용 가능
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_1) {
            if(resultCode == RESULT_OK) {
                String msg = data.getStringExtra("msg"); //데이타 받아오기
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

            }
        }
    }
}