package com.example.mytest.design.template;

import android.util.Log;

public class LoLGame extends TemplateGame {
    public final String TAG = LoLGame.class.getSimpleName();
    @Override
    protected void init() {
        Log.d(TAG, "初始化LoL游戏");
    }

    @Override
    protected void start() {
        Log.d(TAG, "LoL游戏开始");
    }

    @Override
    protected void end() {
        Log.d(TAG, "LoL游戏结束");
    }
}
