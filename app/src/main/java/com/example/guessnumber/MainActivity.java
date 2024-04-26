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
        int userNumber= Integer.parseInt(enterNumber.getText().toString());
        if(userNumber==comNumber){
            Toast.makeText(getApplicationContext(), "correct!",Toast.LENGTH_LONG).show();
        } else if (userNumber>comNumber) {
            Toast.makeText(getApplicationContext(), "high",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "low",Toast.LENGTH_LONG).show();

        }
    }

}