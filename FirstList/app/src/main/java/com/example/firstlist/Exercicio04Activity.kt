package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.firstlist.databinding.ActivityExercicio04Binding

class Exercicio04Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio04Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio04Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinnerItems = arrayOf("Select One", "Movie", "Music", "Book", "Game")
        val defaultSpin = arrayOf("Nothing selected")

        val movieItems = arrayOf("Select One", "Action", "Adventure", "Animation", "Comedy", "Documentary", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Thriller")
        val musicItems = arrayOf("Select One", "Classic", "Dance", "Electronic", "Folk", "Funk", "Heavy Metal", "Hip Hop", "Indie", "Instrumental", "Jazz", "Medieval", "Opera", "Orchestraal", "Religious", "R&B", "Rock", "Tango")
        val bookItems = arrayOf("Select One", "Fiction", "Non-Fiction", "Action", "Adventure", "Biography", "Children", "Drama", "Fairy Tale", "Fantasy", "Horror", "Mystery", "Romance", "Thriller")
        val gameItems = arrayOf("Select One", "Adventure", "Arcade", "Beat 'em up", "Casual", "Escape room", "FPS (First Person Shooter)", "Horror", "MMO", "Open World", "Shoot 'em up", "Platform", "Puzzle", "Race", "RPG", "Simulation", "Sports", "Strategy", "Visual Novel")

        val adapterType = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerItems)
        adapterType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerType.adapter = adapterType

        var adapterGenreType = ArrayAdapter(this, android.R.layout.simple_spinner_item, defaultSpin)
        var contextForAdapter = this

        
        binding.spinnerType.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (binding.spinnerType.selectedItemPosition != 0) {
                    when (binding.spinnerType.selectedItem) {
                        "Movie" -> {
                            adapterGenreType = ArrayAdapter(contextForAdapter, android.R.layout.simple_spinner_item, movieItems)
                        }
                        "Music" -> {
                            adapterGenreType = ArrayAdapter(contextForAdapter, android.R.layout.simple_spinner_item, musicItems)
                        }
                        "Book" -> {
                            adapterGenreType = ArrayAdapter(contextForAdapter, android.R.layout.simple_spinner_item, bookItems)
                        }
                        "Game" -> {
                            adapterGenreType = ArrayAdapter(contextForAdapter, android.R.layout.simple_spinner_item, gameItems)
                        }
                    }

                }
                else {
                    adapterGenreType = ArrayAdapter(contextForAdapter, android.R.layout.simple_spinner_item, defaultSpin)
                }
                adapterGenreType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                binding.spinnerTypeGenre.adapter = adapterGenreType
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    }
}