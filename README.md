# ForegroundView
A collection of Android foreground-enabled views just like FrameLayout. Support following views and viewgroups
* ForegroundImageView
* ForegroundButton
* ForegroundTextView
* ForegroundImageButton
* ForegroundEditText
* ForegroundWebView
* ForegroundLinearLayout
* ForegroundRelativeLayout
* ForegroundGridLayout
* ForegroundGridView
* ForegroundHorizontalScrollView
* ForegroundListView
* ForegroundScrollView

# Screenshots
![GitHub Logo](https://lh6.googleusercontent.com/-afY-VQnVodw/Vga8AjKwFkI/AAAAAAAAMko/RtCMUSkNsqY/w487-h865-no/Screenshot_20150926-223701.png)

# Setup
Add as a dependency to your ``build.gradle``:
```groovy
repositories {
    maven {
        url 'https://dl.bintray.com/baole/maven'
    }
}
dependencies {
    compile 'com.anttek.foreground.widget:library:1.0.2@aar'
}
```

# Usages

Add Foregroundxxx to your layout.xml

```
        <com.anttek.foreground.widget.ForegroundLinearLayout
            android:layout_width="match_parent"
            android:layout_height="64dp"
            android:foreground="@drawable/foreground">
            //child views
        </com.anttek.foreground.widget.ForegroundLinearLayout>
```
Foreground view supports 3 additional attributes that you can define in layout file

* android:foreground
* android:foregroundInsidePadding
* android:foregroundGravity

Alternatively, you can use Java method to change foreground attributes at runtime:
* setForeground(Drawable)
* setForegroundGravity(int)

Checkout sample app to see more detail

# License
```
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
 ```
