package com.dicoding.kotlin.oop

class Animal(
        val name: String,
        val weight: Double,
        val age: Int,
        val isMammal: Boolean
){
    fun eat(){
        println("$name makan!")
    }

    fun sleep(){
        println("$name tidur!")
    }
}

fun main(){
    val dicodingCat =Animal("DicodingMiau", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}