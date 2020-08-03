package com.dicoding.kotlin.dataClassesCollection.Collection

import com.dicoding.kotlin.dataClassesCollection.EndUser

fun main(){
    /*
     * 1. List
     *  val/var nama variable: identifier = listOf(element anggota list)
     *  identifier tidak wajib
     *  tipe list ada 2 : mutable dan immutable, format di atas merupakan immutable list
     *  untuk menerapkan mutable list kita dapat menggunakan mutableListOf()
     * */

    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    val anyList = listOf('a', "kotlin", 3, true, EndUser())
    println(anyList[4])

    val muList = mutableListOf('a', "kotlin", 3, true, EndUser())
    // operasi yang dapat dilakukan di mutable list
    muList.add('d') // menambahkan item di akhir list
    muList.add(1, "Love") // menambahkan item di index 1
    muList[3] = false // mengubah nilai item pada index ke 3
    muList.removeAt(1) // menghapus elemen pada index 1

    for ( any in muList){
        println("$any")
    }
}