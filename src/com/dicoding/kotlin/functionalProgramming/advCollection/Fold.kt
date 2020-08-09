package com.dicoding.kotlin.functionalProgramming.advCollection

fun main(){

    /**
     * Koltin Fold function
     * the list item value are from the first index to last
     * automatically add list item value with the value inside the fold function value
     * foldRight(), automatically add list item value from the last index to the first index
     * e.g: val numbers = listOf(1, 2, 3)
     *      val fold = numbers.fold(10){ current, item ->
     *          println("Current $current")
     *          println("Item $item")
     *          println()
     *          current + item
     *      }
     *      println("Fold Result: $fold")
     */

    val angka = listOf(1, 2, 3, 4, 5)
    val fold = angka.fold(20){ current, item ->
        println("Current $current")
        println("Item $item")
        println()
        item + current
    }
    val foldReverse = angka.foldRight(20){ current, item ->
        println("Current $current")
        println("Item $item")
        println()
        item + current
    }

    println(fold)
    println(foldReverse)


}