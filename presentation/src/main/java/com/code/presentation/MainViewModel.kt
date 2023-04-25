package com.code.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    private val fact = MutableLiveData<String>()
    fun setFact() = fact

    fun callRiddle() {
        viewModelScope.launch {

            delay(3000)
            fact.value = "Hi Deepak !!"

        }
    }

}