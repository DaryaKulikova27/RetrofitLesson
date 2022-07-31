package com.example.retrofitlesson.recycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitlesson.NewsItem
import com.example.retrofitlesson.R
import com.example.retrofitlesson.databinding.NewsCardBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {
    val newsList = ArrayList<NewsItem>()


    class NewsHolder(item : View) : RecyclerView.ViewHolder(item){
        val binding = NewsCardBinding.bind(item)
        fun bind(newsItem : NewsItem) = with(binding) {
            idImg.setImageURI(newsItem.img)
            idTitle.text = newsItem.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_card, parent, false)
        return NewsHolder(view)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    fun addNewsItem(newsItem: NewsItem) {
        newsList.add(newsItem)
        notifyDataSetChanged()
    }




}