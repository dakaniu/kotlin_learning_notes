package com.example.nft.demo

import org.junit.Test
import java.util.*

/**
 * Created by nft on 18-11-15.
 */
class ListAndMapDemo {
    @Test
    fun main(){

        var list1 = listOf<String>(" 鸡蛋","苹果","香蕉","芹菜","西蓝花","大洋葱","红提")
//        for (list in list1.asReversed()){
//            print("${list},")
//        }
//        for ((i, e) in list1.withIndex()){
//            print(" $i $e")
//        }
//         var  map = TreeMap<String ,String>()
//        map["一"] = "1"
//        map["二"]= "2"
//        map["三"]="3"
//        println(map.getValue("二"))
//        println(map["一"])
//        var  i = {x:Int ,y:Int ->x+y}
//        println(i(3,5))
//        var j:(Int ,Int) -> Int = {x,y ->x+y}
//        println(j(4,3))
        var rect1 = Rect(5,6)
        println("Rect高是：${rect1.height},宽是${rect1.width}")
    }

    fun add(x:Int,y:Int):Int = x+y
    class Rect(var height:Int,var width:Int)
}