package com.example.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyDraw extends View {

    private Context context;

    public MyDraw(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint1 = new Paint();
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        Paint paint5 = new Paint();
        paint1.setColor(Color.GREEN);
        paint2.setColor(Color.YELLOW);
        paint3.setColor(Color.RED);
        paint4.setColor(Color.BLUE);
        paint5.setColor(Color.GRAY);
        paint1.setStrokeWidth(10);

        for (float i=1; i<=10; i++){
            canvas.drawLine(220.0f*i, 1730.0f, 350f*i, 1880.0f, paint3);
        }

        canvas.drawCircle(60.0f, 60.0f, 100, paint2);
        canvas.drawLine(0.0f, 0.0f, 140.0f,650.0f, paint2);
        canvas.drawLine(0.0f, 1800.0f, 1200.0f,1800.0f, paint2);
        canvas.drawRect(0.0f, 1800.0f, 1800f, 2600.0f, paint3);
        canvas.drawRect(200.0f, 1600.0f, 700f, 2000.0f, paint4);
        canvas.drawLine(200.0f, 1600.0f, 450.0f,1250.0f, paint4);
        canvas.drawLine(450.0f,1250.0f,700.0f,1600.0f, paint4);
        canvas.drawCircle(450.0f,1500.0f,70, paint5);
        canvas.drawRect(850.0f, 1820.0f, 900.0f, 2030.0f, paint5);
        RectF oval = new RectF(750, 1250, 1000, 1850);
        canvas.drawOval(oval, paint1);
        canvas.drawRect(220.0f, 1730.0f, 350f, 1880.0f, paint2);
        canvas.drawRect(500.0f, 1720.0f, 630.0f, 2000.0f, paint5);

    }

}
