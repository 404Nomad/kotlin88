package com.cfa.kotlin8.poo

interface Action {
    // on va créer 2 actions
    fun courir(){
        println("Cest Animal peut courrir")
    }
    open fun communication()
}