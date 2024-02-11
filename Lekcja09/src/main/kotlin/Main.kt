package org.example

import kotlin.math.*

fun main() {
    //instrukcje skoku break i continue
    var a = 5

    while(true)   //pętla nieskończona
    {
        if(a == 0)
            break   //przerwanie działania pętli
        println("a= $a")
        a--
    }
    println("##################")
    var b = 0
    while(b < 10)
    {
        b++
        if(b == 5 || b == 7)
            continue   //pominięcie

        println("b= $b")
    }
}
