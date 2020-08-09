package com.dicoding.kotlin.generics

// main function
fun main() {
    val longArrayList = ArrayList<Long>()

    val numbers = (1..100).toList()
    print(numbers.slice(1..10))

    val numbers1 = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
}

interface List<T> {
    operator fun get(index: Int): T
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
