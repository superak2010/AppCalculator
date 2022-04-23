package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEditTextNumber1, mEditTextNumber2;
    TextView mTvResult;
    Button mBtnPlus, mBtnMinus, mBtnMultiply, mBtnDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextNumber1 = findViewById(R.id.edittextNumber1);
        mEditTextNumber2 = findViewById(R.id.edittextNumber2);
        mTvResult = findViewById(R.id.result);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnMultiply = findViewById(R.id.buttonMultiply);
        mBtnDivision = findViewById(R.id.buttonDivision);

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button plus", Toast.LENGTH_LONG).show();
                String textNumber1 = mEditTextNumber1.getText().toString();
                String textNumber2 = mEditTextNumber2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input 1 or 2 is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1 + number2;
                mTvResult.setText("Result = " + result);
            }
        });
        mBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button minus", Toast.LENGTH_LONG).show();
                String textNumber1minus = mEditTextNumber1.getText().toString();
                String textNumber2minus = mEditTextNumber2.getText().toString();
                if (textNumber1minus.isEmpty() || textNumber2minus.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input 1 or 2 is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1minus = Integer.parseInt(textNumber1minus);
                int number2minus = Integer.parseInt(textNumber2minus);
                int resultminus = number1minus - number2minus;
                mTvResult.setText("Result = " + resultminus);
            }
        });
        mBtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button multiply", Toast.LENGTH_LONG).show();
                String textNumber1 = mEditTextNumber1.getText().toString();
                String textNumber2 = mEditTextNumber2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input 1 or 2 is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int resultminus = number1 * number2;
                mTvResult.setText("Result = " + resultminus);
            }
        });
        mBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button division", Toast.LENGTH_LONG).show();
                String textNumber1 = mEditTextNumber1.getText().toString();
                String textNumber2 = mEditTextNumber2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input 1 or 2 is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                float number1 = Float.parseFloat(textNumber1);
                float number2 = Float.parseFloat(textNumber2);
                if (number1 % number2 > 0){
                    float number1divisionR = number1;
                    float number2divisionR = number2;
                    float resultdivisionR = number1divisionR / number2divisionR;
                    mTvResult.setText("Result = " + resultdivisionR);
                } else{
                    float number1division = number1;
                    float number2division = number2;
                    float resultdivision = number1division / number2division;
                    mTvResult.setText("Result = " + resultdivision);
                }
            }
        });
    }
}