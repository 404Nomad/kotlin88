package com.cfa.kotlin8.poo

// herite de Mamal et donc allaite
// on a rajouter une classe abstraite dans mamal donc il faut implementer ici aussi
// on ajoute notre interface action
class Dog: Mamal(), Action {
    override fun nbrDePattes(nbrPatte: Int) {
        println("Les chiens de Tchernobyl ils ont généralement $nbrPatte pattes")
    }

    override fun communication() {
        println("le chien aboie")
    }

    // ce n'est pas un override direct comme avec un open
    override fun courir() {
        super.courir()
        println("sur 2 pattes à la fois")
    }

    //on va créer une statique
    companion object{
        val REGIME_ALIMENTAIRE = "carnivore"
    }

}