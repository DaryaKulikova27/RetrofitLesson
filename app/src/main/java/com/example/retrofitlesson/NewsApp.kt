package com.example.retrofitlesson

import android.app.Application
import android.widget.TextView
import com.example.retrofitlesson.data.remode.newList.NewAPI
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class NewsApp : Application() {

    lateinit var newsApi: NewAPI

    override fun onCreate() {
        super.onCreate()
        ObjectBox.init(this)

        configureRetrofit()

    }



    private fun configureRetrofit() {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        val retroFit = Retrofit.Builder()
            .baseUrl("https://ws-tszh-1c-test.vdgb-soft.ru")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        newsApi = retroFit.create(NewAPI::class.java)
    }

}