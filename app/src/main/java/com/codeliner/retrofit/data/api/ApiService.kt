package com.codeliner.retrofit.data.api

import com.codeliner.retrofit.model.cash.Cash
import com.codeliner.retrofit.model.online.Online
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5") //endpoint
    suspend fun getCashMoney(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getOnlineMoney(): Response<Online>
}