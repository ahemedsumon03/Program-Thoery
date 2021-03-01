package com.example.sumonahemed.projectdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private Button answer1,answer2,answer3,answer4;
    private TextView Score,question;

    private Question question1 = new Question();
    private String manswer;
    private int score;
    private int mQuestionlength = question1.mquestion.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = findViewById(R.id.option1);
        answer2 = findViewById(R.id.option2);
        answer3 = findViewById(R.id.option3);
        answer4 = findViewById(R.id.option4);

        Score = findViewById(R.id.Score);
        question = findViewById(R.id.Question);

        Score.setText("Score: "+score);
        updatequestion(r.nextInt(mQuestionlength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()== manswer)
                {
                    score++;
                    Score.setText("Score: "+score);
                    updatequestion(r.nextInt(mQuestionlength));
                }else {
                    gameover();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()== manswer)
                {
                    score++;
                    Score.setText("Score: "+score);
                    updatequestion(r.nextInt(mQuestionlength));
                }else {
                    gameover();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText()==manswer)
                {
                    score++;
                    Score.setText("Score: "+score);
                    updatequestion(r.nextInt(mQuestionlength));
                }else {
                    gameover();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==manswer)
                {
                    score++;
                    Score.setText("Score: "+score);
                    updatequestion(r.nextInt(mQuestionlength));
                }else {
                    gameover();
                }
            }
        });
    }

    private void updatequestion(int num)
    {
        question.setText(question1.getQuestion(num));
        answer1.setText(question1.getchoice1(num));
        answer2.setText(question1.getchoice2(num));
        answer3.setText(question1.getchoice3(num));
        answer4.setText(question1.getchoice4(num));

        manswer = question1.getcorrectanswer(num);
    }
    private void gameover()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Game over!Your score is: "+score+"Points");
        builder.setPositiveButton("New game", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}