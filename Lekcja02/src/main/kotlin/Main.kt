package org.example
fun main() {
    //Typy danych
    var liczba: Int = 10
    println(liczba)
    println("int: " + Int.MAX_VALUE)
    println("int: " + Int.MIN_VALUE)

    var byte: Byte
    println("byte: " + Byte.MAX_VALUE)
    println("byte: " + Byte.MIN_VALUE)

    var short: Short
    println("short: " + Short.MAX_VALUE)
    println("short: " + Short.MIN_VALUE)

    var long: Long
    println("long: " + Long.MAX_VALUE)
    println("long: " + Long.MIN_VALUE)

    var uInt: UInt
    println("uInt: " + UInt.MAX_VALUE)
    println("uInt: " + UInt.MIN_VALUE)

    var float: Float = 3.1415f
    println("float: $float")
    println("float: " + Float.MAX_VALUE)
    println("float: " + Float.MIN_VALUE)

    var double: Double = 3.1415123123
    println("double: $double")
    println("double: " + Double.MAX_VALUE)
    println("double: " + Double.MIN_VALUE)

    var char: Char = 'M'
    println("char: $char")

    var string: String = "To jest tekst String $char"
    string += " dodałem nowy tekst"
    println(string)

    var bool: Boolean = true
    println("bool: $bool")

}
