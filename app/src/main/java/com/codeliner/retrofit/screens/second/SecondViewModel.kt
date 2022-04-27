package com.codeliner.retrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codeliner.retrofit.data.repository.Repository
import com.codeliner.retrofit.model.online.Online
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Online>> = MutableLiveData()

    fun getOnlineMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getOnline()
        }
    }

}