package com.example.guessnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int comNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        comNumber=random.nextInt(100)+1;

    }

    public void guess(View view){
        EditText enterNumber = (EditText) findViewById(R.id.enterNumber);
        if(enterNumber.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "enter a number!",Toast.LENGTH_SHORT).show();
            return;
        }
        int userNumber= Integer.parseInt(enterNumber.getText().toString());
        if(userNumber==comNumber){
            Toast.makeText(getApplicationContext(), "correct!",Toast.LENGTH_LONG).show();
        } else if (userNumber>comNumber) {
            Toast.makeText(getApplicationContext(), "high",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "low",Toast.LENGTH_LONG).show();

        }
    }
    public void answers(View view){
        Toast.makeText(getApplicationContext(), comNumber+"",Toast.LENGTH_SHORT).show();
    }
    public void reset(View view){
        Random random = new Random();
        comNumber=random.nextInt(100)+1;
        Toast.makeText(getApplicationContext(), "Number has been initialized.",Toast.LENGTH_SHORT).show();
    }

}