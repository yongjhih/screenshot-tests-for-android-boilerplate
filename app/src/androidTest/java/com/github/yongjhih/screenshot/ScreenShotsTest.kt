package com.github.yongjhih.screenshot

import android.support.test.InstrumentationRegistry
import android.support.test.filters.LargeTest
import android.view.LayoutInflater
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import android.support.test.runner.AndroidJUnit4
import org.junit.runner.RunWith
import org.junit.Test

/**
 * Created by yongjhih on 1/9/17.
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class ScreenShotsTest() {

    @Test
    fun main() {
        val inflater = LayoutInflater.from(InstrumentationRegistry.getTargetContext())
        val view = inflater.inflate(R.layout.activity_main, null, false)

        ViewHelpers.setupView(view)
                .setExactWidthDp(450)
                .setExactHeightDp(800)
                .layout()

        Screenshot.snap(view)
                .record()
    }
}
