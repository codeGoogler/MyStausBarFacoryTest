package cn.hook.king.mystausbarfacorytest.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;

public class DensityUtil {
    /**
     * dp转px
     *
     * @param context
     * @param dpVal
     * @return
     */
    public static int dip2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     *
     * @param context
     * @param spVal
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转dp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px转sp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal) {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static float getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }


    public static float getScreenHeight(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }
    public static int getScreenIntWidth(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }


    public static int getScreenIntHeight(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }
    public  static int getStatusHeight(Activity context) {
        Rect frame = new Rect();
        context.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;
        // 获取标题栏高度
        Window window = context.getWindow();
        int contentViewTop = context.getWindow()
                .findViewById(Window.ID_ANDROID_CONTENT).getTop();
        // statusBarHeight是上面所求的状态栏的高度
        int titleBarHeight = contentViewTop - statusBarHeight;
        LogUtil.i("test", "statusBarHeight=" + statusBarHeight + " contentViewTop="
                + contentViewTop + " titleBarHeight=" + titleBarHeight);
        return    contentViewTop;//包括状态栏和标题栏
    }
}