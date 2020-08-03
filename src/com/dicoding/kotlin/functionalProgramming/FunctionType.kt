package com.dicoding.kotlin.functionalProgramming

typealias Arithmetic = ((Int, Int) -> Int)?

fun main(){
    /*
     * Function Type:
     * ( tipe data parameter ) -> return type
     * jika ingin tidak memiliki return type maka kita dapat menggunakan Unit
     *
     * jika memiliki beberapa fungsi dengan function type yang sama kita bsa menggunakan
     * typealias untuk menyederhanakannya
     * typealias nama functionType = ( tipe data parameter ) -> return type
     *  */

    val sum: Arithmetic = { valueA, valueB -> valueA + valueB}
    val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

    // penggunaan instance function type
    val sumResult = sum?.invoke(10, 10)
    val multiplyResult = multiply?.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)

}