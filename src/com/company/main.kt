package com.company

/**
 * Created by Administrator on 2017/5/11.
 */
fun main(arg:Array<String>){
    val a = A()
    a.setNum("213")
    a.picUrl.add("111111")
    a.picUrl.add("111112")
    a.picUrl.add("111113")
    val b = B()
    a.slowJson(b)
    println(b.id)
}