package com.example.retrofitlesson

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import io.reactivex.android.schedulers.AndroidSchedulers;
import androidx.lifecycle.ViewModel
import com.example.retrofitlesson.data.remode.newList.NewAPI
import com.example.retrofitlesson.data.remode.newList.NewsListResponse
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class NewsViewModel(application: Application) : AndroidViewModel(application) {
    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }


    lateinit var response: NewsListResponse


    fun fetchNewsList(newAPI: NewAPI?) {
        newAPI?.let {
            compositeDisposable.add(newAPI.getNewsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.e("My tag", it.data.toString())
                    response = it
                }, {

                })
            )
        }

    }
}