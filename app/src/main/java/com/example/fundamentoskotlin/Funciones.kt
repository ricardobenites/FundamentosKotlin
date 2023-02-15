package com.example.fundamentoskotlin

import kotlin.math.abs

fun main(){
    sayHello()

    newTopic("Argumentos")

    //println(sum(2,3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a, c)}")
    println("$a + $c = ${sum(a, c.enableAbs(true))}")
}

private fun sayHello(): Unit{ //Unit = void
    println("Hola Kotlin")
}

fun sum(a: Int, b: Int): Int{
    return  a +b
}
//optimazado para retornos mas simples
fun sub(a: Int, b: Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this
