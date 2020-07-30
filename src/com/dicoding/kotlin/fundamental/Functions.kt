package com.dicoding.kotlin.fundamental

fun main(){
    /* Kotlin functions
     *  fun functionName(param1: type1, param2: type2, paramN: typeN, ....): Return type{
     *      return result
     *  }
     * */

    fun setUser(name: String, age: Int){
        // non return type function, similar to void function in Java
        println("My name is $name, and I am $age years old")
    }

    fun setUser1(name: String, age: Int): String{
        // return String type
        return "My name is $name, and I am $age years old"
    }

    println(setUser1("Audie", 20))
    setUser("Milson", 19)
}