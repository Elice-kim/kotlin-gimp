package aac.app.kotlingimp.api

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by elice.kim on 2018. 2. 18..
 */
interface ApiService {

    @GET("https://api.bithumb.com/public/ticker")
    fun getBithumbCoin(@Query("currency") coin: String)

}