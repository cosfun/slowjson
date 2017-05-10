package com.company

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention



/**
 * Created by Administrator on 2017/5/11.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(RetentionPolicy.RUNTIME)
annotation class slowJson(val value:String = "1")