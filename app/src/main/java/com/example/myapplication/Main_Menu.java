package com.example.myapplication;

// MainMenuActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_menu);

        Button playButton = findViewById(R.id.button_play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to QuestionActivity
                Intent intent = new Intent(Main_Menu.this, QuestionActivity.class);
                startActivity(intent);
            }
        });

        // You can add click listeners for other buttons (Settings, Exit) here
    }
}
