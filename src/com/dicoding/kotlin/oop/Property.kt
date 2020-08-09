package com.dicoding.kotlin.oop

class Hewan{
    var nama = "Dicoding Miau"
        get() {
            println("fungsi getter")
            return field
        }
        set(value) {
            println("fungsi setter")
            field = value
        }
}

fun main(){
    val kucingDicoding = Hewan()
    println("Nama: ${kucingDicoding.nama}")
    kucingDicoding.nama = "Goose"
    println("Nama: ${kucingDicoding.nama}")

}