package com.swiftpizza.dialogfragmentexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val message = MutableLiveData<String>()

    fun setMessage(message: String) {
        this.message.postValue(message)
    }

    fun getMessage(): MutableLiveData<String> {
        return this.message
    }


}