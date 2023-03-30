package com.paradeeez.truequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout alphabet = findViewById(R.id.alphabetLayout);
        final LinearLayout number = findViewById(R.id.numberLayout);
        final LinearLayout animal = findViewById(R.id.animalLayout);
        final LinearLayout fruit = findViewById(R.id.fruitLayout);
        final LinearLayout bodyPart = findViewById(R.id.bodyPartLayout);
        final LinearLayout colour = findViewById(R.id.shapeLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);


        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "alphabet";

                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                animal.setBackgroundResource(R.drawable.round_back_white10);
                fruit.setBackgroundResource(R.drawable.round_back_white10);
                bodyPart.setBackgroundResource(R.drawable.round_back_white10);
                colour.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "number";

                number.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                animal.setBackgroundResource(R.drawable.round_back_white10);
                fruit.setBackgroundResource(R.drawable.round_back_white10);
                bodyPart.setBackgroundResource(R.drawable.round_back_white10);
                colour.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "animal";

                animal.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                fruit.setBackgroundResource(R.drawable.round_back_white10);
                bodyPart.setBackgroundResource(R.drawable.round_back_white10);
                colour.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "fruit";

                fruit.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                animal.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                bodyPart.setBackgroundResource(R.drawable.round_back_white10);
                colour.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        bodyPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "bodyPart";

                bodyPart.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                animal.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                fruit.setBackgroundResource(R.drawable.round_back_white10);
                colour.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "colour";

                colour.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                animal.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                bodyPart.setBackgroundResource(R.drawable.round_back_white10);
                fruit.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}