package org.example

import kotlin.math.*

fun main() {
    //Tablice

    // tablica z danymi
    var tab1 = arrayOf(1,5,10,20,15,"Placek","kotlin",true)
    var tab2: Array<Any> = arrayOf(1,5,10,20,15,"Placek","kotlin",true)

    // tablica z danymi typu integer
    var tab3 = arrayOf<Int>(1,5,10,20,15)
    var tab4: Array<Int> = arrayOf(1,5,10,20,15)
    var tab5 = intArrayOf(1,5,10,20,15)
    var tab6: IntArray = intArrayOf(1,5,10,20,15)

    var tab7 = IntArray(5)
    var tab8 = Array(5, {i -> i}) // elementy tablicy jako indeksy
    for(n in tab8)
    {
        println(n)
    }
    ////////////////////////////////////
    println("Wartość indeksu 1: " + tab1.get(1))
    println("Wartość indeksu 2: " + tab1[2])

    tab8.set(0, 100) // wstawienie do tab8 wartości 100 na pierwszym miejscu (indeks 0)
    tab8[0] = 99 // zmiana wartości indeksu 0 ze 100 na 99
    for(n in tab8)
    {
        println(n)
    }
    // ilość elementów tablicy
    println("Ilość elementów: " + tab8.size)

    //wypisywanie indeksów z tablicy
    for(n in tab8.indices)
    {
        println(n.toString() + ": " + tab8[n]) // n - indeks, tab8[n] - wartość tablicy o indeksie n
    }
}
