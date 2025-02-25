package com.cfa.kotlin8.poo

//Heritage + liaison avec open Vehicule class
class Voiture(): Vehicule(4) {

    // premettra d'instancier le vehicule et affecter une valeur post instanciation
    lateinit var moteur:String
}