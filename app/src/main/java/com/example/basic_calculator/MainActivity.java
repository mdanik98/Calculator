package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5, button6,button7,button8,button9,button0, buttonAdd , clear,buttoneq,buttonSub,buttonDiv,buttonMul,buttonDot;
    private EditText editText;
    private TextView textView;
    private int sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.Button_1);
        button2 = (Button) findViewById(R.id.Button_2);
        button3 = (Button) findViewById(R.id.Button_3);
        button4 = (Button) findViewById(R.id.Button_4);
        button5 = (Button) findViewById(R.id.Button_5);
        button6 = (Button) findViewById(R.id.Button_6);
        button7 = (Button) findViewById(R.id.Button_7);
        button8 = (Button) findViewById(R.id.Button_8);
        button9 = (Button) findViewById(R.id.Button_9);
        button0 = (Button) findViewById(R.id.Button_0);
        buttoneq = (Button) findViewById(R.id.Button_Equal);
        buttonSub = (Button) findViewById(R.id.Button_sub);
        buttonDiv = (Button) findViewById(R.id.Button_divison);
        buttonMul = (Button) findViewById(R.id.Button_multliply);
        buttonAdd = (Button) findViewById(R.id.Button_add);
        buttonDot = (Button) findViewById(R.id.Button_dot);
        editText = (EditText) findViewById(R.id.Input_Edit_Text);
        textView = (TextView) findViewById(R.id.textView);
        clear = (Button) findViewById(R.id.clear);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonDot.setOnClickListener(this);

        editText.setOnClickListener(this);
        textView.setOnClickListener(this);
        clear.setOnClickListener(this);


        editText.setTextIsSelectable(true);
        editText.setShowSoftInputOnFocus(false);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        editText.setCursorVisible(true);


    }



    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.Button_1){
            editText.setText(String.format("%s1", editText.getText().toString()));
            editText.setSelection(editText.getText().length());

        }
        else if(v.getId()==R.id.Button_2){
            editText.setText(String.format("%s2", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_3){
            editText.setText(String.format("%s3", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_4){
            editText.setText(String.format("%s4", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_5){
            editText.setText(String.format("%s5", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_6){
            editText.setText(String.format("%s6", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_7){
            editText.setText(String.format("%s7", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_8){
            editText.setText(String.format("%s8", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_9){
            editText.setText(String.format("%s9", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_0){
            editText.setText(String.format("%s0", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_add){
            editText.setText(String.format("%s+", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_sub){
            editText.setText(String.format("%s-", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }
        else if(v.getId()==R.id.Button_multliply){
            editText.setText(String.format("%s*", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }

        else if(v.getId()==R.id.Button_divison){
            editText.setText(String.format("%s/", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }

        else if(v.getId()==R.id.Button_dot){
            editText.setText(String.format("%s.", editText.getText().toString()));
            editText.setSelection(editText.getText().length());
        }

        else if(v.getId()==R.id.clear){
            editText.getText().clear();
            textView.setText(null);
        }






        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                String w[] = new String[10];
                int [] a = new int[10];
                w = s.split("[-+*/]");

                for (int i = 0; i < w.length; i++) {
                    a[i] = Integer.parseInt(w[i]);
                }

                if(s.contains("+")){
                    sum = a[0]+a[1]+a[2];
                }
                else if(s.contains("-")){
                    sum = a[0]-a[1]-a[2];
                }
                else if(s.contains("/")){
                    sum = a[0]/a[1]/a[2];
                }
                else if(s.contains("*")){
                    sum = a[0]*a[1]*a[2];
                }

                String res = Integer.toString(sum);
                textView.setText(res);

            }

        });


    }
}