package duran_guerrero.rutilio.listas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.listas.R

class MainActivity : AppCompatActivity() {

    lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.miLista)

        val nombres = listOf<String>("Leonel", "Rutilio", "Janeth", "Magali", "José Luis", "Antonio",
            "Erick", "Miguel", "Pedro", "Juan", "Beto", "Oso", "Kike", "Rene", "Popeye", "Juan Luis",
            "Demetrio", "Practica", "Holii", "Juana la cotona", "Lus del cielo", "Carmen Duran")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent, view, position, id ->
            view.setBackgroundColor(Color.BLUE)
            Toast.makeText(this, "Seleccionaste el elemento$position", Toast.LENGTH_LONG).show()
        }

    }
}