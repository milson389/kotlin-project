package com.dicoding.kotlin.fundamental

fun main(){
    /* Fungsi Konversi
     * toByte()
     * toShort()
     * toInt()
     * toLong(), biasa value dari varialbe long berakhiran 'L' (e.g: 100L)
     * toFloat()
     * toDouble()
     * toChar()
     * */

    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

    println(intNumber)

    val stringNumber = "23"
    val intNumbers = 3

    println(intNumbers + stringNumber.toInt())

    val readableNumber = 1_000_000
    println(readableNumber)

}