package com.dicoding.kotlin.dataClassesCollection.Collection

fun main(){
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 1. Fungsi filter(), dan filterNot()
    val oddList = numList.filterNot { it%2 == 0 }
    val evenList = numList.filter { it%2 ==0 }

    println(oddList)
    println(evenList)

    // 2. Fungsi map()
    val mutlipliedBy5 = numList.map { it*5 }
    println(mutlipliedBy5)

    // 3. Fungsi count(), menghitung jumlah item yang ada di dalam collection
    println(numList.count())
    println(numList.count { it%3 == 0 }) // menghitung jumlah item yang ada di collection yang habis dibagi 3

    // 4. Fungsi find(), firstOrNull(), lastOrNull()
    val firstOddNumber = numList.find { it%2 == 1 }
    val lastOrNullOddNumber = numList.lastOrNull { it%2 == 1 }
    val firstOrNullNumber = numList.firstOrNull{it%2 == 3}

    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNullOddNumber)

    // 5. Fungsi first(), dan last()
    val moreThan5 = numList.first { it > 5 }
    println(moreThan5)

    // 6. Fungsi sum(), menghitung jumlah nilai yang ada di dalam list
    val total = numList.sum()
    println(total)

    // 7. fungsi sorted(), sortedDescending()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(ascendingSort)
    println(descendingSort)

}