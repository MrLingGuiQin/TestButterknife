package qin.gui.ling.com.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * ***************************************
 * statement:
 * auther: lingguiqin
 * date created : 2017/6/9 0009
 * ***************************************
 */

public class ToastHelper {
    private static Toast mToast;

    public static void showMsg(Context context, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_LONG);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
