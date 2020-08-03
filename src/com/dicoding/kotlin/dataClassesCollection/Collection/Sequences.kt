package com.dicoding.kotlin.dataClassesCollection.Collection

fun main(){
    // Sequence merupakan lazy evaluation
    val list = (1..1000000).toList()
    /** List eager evaluation, memakan banyak waktu
     *  list.filter { it % 5 == 0 }.map { it * 2 }.forEach{ println(it)}
     */
    // List as sequence lazy evaluation, lebih efficient waktu
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach{ println(it)}

    /*
     * Membuat objek sequence
     * menggunakan generateSequence(){}
     * parameter pertama merupakan item pertama yang ada di dalam collection
     * parameter kedua merupakan lambda expression yang berisi perubahan pada masing masing item
     * kemudian untuk menghindari infinite loop tambahkan fungsi take()
     * nama variabel objek sequence.take(banyak nya perubahan yang dilakukan di lambda expression)
     *  */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}