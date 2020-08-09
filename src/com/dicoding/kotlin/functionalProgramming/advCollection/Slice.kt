package com.dicoding.kotlin.functionalProgramming.advCollection

fun main(){
    /**
     * Slice function, used to display certain position and usually the arguments are range
     * the arguments inside slice functions are the index position of item that will be displayed
     */

    val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val index = listOf(2, 3, 5, 8)

    val slice = total1.slice(3..6)
    val slice1 = total1.slice(index)
    val slice2 = total1.slice(3..6 step 2)

    println(slice) // print item with index between 3 till 6
    println(slice1) // print item with index 2, 3, 5, 8
    println(slice2) // print item with index 3, 5
}