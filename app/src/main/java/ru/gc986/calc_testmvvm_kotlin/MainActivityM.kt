package ru.gc986.calc_testmvvm_kotlin

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField
import android.util.Log

/**
 * Created by gc986 on 30.05.17.
 */
class MainActivityM{

    val number : ObservableField<String> = ObservableField<String>()
    val number0 : ObservableField<String> = ObservableField<String>()

    constructor(){
        number.set("0")
        number0.set("0")
    }
}