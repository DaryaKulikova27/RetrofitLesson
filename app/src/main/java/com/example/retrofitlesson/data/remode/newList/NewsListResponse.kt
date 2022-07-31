package com.example.retrofitlesson.data.remode.newList

data class NewsListResponse(val success: Boolean, val data: List<DataListItem>) {

}

data class DataListItem(
    val news: List<NewsItem>,
    val count: String,
    val error_msg: String,
    val Here: String
) {}

data class NewsItem(
    val id: String,
    val type: String,
    val title: String,
    val img: String,
    val news_date: String,
    val news_date_uts: String,
    val annotation: String,
    val mobile_url: String
) {}

