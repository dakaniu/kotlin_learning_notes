package com.example.nft.demo

import org.junit.Test
import java.math.BigInteger

/**
 * Created by nft on 18-11-15.
 */
class StringComprepar {
    @Test
    fun main() {

//        vararg str = "a_b_c_d_e_f_g_h_j"
//        str.flatMap(it.split("_")).
        var str1 = "张三"
        var str2 = "张二"
//        var str3 = "张三"
//        println(str1==str2)
//        println(heat("水"))
//        println(heat(null))

//        println("请输入第一个数值：")
//        var num1Str = readLine() //读取键盘输入的字符串
//        println("请输入第二个数值：")
//        var num2Str = readLine()
//
//        var num1 = num1Str!!.toInt()// !!代表num1Str确保不为null
//        var num2 = num2Str!!.toInt()
//        println("${num1} + ${num2} = ${num1 +num2}")
//        var girl = Girl("温柔", "甜美")
//        println("这个女孩性格非常　${girl.charctor},声音很　${girl.voice}")
//        girl.cry()
//        girl.smile()
//        println(eumnDemo.星期六.ordinal)//枚举类的test
        var eumn = eumnDemo.parse("一")
        eumn.getWeek()
        println(eumn.num)
        eumn.saybye(eumnDemo.parsekey("一"))//类方法的扩展
        var son:sealdClassDemo = sealdClassDemo.son()
        var son1:sealdClassDemo = sealdClassDemo.son1()
        var son2:sealdClassDemo = sealdClassDemo.son()
        var son3:sealdClassDemo = sealdClassDemo.son1()
        var son4:sealdClassDemo = sealdClassDemo.son2(1,"fsdf")
//        println(son4)
//        var list = listOf<sealdClassDemo>(son,son1,son2,son3)
//        for (v in list){
//            if (v is sealdClassDemo.son){
//
//                v.sayHello()
//            }
//        }
//
//        var test:Int = 5;
//        var num=BigInteger("5")
//        var result = BigInteger("1")
//        println(jiecheng1(num,result))
//        println(jiecheng(num))
//        println(add(100,0))

    }

    fun eumnDemo.saybye(num1 :String){
        var num = when(num1){
            "一"-> "zaijian"
            "二" -> "再见"
            "三" -> "goodbye"
            "四" -> "byebye"
            else -> "再也不见"
        }
        println(num)
    }

    fun jiecheng(a:BigInteger):BigInteger{

        if (a== BigInteger.ONE){
            return BigInteger.ONE
        }
        return a*jiecheng(a- BigInteger.ONE)
    }

    tailrec fun jiecheng1(a:BigInteger,result:BigInteger):BigInteger{
        if (a == BigInteger.ONE){
            return result*a
        } else{
            return jiecheng1(a-BigInteger.ONE,result*a)
        }
    }
    tailrec fun add(a:Int,b:Int):Int{
        if (a == 1){
            return b+a
        } else{
            return add(a-1,b+a)
        }
    }
    fun heat(heat: String?): String {
        return "热" + heat
    }

}