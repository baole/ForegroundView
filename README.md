# BoundedView
A collection of Android bounded views which constraint in boundedWidth/boundedHeight. This library helps to resolve android:maxWidth and layout_width="match_parent" not working together.
Support following views and viewgroups
* BoundedImageView
* BoundedButton
* BoundedTextView
* BoundedImageButton
* BoundedEditText
* BoundedWebView
* BoundedLinearLayout
* BoundedRelativeLayout
* BoundedGridLayout
* BoundedGridView
* BoundedHorizontalScrollView
* BoundedListView
* BoundedScrollView


# Setup
Add as a dependency to your ``build.gradle``:
```groovy
repositories {
    maven {
        url 'https://dl.bintray.com/baole/maven'
    }
}
dependencies {
    compile 'com.anttek.bounded:library:1.0@aar'
}
```

# Usages

Add Boundedxxx to your layout.xml

```
    <com.anttek.boundedview.BoundedLinearLayout
        android:layout_width="match_parent"
        app:boundedHeight="100dp"
        app:boundedWidth="100dp"
        android:layout_height="match_parent"
        android:background="#ffff00"/>
```
Bounded view supports 3 additional attributes that you can define in layout file

* android:boundedWidth
* android:boundedHeight

This library supports for common views included in Android SDK. If you need to implement for others views
such as in support library, using BoundedViewHelper. See BoundedLinearLayout as an example.

Checkout sample app to see more detail

# License
```
/*
 * Copyright (C) 2016  Bao Le Duc
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
