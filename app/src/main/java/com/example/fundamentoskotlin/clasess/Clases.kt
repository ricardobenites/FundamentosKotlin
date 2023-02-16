package com.example.fundamentoskotlin.clasess

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone: Phone = Phone(1234567)
    phone.showNumber()
    println(phone.number)
}