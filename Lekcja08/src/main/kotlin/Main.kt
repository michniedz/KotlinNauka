package org.example

import kotlin.math.*

fun main() {
    //pętla while, do-while
    var a = 5
    var b = 0
    while(b < 5){
        b++
        println("b= $b")
    }
    do{
        println("a= $a")
        a--
    }while(a != 0)
}
