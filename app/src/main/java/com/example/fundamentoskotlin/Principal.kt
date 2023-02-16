package com.example.fundamentoskotlin

//constante global, mejor practica
const val separator = "=================="
fun main(){
    //print("Hola Kotlin")
    newTopic("Hola Kotlin")

    newTopic("Variables y Constantes")
    //val a = 2
    val a = true
    println("a = $a")

    //val a = 2
    var b: Int
    b = 5
    println("b = $b")

    var objNull: Any?
    objNull = null
    objNull = "Hi"

    println(objNull)

}
fun newTopic(topic: String){
    /*println()
    print("==================")
    print(topic)
    print("==================")*/

    print("\n $separator $topic $separator \n")
}