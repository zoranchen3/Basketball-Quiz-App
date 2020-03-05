package com.zoran.basketballquizapp;



import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;
import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends AppCompatActivity {
    RadioButton ans1option1,ans1option2,ans1option3,ans2option1,ans2option2,ans2option3,ans3option1,ans3option2,ans3option3;;
    EditText ans4edit;
    TextView dialogText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.showDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(v);
            }
        });
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
        ans4edit = (EditText)findViewById(R.id.q4_edit_view);
        dialogText = (TextView)findViewById(R.id.dialog_text_view);
    }

    public void submitAnswer(View view){
         getAllView();
         String msg = calculateMsg();
       /*  dialogText.setText("jass");*/
         showCustomDialog(msg);
    }

    private void showCustomDialog(String message) {

        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);
       /** 動態載入 android-dynamical-loading **/
        LayoutInflater mInflater = LayoutInflater.from(this);
        View contentView  = mInflater.inflate(R.layout.my_dialog,viewGroup,false);
                                                                                                                    //then we will inflate the custom alert dialog xml that we created
        TextView text = (TextView)contentView.findViewById(R.id.dialog_text_view);
        text.setText(message);

        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(contentView);

        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
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

        if (ans4edit.getText().toString() == "呂政儒"){
            correct++;
        }else {
        error++;
    }

        msg+="答對題數:"+correct+"\n答錯題數:"+error+"\n";
        return msg;

    }

    }



