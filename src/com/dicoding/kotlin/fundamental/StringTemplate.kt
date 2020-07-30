package com.dicoding.kotlin.fundamental


fun main(){
    val text = "Kotlin"
    for (char in text){
        print("$char ")
    }

    println()

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}