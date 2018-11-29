package com.example.nft.demo

import org.junit.Test

/**
 * Created by nft on 18-11-20.
 */
enum class eumnDemo(var num:String) {
//    星期一,星期二,星期三,星期四,星期五,星期六,星期日,
    一("星期一"),
    二("星期二"),
    三("星期三"),
    四("星期四"),
    五("星期五"),
    六("星期六"),
    日("星期日");



    fun getWeek(){
        println(num)
    }
//    init{
//        println(num)
//    }

    companion object {

        fun parse(name:String):eumnDemo{
            return eumnDemo.valueOf(name)
        }

        fun parsekey(name: String):String{
            return name
        }
    }

}
