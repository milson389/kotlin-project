package com.dicoding.kotlin.dataClassesCollection.Collection

fun main(){
    /*
     * 2. Sets
     * val / var nama variable = setOf(element anggota sets)
     * sets tidak menampilkan anggota elemen yang merupakan duplikat
     *  */

    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    // membandingkan isi dari 2 set
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    // mengecek apakah sebuah nilai terdapat di dalam sets
    println(5 in setA)

    // fungsi untuk menggabungkan 2 buah set, union() dan fungsi untuk mendapatkan irisan dari 2 buah set, intersect()
    val  setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // fungsi add dan remove pada sets, tidak seperti list, elemen dalam set tidak dapat diubah valuenya
    val setD = mutableSetOf(1, 2, 4, 2, 1, 5)
    setD.add(6) // menambahkan item di akhir set
    setD.remove(1) // menghapus elemen yang bernilai 1
    println(setD)

}