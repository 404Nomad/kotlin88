package com.cfa.kotlin8.poo

class Moto(val sideCar:Boolean = false): Vehicule(2) {
    override fun nombreDeRoue(): String = "Ce véhicule à ${if(sideCar) nbrRoue + 1 else nbrRoue} roues"
}