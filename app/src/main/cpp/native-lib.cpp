#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_secureapi_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_secureapi_viewmodel_MyViewModel_getToken(
        JNIEnv *env, jobject /* this */) {
    std::string token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhaSI6ImdBQUFBQUJkTjk0bTRYVktjcWFqQk1KbjFWWWh2ZW5TSFRqUXdGUDloUDM4QjNIdk14Y3hwUkprbmVzc1pUSWk1SjNKLUJZc3hqZ3RQd1BWcGV1SDZVdTB4SzRlX2g3S0JaRWZKTEJNMkxoUXZ1MjlnNXVuT3F3PSIsImJpIjoiZ0FBQUFBQmROOTRtWGJISzMwWk5vdmtVMDJub0VLdHdQU0pnWkNkd0tDa3Zma2lPbVhobzJzVEFhbTlLbHJPTnVaLWd2SlZjNzBsSEpMTjRxUTdnMGd5N0lWYzBBXzk2czdpQ09PMFlOVloxeDRlMXQ4MGhzWUllbVNISGszX2tNZjBCVm1VcGRIRXkyRzNGQlRSc2tTYVFITEtSa1NDUm03N290M3p6M3dtdnlkeVQ1OU52MGJBPSJ9.e6s_qxHA6c91S6AMMAJcr_LWUhKm-GgwzP8NerRk-TI";
    return env->NewStringUTF(token.c_str());
}
