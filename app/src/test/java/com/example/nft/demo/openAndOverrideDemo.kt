package com.example.nft.demo

import org.junit.Test

/**
 * Created by nft on 18-11-19.
 */
class openAndOverrideDemo {

    @Test
    fun test() {
        var son = Son()
        son.charctor

        println("儿子性格是${son.charctor}")
        son.action()
        var man = Man("王冬冬")
        var woman = Woman("飞婷")
        man.eat()
        woman.eat()

    }
}