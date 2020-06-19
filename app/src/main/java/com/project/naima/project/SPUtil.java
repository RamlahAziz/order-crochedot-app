/**
 * File Name:SPUtil.java
 * Package Name:com.zzkko.util
 * author:yangxiongjie
 * Date:2014-1-17下午4:38:42
 * Copyright (c) 2014, zzkko All Rights Reserved.
 */
package com.project.naima.project;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;


/**
 * simple desrciption
 */
public class SPUtil {
    /**
     * if it's the first time to open this version app
     */
    public static void saveData(Context context, Data data) {
        if (null == context) {
            return;
        }
        try {//# 1676 java.lang.RuntimeException
            SharedPreferences sp = context.getSharedPreferences("Data", Context.MODE_PRIVATE);
            sp.edit().putString("DataInfo", new Gson().toJson(data)).commit();
        } catch (Exception e) {
        }
    }

    public static Data getData(Context context) {
        if (null == context) { // bugtags #470 java.lang.NullPointerException
            return null;
        }

        SharedPreferences sp = context.getSharedPreferences("Data", Context.MODE_PRIVATE);
        return new Gson().fromJson(sp.getString("DataInfo", ""), Data.class);
    }




}
