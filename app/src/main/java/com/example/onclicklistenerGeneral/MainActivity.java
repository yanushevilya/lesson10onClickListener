package com.example.onclicklistenerGeneral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Activity как Обработчик

//  Нам надо научить кнопку реагировать на нажатие.
//  Соответственно для реализации необходимо выполнить следующие шаги:
//        - создаем обработчик
//        - внутри обработчика будем определять, какая именно кнопка была нажата
//        - заполняем метод onClick
//        - присваиваем обработчик кнопке

// Важно!!! Любой объект, который реализует интерфейс OnClickListener можно положить в метод установки обработчика слушателя вьюшки (например кнопки)
// Можно создать отдельно такой объект, а можно сделать обработчиком слушателя саму Activity
// для этого имплементируем OnClickListener в наш MainActivity


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "myLogs";

    TextView tvScreen;
    Button btnOk, btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScreen = findViewById(R.id.tvScreen);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

// +++++++++++++++++++++++++++++++++++++
    // передаем обработчик нажатия в метод setOnClickListener
        Log.d(TAG, "передаем обработчик нажатия в метод setOnClickListener");
        btnOk.setOnClickListener(this::onClick);
        btnCancel.setOnClickListener(this::onClick);                                                         //
    }

    // ПРИСВАИВАЕМ ОДИН И ТОТЖЕ ОБРАБОТЧИК ОБЕИМ КНОПКАМ:
    @Override
    public void onClick(View v) {
        Log.d(TAG, "перебираем переданные в обработчик View по их id");
        switch (v.getId()) {
            case R.id.btnOk:
                tvScreen.setText("ButtonOK is press");
                break;
            case R.id.btnCancel:
                tvScreen.setText("ButtonCancel is press");
        }
    }

// +++++++++++++++++++++++++++++++++++++
}