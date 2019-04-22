package com.example.platemath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public int count2, count5, count10, count25, count35, count45 = 0;
    public String val2, val5, val10, val25, val35, val45;


    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popItOff(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String stringVal = editText.getText().toString();
        Double realVal = Double.parseDouble(stringVal);
        doTheMath(realVal);


        TextView text45 = findViewById(R.id.text45);
        fillTheText(text45, count45, "45");
        TextView text35 = findViewById(R.id.text35);
        fillTheText(text35, count35, "35");
        TextView text25 = findViewById(R.id.text25);
        fillTheText(text25, count25, "25");
        TextView text10 = findViewById(R.id.text10);
        fillTheText(text10, count10, "10");
        TextView text5 = findViewById(R.id.text5);
        fillTheText(text5, count5, "5");
        TextView text2 = findViewById(R.id.text2);
        fillTheText(text2, count2, "2.5");
        blankCounts();
        }
    public void doTheMath(double realVal){
        realVal = realVal-45;
        realVal = realVal/2;
        while (realVal > 2) {
            if (realVal >= 45) {
                realVal = realVal - 45;
                count45++;
                continue;
            }
            if (realVal >= 35) {
                realVal = realVal - 35;
                count35++;
                continue;
            }
            if (realVal >= 25) {
                realVal = realVal - 25;
                count25++;
                continue;
            }
            if (realVal >= 10) {
                realVal = realVal - 10;
                count10++;
                continue;
            }
            if (realVal >= 5) {
                realVal = realVal - 5;
                count5++;
                continue;
            }
            if (realVal >= 2.5) {
                realVal = realVal - 2.5;
                count2++;
                continue;
            }
            else{
                return;
            }

        }
    }
    public void fillTheText(TextView view, int value, String plate){
        String realVal = Integer.toString(value);
        view.setText("You need " + realVal + " " + plate + "s");


    }
    public void blankCounts(){
        count2 = 0;
        count5 = 0;
        count10 = 0;
        count25 = 0;
        count35 = 0;
        count45 = 0;
    }
    }

