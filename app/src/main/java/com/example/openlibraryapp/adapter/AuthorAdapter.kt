package com.example.openlibraryapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.openlibraryapp.R
import com.example.openlibraryapp.model.AuthorDoc

class AuthorAdapter (
    private val authors: MutableList<AuthorDoc> = mutableListOf(),
    //private val onFlowerClicked: (FlowersItem) -> Unit
) : RecyclerView.Adapter<AuthorsViewHolder>() {





    fun updateAuthors(newAuthors: List<AuthorDoc>) {
        authors.clear()
        authors.addAll(newAuthors)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
        val authorsView = LayoutInflater.from(parent.context).inflate(R.layout.author_item, parent, false)
        return AuthorsViewHolder(authorsView)
    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {

        Log.d("logonBind","this is onBind")
        val author = authors[position]
        holder.bind(author)
    }

    override fun getItemCount(): Int = authors.size
}

class AuthorsViewHolder(
    itemView: View
    //private val onFlowerClicked: (FlowersItem) -> Unit
) : RecyclerView.ViewHolder(itemView) {



    val authorName: TextView = itemView.findViewById(R.id.textViewName)
    val authorBirthDate: TextView = itemView.findViewById(R.id.textViewBirthDate)
    val authorWorkCount: TextView = itemView.findViewById(R.id.textViewWorkCount)



    fun bind(author: AuthorDoc) {
        authorName.text = author.name
        authorBirthDate.text = author.birthDate
        authorWorkCount.text = author.workCount.toString()

    }
}