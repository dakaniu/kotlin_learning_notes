package com.example.nft.demo

/**
 * Created by nft on 18-11-21.
 */
class singletonDemo private constructor(){
    companion object {
        val  instance by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED ){
            singletonDemo()
        }
    }
    private @Volatile var instance:singletonDemo? = null

    fun get():singletonDemo{
        if (instance == null){
            synchronized(this){
                if (instance == null){
                    instance = singletonDemo()
                }
            }
        }

        return instance!!
    }
//dobulecheck 线程安全的　使用关键字volatile
//    private singletonDemo(){}
//    private  static volatile singletonDemo instance = null
//    public static singletonDemo getInstance(){
//        if (instance == null ){
//            synchronized(this){
//                if (instance == null){
//                    instance = new singletonDemo()
//                }
//            }
//        }
//        return instance
//    }
}