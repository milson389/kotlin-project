package com.dicoding.kotlin.controlFlow

fun main(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt){
        print("$i ")
    }

    println()

    // continue, to skip value that full filled the condition
    for (i in listOfInt){
        if (i == null){
            continue
        }else{
            print("$i ")
        }
    }

    println()

    // break, to stop the program from continuing
    for (i in listOfInt){
        if (i == null){
            break
        }else{
            print("$i ")
        }
    }

    println()

    // labeling
    loop@ for(i in 1..10){
        println("Outside Loop")
        for (j in 1.rangeTo(10)){
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}