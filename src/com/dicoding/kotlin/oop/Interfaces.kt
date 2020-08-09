package com.dicoding.kotlin.oop

interface IFly{
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int): IFly{
    override fun fly() {
        if (numberOfWings > 0){
            println("Flying with $numberOfWings wings")
        }else{
            println("Flying without wings")
        }
    }
}

fun main(){
    val burung = Bird(2)
    burung.fly()
}