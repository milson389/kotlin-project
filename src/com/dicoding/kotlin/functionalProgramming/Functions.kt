package com.dicoding.kotlin.functionalProgramming

fun main(){
    val fullName = getFullName(first = "Kotlin", middle = "is", last = "Awesome")
    val fullNames = getFullNames()
    val namaLengkap = getFullNames(first = "Dicoding")
    println(fullName)
    println(fullNames)
    println(namaLengkap)
}

// 1. Named Arguments
fun getFullName(first: String, middle: String, last: String): String{
    return "$first $middle $last"
}

// 2. Default Arguments
fun getFullNames(
        first: String = "Koltin",
        middle: String = " is ",
        last: String = "Awesome"): String{
    return "$first$middle$last"
}