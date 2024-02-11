package org.example

import kotlin.math.*

fun main() {
    //operatory logiczne
    val a = 5
    val b = 10
    var x: Boolean
    x = 5 > 5 || a < b // oprator "lub" "OR"  false OR true
    println(x)  //true
    x = 5 > 5 && a < b // oprator "lub" "OR" false AND true
    println(x)  //false
    println(false || false)  //false
    println(false || true)  //true
    println(true || false)  //true
    println(true || true)  //true
    println(false && false)  //false
    println(false && true)  //false
    println(true && false)  //false
    println(true && true)  //true
    // OPERATOR NOT ! - zaprzeczenie
    println(!true)  //false
    println(!false)  //true
    // kolejność wykonywania działań
    // AND - iloczyn logiczny
    // OR - suma logiczna
    println(true || false && false)  //true
    println((true || false) && false)  //false
    println(true || (false && false))  //true
}
