package com.dicoding.kotlin.functionalProgramming

import java.lang.StringBuilder

fun main(){
    val message = buildString {
        append("Hello ")
        append("From ")
        append("Lambda ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}