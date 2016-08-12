//
// Created by Administrator on 2016/8/3.
//
#include <com_zhakui_ishare_NativeUtils.h>

jstring JNICALL Java_com_zhakui_ishare_NativeUtils_getname(JNIEnv *env, jobject obj)
{
    jstring pszstr = env->NewStringUTF("zhkui");
    return pszstr;
}
