package com.cfa.kotlin8.functions

fun isOldEnouth(age:Int): Boolean {
    var test:Boolean = true
    if (age < 18) {
        test = false
    }
    return test
}

fun isOldEnouthLight(age:Int): Boolean = age >= 18

fun logFullName(nom: String, prenom: String)  { println("$nom $prenom") }

fun filtreNombre(nombres: Array<Int>, param: (Int) -> Boolean): Array<Int> {
    var nombresFiltre = mutableListOf<Int>()
    for  (n in nombres) {
        if (param(n))
            nombresFiltre.add(n)
    }
    return nombresFiltre.toTypedArray()
//return TODO("Provide the return value")
}

fun positive(n:Int): Boolean = n > 0

