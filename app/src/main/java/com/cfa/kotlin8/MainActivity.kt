package com.cfa.kotlin8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cfa.kotlin8.functions.filtreNombre
import com.cfa.kotlin8.functions.positive
import com.cfa.kotlin8.poo.Persone
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

        println("Liste des nombres modulo 2 : ${Arrays.toString(filterEv.toTypedArray())}")

        val persone1 = Persone("Dupont", "Jean", 20, 1.80F)
        val persone2 = Persone("Martin", "Luc", 16, 1.80F)

        val p2 = Persone("Jordan", "Michael", 27, 1.64F)

        println("${p2.prenom} peut jouer au basket : ${p2.peuJouerAuBasket}")
    }
}