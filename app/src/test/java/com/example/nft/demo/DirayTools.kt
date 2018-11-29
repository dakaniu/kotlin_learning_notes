package com.example.nft.demo

import org.junit.Test

/**
 * Created by nft on 18-11-15.
 */
class DirayTools {
    @Test
    fun main(){

        println(DirayGenerater("人民大会堂"))
        println(DirayGenerater("金銮殿"))
    }

    fun DirayGenerater(palceName:String):String{
        var temple = """
            今天天气良好　万里无云　我们去${palceName}游玩
            首先引入眼帘的是${palceName}${palceName.length}个大字　
            """
        return temple
    }
}