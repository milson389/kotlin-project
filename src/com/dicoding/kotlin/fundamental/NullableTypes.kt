package com.dicoding.kotlin.fundamental

fun main(){
    /* NullPointerException
     * val/var variableName: variableType? = null
     */
    val text: String? = null
    if (text != null){
        val textLength = text.length
    }
}