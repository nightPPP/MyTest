package com.example.mytest.design.template;

public abstract class TemplateGame {

    protected abstract void init();
    protected abstract void start();
    protected abstract void end();

    public final void play(){
        init();
        start();
        end();
    }
}
