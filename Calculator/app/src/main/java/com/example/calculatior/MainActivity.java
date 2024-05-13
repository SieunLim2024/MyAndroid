package com.example.calculatior;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView result;
    private Button plus;
    private Button minus;
    private Button division;
    private Button multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        num1= (EditText) findViewById(R.id.number1);
        num2= (EditText) findViewById(R.id.number2);
        result =(TextView) findViewById(R.id.result);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        division = (Button) findViewById(R.id.division);
        multiplication = (Button) findViewById(R.id.multiplication);

    }
    //더하기
    public void clickPlus(View v){
        if(num1.getText().toString().isEmpty()||num2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "enter a number!",Toast.LENGTH_SHORT).show();
        }else{
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            int n3=n1+n2;
            String rs=n1+"+"+n2+"="+n3;
            result.setText(rs);
        }
    }

    public void clickDivision(View view) {
        if(num1.getText().toString().isEmpty()||num2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "enter a number!",Toast.LENGTH_SHORT).show();
        }else{
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            int n3=n1/n2;
            String rs=n1+"/"+n2+"="+n3;
            result.setText(rs);
        }
    }

    public void clickMultiplication(View view) {
        if(num1.getText().toString().isEmpty()||num2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "enter a number!",Toast.LENGTH_SHORT).show();

        }else{
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            int n3=n1*n2;
            String rs=n1+"*"+n2+"="+n3;
            result.setText(rs);
        }
    }

    public void clickMinus(View view) {
        if(num1.getText().toString().isEmpty()||num2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "enter a number!",Toast.LENGTH_SHORT).show();
        }else{
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            int n3=n1-n2;
            String rs=n1+"-"+n2+"="+n3;
            result.setText(rs);
        }
    }
}