package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int noOfCorrectAnswers = 0;
    String answer_1;
    String answer_2;
    String answer_3;
    String answer_4;
    String answer_5;
    String answer_6;
    String answer_7;
    String answer_8;
    String answer_9;
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
        //First edit text for the first question
        EditText editText1 = (EditText) findViewById(R.id.input_1);
        EditText editText2 = (EditText) findViewById(R.id.input_2);
        EditText editText3 = (EditText) findViewById(R.id.input_3);
        EditText editText4 = (EditText) findViewById(R.id.input_4);
        EditText editText5 = (EditText) findViewById(R.id.input_5);
        EditText editText6 = (EditText) findViewById(R.id.input_6);
        EditText editText7 = (EditText) findViewById(R.id.input_7);
        EditText editText8 = (EditText) findViewById(R.id.input_8);
        EditText editText9 = (EditText) findViewById(R.id.input_9);
        EditText editText10 = (EditText) findViewById(R.id.input_10);

        //Store each texts from the edit text in different varibles
        answer_1 = editText1.getText().toString();
        answer_2 = editText2.getText().toString();
        answer_3 = editText3.getText().toString();
        answer_4 = editText4.getText().toString();
        answer_5 = editText5.getText().toString();
        answer_6 = editText6.getText().toString();
        answer_7 = editText7.getText().toString();
        answer_8 = editText8.getText().toString();
        answer_9 = editText9.getText().toString();
        answer_10 = editText10.getText().toString();
    }

    private void checkAnswers(){
        inputAnswers();
        //checking if the answers matches the stored values
        if(answer_1.contains(getString(R.string.answer_one))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_2.contains(getString(R.string.answer_two))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_3.contains(getString(R.string.answer_three))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_4.contains(getString(R.string.answer_four))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_5.contains(getString(R.string.answer_five))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_6.contains(getString(R.string.answer_six))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_7.contains(getString(R.string.answer_seven))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_8.contains(getString(R.string.answer_eight))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_9.contains(getString(R.string.answer_nine))){
            score += 10;
            Toast.makeText(this, "Correct! Your score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

        if(answer_10.contains(getString(R.string.answer_ten))){
            score += 10;
            Toast.makeText(this, "Correct! \nYour score is: "+score, Toast.LENGTH_SHORT).show();
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Aww. Try again. \nScore: "+score, Toast.LENGTH_SHORT).show();
        }

    }

    public void previousQuestion(View v){

    }

    public void nextQuestion(View v){

    }

    /**
     * Submits all answers once the button is clicked to check for the maximum questions answered correctly
     */
    public void submitAnswer(View v){
        checkAnswers();
        Toast.makeText(this, "Congratulations, you scored "+noOfCorrectAnswers+" correctly", Toast.LENGTH_LONG).show();
    }
}
