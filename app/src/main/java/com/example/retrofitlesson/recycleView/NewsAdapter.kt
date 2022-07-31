package com.example.retrofitlesson.recycleView

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitlesson.NewsItem
import com.example.retrofitlesson.ObjectBox
import com.example.retrofitlesson.R
import com.example.retrofitlesson.databinding.NewsCardBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {
    private val newsList = ArrayList<NewsItem>()
    val newBox = ObjectBox.store.boxFor(NewsItem::class.java)


    class NewsHolder(item : View) : RecyclerView.ViewHolder(item){
        val binding = NewsCardBinding.bind(item)
        fun bind(newsItem : NewsItem) = with(binding) {
            idImg.setImageURI(Uri.parse(newsItem.img))
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

    fun initRecycleView() {
        completeDataBase()
        for (i in 0..newBox.count()) {
            newsList.add(newBox[i])
        }
        notifyDataSetChanged()
    }

    private fun completeDataBase() {
        val new1 = NewsItem(
            0,
            1,
            "New1",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new2 = NewsItem(
            1,
            1,
            "New2",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new3 = NewsItem(
            2,
            1,
            "New2",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new4 = NewsItem(
            3,
            1,
            "New2",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new5 = NewsItem(
            4,
            1,
            "New2",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new6 = NewsItem(
            5,
            1,
            "New2",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg",
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )
        newBox.put(new1)
        newBox.put(new2)
        newBox.put(new3)
        newBox.put(new4)
        newBox.put(new5)
        newBox.put(new6)
    }



}