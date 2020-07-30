package com.dicoding.kotlin.fundamental

fun main(){
    /* NullPointerException
     * val/var variableName: variableType? = default Value
     */
    val text: String? = null
    if (text != null){
        val textLength = text.length
    }
}