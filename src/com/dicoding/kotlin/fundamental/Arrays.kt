package com.dicoding.kotlin.fundamental

fun main(){
    /* function arrayOf()
     *  intArrayOf()
     *  booleanArrayOf()
     *  charArrayOf()
     *  longArrayOf()
     *  shortArrayOf()
     *  byteArrayOf()
     *  */
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)
    val intArray = Array(4, {i -> i*i})

    for (int in intArray){
        print("$int ")
    }

}