package cn.hook.king.mystausbarfacorytest.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ArrayRes;

import java.util.ArrayList;
import java.util.List;

public class ActivityUtils {
    /**
     * skip to @param(cls)，and call @param(aty's) finish() method
     */
    public static void skipActivity(Activity aty, Class<?> cls) {
        showActivity(aty, cls);
        aty.finish();
    }

    /**
     * skip to @param(cls)，and call @param(aty's) finish() method
     */
    public static void skipActivity(Activity aty, Intent it) {
        showActivity(aty, it);
        aty.finish();
    }

    /**
     * skip to @param(cls)，and call @param(aty's) finish() method
     */
    public static void skipActivity(Activity aty, Class<?> cls, Bundle extras) {
        showActivity(aty, cls, extras);
        aty.finish();
    }

    /**
     * show to @param(cls)，but can't finish activity
     */
    public static void showActivity(Context aty, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(aty, cls);
        aty.startActivity(intent);
//        AnimationUtil.showNext(aty);
    }

    /**
     * show to @param(cls)，but can't finish activity
     */
    public static void showActivity(Activity aty, Intent it) {
        aty.startActivity(it);
//        AnimationUtil.showNext(aty);
    }

    /**
     * show to @param(cls)，but can't finish activity
     */
    public static void showActivity(Context aty, Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.setClass(aty, cls);
        aty.startActivity(intent);
//        AnimationUtil.showNext(aty);
    }
    /**
     * show to @param(cls)，but can't finish activity
     */
    public static void showActivityForResult(Activity aty, Class<?> cls, Bundle bundle, int requestCode) {
    	Intent intent = new Intent();
    	if(bundle!=null){
    		intent.putExtras(bundle);
    	}
    	intent.setClass(aty, cls);
    	aty.startActivityForResult(intent, requestCode);
//    	AnimationUtil.showNext(aty);
    }
    /**
     * show to @param(cls)，but can't finish activity
     */
    public static void showActivityForResult(Activity aty, Class<?> cls, int requestCode) {
    	Intent intent = new Intent();
    	intent.setClass(aty, cls);
    	aty.startActivityForResult(intent, requestCode);
//    	AnimationUtil.showNext(aty);
    }

    /**
     * extends 权限获取的 activity
     */
   public static List<Activity> permissionActivilyList = new ArrayList<>();
    public static void addPermissionActivty(Activity activty){
        if(permissionActivilyList.contains(activty)){
            permissionActivilyList.remove(activty);
            permissionActivilyList.add(activty);
        }else{
            permissionActivilyList.add(activty);
        }
    }
    public static void removePermissionActiivty(Activity activty){
        if(permissionActivilyList.contains(activty)){
            permissionActivilyList.remove(activty);
        }
    }
}
