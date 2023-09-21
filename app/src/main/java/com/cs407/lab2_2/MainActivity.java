package com.cs407.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity(String s, String t, String func) {
        Intent intent = new Intent(this, MainActivity2.class);
        try {
            int value = Integer.parseInt(s);
            int value2 = Integer.parseInt(t);
            intent.putExtra("message1",s);
            intent.putExtra("message2",t);
            intent.putExtra("func", func);
            startActivity(intent);
        } catch (NumberFormatException e) {
            intent.putExtra("error", "error");
            startActivity(intent);
        }
    }

    public void clickFunctionAdd(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String func = "+";
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), func);
    }

    public void clickFunctionSub(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String func = "-";
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), func);
    }

    public void clickFunctionMul(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String func = "x";
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), func);
    }

    public void clickFunctionDivide(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String func = "/";
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), func);
    }

}