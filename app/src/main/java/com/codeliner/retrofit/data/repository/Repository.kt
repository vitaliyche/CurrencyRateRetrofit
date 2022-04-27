package com.codeliner.retrofit.data.repository

import com.codeliner.retrofit.data.api.RetrofitInstance
import com.codeliner.retrofit.model.cash.Cash
import com.codeliner.retrofit.model.online.Online
import retrofit2.Response

class Repository {
    suspend fun getCash(): Response<Cash> {
        return RetrofitInstance.api.getCashMoney()
    }

    suspend fun getOnline(): Response<Online> {
        return RetrofitInstance.api.getOnlineMoney()
    }
}