package com.example.listazak

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.chipycheckboxy.R
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dodawanie=findViewById<RadioButton>(R.id.dodawanie)
        val odhaczanie=findViewById<RadioButton>(R.id.odhaczanie)

        val wedliny= findViewById<TextView>(R.id.wedliny)
        val warzywa= findViewById<TextView>(R.id.warzywa)
        val pieczywo= findViewById<TextView>(R.id.pieczywo)

        val szynka = findViewById<Chip>(R.id.szynka)
        val salami = findViewById<Chip>(R.id.salami)
        val kielbasa= findViewById<Chip>(R.id.kielbasa)

        val Burak = findViewById<Chip>(R.id.Burak)
        val Cebula= findViewById<Chip>(R.id.Cebula)
        val Ziemniak = findViewById<Chip>(R.id.ziemniak)
        val Salata= findViewById<Chip>(R.id.salata)

        val bagietka = findViewById<Chip>(R.id.bagietka)
        val croissant = findViewById<Chip>(R.id.croissant)
        val chleb =findViewById<Chip>(R.id.chleb)

        wedliny.visibility = View.GONE
        warzywa.visibility = View.GONE
        pieczywo.visibility = View.GONE

        szynka.visibility = View.GONE
        salami.visibility = View.GONE
        kielbasa.visibility = View.GONE

        Ziemniak.visibility = View.GONE
        Burak.visibility = View.GONE
        Cebula.visibility = View.GONE
        Salata.visibility = View.GONE

        bagietka.visibility = View.GONE
        croissant.visibility = View.GONE
        chleb.visibility = View.GONE
        dodawanie.setOnClickListener(){
            if (dodawanie.isChecked) {

                wedliny.visibility = View.VISIBLE
                szynka.visibility = View.VISIBLE
                salami.visibility = View.VISIBLE
                kielbasa.visibility = View.VISIBLE

                warzywa.visibility = View.VISIBLE
                Ziemniak.visibility = View.VISIBLE
                Burak.visibility = View.VISIBLE
                Cebula.visibility = View.VISIBLE
                Salata.visibility = View.VISIBLE

                pieczywo.visibility = View.VISIBLE
                bagietka.visibility = View.VISIBLE
                croissant.visibility = View.VISIBLE
                chleb.visibility = View.VISIBLE
            }
        }
        odhaczanie.setOnClickListener() {


            if (szynka.isChecked or salami.isChecked or kielbasa.isChecked) {
                wedliny.visibility = View.VISIBLE
                if (szynka.isChecked) {
                    szynka.visibility = View.VISIBLE
                } else {
                    szynka.visibility = View.GONE
                }

                if (salami.isChecked) {
                    salami.visibility = View.VISIBLE
                } else {
                    salami.visibility = View.GONE
                }

                if (kielbasa.isChecked) {
                    kielbasa.visibility = View.VISIBLE
                } else {
                    kielbasa.visibility = View.GONE
                }
            } else
            {
                wedliny.visibility = View.GONE
            }


            if (Ziemniak.isChecked or Burak.isChecked or Cebula.isChecked or Salata.isChecked) {
                warzywa.visibility = View.VISIBLE
                if (Ziemniak.isChecked) {
                    Ziemniak.visibility = View.VISIBLE
                } else {
                    Ziemniak.visibility = View.GONE
                }
                if (Burak.isChecked) {
                    Burak.visibility = View.VISIBLE
                } else {
                    Burak.visibility = View.GONE
                }
                if (Cebula.isChecked) {
                    Cebula.visibility = View.VISIBLE
                } else {
                    Cebula.visibility = View.GONE
                }
                if (Salata.isChecked) {
                    Salata.visibility = View.VISIBLE
                } else {
                    Salata.visibility = View.GONE
                }
            } else
            {
                warzywa.visibility = View.GONE
            }

            if (bagietka.isChecked or croissant.isChecked or chleb.isChecked) {
                pieczywo.visibility = View.VISIBLE
                if (bagietka.isChecked) {
                    bagietka.visibility = View.VISIBLE
                } else {
                    bagietka.visibility = View.GONE
                }
                if (croissant.isChecked) {
                    croissant.visibility = View.VISIBLE
                } else {
                    croissant.visibility = View.GONE
                }
                if (chleb.isChecked) {
                    chleb.visibility = View.VISIBLE
                } else {
                    chleb.visibility = View.GONE
                }
            } else
            {
                pieczywo.visibility = View.GONE
            }

        }


    }
}