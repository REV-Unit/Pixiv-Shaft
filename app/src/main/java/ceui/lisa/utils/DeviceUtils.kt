package ceui.lisa.utils

import android.content.Context
import android.content.res.Configuration
import android.view.WindowManager

object DeviceUtils {
    fun isTablet(context: Context): Boolean =
        (context.resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE

    fun isLandscape(context: Context): Boolean =
        context.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    // Unit: pix
    fun getDeviceWidth(context: Context):Int=
        (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.width
}