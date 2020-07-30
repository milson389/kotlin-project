package com.dicoding.kotlin.controlFlow

import kotlin.random.Random

fun main(){
    val value = 20

    when(value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("Value cannot be reached")
    }

    val values = 7
    val stringOfValue = when (values){
        6 -> {
            println("Six")
            "Value is 6"
        }
        7 -> {
            println("Seven")
            "Value is 7"
        }
        8 -> {
            println("Eight")
            "Value is 8"
        }
        else ->{
            println("Undefined")
            "Value cannot be reached"
        }
    }

    println(stringOfValue)

    // is / !is untuk memeriksa tipe dari instance
    val anyType: Any = 100L
    when(anyType){
        is Long -> println("the value has a long type")
        is String -> println("the value has a String type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }

    // in / !in untuk mengecek apakah value berada di dalam instace/ jarak yang ditentukan
    val nilai = 27
    val ranges = 10..50

    when(nilai){
        in ranges -> println("value is in range")
        !in ranges -> println("value out of range")
        else -> println("value undefined")
    }

    // fungsi random
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50*regis
        in 51..100 -> 100*regis
        else -> regis
    }

    println(registerNumber)

}

fun getRegisterNumber() = Random.nextInt(100)


