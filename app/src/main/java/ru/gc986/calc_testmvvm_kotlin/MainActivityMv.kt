package ru.gc986.calc_testmvvm_kotlin

/**
 * Created by gc986 on 30.05.17.
 */
class MainActivityMv {

    var model = MainActivityM()
    var toClear : Boolean = false

    constructor()

    constructor (model:MainActivityM){
        this.model = model
    }

    fun add(){
        if(model.number0.get().equals("0")) {
            model.number0.set(model.number.get())
            clear()
        }
        else {
            val summ = model.number.get().toFloat() + model.number0.get().toFloat()
            model.number.set(summ.toString())
            toClear = true
            model.number0.set(summ.toString())
        }
    }

    fun clear(){
        if (model.number.get().equals("0"))
            model.number0.set("0")
        else
            model.number.set("0")
    }

    fun a1(){
        addToField("1")
    }

    fun a2(){
        addToField("2")
    }

    fun a3(){
        addToField("3")
    }

    fun a4(){
        addToField("4")
    }

    fun a5(){
        addToField("5")
    }

    fun a6(){
        addToField("6")
    }

    fun a7(){
        addToField("7")
    }

    fun a8(){
        addToField("8")
    }

    fun a9(){
        addToField("9")
    }

    fun a0(){
        addToField("0")
    }

    fun a_(){
        model.number.set(model.number.get()+".")
    }

    fun addToField(num:String){
        if (toClear)
            model.number.set("0")
        toClear = false

        if(model.number.get().equals("0"))
            model.number.set("")

        model.number.set(model.number.get()+num)

        if((model.number.get()+"0").toFloat()==0f)
            clear()
    }

}