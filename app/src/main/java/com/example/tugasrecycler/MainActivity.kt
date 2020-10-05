package com.example.tugasrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Naruto", "2020", R.drawable.naruto))
        arrayList.add(Model("Conan", "2020", R.drawable.conan))
        arrayList.add(Model("Bleach", "2020", R.drawable.bleach))
        arrayList.add(Model("Si Juki", "2020", R.drawable.juki))
        arrayList.add(Model("One Puchman", "2020", R.drawable.puchman))
        arrayList.add(Model("One Peace", "2020", R.drawable.onepeace))
        arrayList.add(Model("Doraemon", "2020", R.drawable.doraemon))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}
