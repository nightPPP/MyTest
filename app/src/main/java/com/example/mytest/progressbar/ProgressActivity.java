package com.example.mytest.progressbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;

/**
 * 绘制进度
 * @author liuy
 */
public class ProgressActivity extends AppCompatActivity {

    private ProgressBar bar;
    private Button restart;
    private Button next;
    private Button failed;
    private Handler mhandler = new Handler();
    int pro = 0;
    int delayTime = 20;
    private TextView tvProgress;
    private TextView tvShowSynStatus;
    private int END_VALUE = 95;
    private int SECOND_VALUE = 50;

    private Runnable mCounter = new Runnable() {
        @Override
        public void run() {
            updateProgress(this);
        }
    };

    private void updateProgress(Runnable runnable) {
        if (pro <= SECOND_VALUE){
            delayTime = 20;
            pro += 1;
        } else {
            if (pro != END_VALUE) {
                delayTime = 200;
                pro += 1;
            } else {
                mhandler.removeCallbacks(mCounter);
            }
        }

        bar.setProgress(pro);
        tvProgress.setText(pro + "%");
        mhandler.postDelayed(runnable, delayTime);

        if (100 == pro){
            mhandler.removeCallbacks(mCounter);
            Toast.makeText(ProgressActivity.this, "成功", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        restart = (Button) findViewById(R.id.btn_restart);
        next = (Button) findViewById(R.id.btn_next);
        failed = (Button) findViewById(R.id.btn_failed);
        tvProgress = (TextView) findViewById(R.id.tv_progress);
        tvShowSynStatus = (TextView) findViewById(R.id.tv_show_syn);
        bar = (ProgressBar) findViewById(R.id.progress_bar);

        restart.setOnClickListener(v -> {
            mhandler.removeCallbacks(mCounter);
            pro = 0;
            bar.setProgressDrawable(getDrawable(R.drawable.login_compass_progress_bg));
            tvShowSynStatus.setText("账号绑定数据同步中...");
            mhandler.post(mCounter);
        });
        next.setOnClickListener(v -> {
            mhandler.removeCallbacks(mCounter);
            if (pro < 100){
                pro+=1;
            } else {
                pro = 0;
            }
            bar.setProgressDrawable(getDrawable(R.drawable.login_compass_progress_bg));
            tvShowSynStatus.setText("账号绑定数据同步中...");
            mhandler.post(mCounter);
        });
        failed.setOnClickListener(v -> {
            bar.setProgressDrawable(getDrawable(R.drawable.login_compass_progress_failed_bg));
            tvShowSynStatus.setText("数据同步失败");
            mhandler.removeCallbacks(mCounter);
            Toast.makeText(ProgressActivity.this, "网络原因绑定数据同步失败", Toast.LENGTH_SHORT).show();
        });

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
