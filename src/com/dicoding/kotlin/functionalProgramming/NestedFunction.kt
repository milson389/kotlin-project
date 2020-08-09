package com.dicoding.kotlin.functionalProgramming

import java.lang.IllegalArgumentException

fun main(){

    println(sum(3, 3, 3))
    println(jumlah(3, 3, 3))
}

// Inner Functions
fun sum(valueA: Int, valueB: Int, valueC: Int): Int{
    fun validateNumber(value: Int){
        if (value == 0){
            throw IllegalArgumentException("value must be greater than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB
}

// Extension Functions
fun jumlah(valueA: Int, valueB: Int, valueC: Int): Int{
    fun Int.validasiAngka(){
        if (this == 0){
            throw IllegalArgumentException("nilai harus lebih besar dari 0")
        }
    }

    valueA.validasiAngka()
    valueB.validasiAngka()
    valueC.validasiAngka()

    return valueA + valueB
}