package com.cfa.kotlin8.poo

// Encapsulation POO + ouvert a l'heritage
open class Vehicule(protected val nbrRoue: Int) {
    open fun nombreDeRoue(): String = "Ce Vehicule à $nbrRoue roues !!"
}