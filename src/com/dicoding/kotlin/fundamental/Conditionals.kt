package com.dicoding.kotlin.fundamental

fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > openHours){
        "Office already open"
    }else if (now == openHours){
        "Wait a minute, Office will open soon"
    }else{
        "Office is closed"
    }

    println(office)
}