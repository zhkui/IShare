package com.zhakui.ishare;

/**
 * Created by Administrator on 2016/8/3.
 */
public class NativeUtils {
    static {
        System.loadLibrary("NativeUtils");   //defaultConfig.ndk.moduleName
    }
    public native String getname();
}
