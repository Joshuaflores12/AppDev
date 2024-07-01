package com.example.myapplication;

// QuestionActivity.java

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_page);

        // Here you can set up your question and answer buttons
        // Example:
        Button answerButton1 = findViewById(R.id.Answer1);
        answerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle answer selection logic here
            }
        });

        // Repeat for other answer buttons (answer_button_2, answer_button_3, answer_button_4)
    }
}
