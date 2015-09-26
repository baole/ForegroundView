/*
 * Copyright (C) 2015  Bao Le Duc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.anttek.foreground.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;

import com.anttek.foreground.internal.ForegroundViewImlp;

/**
 * Created by Bao Le on 9/26/2015.
 * Add foreground to base view
 */
public class ForegroundImageButton extends ImageButton {

    private final ForegroundViewImlp mImpl;

    public ForegroundImageButton(Context context) {
        this(context, null);
    }

    public ForegroundImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ForegroundImageButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mImpl = new ForegroundViewImlp(context, this);
        mImpl.init(attrs, defStyle);
    }

    /**
     * Describes how the foreground is positioned.
     *
     * @return foreground gravity.
     * @see #setForegroundGravity(int)
     */
    public int getForegroundGravity() {
        return mImpl.getForegroundGravity();
    }

    /**
     * Describes how the foreground is positioned. Defaults to START and TOP.
     *
     * @param foregroundGravity See {@link android.view.Gravity}
     * @see #getForegroundGravity()
     */
    public void setForegroundGravity(int foregroundGravity) {
        mImpl.setForegroundGravity(foregroundGravity);
    }

    @Override
    protected boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || mImpl.verifyDrawable(who);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        mImpl.jumpDrawablesToCurrentState();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        mImpl.drawableStateChanged();
    }

    /**
     * Supply a Drawable that is to be rendered on top of all of the child
     * views in the frame layout.  Any padding in the Drawable will be taken
     * into account by ensuring that the children are inset to be placed
     * inside of the padding area.
     *
     * @param drawable The Drawable to be drawn on top of the children.
     */
    public void setForeground(Drawable drawable) {
        mImpl.setForeground(drawable);
    }

    /**
     * Returns the drawable used as the foreground of this FrameLayout. The
     * foreground drawable, if non-null, is always drawn on top of the children.
     *
     * @return A Drawable or null if no foreground was set.
     */
    public Drawable getForeground() {
        return mImpl.getForeground();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        mImpl.onLayout(changed);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mImpl.onSizeChanged();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mImpl.draw(canvas);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        mImpl.onTouchEvent(e);
        return super.onTouchEvent(e);
    }
}