package com.cs407.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        try{
            boolean test = intent.getStringExtra("error").equalsIgnoreCase("error");
            if(test){
                textView.setText("Error, invalid input");
            }
        }
        catch(NullPointerException e){
            int int1 = Integer.parseInt(intent.getStringExtra("message1"));
            int int2 = Integer.parseInt(intent.getStringExtra("message2"));
            String func = intent.getStringExtra("func");
            if(func.equalsIgnoreCase("+")){
                textView.setText("Your result is: "+ (int1+int2));
            }
            else if(func.equalsIgnoreCase("-")){
                textView.setText("Your result is: "+ (int1-int2));
            }
            else if(func.equalsIgnoreCase("x")){
                textView.setText("Your result is: "+ (int1*int2));
            }
            else{
                if(int2==0){
                    textView.setText("Error, Cannot divide by 0");
                }
                else{
                    textView.setText("Your result is: "+ (int1/int2));}
            }
        }

    }

}