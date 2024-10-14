package com.juaracoding.ujian1batch4androidkotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juaracoding.ujian1batch4androidkotlin.DetailActivity
import com.juaracoding.ujian1batch4androidkotlin.R
import com.juaracoding.ujian1batch4androidkotlin.model.Article


class ArticleAdapter(private val articles: List<Article>, private val clickListener: (Article) -> Unit) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article: Article) {
            itemView.findViewById<ImageView>(R.id.articleImage).setImageResource(article.imageResourceId)
            itemView.findViewById<TextView>(R.id.articleTitle).text = article.title
            itemView.findViewById<TextView>(R.id.articleOverview).text = article.overview

            itemView.setOnClickListener { clickListener(article) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(articles[position])
    }

    override fun getItemCount() :Int {
        return articles.size
    }
}
