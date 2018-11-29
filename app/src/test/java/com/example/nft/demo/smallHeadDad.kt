package com.example.nft.demo

/**
 * Created by nft on 18-11-19.
 */
//class smallHeadDad:IWashBowl by BigHeadSon(){
//    override fun washing() {
//        println("小头爸爸委托儿子洗碗")
//        BigHeadSon().washing()
////        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        println("小头爸爸看着儿子洗碗")
//    }
//}

/**
 * bigHeadSon　是单例模式　直接调用 BigHeadSon.XXX即可
 **/
class smallHeadDad:IWashBowl by BigHeadSon{
        override fun washing() {
        println("小头爸爸委托儿子洗碗")
        BigHeadSon.washing()
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("小头爸爸看着儿子洗碗")
    }
}