package com.dicoding.kotlin.functionalProgramming

fun main(){
    println(manualFactorial(4))
    println(factorial(4))
    println(faktorial(4))
}

fun manualFactorial(n: Int): Int{
    return if (n == 1){
        n
    }else{
        var result = 1
        for (i in 1..n){
            result *= i
        }
        result
    }
}

fun factorial(n: Int): Int{
    return if (n == 1){
        n
    }else{
        n * factorial(n - 1)
    }
}

// tail rec recursion , to prevent java.lang.StackOverflowError
tailrec fun faktorial(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if (n == 1){
        n
    }else{
        n * faktorial(n -1, newResult)
    }
}