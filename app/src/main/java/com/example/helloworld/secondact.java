package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondact extends AppCompatActivity {

    Button b2_1, b2_2;
    TextView tv1;
    EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondact);

        b2_1 = findViewById(R.id.bu2_1); //버튼 동작
        b2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack(); //
            }
        });

        tv1 = findViewById(R.id.tvm);
        Intent intent = getIntent();  //앞에서 보낸 인탠트 데이터를 가져오는 것
        //데이터 타입 일치시키기 - string
        //받을 문자열 변수 선언하기
        //getextra로 못 받음 - 파라미터 일치
        String msg = intent.getStringExtra("msg"); //앞에서 보낸 이름이랑 같아야 함
        tv1.setText(msg);

        b2_2 = findViewById(R.id.bu2_2); //버튼 동작
        b2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallSendMsg(); //
            }
        });
        et1=findViewById(R.id.etmsg);

    }


    private void CallSendMsg() {
        Intent intent = new Intent(this, firstactivity.class);
        intent.putExtra("msg", et1.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }

    private void callBack() { //자기 자신 액티비티만 종료해서 첫번째 액티비티만 보이게 함
        finish(); //현재 보여지고 있는 두번째 액티티비를 종료시킴
    }
}