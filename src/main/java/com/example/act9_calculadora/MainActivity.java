package com.example.act9_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText et_number1;
        EditText et_number2;
        EditText et_result;

        double number1;
        double number2;
        double result;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initComponents();
        }

        private void initComponents(){
            et_number1 = (EditText)findViewById(R.id.et_number1);
            et_number2 = (EditText)findViewById(R.id.et_number2);
            et_result = (EditText)findViewById(R.id.et_result);
        }

        private void valuesCasting(){
            number1 = Double.parseDouble(et_number1.getText().toString());
            number2 = Double.parseDouble(et_number2.getText().toString());
        }

        public void addOnClick(View view){
            try{
                valuesCasting();
                result = number1 + number2;
                et_result.setText(String.valueOf(result));
            }catch (Exception e){
                Log.e("Error add:", "Message " + e.getMessage());
                et_result.setText("Error");
            }
        }
        public void restOnClick(View view){
            try{
                valuesCasting();
                result = number1 - number2;
                et_result.setText(String.valueOf(result));
            }catch (Exception e){
                Log.e("Error rest:", "Message " + e.getMessage());
                et_result.setText("Error");
            }
        }
        public void divisionOnClick(View view){
            try{
                valuesCasting();
                result = number1 / number2;
                et_result.setText(String.valueOf(result));
            }catch (Exception e){
                Log.e("Error division:", "Message " + e.getMessage());
                et_result.setText("Error");
            }
        }
        public void multiplicationOnClick(View view){
            try{
                valuesCasting();
                result = number1 * number2;
                et_result.setText(String.valueOf(result));
            }catch (Exception e){
                Log.e("Error multiplication:", "Message " + e.getMessage());
                et_result.setText("Error");
            }
        }
        public void moduleOnClick(View view){
            try{
                valuesCasting();
                result = number1 % number2;
                et_result.setText(String.valueOf(result));
            }catch (Exception e){
                Log.e("Error module:", "Message " + e.getMessage());
                et_result.setText("Error");
            }
        }
    }




