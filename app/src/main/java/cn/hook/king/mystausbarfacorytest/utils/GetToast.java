package cn.hook.king.mystausbarfacorytest.utils;

import android.content.Context;
import android.widget.Toast;

public class GetToast {
	private static Toast toast = null;
	public static Toast useString(Context context, String string) {
		if (context == null)
			return null;
		if(toast == null){
			toast = Toast.makeText(context,string,Toast.LENGTH_SHORT);
		}else{
			toast.setText(string);
		}
		toast.show();
		return toast;
	}

	public static Toast useid(Context context, int id) {
		if (context == null)
			return null;
		if(toast == null){
			toast = Toast.makeText(context,id,Toast.LENGTH_SHORT);
		}else{
			toast.setText(id);
		}
		toast.show();
		return toast;
	}
	public static Toast setToastPosition(int grivity){
		if(toast == null){
			return null;
		}
		toast.setGravity(grivity, 0, 0);
		return toast;
	}


}
