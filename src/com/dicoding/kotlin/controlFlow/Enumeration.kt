package com.dicoding.kotlin.controlFlow

fun main(){
    // Manual Enumeration
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    colorRed.printValue()
    colorGreen.printValue()
    colorBlue.printValue()

    println()

    // When in Enumeration
    when(colorGreen){
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }


    println()

    // get index position from each Enumeration Object
    println("Position RED is ${colorRed.ordinal}")
    println("Position GREEN is ${colorGreen.ordinal}")
    println("Position BLUE is ${colorBlue.ordinal}")

    println()

    // Using Array<> and loops Enumeration
    val grade: Array<Grade> = Grade.values()
    grade.forEach {grade ->
        grade.printValue()
        println("$grade position is ${grade.ordinal}")
    }

    println()

    // Using loops enumeration
    for (grade in Grade.values()){
        grade.printValue()
        println("$grade position is ${grade.ordinal}")
    }

}

enum class Color( val value: Int){
    RED(0xFF0000){
        override fun printValue() {
            println("Value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("Value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("Value of BLUE is $value")
        }
    };

    abstract fun printValue() // abstract/interface method printValue()
}

enum class Grade(val value: Int){

    A(100){
        override fun printValue() {
            println("Bobot Maksimum Nilai A : $value")
        }
    },
    B(80){
        override fun printValue() {
            println("Bobot Maksimum Nilai B : $value")
        }
    },
    C(60){
        override fun printValue() {
            println("Bobot Maksimum Nilai C : $value")
        }
    },
    D(40){
        override fun printValue() {
            println("Bobot Maksimum Nilai D : $value")
        }
    },
    E(20){
        override fun printValue() {
            println("Bobot Maksimum Nilai E : $value")
        }
    },
    F(0){
        override fun printValue() {
            println("Bobot Maksimum Nilai F : $value")
        }
    };

    abstract fun printValue()
}