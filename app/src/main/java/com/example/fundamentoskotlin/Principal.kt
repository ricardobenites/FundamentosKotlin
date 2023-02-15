package com.example.fundamentoskotlin

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

}
fun newTopic(topic: String){
    println()
    print("==================")
    print(topic)
    print("==================")

    print("\n================== $topic ==================\n")
}