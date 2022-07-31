package com.example.retrofitlesson

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitlesson.databinding.ActivityMainBinding
import com.example.retrofitlesson.recycleView.NewsAdapter
import io.objectbox.Box

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var newBox : Box<NewsItem>
    private val adapter = NewsAdapter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFrag(NewsFragment.newInstance())

        newBox = ObjectBox.store.boxFor(NewsItem::class.java)
        completeDataBase()
        init()




    }



    private fun openFrag(f: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.holder, f).commit()
    }

    private fun init() {
        binding.apply {
            // настраиваем вид списка
            newsRecycleView.layoutManager = LinearLayoutManager(this@MainActivity)
            newsRecycleView.adapter = adapter
        }
    }

    fun completeRecycleView() {
        for()
    }



    private fun completeDataBase() {
        val new1 = NewsItem(
            0,
            1,
            "New1",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new2 = NewsItem(
            1,
            1,
            "New2",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new3 = NewsItem(
            2,
            1,
            "New2",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new4 = NewsItem(
            3,
            1,
            "New2",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new5 = NewsItem(
            4,
            1,
            "New2",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
            "2022-07-29",
            1659042000,
            "<\\/p><\\/div><\\/article><article class=\\\"item\\\"><div class=\\\"img fl-l\\",
            "https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/mobile\\/news\\/get\\/644078",
        )

        val new6 = NewsItem(
            5,
            1,
            "New2",
            Uri.parse("https:\\/\\/ws-tszh-1c-test.vdgb-soft.ru\\/api\\/uploads\\/news\\/5536\\/img_7652.jpg"),
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