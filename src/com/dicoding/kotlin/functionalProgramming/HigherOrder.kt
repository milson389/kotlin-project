package com.dicoding.kotlin.functionalProgramming

fun main(){
    printResult(10, sum)
    cetakHasil(20, kuadrat)

    printResult(10){value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value+value}

fun cetakHasil(value: Int, jumlah: (Int) -> Int){
    val hasil = jumlah(value)
    println(hasil)
}

var jumlah: (Int) -> Int = { value -> value + value}
var kuadrat: (Int) -> Int = { value -> value*value}