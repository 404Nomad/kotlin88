package com.cfa.kotlin8.poo;

//définir proprietes dans el constructeur
public class Persone(val nom:String, val prenom:String, val age:Int, val high:Float) {

    // definir propriétées interne a l'objet
    // peut jouer au basket si age superieur a 50 ans et hauteur superieur a 1.5 ( F = Float )
    val peuJouerAuBasket = age > 50 && high > 1.5F


    fun estMajeur(age: Int):Boolean = age > 18

    // passer quelque chose a l'initialisation
    init {
        val basketString:String = when(peuJouerAuBasket){
            true -> "peu jouer au basket"
            false -> "peu pas jouer au basket, domage!"
        }
    }
}
