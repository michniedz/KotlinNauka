package org.example

import kotlin.math.*

fun main() {
    //pętla FOR
    var tab1 = arrayOf(1, 4, 5, 10, 100)

    // wypisanie wszystkich elementów z tab1
    for(i in tab1)
    {
        println(i)
    }
    // wypisanie wszystkich elementów z tab1 oraz indeksów
    for(i in tab1.withIndex())
    {
        println(i)
    }
    for((i, w) in tab1.withIndex())
    {
        println("$i: $w")
    }
    // wypisanie liter ze stringa
    for(i in "Lekcja 11")
    {
        println(i)
    }
    // zakresy włącznie z 10
    println("----------")
    for (i in 1..10)
    {
        println(i)
    }
    // zakresy bez 10
    println("----------")
    for (i in 1 until 10)
    {
        println(i)
    }
    // zakresy bez 10
    println("----------")
    for (i in 10 downTo  1)
    {
        println(i)
    }
    // zakresy włącznie z 10 co 2 element
    println("----------")
    for (i in 1..10 step 2)
    {
        println(i)
    }
}
