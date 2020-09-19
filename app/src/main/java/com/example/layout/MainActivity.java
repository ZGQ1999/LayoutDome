package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.googlecode.aviator.AviatorEvaluator;

public class MainActivity extends AppCompatActivity {
    //1.定义变量
    private TextView tvinput;
    private TextView tvresult;

    private String inputStr;
    private String express;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.获取对象
        tvinput = findViewById(R.id.tv_input);
        tvresult = findViewById(R.id.tv_result);

        flag = false;
        express = "" ;
        inputStr = "";
    }
    //3.控件实现方式

}