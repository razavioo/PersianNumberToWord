package com.example.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.numberword.PersianNumberToWord;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BigDecimal number = new BigDecimal(122);
        String numberWord = PersianNumberToWord.onWork(number, "ریال");
        Toast.makeText(this, numberWord, Toast.LENGTH_SHORT).show();
    }
}
