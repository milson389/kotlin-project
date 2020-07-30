package com.dicoding.kotlin.fundamental

fun main(){
    // Hello World!
    // println("Hello World!")

    // declare variable
    val name = "Audie"
    print("Hello my name is ")
    println(name)

    /* var vs val
     * var valuenya bisa diubah lagi
     * val valuenya tidak bisa diubah lagi, mirip const
     * */

    /* Inisialiasi variable
     * val/var nama variable: Identifier = value
     * Identifier tidak wajib
     * */

    // 1. String
    val company: String = "Dicoding"
    println(company)
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    println(firstWord + lastWord)

    // 2. Integer
    val valueA: Int = 10
    val valueB: Int = 20
    println(valueA + valueB)

    // 3. Char
    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)





}