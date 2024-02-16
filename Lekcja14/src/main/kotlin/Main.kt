package org.example

import kotlin.math.*

fun main() {
    //Funkcje wyższego rzędu
    //I sposób - funkcja anonimowa wyrażenia lambda
    var dodawanie = suma(10, 2) {x -> "Suma= $x"}
    println(dodawanie)

    //II sposób - funkcja anonimowa z użyciem słówka fun
    dodawanie = suma(1, 20, fun(x): String {return "wynik: $x"})
    println(dodawanie)

    //przeciążenie funkcji suma
    println(suma(2,3){a, b, c -> "$a + $b: $c"})
}
fun suma(x: Int, y: Int, function: (Int) -> (String)): String
{
    return function(x + y)
}
fun suma(x: Int, y: Int, function: (Int, Int, Int) -> String): String{
    return function(x, y, x + y)
}