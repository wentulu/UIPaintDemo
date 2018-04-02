//
// Created by guoruidong on 2018/3/29.
//

#include<jni.h>
extern"C"

JNIEXPORT jstring JNICALL
Java_com_stu_grd_uipaintdemo_CppHelper_getSecret(JNIEnv *env,jclass type){
    char app_key[] = "JNI CALLBACK";

    return (env)->NewStringUTF(app_key);
}