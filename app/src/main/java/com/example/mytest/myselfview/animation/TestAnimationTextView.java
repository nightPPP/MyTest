package com.example.mytest.myselfview.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;

public class TestAnimationTextView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        findViewById(R.id.btn).setOnClickListener(v -> {
            TextView tv = (TextView) findViewById(R.id.tv);
            Animation animation = AnimationUtils.loadAnimation(TestAnimationTextView.this,
                    R.anim.scaleanim);
            tv.setAnimation(animation);
        });
    }
}
