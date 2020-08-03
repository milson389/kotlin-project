package com.dicoding.kotlin.dataClassesCollection

data class PenggunaData(val name: String, val age: Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val penggunaData = PenggunaData("Audie", 20)
    val penggunaData2 = PenggunaData("Milson", 19)

    val nama = penggunaData.component1()
    val umur = penggunaData.component2()
    val (namas, umurs) = penggunaData

    println("My name is $nama, I am $umur years old")
    println("My name is $namas, I am $umurs years old")

    penggunaData2.intro()
}