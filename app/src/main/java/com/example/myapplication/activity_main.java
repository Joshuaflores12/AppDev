package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main extends AppCompatActivity { // Class name should match the filename (MainActivity)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Assuming your layout file is named "activity_main.xml"

        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainMenuActivity (corrected name)
                Intent intent = new Intent(activity_main.this, Main_Menu.class);
                startActivity(intent);
            }
        });
    }
}


