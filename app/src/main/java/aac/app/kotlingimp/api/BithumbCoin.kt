package aac.app.kotlingimp.api

import com.google.gson.annotations.SerializedName

/**
 * Created by elice.kim on 2018. 2. 18..
 */
data class BithumbCoin(
        @SerializedName("status") val status: String,
        @SerializedName("data") val data: Data) {

    data class Data(
            @SerializedName("opening_price") val openingPrice: String,
            @SerializedName("closing_price") val closingPrice: String,
            @SerializedName("min_price") val minPrice: String,
            @SerializedName("max_price") val maxPrice: String,
            @SerializedName("average_price") val average: String,
            @SerializedName("units_traded") val trade: String,
            @SerializedName("buy_price") val buyPrice: String,
            @SerializedName("sell_price") val sellPrice: String,
            @SerializedName("date") val date: String
    )
}