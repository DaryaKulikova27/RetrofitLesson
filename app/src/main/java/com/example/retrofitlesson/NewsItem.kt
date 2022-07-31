package com.example.retrofitlesson

import android.net.Uri
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.util.*

@Entity
data class NewsItem(
    @Id
    var id: Long = 0,


    var type: Int,
    var title: String,
    var img: String,
    var newsDate: String,
    var newsDateTimestamp: Long,
    var annotation: String,
    var mobile_url: String,
)