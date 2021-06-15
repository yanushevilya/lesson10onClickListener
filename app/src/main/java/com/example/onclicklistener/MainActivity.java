package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        // Нам надо научить кнопку реагировать на нажатие.                                                  //
        // Для этого у кнопки есть метод setOnClickListener (View.OnClickListener l).                       //
        // На вход подается объект с интерфейсом View.OnClickListener. ЗДЕСЬ МЫ СОЗДАДИМ ИМЕННО ЕГО.        //
        // Именно этому объекту кнопка поручит обрабатывать нажатия.                                        //
        View.OnClickListener onClickBtnOk = new View.OnClickListener() {                                    //
            @Override                                                                                       //
            public void onClick(View v) {                                                                   //
                tvScreen.setText("ButtonOK is press");                                                      //
            }                                                                                               //
        };                                                                                                  //
                                                                                                            //
        // Обработчик нажатия готов.                                                                        //
        // Осталось «скормить» его кнопке с помощью метода setOnClickListener.                              //
        btnOk.setOnClickListener(onClickBtnOk);                                                             //



        // аналогично для второй кнопки
        View.OnClickListener onClickBtnCancel = new View.OnClickListener() {                                //
            @Override                                                                                       //
            public void onClick(View v) {                                                                   //
                tvScreen.setText("ButtonCancel is press");                                                  //
            }                                                                                               //
        };                                                                                                  //
                                                                                                            //
        // Обработчик нажатия готов.                                                                        //
        // Осталось «скормить» его кнопке с помощью метода setOnClickListener.                              //
        btnCancel.setOnClickListener(onClickBtnCancel);                                                         //
    }
}