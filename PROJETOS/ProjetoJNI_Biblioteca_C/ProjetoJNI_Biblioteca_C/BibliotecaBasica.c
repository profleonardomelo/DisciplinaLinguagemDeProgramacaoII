#include <jni.h>        
#include <stdio.h>      
#include "BibliotecaBasica.h"   

JNIEXPORT void JNICALL Java_Principal_ProgramaJNI_exibirNativo(JNIEnv* env, jobject thisObj) {
	printf("Esta mensagem foi exibida usando o comando \"printf\" da linguagem C.\n");
}