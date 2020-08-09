package com.dicoding.kotlin.oop.inheritance

/**
 * to make super/parent class we need to make open class
 * we need to declare open class because in the default the class is final
 */


open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    open fun eat(){
        println("$name is eating!")
    }

    open fun sleep(){
        println("$name is sleeping!")
    }
}

class Cat(
        pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean,
        val furColor: String, val numberOfFeet: Int): Animal(pName, pWeight, pAge, pIsCarnivore){

    fun playWithHuman(){
        println("$name is playing with humans")
    }

    override fun eat() {
        println("$name is eating fish!")
    }

    override fun sleep() {
        println("$name is sleeping on the pillow!")
    }
}

fun main(){
    val dicodingCat = Cat("Dicoding Miau", 3.2, 2, true, "Brown", 4)
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}