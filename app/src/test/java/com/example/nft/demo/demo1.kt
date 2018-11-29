package com.example.nft.demo

import org.junit.Test

/**
 * Created by nft on 18-11-15.
 */
class demo1 {
    @Test
    fun main(){

        println(checkFace(30))
        println(checkFace(98))
        var a = 3
        var b = 7
        println("${a}与${b}比较大的是${returnBig(3,7)}")
        gredeScore(5)
        gredeScore(7)
        gredeScore(10)
        gradeDiray("人民大会堂")
        gradeDiray("金銮殿")
        gradeDiray("天安门广场的毛主席纪念堂")
        returnBig(1)

    }

    fun checkFace(score:Int):String{
        if (score>80){
            return "这是一个帅哥"
        }else{
            return "这是一个衰哥"
        }
//等同于如下代码
//        if (score>80) return "这是一个帅哥" else return "这是一个衰哥"
    }
    @JvmOverloads
    fun returnBig(a:Int,b:Int = 1):Int{
        if (a>b) return a else return b
    }

    fun gredeScore(score: Int){

        //类似switch　语句
        when(score){
            10 -> println("成绩优秀　棒棒哒")
            9 -> println("干的不错")
            8 -> println("还可以")
            7 -> println("还需努力")
            6 -> println("刚刚及格")
            else -> println("成绩不合格　需要加油努力了")
        }

    }

    fun gradeDiray(palceName:String){

        var length = when(palceName.length){
            1 -> "一"
            2 -> "二"
            3 -> "三"
            5 -> "五"
            else -> palceName.length
        }

//        if (palceName.length >3) println("地名比较短　很好记") else println("地名比较长　不容易记住")
        var namelength =   if (palceName.length >3)  "地名比较长　不容易记住" else "地名比较短　很好记"
        var temple = """
            今天天气良好　万里无云　我们去${palceName}游玩
            首先引入眼帘的是${palceName}${length}个大字 还有就是　${namelength}
            """
        println(temple)
    }
}
//fun main(args:Array<String>){
//    fun sayhello(){
//        println("hellolooo ")
//    }
//}