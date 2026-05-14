package com.example.actividad15

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividad15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvwNews.layoutManager = LinearLayoutManager(this)
        binding.rvwNews.adapter = NoticiaAdapter(getNews())
    }

    fun getNews(): List<Noticia>{
        val noticias = listOf<Noticia>(
            Noticia("Titulo 1","Descripción 1"),
            Noticia("Titulo 2","Descripción 2"),
            Noticia("Titulo 3","Descripción 3"),
            Noticia("Titulo 4","Descripción 4"),
            Noticia("Titulo 5","Descripción 5"),
            Noticia("Titulo 6","Descripción 6"),
            Noticia("Titulo 7","Descripción 7"),
        )

        return  noticias
    }

}