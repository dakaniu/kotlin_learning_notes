package com.example.nft.demo

/**
 * Created by nft on 18-11-19.
 */
class apple(name:String) :Human(name),IFurit {
    override fun furitSize() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("苹果和梨一样大　但是比西瓜小")
    }

    override fun eat() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("苹果被${name}吃了")
    }
}