package com.dicoding.kotlin.functionalProgramming.advCollection

fun main(){
    /**
     * Drop function, used to drop/remove how many items inside a collection from the first item till the indexed item
     * dropLast(), used to drop how many items inside collection from last index till the indexed item
     */
    val angka = listOf(1, 2, 3, 4, 5, 6)
    val drop = angka.drop(3)
    val dropReverse = angka.dropLast(3)

    println(drop)
    println(dropReverse)
}