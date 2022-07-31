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
    private val adapter = NewsAdapter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //openFrag(NewsFragment.newInstance())

        //newBox = ObjectBox.store.boxFor(NewsItem::class.java)



        init()
        adapter.initRecycleView()



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





}