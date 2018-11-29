package com.example.nft.demo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        var a = "12"
        var b = 12
        a = b.toString()
        b = a.toInt()
//        println()
        var c = "e3"
//        b = c.toInt()
        var nums = 1.. 100 //声明了１到１００的数组
        var nums1 = 1 until 100 //开区间　１到９９
        var nums2 = nums step 2 //步长是２的数组
        var nums3 = nums.reversed() //倒序
        var nums4 = nums.count()//总数

        for (nums0 in nums2){
            print(  " ${nums0} ,")
        }
        println()
        for (nums0 in nums1){
            print(  " ${nums0} ,")
        }
        println()
        for (nums0 in nums3){
            print(  " ${nums0} ,")
        }
        println()
        println(nums4)
        var sum = 0
        for (num in nums){
            print( "${num},")
            sum = sum +num

        }
//        println("${sum}") // println(sum)
//        print("hello word")
//        var x = 8
//        when (x) {
//            7 -> println("7")//当x为7的时候，输出7
////            if (x > 0) 1 else -1 -> println("大于0并等于1，或小于0并等于-1")//如果x>0是1的时候或小于0是-1的时候
//            in 1..10 -> println("范围匹配1-10")//是否在1-10之间
////            is String -> println("String类型")//是String类型
//        }
//        println(" 3 +2= "+plus(3,2))
//        println("3/2="+sub(3.0f,2))
        var result = sayHello("张三")
        println(result)
        println(checkAge(13))
        println(saveLog(2))
    }

    fun plus(a:Int,b:Int):Int{
        return a+b
    }

    fun sub(a:Float,b:Int):Float{
        return a/b
    }
    fun sayHello(name:String):String{
        return name+"hello"
    }
    fun checkAge(age:Int):Boolean{
        if (age>18) return true else return false
    }
    fun saveLog(logLevel: Int){

        println("logLevel")
    }
}
