package com.dicoding.kotlin.functionalProgramming

typealias Aritmethic = (Int, Int) -> Int

var pesan2 = "Kotlin"

fun main(){
    val operasiPenjumlahan: Aritmethic = ::penjumlahan
    println(operasiPenjumlahan(10, 10))

    val angka = 1.rangeTo(10)
    val angkaGenap = angka.filter(::isEvenNumber)
    val angkaGanjil = angka.filter(::isOddNumber)

    println(angkaGenap)
    println(angkaGanjil)

    println(::pesan2.name)
    println(::pesan2.get())


}

fun penjumlahan(valueA: Int, valueB: Int): Int{
    return valueA + valueB
}

fun isEvenNumber(number: Int) = number % 2 == 0
fun isOddNumber(number: Int) = number % 2 == 1