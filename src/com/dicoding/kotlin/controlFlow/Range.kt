package com.dicoding.kotlin.controlFlow

fun main(){
    /* Range
     * representasi range : '..' atau 'rangeTo()' atau 'downTo()'
     * fungsi step untuk menghitung/ memasukan selisih
     */

    val rangeInt = 1..10 step 2
    rangeInt.forEach{
        print("$it ")
    }

    println()

    val rangesInt = 1.rangeTo(10) step 2
    rangesInt.forEach{
        print("$it ")
    }

    println()

    val downInt = 9.downTo(1) step 2
    downInt.forEach{
        print("$it ")
    }

    println("\n${rangeInt.step}")

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne){
        println("Value 7 available")
    }else{
        println("Value 7 unavailable")
    }

    val rangeChar = 'A'.rangeTo('Z')
    rangeChar.forEach{
        print("$it ")
    }
}