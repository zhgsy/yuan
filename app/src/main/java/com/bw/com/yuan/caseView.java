package com.bw.com.yuan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class caseView extends View {
    public caseView(Context context) {
        super(context);
    }

    public caseView(Context context,AttributeSet attrs) {
        super(context, attrs);
    }

    public caseView(Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public caseView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
    public void initview(){
        Paint paint = new Paint();
        paint.setAntiAlias(true); //设置是否抗锯齿;
        paint.setStyle(Paint.Style.FILL_AND_STROKE); //设置填充样式
        paint.setColor(Color.GREEN);//设置画笔颜色
        paint.setStrokeWidth(2);//设置画笔宽度
        paint.setShadowLayer(10,15,15,Color.RED);//设置阴影


    }

}
