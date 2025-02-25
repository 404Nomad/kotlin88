package com.cfa.kotlin8.poo

abstract class Mamal {

    fun feeding() {
        println("Un mammifère allaite forcément")
    }

    // methode pour affecter le nombre de pattes depuis les filles
    // methode abstraite
    abstract fun nbrDePattes(nbrPatte:Int)
}