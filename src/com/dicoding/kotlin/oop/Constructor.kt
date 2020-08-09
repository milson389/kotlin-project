package com.dicoding.kotlin.oop

class Hewan1(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val nama1: String
    val berat1: Double
    val umur1: Int
    val mamalia1: Boolean

    init{
        this.nama1 = pName
        this.berat1 = if (pWeight < 0) 0.1 else pWeight
        this.umur1 = if (pAge < 0) 0 else pAge
        this.mamalia1 = pIsMammal
    }
}