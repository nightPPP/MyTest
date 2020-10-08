package com.example.mytest.myselfview.painttest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 *
 * @author liuy
 */
public class PaintPath extends View {
    public PaintPath(Context context) {
        super(context);
    }

    public PaintPath(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintPath(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.BLACK);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Path path = new Path();
        path.moveTo(10,10);
        path.lineTo(10, 300);
//        path.lineTo(100, 300);

//        path.moveTo(200, 200);
//        path.lineTo(200, 300);
//        path.lineTo(400, 300);
//        path.close();

        RectF rectF = new RectF(150, 190, 200, 200);
        path.arcTo(rectF, 0, 90);
        path.close();

        canvas.drawPath(path, paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(50);

        canvas.drawLine(500, 500, 600,600,paint);

        canvas.drawPoint(100,500,paint);


    }
}

