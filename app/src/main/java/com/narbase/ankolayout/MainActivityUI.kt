package com.narbase.ankolayout

import android.widget.ImageView
import org.jetbrains.anko.*

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        relativeLayout {
            imageView(R.drawable.kotlin_android) {
                scaleType = ImageView.ScaleType.CENTER_CROP
            }.lparams(width = matchParent, height = matchParent)
            textView(R.string.narbase_loves_kotlin) {
                textSize = 34f
            }.lparams(width = wrapContent, height = wrapContent) {
                centerHorizontally()
                alignParentBottom()
            }
        }
    }
}