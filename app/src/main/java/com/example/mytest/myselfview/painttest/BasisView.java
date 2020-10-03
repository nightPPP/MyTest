package com.example.mytest.myselfview.painttest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class BasisView extends View {
    public BasisView(Context context) {
        super(context);
    }

    public BasisView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasisView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.BLACK);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(50);
        //圆心的横向x坐标190，纵向y坐标200， 圆的半径150
        canvas.drawCircle(190,200,150,paint);

        paint.setColor(Color.BLUE);
        canvas.drawCircle(190, 200, 100, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(190, 200, 50, paint);

    }
}
