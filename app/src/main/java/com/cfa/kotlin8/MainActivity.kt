package com.cfa.kotlin8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cfa.kotlin8.functions.filtreNombre
import com.cfa.kotlin8.functions.positive
import com.cfa.kotlin8.poo.Persone
import com.cfa.kotlin8.poo.Vehicule
import com.cfa.kotlin8.poo.Voiture
import com.cfa.kotlin8.poo.Moto
import com.cfa.kotlin8.poo.*
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        println("donner un message en console")
        //println("donner un message en console")

        for (i in 1..10) {
            println("répétition $i")
        }

        //var prenom : String? = null
        //println(prenom?.length) // verifier que prenom soit null
        //println(prenom!!.length) //verifier que prenom ne soit jamais null


        val listeNombres = arrayOf(-99,-45,-60,0,6,58,69)
        val listeNombresFiltre = filtreNombre(listeNombres, ::positive )

        println("Liste des nombres : ${Arrays.toString(listeNombres)}")
        println("Liste des nombres positives : ${Arrays.toString(listeNombresFiltre)}")

        val filterPositiv = listeNombres.filter { nbre -> nbre > 0 }
        val filterEv = listeNombres.filter { nbre -> nbre % 2 == 0 }
        val filterEv2 = listeNombres.filter { it % 2 == 0 }

        listeNombres.forEach { println(it) }
        listeNombres.forEachIndexed{ind, nbr -> println(" $ind => $nbr") }
        listeNombres.forEachIndexed{_, nbr -> println(" $nbr") }
        // parcourir tableau et recuperer que les indexs
        listeNombres.forEachIndexed{ind, _-> println(" $ind") }

        println("Liste des nombres modulo 2 : ${Arrays.toString(filterEv.toTypedArray())}")

        val persone1 = Persone("Dupont", "Jean", 20, 1.80F)
        val persone2 = Persone("Martin", "Luc", 16, 1.80F)

        val p2 = Persone("Jordan", "Michael", 27, 1.64F)

        println("${p2.prenom} peut jouer au basket : ${p2.peuJouerAuBasket}")

        val p3 = Persone("Jordan", "Peterson")

        val v1 = Voiture()
        v1.moteur = "Electrique"
        println("c'est une voiture ${v1.nombreDeRoue()}")

        val v2 = Moto()
        println("c'est une moto ${v2.nombreDeRoue()}")

        val v3 = Moto(sideCar = true)
        println("C'est une moto ${v3.nombreDeRoue()}")

        val Animal = Dog()
        Animal.feeding()
        Animal.nbrDePattes(4)
        Animal.courir()
        Animal.communication()
        println("")

        println("Le régime des chiens est souvent : ${Dog.REGIME_ALIMENTAIRE}")

        val el1 = Eleve("Dupont", "Jean", 12.5)
        val el2 = Eleve("Martin", "Luc", 9.5)
        val el3= Eleve("Martin", "Luc", 9.5)

        println(el1.equals(el2))
        println(el3.equals(el2))

        println(Animal is Dog == true)

        var test = Animal !is Dog
        println(test)

        // smart cast -
        // safe cast -
        // unsafe cast - permet de lever une exception

        //
        try {
            var camion:Vehicule = v2 as Vehicule
        } catch (e: Exception) {
            println(e.message)
        }

        // tableau avec entiers et tableau avec prénom , pour les parcourir on peut
        // faire un for each, ou utiliser une fonction parcourir les deux tableaux.
        // ici on a donc deux tableau typé différement


        //val tab1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val tab3 = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
        //val tab2 = arrayOf("Jean", "Luc", "Martin", "Dupont")
        val tab4 = arrayOf<String>("Jean", "Luc", "Martin", "Dupont")

        // function pour afficher les elements du tableau peut importe son Type
        // pour cela on utilise
        // fonction affichage
        // <T> permet de signaler que la fonction est generique
        fun <T> affiche(tableau: Array<T>) {
            var sb = StringBuilder()
            var separator = ""
            for (el in tableau) {
                sb.append(separator)
                sb.append(el)
                separator = ", "
            }
            println(sb.toString());
        }

        affiche(tab3)
        affiche(tab4)

        println("le vent va vers ${Direction.NORD.action()}")
        println("Le vent va vers ${Direction.NORD.description} et ${Direction.NORD.action()}")
    }
}