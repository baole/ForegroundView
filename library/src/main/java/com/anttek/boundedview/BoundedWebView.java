package com.anttek.boundedview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created by baoleduc on 26/07/16.
 */
public class BoundedWebView extends WebView {

    private final BoundedViewHelper boundedHelper;

    public BoundedWebView(Context context) {
        super(context);
        boundedHelper = new BoundedViewHelper(context, null);
    }

    public BoundedWebView(Context context, AttributeSet attrs) {
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
