package com.example.nft.demo

/**
 * Created by nft on 18-11-21.
 * 基本懒加载　当调用getinstance 时返回实例
 */
class singletonDemo3 {
    //kotlin有２种方式　
    //第一种　利用
    companion object {
        val instace1 by lazy (mode = LazyThreadSafetyMode.NONE){
            singletonDemo3()
        }
    }
    //第二种　和java写法类似
    private var instance:singletonDemo3? = null

    fun get():singletonDemo3{
        if (instance == null){
            instance = singletonDemo3()
        }
        return instance!!;
    }
//    private static singletonDemo3  instance = null;
//    private singletonDemo3(){}
//    public static singletonDemo3 getInstance(){
//        if (instance == null){
//            instance = new singletonDemo3();
//        }
//        retun instance;
//    }
}