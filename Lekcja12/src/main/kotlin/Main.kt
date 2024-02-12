package org.example

import kotlin.math.*

fun main() {
    //FUNKCJE
    testowa1()
    testowa2("Paweł")
    testowa3("Paweł", 21)
    testowa4(2 ,4, 14)
    println("Wynik: ${testowa5(10, 20)}")
    val suma = testowa5(10, 20);
    println("Suma: ${suma}")
    println(testowa6(6, 3))
    println(testowa6(3, 6))
}
// funkcja bez argumentów
fun testowa1()
{
    println("Witaj świecie")
}
// funkcja z jednym argumentem
fun testowa2(imie: String)
{
    println("Witaj $imie")
}
// funkcja z dwoma argumentami
fun testowa3(imie: String, wiek: Int)
{
    println("Witaj $imie, masz $wiek lat")
}
//funkcja z wieloma argumentami
fun testowa4(x: Int, y: Int, z: Int)
{
    println("Suma: ${x + y + z}")
}
// funkcja zwracająca wyniki działania
fun testowa5(a: Int, b: Int): Int
{
    val x = a + b
    return x
}
fun testowa6(a: Int, b: Int): String
{
    val x = a - b
    if(x >= 0)
        return "Dodatnia"
    else
        return "Ujemna"
}