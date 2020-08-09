package com.dicoding.kotlin.oop.exception

import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(){
    val someNullValue: String? = null
    var someIntValue: Int = 0
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    }catch (e: Exception){
        someMustNotNullValue = "String has Null value"
        println(someMustNotNullValue)
    }finally {
        println(someMustNotNullValue)
    }

    try {
        someIntValue = someNullValue!!.toInt()
    }catch (e: NullPointerException){
        someIntValue = 0
    }catch (e: NumberFormatException){
        someIntValue = -1
    }finally {
        when(someIntValue){
            0 -> println("NullPointerException")
            -1 -> println("NumberFormatException")
            else -> println(someIntValue)
        }
    }

}