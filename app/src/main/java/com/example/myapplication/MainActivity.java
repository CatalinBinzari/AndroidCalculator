package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log; //pentru a pune logs in consola

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String My_TAG = "un_mesaj_oarecare";
    private Button button_minus;
    private TextView t1;
    private EditText e1;
    private EditText e2;
    private  int num1;
    private  int num2;
    private int dif;
    private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(My_TAG,"onCreate");
        addListenerOnButton();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(My_TAG,"onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(My_TAG,"onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(My_TAG,"onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(My_TAG,"onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(My_TAG,"onDestroy invoked");
    }
    public void OnButtonClick(View v){
        e1 = (EditText) findViewById(R.id.editText2);
        e2 = (EditText) findViewById(R.id.editText3);
        t1 = (TextView) findViewById(R.id.textView);
        num1 = Integer.parseInt(e1.getText().toString());
        num2 = Integer.parseInt(e2.getText().toString());
        sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }
    public void addListenerOnButton(){
        button_minus = (Button) findViewById(R.id.button9);
        e1 = (EditText) findViewById(R.id.editText2);
        e2 = (EditText) findViewById(R.id.editText3);
        t1 = (TextView) findViewById(R.id.textView);
        t1.setText("ffff");
        button_minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                MainActivity.this, t1.getText() ,
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
        );
    }
}
