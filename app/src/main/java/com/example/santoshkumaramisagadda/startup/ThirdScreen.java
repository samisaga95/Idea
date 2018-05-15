package com.example.santoshkumaramisagadda.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdScreen extends AppCompatActivity {

    EditText t1, t2, t3;
    RadioGroup rg1;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        t2 = (EditText) findViewById(R.id.editText_item);
        t3 = (EditText) findViewById(R.id.editText_price);

        rb1 = (RadioButton) findViewById(R.id.groceries);
        rb2 = (RadioButton) findViewById(R.id.frozen);
        rb3 = (RadioButton) findViewById(R.id.dairy);
        rb4 = (RadioButton) findViewById(R.id.poultry);
        rb5 = (RadioButton) findViewById(R.id.toiletries);
        rb6 = (RadioButton) findViewById(R.id.essentials);




        rg1 = (RadioGroup) findViewById(R.id.radioGroup);

        b1=(Button) findViewById(R.id.button1);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String item = t2.getText().toString();
                String price = t3.getText().toString();
                String category = "";
                String output =item + " " + price + " ";

                int selectedId = rg1.getCheckedRadioButtonId();
                // find which radioButton is checked by id
                if (selectedId == rb1.getId()) {
                    category = "Grocerries";
                    //Toast.makeText(SecondScreen.this, "Grocerries", Toast.LENGTH_SHORT).show();
                } else if (selectedId == rb2.getId()) {
                    category = "Frozen";
                    //Toast.makeText(SecondScreen.this, "Frozen", Toast.LENGTH_SHORT).show();
                } else if (selectedId == rb3.getId()) {
                    category = "Dairy Product";
                    //Toast.makeText(SecondScreen.this, "Dairy Product", Toast.LENGTH_SHORT).show();
                } else if (selectedId == rb4.getId()) {
                    category = "Poultry";
                    //Toast.makeText(SecondScreen.this, "Poultry", Toast.LENGTH_SHORT).show();
                } else if (selectedId == rb5.getId()) {
                    category = "Toiletries";
                    //Toast.makeText(SecondScreen.this, "Toiletries", Toast.LENGTH_SHORT).show();
                } else if (selectedId == rb6.getId()) {
                    category = "Home Essentials";
                    //Toast.makeText(SecondScreen.this, "Home Essentials", Toast.LENGTH_SHORT).show();
                }
                output += category;
                Toast.makeText(ThirdScreen.this, output, Toast.LENGTH_SHORT).show();

            }
        });
    }


}
