package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sonuc = MutableLiveData<String>()
    var mrepo = MatematikselRepository()

    init {
        sonuc = mrepo.matematikselSonucuGetir()// Repo view model bağlantısı
    }

    fun toplamaYap(alinanSayi1: String, alinanSayi2: String) {
        mrepo.topla(alinanSayi1,alinanSayi2)
    }

    fun carpmaYap(alinanSayi1: String, alinanSayi2: String) {
        mrepo.carp(alinanSayi1,alinanSayi2)
    }
}