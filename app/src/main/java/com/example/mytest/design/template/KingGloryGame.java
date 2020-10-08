package com.example.mytest.design.template;

import android.util.Log;

public class KingGloryGame extends TemplateGame {
    public final String TAG = KingGloryGame.class.getSimpleName();
    @Override
    protected void init() {
        Log.d(TAG, "初始化王者荣耀游戏");
    }

    @Override
    protected void start() {
        Log.d(TAG, "王者荣耀游戏开始");
    }

    @Override
    protected void end() {
        Log.d(TAG, "王者荣耀游戏结束");
    }
}
