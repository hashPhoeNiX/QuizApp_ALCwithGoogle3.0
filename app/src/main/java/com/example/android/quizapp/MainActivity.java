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
    int id = 1;
    List<String> questions = new ArrayList<>();
    List<String> answers = new ArrayList<>();
    String que1;
    String que2;
    String que3;
    String que4;
    String que5;
    String que6;
    String que7;
    String que8;
    String que9;
    String que10;

    String ans1;
    String ans2;
    String ans3;
    String ans4;
    String ans5;
    String ans6;
    String ans7;
    String ans8;
    String ans9;
    String ans10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAnswers() {
        ans1 = getResources().getString(R.string.answer_one);
        ans2 = getResources().getString(R.string.answer_two);
        ans3 = getResources().getString(R.string.answer_three);
        ans4 = getResources().getString(R.string.answer_four);
        ans5 = getResources().getString(R.string.answer_five);
        ans6 = getResources().getString(R.string.answer_six);
        ans7 = getResources().getString(R.string.answer_seven);
        ans8 = getResources().getString(R.string.answer_eight);
        ans9 = getResources().getString(R.string.answer_nine);
        ans10 = getResources().getString(R.string.ansswer_ten);

        answers.add(ans1);
        answers.add(ans2);
        answers.add(ans3);
        answers.add(ans4);
        answers.add(ans5);
        answers.add(ans6);
        answers.add(ans7);
        answers.add(ans8);
        answers.add(ans9);
        answers.add(ans10);
    }

    public void getQuestions() {
        que1 = getResources().getString(R.string.question_one);
        que2 = getResources().getString(R.string.question_two);
        que3 = getResources().getString(R.string.question_three);
        que4 = getResources().getString(R.string.question_four);
        que5 = getResources().getString(R.string.question_five);
        que6 = getResources().getString(R.string.question_six);
        que7 = getResources().getString(R.string.question_seven);
        que8 = getResources().getString(R.string.question_eight);
        que9 = getResources().getString(R.string.question_nine);
        que10 = getResources().getString(R.string.question_ten);

        questions.add(que1);
        questions.add(que2);
        questions.add(que3);
        questions.add(que4);
        questions.add(que5);
        questions.add(que6);
        questions.add(que7);
        questions.add(que8);
        questions.add(que9);
        questions.add(que10);
    }

    public void displayQuestions() {

    }

    public void previousQuestion(View view) {
        Button prev = (Button) findViewById(R.id.prev);

    }

    public void nextQuestion(View view) {
        Button next = (Button) findViewById(R.id.next);
    }

    public void submitAnswer(View view) {
        EditText response = (EditText) findViewById(R.id.text_entry);
        TextView question = (TextView) findViewById(R.id.question_text_view);
        TextView question_id = (TextView) findViewById(R.id.que_id);

        Log.i(getString(R.string.answer_one),"here");
        getAnswers();
        getQuestions();
        for (int a = 0; a<answers.size(); a++) {
            if (response.getText().toString().equalsIgnoreCase(answers.get(a))) {
                score += 5;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Score: " + score, Toast.LENGTH_LONG).show();
                question.setText(questions.get(a));
                id = a+1;
                question_id.setText(id);
            } else {
                Log.i(getString(R.string.answer_one), "here3");
                Toast.makeText(this, "Aww. Try again", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Score: " + score, Toast.LENGTH_LONG).show();
                break;
            }
        }
    }

    public void startQuiz(View view) {
        displayQuestions();
    }
}
