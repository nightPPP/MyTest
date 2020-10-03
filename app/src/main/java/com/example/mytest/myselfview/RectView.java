package com.example.mytest.myselfview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author liuy
 */
public class RectView extends View {

    private Paint mPaint = new Paint();

    public RectView(Context context) {
        super(context);
        init();
    }

    public RectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if (MeasureSpec.AT_MOST == widthMode && MeasureSpec.AT_MOST == heightMode){
            setMeasuredDimension(300,300);
        } else if (MeasureSpec.AT_MOST == widthMode){
            setMeasuredDimension(300, heightSize);
        } else if (MeasureSpec.AT_MOST == heightMode){
            setMeasuredDimension(widthSize, 300);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();

        int width = getWidth() - paddingLeft - paddingRight;

        int height = getHeight() - paddingTop - paddingBottom;

        canvas.drawRect(paddingLeft, paddingTop, width + paddingRight, height + paddingBottom,mPaint);
    }
}
