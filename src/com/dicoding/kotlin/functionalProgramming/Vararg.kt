package com.dicoding.kotlin.functionalProgramming

fun main(){
    /*
     * variables argument, menyederhanakan fungsi dalam kotlin
     * dengan menggunakan vararg, function bisa memiliki banyak parameter untuk tipe data yang sama
     */
    val number = sumNumbers(10, 20, 30, 40)
    val angka = getNumberSize(10, 20, 30, 40, 50)
    sets(10, 20, 30, 40, 50, 60, name = "Unit SSD")
    println(number)
    println(angka)

    // memasukkan array ke dalam vararg dengan spread operator (*)
    val numbers = intArrayOf(10, 20, 30, 40)
    paket(10, 20, 20, *numbers, 10)

}

fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int{
    return number.size
}

fun sets(vararg number: Int, name: String){
    println("Daftar: $name, Total: ${number.sum()}")
}

fun paket(vararg number: Int){
    println(number)
}