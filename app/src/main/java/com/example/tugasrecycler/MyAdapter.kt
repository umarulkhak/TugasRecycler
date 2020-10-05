package com.example.tugasrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model){
            itemView.titleTV.text = model.title
            itemView.textdate.text = model.tanggal
            itemView.imgView.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {
            if (position == 0){
                Toast.makeText(context,"You clicked Naruto", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(context,"You clicked Conan", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(context,"You clicked Bleach", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(context,"You clicked Si Juki", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(context,"You clicked One Puchman", Toast.LENGTH_LONG).show()
            }
            if (position == 5){
                Toast.makeText(context,"You clicked One Peace", Toast.LENGTH_LONG).show()
            }
            if (position == 6){
                Toast.makeText(context,"You clicked Doraemon", Toast.LENGTH_LONG).show()
            }
        }
    }

}