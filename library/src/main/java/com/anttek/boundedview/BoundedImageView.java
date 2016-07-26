package com.anttek.boundedview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by baoleduc on 26/07/16.
 */
public class BoundedImageView extends ImageView {

    private final BoundedViewHelper boundedHelper;

    public BoundedImageView(Context context) {
        super(context);
        boundedHelper = new BoundedViewHelper(context, null);
    }

    public BoundedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        boundedHelper = new BoundedViewHelper(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(boundedHelper.getBoundedMeasuredWidth(getMeasuredWidth()),
                boundedHelper.getBoundedMeasuredHeight(getMeasuredHeight()));
    }
}
