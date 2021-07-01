package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3_price extends AppCompatActivity {

    //변수선언
    EditText ea, el, em;
    String price;
    int aprice, lprice, mprice; //아메, 라떼, 모카 순 변수 선언인

    TextView tnum, tsale, tprice;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_price);

        ea = findViewById(R.id.americano);
        el = findViewById(R.id.latte);
        em = findViewById(R.id.mocha);

        tnum = findViewById(R.id.num); //개수
        tsale = findViewById(R.id.saleprice); //할인금액
        tprice = findViewById(R.id.realprice); //결제금액
    }

    public void totalprice(View view){
    // 세일 해당 유무에 따라 전체 가격을 알려주는 함수

        price = ea.getText().toString();
        aprice = Integer.parseInt(price) * 1000; //아메리카노
        int numa = Integer.parseInt(price) ; //아메리카노 개수

        price = el.getText().toString();
        lprice = Integer.parseInt(price) * 1500; //라떼
        int numl = Integer.parseInt(price) ; // 라떼 개수


        price = em.getText().toString();
        mprice = Integer.parseInt(price) * 1700; //모카
        int numm = Integer.parseInt(price) ; //모카 개수


        int num = numa + numl + numm; //주문 커피 총 개수
        double saleprice = (aprice + lprice + mprice) * 0.9 ;
        int totalprice = aprice + lprice + mprice;

        double sale = totalprice - saleprice ;

        tnum.setText("주문개수: "+ num + "개");




        CheckBox checkBox = (CheckBox) findViewById(R.id.sale);
        if(checkBox.isChecked()){
            Toast.makeText(this, "할인 적용되어, 전체 가격 "+ saleprice + " 원 입니다.", Toast.LENGTH_SHORT).show();
            tsale.setText("할인금액: "+ sale + "원");
            tprice.setText("결제금액: "+ saleprice +"원");
        }
        else {
            Toast.makeText(this, "전체 가격 " + totalprice + " 원 입니다.", Toast.LENGTH_SHORT).show();
            tprice.setText("결제금액: "+ totalprice +"원");
            }



    }





}