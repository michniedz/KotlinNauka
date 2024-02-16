package org.example

import kotlin.math.*

fun main() {
    //Programowanie obiektowe: klasy
    //tworzenie obiektu os1
    var os1 = Osoba()
    println(os1.imie)
    println(os1.nazwisko)
    //przypisanie nowej wartości wieku dla obiektu os1
    os1.wiek = 22
    println(os1.wiek)
    os1.wyswietl()
    // tworzenie II obiektu os2
    var os2 = Osoba()
    os2.imie = "Paweł"
    os2.nazwisko = "Kot"
    os2.wiek = 18
    os2.wyswietl()
}
//tworzenie klasy Osoba
class Osoba
{
    // tworzymy pola imie, nazwisko, wiek
    var imie: String = "Jan"
    var nazwisko: String = "Kowalski"
    var wiek: Int = 18
    // tworzenie metody wyswietl
    fun wyswietl()
    {
        println("Imię i nazwisko: $imie $nazwisko, wiek: $wiek")
    }
}