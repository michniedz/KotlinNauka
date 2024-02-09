package org.example

import kotlin.math.*

fun main() {
    //operatory arytmetyczne
    val a = 40
    val b = 30
    var suma = a + b
    println(suma)
    println(a - b)
    println(a.toFloat() / b.toFloat())
    println(a / b)
    println(a * b)
    println(a % b)
    suma += 1 // => suma = suma + 1
    println(suma)
    suma -= 1 //70
    println(suma)
    suma /= 2 //35
    println(suma)
    suma *= 2 //70
    println(suma)
    suma %= 3 //1
    println(suma)
    suma++ //2  postinkrementacja - po odczytaniu zmiennej
    println(suma)
    println(suma++) //2
    println(++suma) //4
    suma-- //3  postdekrementacja
    println(suma)
    ++suma //4 preinkrementacja - przed odczytaniem zmiennej
    println(suma)
    --suma //3 predekrementacja
    println(suma)

    println((2.0).pow(4)) //potęgowanie   16.0
    println(sqrt(9f))   // 3.0
}
