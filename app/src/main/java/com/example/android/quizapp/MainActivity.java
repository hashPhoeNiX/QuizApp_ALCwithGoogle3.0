package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void questions(){
        que1 = "A woman shoots her husband, holds him under water for five minutes, and hangs him. When she's\n" +
                "done, her husband tells her, \"Good Job.\"\n" +
                "How is this possible?";
        que2 = "A man is convicted to death. He will be spared if he can pick out one real flower in a room full of fake\n" +
                "flowers. When he gets in the room, he complains about the heat and opens a window. Soon after, he\n" +
                "finds the real flower.";
        que3 = "A sign at a store says, \"If you don't see what you want, you're in the right place.\" What does the store\n" +
                "sell?";
        que4 = "Two mothers and two daughters go to the bike shop. Each one of them buys one bike. They come\n" +
                "back with three bikes. How is this possible.";
        que5 = "The man who makes it doesn't need it, the man who buys it doesn't use it, and the man he gives it to\n" +
                "doesn't know he's using it.\n" +
                "What is it?";
        que6 = "The manager of a hotel realizes that someone is stealing from the hotel. He comes up with a plan to\n" +
                "catch the thief. That evening, he gives everyone a stick and says to sleep with it under their pillow.\n" +
                "The stick will grow an inch longer if it is the thief's pillow. The next morning, all the guests come into\n" +
                "the lobby with their sticks. The manager picks out the thief. The sticks weren't magic. How did he do\n" +
                "it?";
        que7 = "";
        que8 = "";
        que9 = "";
        que10 = "";
    }

    public void displayQuestions(String que, String answerA, String answerB, String answerC, String answerD){
        TextView question = (TextView) findViewById(R.id.question_text_view);
        question.setText(que);

        RadioButton optionA = (RadioButton) findViewById(R.id.optionA);
        optionA.setText(answerA);

        RadioButton optionB = (RadioButton) findViewById(R.id.optionB);
        optionB.setText(answerB);

        RadioButton optionC = (RadioButton) findViewById(R.id.optionC);
        optionC.setText(answerC);

        RadioButton optionD = (RadioButton) findViewById(R.id.optionD);
        optionA.setText(answerD);
    }

    public void previousQuestion(View view){
        Button prev = (Button) findViewById(R.id.prev);

    }

    public void nextQuestion(View view){
        Button next = (Button) findViewById(R.id.next);
    }

    public void submitAnswer(View view){
        Toast.makeText(this, "Score: " + score, Toast.LENGTH_LONG).show();
    }

    public void startQuiz(View view){

        /**
         * To get the selected button group
         */
        RadioGroup ans = (RadioGroup) findViewById(R.id.radioGroup);
        int answer = ans.getCheckedRadioButtonId();

        if (answer==1){
            score += 2;
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wrong answer, please try again.", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
