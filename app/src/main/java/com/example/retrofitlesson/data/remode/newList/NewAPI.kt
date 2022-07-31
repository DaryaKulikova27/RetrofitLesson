package com.example.retrofitlesson.data.remode.newList

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface NewAPI {
    @GET("./api/mobile/news/list")
    @Headers("Content-Type: application/json")
    fun getNewsList(): Single<NewsListResponse>
}