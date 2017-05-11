package com.company

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention



/**
 * Created by Administrator on 2017/5/11.
 */
@Target(AnnotationTarget.FIELD)
@Retention(RetentionPolicy.RUNTIME)
annotation class slowJson(val value:String = "1")


fun <V:Any> Any.slowJson(v:V){
    val ac=this.javaClass.declaredFields
    val fieldsName=HashMap<String,Any>()
    ac.forEach {
        fieldsName.put(it.name,it.get(this))
    }
    val d=v.javaClass.declaredFields
    d.forEach {
        println(it.name+","+it.getAnnotation(slowJson::class.java).value)
         it.set(v,fieldsName[it.getAnnotation(slowJson::class.java).value])

    }
}