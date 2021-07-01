package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //변수 선언
    TextView textview;
    int count = 0;

    @Override //메인함수 역할
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout); //클래스가 동작할때 액티비티 화면을 가져와 붙이라는 말


        //아이디로 뷰를 가져와서 세팅을 하겠다는 의미
        textview = findViewById(R.id.txtCount);


    }

    public void onToastClick(View view) { //토스트 버튼 작동 함수
        //메세지 박스 띄우기 "hello toast"
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void onCounterClick(View view) {
        //메세지 박스 "hello counter"
        //Toast.makeText(this, "Hello Counter", Toast.LENGTH_SHORT).show();
        count++;
        textview.setText(count + ""); //int 를 문자로 변환 숫자->문

        //값을 가져오고싶다면 getText사용
        //int count = Integer.parseInt(textview.getText().toString());
        //textview.setText(count + ""); //int 를 문자로 변환 숫자->문

    }



}