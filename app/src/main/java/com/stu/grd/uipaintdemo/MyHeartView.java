package com.stu.grd.uipaintdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by guoruidong on 2018/3/29.
 */

public class MyHeartView extends View{

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public MyHeartView(Context context) {
        super(context);
    }

    public MyHeartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyHeartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        RectF heartRectF1 = new RectF(300,300,500,500);
        RectF heartRectF2 = new RectF(500,300,700,500);

        mPaint.setStrokeWidth(1);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(heartRectF1,mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawRect(heartRectF2,mPaint);


        mPaint.setStrokeWidth(1);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.addArc(heartRectF1,-225,225);
        path.arcTo(heartRectF2,-180,225);
        path.lineTo(500,650);
        path.close();
        canvas.drawPath(path,mPaint);
    }
}
