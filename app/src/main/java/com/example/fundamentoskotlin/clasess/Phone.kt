package com.example.fundamentoskotlin.clasess

class Phone (val number:Int){
    fun call(){
        println("Llamando...")
    }

    fun showNumber(){
        println("Mi numero es $number")
    }
}