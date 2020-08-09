package com.dicoding.kotlin.functionalProgramming.advCollection

fun main(){
    /**
     * Take functions, used to display how many items in collection to display from first index to the indexed
     * takeLast, used to display how many items in collection from last to the indexed
     */

    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)
    val takeReversed = total.takeLast(3)

    println(take)
    println(takeReversed)
}