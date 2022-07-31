package com.example.retrofitlesson

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.retrofitlesson.data.remode.newList.NewAPI


class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsListModel = ViewModelProvider(this)[NewsViewModel::class.java]
        newsListModel.fetchNewsList((activity?.application as? NewsApp)?.newsApi)

    }

    companion object {
        @JvmStatic
        fun newInstance() = NewsFragment()
    }
}