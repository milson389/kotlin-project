package com.dicoding.kotlin.dataClassesCollection.Collection

fun main(){
    /*
     * 3. Maps ( immutable )
     * val / var nama variable = mapOf(
     *      key to value,
     *      key to value
     * )
     * untuk membuat sebuah map menjadi mutable kita bisa menggunakan fungsi toMutableMap()
     *  */

    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    // mencetak value dari sebuah key
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    // mencetak seluruh key yang ada di sebuah maps
    val mapKeys = capital.keys
    println(mapKeys)

    // mencetak seluruh value yang ada di sebuah maps
    val mapValues = capital.values
    println(mapValues)

    // mutable Maps, tidak direkomendasikan
    val mutableCapital = capital.toMutableMap()

    // menambahkan key dan value baru ke dalam mutable maps
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)

}