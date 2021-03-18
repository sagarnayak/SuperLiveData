package com.sagar.livedata

import androidx.lifecycle.MutableLiveData
import com.sagar.modelsandenums.models.Event
import com.sagar.modelsandenums.models.Result

class SuperMutableLiveData<T> {

    private var success: MutableLiveData<Event<T>> = MutableLiveData()
    private var fail: MutableLiveData<Event<Result>> = MutableLiveData()

    fun getSuccess() = success

    fun getFail() = fail
}