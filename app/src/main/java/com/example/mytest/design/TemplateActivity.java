package com.example.mytest.design;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;
import com.example.mytest.design.template.KingGloryGame;
import com.example.mytest.design.template.LoLGame;
import com.example.mytest.design.template.TemplateGame;

public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        findViewById(R.id.tv_template).setOnClickListener(v ->{
            Toast.makeText(TemplateActivity.this,"template", Toast.LENGTH_SHORT).show();
            TemplateGame game = new LoLGame();
            game.play();

            game = new KingGloryGame();
            game.play();

        });
    }
}
