package com.dicoding.kotlin.functionalProgramming

import java.lang.StringBuilder

fun main(){
    // 1. run(), inisialisasi dan perhitungan nilai kembalian
    val text = "Hello"
    val result = text.run{
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println(result)

    // 2. with()
    val message = "Hello Kotlin!"
    val hasil = with(message){
        println("$this")
        "Karakter pertama adalah ${this[0]} dan karakter terakhir adalah ${this[this.length-1]}"
    }

    println(hasil)

    // 3. apply()
    var builder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(builder.toString())

    // 4. let()
    val pesan: String?= null
    pesan?.let {
        val length = it.length*2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    // 5. also()
    val pesan1 = "Hello Kotlin"
    val result1 = pesan1.also {
        println("Value length -> ${it.length}")
    }

    println("Text -> $result1")
}