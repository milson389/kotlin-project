package com.dicoding.kotlin.controlFlow

fun main(){
    val jarak = 1..5
    for (i in jarak){
        println("value is $i")
    }

    println()

    // fungsi withIndex() untuk mengakses indeks setiap elemen pada ranges
    val distance = 1.rangeTo(10) step 3
    for ((index, value) in distance.withIndex()){
        println("value $value with index $index")
    }

    println()

    /* fungsi forEachIndexed
     * jika memakai fungsi ini tapi hanya ingin menampilkan index maka ganti parameter kedua dengan '_'
     *  */

    distance.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}