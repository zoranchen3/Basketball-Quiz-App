package com.zoran.basketballquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton ans1option1,ans1option2,ans1option3,ans2option1,ans2option2,ans2option3,ans3option1,ans3option2,ans3option3;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void getAllView(){
        ans1option1 = (RadioButton)findViewById(R.id.ans1option1);
        ans1option2 = (RadioButton)findViewById(R.id.ans1option2);
        ans1option3 = (RadioButton)findViewById(R.id.ans1option3);
        ans2option1 = (RadioButton)findViewById(R.id.ans2option1);
        ans2option2 = (RadioButton)findViewById(R.id.ans2option2);
        ans2option3 = (RadioButton)findViewById(R.id.ans2option3);
        ans3option1 = (RadioButton)findViewById(R.id.ans3option1);
        ans3option2 = (RadioButton)findViewById(R.id.ans3option2);
        ans3option3 = (RadioButton)findViewById(R.id.ans3option3);


    }

    public void submitAnswer(View view){


    }

    private String calculateMsg()  {
        String msg ="";
        int correct = 0;
        int error = 0;
        getAllView();
        if (ans1option1.isChecked() == true ){
            correct++;
        }else {
            error++;
        }

        if (ans2option3.isChecked() == true ){
            correct++;
        }else {
            error++;
        }

        if (ans3option3.isChecked() == true ){
            correct++;
        }else {
            error++;
        }
        msg+="";
        return msg;

    }

    }



