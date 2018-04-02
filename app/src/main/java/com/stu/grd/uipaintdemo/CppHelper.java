package com.stu.grd.uipaintdemo;

/**
 * Created by guoruidong on 2018/3/29.
 */

public class CppHelper {

    static{
        System.loadLibrary("ui-paint-demo");
    }
    public static final  native String getSecret();

}
