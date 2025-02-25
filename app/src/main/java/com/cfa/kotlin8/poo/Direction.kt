package com.cfa.kotlin8.poo

enum class Direction(var description:String) {
    // ajout de string + méthode surchargeable
    NORD("Le nord"){
        override fun action() = "Il fait un Froid Glacial"
    },
    SUD("Pas le nord, l'inverse même"){
        override fun action() = " Il fait un Froid Polaire"
    },
    EST("Est") {
        override fun action() = " Il fait un Froid Galactique"
    },
    OUEST("Ouest") {
        override fun action() = " Il fait un Froid Absolu"
    };

    abstract fun action(): String
}