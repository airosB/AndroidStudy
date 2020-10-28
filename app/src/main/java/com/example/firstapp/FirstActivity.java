package com.example.firstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);

        int n = 10;
        long factorial = calculateFactorial(n);
        this.setTitle(n + "の階乗");

        TextView firstText = (TextView)findViewById(R.id.firstText);
        firstText.setText(String.valueOf(factorial));
        firstText.setTextSize(20.0f);

        int color = ContextCompat.getColor(getApplicationContext(), R.color.purple_200);
        firstText.setTextColor(color);

        doCat();
    }

    /**
     * 階乗計算
     * @param n
     * @return
     */
    private long calculateFactorial(int n) {
        long product = 1L;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }

    private void doCat(){
        Cat tama = new Cat("タマ", 3, "オス", "三毛猫");
        Cat kuro = new Cat("クロ", 1, "メス", "黒猫");
        tama.greet();
        kuro.greet();
        tama.talkAbout(kuro);
        kuro.talkAbout(tama);
        kuro.talkAbout(kuro);
        tama.sleep();
        kuro.say("寝てるし……");
        kuro.sleep();
    }
}
