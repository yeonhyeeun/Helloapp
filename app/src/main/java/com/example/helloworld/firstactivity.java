package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class firstactivity extends AppCompatActivity {
    Button b1, b2;
    EditText etvm;

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
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallSecondActivityWithMsg();
            }
        });
        etvm=findViewById(R.id.etvm);
    }

    private void CallSecondActivityWithMsg() {
            Intent intent = new Intent(this, secondact.class);
            intent.putExtra("msg", etvm.getText().toString());
            startActivity(intent);
            }


    private void CallSecondActivity(){
            Intent intent = new Intent(this, secondact.class); //private 함수여서 this 사용 가능
            startActivity(intent);
            }
}