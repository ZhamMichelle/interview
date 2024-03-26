#include "nativelib_AwesomeLib.h"
#include <iostream>

JNIEXPORT void JNICALL Java_nativelib_AwesomeLib_helloHabr(JNIEnv* env, jobject thisObject)
{
    std::cout << "Hello Habr! This is C++ code!!" << std::endl;
}