package com.example.android.quizapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int noOfCorrectAnswers = 0;
    int answer_1;
    String answer_2;
    String answer_3;
    Boolean answer_4a;
    Boolean answer_4b;
    String answer_5;
    String answer_6;
    String answer_7;
    int answer_8;
    boolean answer_9a;
    boolean answer_9b;
    String answer_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method handles each questions and their answers
     */
    private void inputAnswers(){
        //Views for each question
        RadioGroup option = (RadioGroup) findViewById(R.id.question1_options);

        EditText editText2 = (EditText) findViewById(R.id.input_2);
        EditText editText3 = (EditText) findViewById(R.id.input_3);

        CheckBox checkBox4a = (CheckBox) findViewById(R.id.input_4a);
        CheckBox checkBox4b = (CheckBox) findViewById(R.id.input_4b);
        CheckBox checkBox4c = (CheckBox) findViewById(R.id.input_4c);
        CheckBox checkBox4d = (CheckBox) findViewById(R.id.input_4d);

        EditText editText5 = (EditText) findViewById(R.id.input_5);
        EditText editText6 = (EditText) findViewById(R.id.input_6);
        EditText editText7 = (EditText) findViewById(R.id.input_7);

        RadioGroup answer8_option = (RadioGroup) findViewById(R.id.answer8_options);

        CheckBox ans9_a = (CheckBox) findViewById(R.id.input_9a);
        CheckBox ans9_b = (CheckBox) findViewById(R.id.input_9b);
        EditText editText10 = (EditText) findViewById(R.id.input_10);

        //Store each texts from the Views in different varibles
        answer_1 = option.getCheckedRadioButtonId();
        answer_2 = editText2.getText().toString();
        answer_3 = editText3.getText().toString();

        answer_4a = checkBox4a.isChecked();
        answer_4b = checkBox4d.isChecked();

        answer_5 = editText5.getText().toString();
        answer_6 = editText6.getText().toString();
        answer_7 = editText7.getText().toString();
        answer_8 = answer8_option.getCheckedRadioButtonId();

        answer_9a = ans9_a.isChecked();
        answer_9b = ans9_b.isChecked();

        answer_10 = editText10.getText().toString();
    }

    /**
     * Checking if the answers are correct and awarding points to each correct one
     */
    private void checkAnswers(){
        inputAnswers();
        //checking if the answers matches the stored values
        if(answer_1 == 0){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_2.contains(getString(R.string.answer_two))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_3.contains(getString(R.string.answer_three))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_4a || answer_4b){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_5.contains(getString(R.string.answer_five))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_6.contains(getString(R.string.answer_six))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_7.contains(getString(R.string.answer_seven))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_8==4){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_9a && answer_9b){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_10.contains(getString(R.string.answer_ten))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Submits all answers once the button is clicked to check for the maximum questions answered correctly
     */
    public void submitAnswer(View v){
        checkAnswers();
        Toast.makeText(this, "Congratulations, you scored "+noOfCorrectAnswers+" correctly", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Your score is: "+score, Toast.LENGTH_LONG).show();
    }
}
