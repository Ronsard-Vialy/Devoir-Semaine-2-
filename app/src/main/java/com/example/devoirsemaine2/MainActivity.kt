package com.example.devoirsemaine2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val question = findViewById<TextView>(R.id.Question_card)
            val reponse= findViewById<TextView>(R.id.Answer_Card)
            val visibleimg= findViewById<ImageView>(R.id.voir)
            val invisibleimg= findViewById<ImageView>(R.id.ne_pas_voir)
            val box1 =findViewById<TextView>(R.id.Exemple1)
            val box2 =findViewById<TextView>(R.id.Exemple2)
            val box3 =findViewById<TextView>(R.id.Exemple3)


        question.setOnClickListener { question.visibility = View.GONE
            reponse.visibility= View.VISIBLE}
            reponse.setOnClickListener { question.visibility = View.VISIBLE
                reponse.visibility= View.INVISIBLE}

            visibleimg.setOnClickListener { invisibleimg.visibility = View.VISIBLE
                visibleimg.visibility= View.INVISIBLE
                box1.visibility=View.VISIBLE
                box2.visibility=View.VISIBLE
                box3.visibility=View.VISIBLE }


            invisibleimg.setOnClickListener { visibleimg.visibility = View.VISIBLE
                invisibleimg.visibility= View.INVISIBLE
                box1.visibility=View.INVISIBLE
                box2.visibility=View.INVISIBLE
                box3.visibility=View.INVISIBLE }
            box1.setOnClickListener {
                box1.setBackgroundColor(getResources().getColor(R.color.Bonne_reponse))
            }
        box2.setOnClickListener {
            box1.setBackgroundColor(getResources().getColor(R.color.Bonne_reponse))
            box2.setBackgroundColor(getResources().getColor(R.color.Mauvaise_reponse))
        }
        box3.setOnClickListener {
            box1.setBackgroundColor(getResources().getColor(R.color.Bonne_reponse))
            box3.setBackgroundColor(getResources().getColor(R.color.Mauvaise_reponse))
        }

        }
    }
