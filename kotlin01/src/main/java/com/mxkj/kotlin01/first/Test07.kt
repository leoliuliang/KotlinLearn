package com.mxkj.kotlin01.first

import java.lang.Exception
import java.lang.IllegalStateException

/** 异常 与 先决条件函数 */
fun main() {
    var number : Int ?= null
    try {
        number!!.plus(2)
    }catch (e: Exception){
        println(e)
    }

//    number ?: throw MyExcepution()

    //先决条件函数
    checkNotNull(number,{"操作不合法 先决条件函数 checkNotNull"})
//    require(false,{"错误"})
//    requireNotNull(null,{"是null"})
//    assert(false, { "拉拉" })
}

/** 自定义异常 */
class MyExcepution : IllegalStateException("我的 非法异常")