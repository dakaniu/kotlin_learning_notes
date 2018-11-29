package com.example.nft.demo

/**
 * Created by nft on 18-11-21.
 */
class singletonDemo1 private constructor(){
    companion object {
        private var instance:singletonDemo1? = null

        @Synchronized
        fun getInstance1():singletonDemo1{
            if (instance == null) instance = singletonDemo1()
            return instance!!
        }
    }
//线程安全你　每次获取的时候需要枷锁　这个不是很经济　浪费空间
//    private static singletonDemo1 instance = null
//    private singletonDemo1(){}
//    public static synchronized singletonDemo1 getInstance(){
//
//        if (instance == null ){
//            instance = new singletonDemo1()
//        }
//        return instance
//    }
}