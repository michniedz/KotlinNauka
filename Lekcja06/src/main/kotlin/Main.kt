package org.example

import kotlin.math.*

fun main() {
    //indtrukcja warunkowa IF
    var a = 5
    var b = 10
    // if
    if (a < b)
    {
        println("a jest mniejsza od b")
    }
    if (a > b)
    {
        println("a jest większa od b")
    }
    // if - else
    a = 10
    b = 5
    if (a < b)
    {
        println("a jest mniejsza od b")
    }
    else
    {
        println("a jest większa od b")
    }
    // if - ifelse - else
    print("Podaj x: ")
    val x = readLine()!!.toInt()
    if (x > 0)
        println("x jest większe od 0")
    else if (x < 0)
        println("x jest mniejsze od 0")
    else
        println("x jest równe 0")
}
