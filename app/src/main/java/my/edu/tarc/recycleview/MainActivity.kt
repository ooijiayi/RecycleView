package my.edu.tarc.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p:List<Product> = listOf(Product("pen",1.20),
                                     Product("HIHI",400.00),
                                             Product("GG",600.00))
        val recyclerView:RecyclerView=findViewById(R.id.my_recyclerView)

        recyclerView.adapter = ProductAdapter(p)
        recyclerView.layoutManager= LinearLayoutManager(application)
        recyclerView.setHasFixedSize(true)
    }
}