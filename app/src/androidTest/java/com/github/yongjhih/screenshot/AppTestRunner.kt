package com.github.yongjhih.screenshot

import android.os.Bundle
import com.facebook.testing.screenshot.ScreenshotRunner
import android.support.test.runner.AndroidJUnitRunner


/**
 * Created by yongjhih on 1/9/17.
 */
class AppTestRunner : AndroidJUnitRunner() {
    override fun onCreate(args: Bundle) {
        ScreenshotRunner.onCreate(this, args)
        super.onCreate(args)
    }

    override fun finish(resultCode: Int, results: Bundle) {
        ScreenshotRunner.onDestroy()
        super.finish(resultCode, results)
    }
}
