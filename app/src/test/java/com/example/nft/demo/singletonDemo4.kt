package com.example.nft.demo

/**
 * Created by nft on 18-11-21.
 */
class singletonDemo4 private constructor(){
    companion object {
        fun getInstance() = singletonDemo4Inne.instance
    }


    private object singletonDemo4Inne{
        var instance = singletonDemo4()
    }
//    private singletonDemo4(){}
//    private static class singletonDemo4InnerClass {
//    private static singletonDemo4 instance = new singletonDemo4()
//    }
//    public static singletonDemo4 getInstance(){
//            return singletonDemo4InnerClass.instance;
//    }
}