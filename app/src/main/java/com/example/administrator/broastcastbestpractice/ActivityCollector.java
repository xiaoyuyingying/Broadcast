package com.example.administrator.broastcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */

public class ActivityCollector {
    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity (Activity activity){
        activityList.add(activity);
    }

    public static void delActivity (Activity activity){
        activityList.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity : activityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
