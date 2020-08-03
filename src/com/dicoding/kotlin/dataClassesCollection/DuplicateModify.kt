package com.dicoding.kotlin.dataClassesCollection

class Pengguna(val nama: String, val umur: Int)
data class DataPengguna(val name: String, val umur: Int)

fun main(){
    val dataPengguna = DataPengguna("Audie", 19)
    val dataPengguna2 = dataPengguna.copy()
    val dataPengguna3 = dataPengguna.copy(umur = 20)

    println(dataPengguna2)
    println(dataPengguna3)
}