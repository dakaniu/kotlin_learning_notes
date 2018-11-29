package com.example.nft.demo

/**
 * Created by nft on 18-11-20.
 */
sealed class sealdClassDemo {

    fun sayHello(){
        println("大家好")
    }

    class son():sealdClassDemo()
    class son1():sealdClassDemo()
    data class son2(var b:Int,var d:String):sealdClassDemo()
}