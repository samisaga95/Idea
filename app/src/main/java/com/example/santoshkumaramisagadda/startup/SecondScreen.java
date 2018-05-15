package com.example.santoshkumaramisagadda.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Calendar;

public class SecondScreen extends AppCompatActivity {

    EditText t1;
    DatePicker dp1;
    Button b1;
    int year, month, day;
    Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        t1 = (EditText) findViewById(R.id.editText_store);
        b1 = (Button) findViewById(R.id.buttonNext);
        dp1= (DatePicker) findViewById(R.id.datePicker);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);


    }
}