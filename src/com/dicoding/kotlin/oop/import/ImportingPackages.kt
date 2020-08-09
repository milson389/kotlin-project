package com.dicoding.kotlin.oop.import

import com.dicoding.kotlin.functionalProgramming.factorial
import java.lang.Math.pow
import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sqrt
import kotlin.math.sin as Sinus
import kotlin.math.*

fun main(){
    val someInt = Random(0).nextInt(1, 10)
    println(someInt)
    println(PI)
    println(cos(120.0))
    println(Sinus(120.0))
    println(sqrt(9.0))
    println(factorial(4))
    println(pow(3.0, 2.0))
}


