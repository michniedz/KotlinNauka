package org.example

import kotlin.math.*

fun main() {
    //wyrażenia IF i WHEN
    val a = 5
    var b = 0
    // val x = a >= 0 ? "Dodatania" : "Ujemna"
    var x = if (a >= 0)  "Dodatania" else "Ujemna"
    println(x)
    x = if (a >= 0) {
        print("Liczba: ")
        "Dodatania"
    } else "Ujemna"
    println(x)
    var y = when{
        b > 0 -> "Dodatania"
        b == 0 -> "Równa 0"
        else -> "Ujemna"
    }
    println(y)
    when(b)
    {
        1 -> println("Jeden")
        2 -> println("Dwa")
        3 -> println("Trzy")
        else -> println("Inna")
    }
}
