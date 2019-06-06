package com.pb.customviews.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

public class SpeedoMeter extends View {
    private Paint paint = new Paint();
    public SpeedoMeter(Context context) {
        super(context);
        setFocusable(true);

    }

    public SpeedoMeter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpeedoMeter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        //1
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GRAY);
        RectF oval1 = new RectF(0, 0, 250,250);

        Paint p1 = new Paint();
        p1.setColor(Color.BLACK);

        canvas.drawText("Parent", 30, 50, p1);
        canvas.drawOval(oval1, paint);


        //2
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLUE);
        RectF oval2 = new RectF(50, 50, 150, 150);

        Paint p2 = new Paint();
        p2.setColor(Color.GREEN);

        canvas.drawText("Child", 75, 75, p2);
        canvas.drawOval(oval2, paint);
    }
}
