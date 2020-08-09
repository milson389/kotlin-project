package com.dicoding.kotlin.functionalProgramming.advCollection

data class Item(val key: String, val value: Any)

fun main(){
    /**
     * Distinct function, used to display non duplicate value inside collections
     * Distinct similar with how sets works
     * Distinct cannot be applied to map
     */

    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()

    println(distinct)

    val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "is"),
            Item("3", "Awesome"),
            Item("3", "as"),
            Item("3", "Programming"),
            Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key } // display non duplicate key inside the data class
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    } // display all that has been filtered with the distinct functions

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy { it.length } // display non duplicate item length inside the collection
    println(distinct2)
}