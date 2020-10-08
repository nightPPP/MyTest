package com.example.mytest.myselfview.painttest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class LineTextView extends androidx.appcompat.widget.AppCompatTextView {

    private Paint mPaint;

    public LineTextView(Context context) {
        super(context);
        init();
    }

    public LineTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LineTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        mPaint.setColor(Color.YELLOW);

        RectF rectF = new RectF(0, 0, width, height);
        canvas.drawRect(rectF, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawLine(0, height/2, width, height/2, mPaint);

    }
}
