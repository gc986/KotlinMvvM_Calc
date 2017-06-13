package ru.gc986.calc_testmvvm_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.databinding.DataBindingUtil
import ru.gc986.calc_testmvvm_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val model : MainActivityM = MainActivityM()
    var VModel : MainActivityMv = MainActivityMv()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        VModel = MainActivityMv(model)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVmodel(VModel)
        binding.setModel(model)
    }
}
