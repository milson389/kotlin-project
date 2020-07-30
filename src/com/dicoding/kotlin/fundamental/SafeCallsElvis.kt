package com.dicoding.kotlin.fundamental

fun main(){

    /* Safe calls operator
     * tidak langsung menggunakan function
     * mengganti (.) dengan (?.)
     * non-null assertion ( !! ) = mengakses/mengelola nilai dari sebuah objek nullable tpi akan NPE
     *  */
    val teks: String? = null
    println(teks?.length)

    /* Elvis operator
     * menetapkan default value jika objek bernilai null
     */
    val texts: String? = null
    val textsLength = texts?.length ?: 7
    println(textsLength)

    // non-null assertion ( !! )
}