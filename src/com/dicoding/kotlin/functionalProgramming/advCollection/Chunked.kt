package com.dicoding.kotlin.functionalProgramming.advCollection

fun main(){
    /**
     * chunked() functions similar to split() functions
     * the result from chunked function will be an array
     * chunked function arguments are how we split the string into char
     */
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)

    val chunkedTransform = word.chunked(3){
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}