package org.example

import kotlin.math.*

fun main() {
    //Funkcje anonimowe - nie posiada nazwy, lambda
    var test = { println("Witaj świecie")}
    println(test())
    ///////////////
    test()
    ////////////////
    // funkcja anonimowa I sposób
    var suma: (Int, Int) -> Int = {x, y -> x + y}
    suma(20, 20) // brak wyświetlenia
    println(suma(10, 20))

    // funkcja anonimowa II sposób
    var suma2 = fun(x: Int, y: Int): Int { return x + y } // bez return będzie błąd
    println(suma2(10, 10))

    //
    var suma3 = {x: Int, y: Int -> x + y}
    println(suma3(20, 20))

    // tworzenie nowej powiększonej tablicy
    println("powiększona 2 razy")
    var tablica = listOf(10,20,30)
    var function = {x: Int -> println(x * 2)}
    // słówko it - pojedynczy jeden element wyciągniety z naszej listy
    tablica.forEach{function(it)}

    /////////////////////////
    println("powiększona 3 razy")
    tablica.forEach{item -> println(item * 3)}
    //()nawiasy są pomijane jeżeli nie ma argumentów

    /////////////////////////
    println("FILTER")
    tablica.filter(fun(item) = item % 4 == 0).forEach{item -> println(item)}
    // sposób ze słówkiem it
    tablica.filter(fun(item) = item % 15 == 0).forEach{println(it)}

}
