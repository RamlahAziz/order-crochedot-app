package com.project.naima.project;

/**
 * Created by C_v on 10/28/2017.
 */


import android.util.SparseArray;
import android.view.View;

/**
 * Created by Jiangwenjin on 2015/12/8.
 */
public class TagHelper {
    public static final int TAG_VIEW_HOLDER = 1; // viewholder
    public static final int TAG_PRIVATE = 2; // is private
    public static final int TAG_HANDLER = 3; // handler
    public static final int TAG_FOOTER = 4; // if set footer
    public static final int TAG_UIL = 5; // uil url
    public static final int TAG_LOCAL_IMAGE = 6; // 本地相册
    public static final int TAG_INDEX = 10; // index、position
    public static final int TAG_LABEL = 20; // label id
    public static final int TAG_ITEM = 21; // userinfo
    public static final int TAG_GIFT = 22; // giftinfo
    public static final int TAG_USER_TASK = 23; //
    public static final int TAG_FOLLOW_TALENT = 24; //

    private TagHelper() {
    }

    public static Object getTag(View v, int key) {
        if (null == v) {
            return null;
        }

        Object o = v.getTag();
        if (null == o) {
            return null;
        }

        if (o instanceof SparseArray) {
            return ((SparseArray) o).get(key);
        }

        return o;
    }

    public static boolean setTag(View v, int key, Object value) {
        if (null == v) {
            return false;
        }

        Object o = v.getTag();
        SparseArray sa;
        if (null == o) {
            sa = new SparseArray();
        } else {
            sa = (SparseArray) o;
        }

        sa.put(key, value);
        v.setTag(sa);
        return true;
    }

}