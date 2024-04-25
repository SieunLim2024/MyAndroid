package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;
    private Button button;
    private int diceFace;
    private int[] images;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        dice= (ImageView) findViewById(R.id.dice);
        button=(Button) findViewById(R.id.button);
        result=(TextView)findViewById(R.id.result);
        images = new int[]{
                R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,
                R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6
        };
        //다이스 초기값
        diceFace=1;
    }
    public void roll(View v){
        //랜덤 값 생성
        Random random = new Random();
        diceFace = random.nextInt(6);
        dice.setImageResource(images[diceFace]);
        String str="결과: "+(diceFace+1);
        result.setText(str);
    }

}