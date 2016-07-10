package com.develodroid.multilayerprogressbar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import com.develodroid.multilayerprogressbar.R;

/**
 * @author Chema Rubio
 */

public class MultiLayerProgressView extends View{

    public static final String TAG = MultiLayerProgressView.class.getSimpleName();

    private int layers;
    private float percent;
    private Paint mPaint;
    private Path mPath;

    private Paint mTextPaint;
    private int mTextColor;
    private float mTextX = 0.0f;
    private float mTextY = 0.0f;
    private float mTextWidth = 0.0f;
    private float mTextHeight = 0.0f;

    private TypedArray mTypedArray;


    /**
     * @param context
     */
    public MultiLayerProgressView(Context context) {
        super(context);
    }

    /**
     * @param context
     * @param attrs
     */
    public MultiLayerProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public MultiLayerProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * @param context
     * @param attrs
     * @param defStyleAttr
     * @param defStyleRes
     */
    public MultiLayerProgressView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(){
        mPath   = new Path();
        mPaint  = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLUE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
        canvas.drawColor(Color.BLUE);
    }
}
