package com.example.onclicklistenerGeneral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Присвоение одного обработчика на несколько кнопок

//  Нам надо научить кнопку реагировать на нажатие.
//  Соответственно для реализации необходимо выполнить следующие шаги:
//        - создаем обработчик
//        - внутри обработчика будем определять, какая именно кнопка была нажата
//        - заполняем метод onClick
//        - присваиваем обработчик кнопке

// Важно!!! Любой объект, который реализует интерфейс OnClickListener можно положить в метод установки обработчика слушателя вьюшки (например кнопки)
// Можно создать отдельно такой объект, а можно сделать обработчиком слушателя саму Activity
// для этого имплементируем OnClickListener в наш MainActivity

public class MainActivity extends AppCompatActivity {

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

// СОЗДАЕМ ОБРАБОТЧИК
        // Для установки слушателя у кнопки есть метод setOnClickListener (View.OnClickListener l).
        // На вход подается объект с интерфейсом View.OnClickListener. ЗДЕСЬ МЫ СОЗДАДИМ ТАКОЙ ОБЪЕКТ.
        // Именно этому объекту кнопка поручит обрабатывать нажатия.
        View.OnClickListener onClickListenerBtn = new View.OnClickListener() {
// ЗАПОЛНЯЕМ МЕТОД onClick
        // На вход ему подается объект класса View, это как раз то, что нам нужно. Это View на
        // которой произошло нажатие и которая вызвала обработчик. Т.е. в нашем случае это будет либо кнопка OK либо
        // Cancel. Нам осталось узнать ID этой View и сравнить его с нашими R.id.btnOk и R.id.btnCancel, чтобы определить
        // какая именно это кнопка. Чтобы получить ID какой-либо View, используется метод getId. Для перебора результатов
        // используем java-оператор switch.
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnOk:
                        tvScreen.setText("ButtonOK is press");
                        break;
                    case R.id.btnCancel:
                        tvScreen.setText("ButtonCancel is press");
                }

            }
        };
// ПРИСВАИВАЕМ ОДИН И ТОТЖЕ ОБРАБОТЧИК ОБЕИМ КНОПКАМ:
        // Обработчик нажатия готов.
        // Осталось «скормить» его кнопке с помощью метода setOnClickListener.
        btnOk.setOnClickListener(onClickListenerBtn);
        btnCancel.setOnClickListener(onClickListenerBtn);                                                         //
    }
}