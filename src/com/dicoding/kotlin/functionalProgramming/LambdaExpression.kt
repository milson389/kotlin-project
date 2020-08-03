package com.dicoding.kotlin.functionalProgramming

fun main(){
    message()
    printMessage("Hello From Lambda")
    val length = messageLength("Hello From Lambda")
    println("Message length $length")
}

// Lambda Expression Function
val message = { println("Hello from Lambda")}

// Lambda Expression with parameter
val printMessage = {message: String -> println(message)}
val messageLength = { message: String -> message.length}