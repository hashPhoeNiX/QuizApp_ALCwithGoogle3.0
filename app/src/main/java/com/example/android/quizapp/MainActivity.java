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

    //Radiogroup for question 1
    RadioGroup option;

    //checkbox for question 4
    CheckBox checkBox4a;
    CheckBox checkBox4b;
    CheckBox checkBox4c;
    CheckBox checkBox4d;

    //Radiogroup for question 8
    RadioGroup answer8_option;

    //checkbox for question 9
    CheckBox ans9_a;
    CheckBox ans9_b;

    //Edit text for question 2, 3, 5, 6, 7, 10
    EditText editText2;
    EditText editText3;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText10;


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
        option = (RadioGroup) findViewById(R.id.question1_options);

        editText2 = (EditText) findViewById(R.id.input_2);
        editText3 = (EditText) findViewById(R.id.input_3);

        checkBox4a = (CheckBox) findViewById(R.id.input_4a);
        checkBox4b = (CheckBox) findViewById(R.id.input_4b);
        checkBox4c = (CheckBox) findViewById(R.id.input_4c);
        checkBox4d = (CheckBox) findViewById(R.id.input_4d);

        editText5 = (EditText) findViewById(R.id.input_5);
        editText6 = (EditText) findViewById(R.id.input_6);
        editText7 = (EditText) findViewById(R.id.input_7);

        answer8_option = (RadioGroup) findViewById(R.id.answer8_options);

        ans9_a = (CheckBox) findViewById(R.id.input_9a);
        ans9_b = (CheckBox) findViewById(R.id.input_9b);
        editText10 = (EditText) findViewById(R.id.input_10);

        //Store each texts from the Views in different varibles
        answer_1 = option.getCheckedRadioButtonId();
        answer_2 = editText2.getText().toString().toLowerCase();
        answer_3 = editText3.getText().toString().toLowerCase();

        answer_4a = checkBox4a.isChecked();
        answer_4b = checkBox4d.isChecked();

        answer_5 = editText5.getText().toString().toLowerCase();
        answer_6 = editText6.getText().toString().toLowerCase();
        answer_7 = editText7.getText().toString().toLowerCase();
        answer_8 = answer8_option.getCheckedRadioButtonId();

        answer_9a = ans9_a.isChecked();
        answer_9b = ans9_b.isChecked();

        answer_10 = editText10.getText().toString().toLowerCase();
    }

    /**
     * Checking if the answers are correct and awarding points to each correct one
     */
    private void checkAnswers(){
        inputAnswers();
        //checking if the answers matches the stored values
        //answer 1 is His son
        if(answer_1 != -1){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 1 is "+getString(R.string.answer_one), Toast.LENGTH_LONG).show();
        }

        //answer 2 is meat
        if(answer_2.contains(getString(R.string.answer_two))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 2 is "+getString(R.string.answer_two), Toast.LENGTH_LONG).show();
        }

        //answer 3 is Nine
        if(answer_3.contains(getString(R.string.answer_three))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 3 is "+getString(R.string.answer_three), Toast.LENGTH_LONG).show();
        }

        //answer 4 is Neither or Both Rocks and Feathers
        if(answer_4a || answer_4b){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 4 is "+getString(R.string.answer_four), Toast.LENGTH_LONG).show();
        }

        //answer 5 is Sponge
        if(answer_5.contains(getString(R.string.answer_five))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 5 is "+getString(R.string.answer_five), Toast.LENGTH_LONG).show();
        }

        //answer 6 is Wine
        if(answer_6.contains(getString(R.string.answer_six))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 6 is "+getString(R.string.answer_six), Toast.LENGTH_LONG).show();
        }

        //answer 7 is Fire
        if(answer_7.contains(getString(R.string.answer_seven))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 7 is "+getString(R.string.answer_seven), Toast.LENGTH_LONG).show();
        }

        //answer 8 is A Secret
        if(answer_8 != -1){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 8 is "+getString(R.string.answer_eight), Toast.LENGTH_LONG).show();
        }

        //answer 9 is Your breath
        if(answer_9a && answer_9b){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 9 is "+getString(R.string.answer_nine), Toast.LENGTH_LONG).show();
        }

        //answer 10 is A Book
        if(answer_10.contains(getString(R.string.answer_ten))){
            score += 10;
            noOfCorrectAnswers++;
        }else{
            Toast.makeText(this, "Answer for Question 10 is "+getString(R.string.answer_ten), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Submits all answers once the button is clicked to check for the maximum questions answered correctly
     */
    public void submitAnswer(View v){
        checkAnswers();
        Toast.makeText(this, "Congratulations, you answered  "+noOfCorrectAnswers+" questions correctly\n\"Your score is: "+score, Toast.LENGTH_LONG).show();
    }

    /**
     * Reset the views back to their initial position
     * All views are returned back to how they were in the activity_main
     * @param v
     */
    public void reset(View v){
        inputAnswers();
        score = 0;
        noOfCorrectAnswers = 0;
        option.clearCheck();
        ans9_a.setChecked(false);
        ans9_b.setChecked(false);
        answer8_option.clearCheck();
        editText3.setText("");
        editText2.setText("");
        editText5.setText("");
        editText6.setText("");
        editText7.setText("");
        editText10.setText("");
        checkBox4a.setChecked(false);
        checkBox4b.setChecked(false);
        checkBox4c.setChecked(false);
        checkBox4d.setChecked(false);
        setContentView(R.layout.activity_main);
    }
}
