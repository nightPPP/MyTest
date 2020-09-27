package com.example.mytest.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;

/**
 * 绘制进度
 */
public class ProgressActivity extends AppCompatActivity {

    private ProgressBar bar;
    private Handler mhandler = new Handler();
    int pro = 0;
    int delayTime = 20;
    private TextView tvProgress;
    private int END_VALUE = 95;
    private int SECOND_VALUE = 50;

    private Runnable mCounter = new Runnable() {
        @Override
        public void run() {
            if (pro <= SECOND_VALUE){
                delayTime = 20;
                pro += 1;
            } else {
                if (pro != END_VALUE) {
                    delayTime = 200;
                    pro += 1;
                }
            }

            bar.setProgress(pro);
            tvProgress.setText(pro + "%");
            mhandler.postDelayed(this, delayTime);
            if (pro == END_VALUE) {
                mhandler.removeCallbacks(mCounter);
            }

        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        tvProgress = (TextView) findViewById(R.id.tv_progress);
        bar = (ProgressBar) findViewById(R.id.progress_bar);

        mhandler.post(mCounter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mhandler) {
            mhandler.removeCallbacks(mCounter);
        }
    }
}
