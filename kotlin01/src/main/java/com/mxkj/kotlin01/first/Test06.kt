package com.mxkj.kotlin01.first

/** 空检查机制
 * 1.问号：?
 * 2.let函数的：?.let
 * 3. 一定执行：!!
 * 4. 空和并操作府：?:
 * */
fun main() {

    //带let函数的安全调用操作符
    var str = readLine()?.let {
        if (it.isNotBlank()){
            it.capitalize()
        }else{
            "str是空"
        }
    }
    println(str)

    //如果是null,他会跳过函数不执行count
    var str2 = getStr()?.count()
    println(str2)

    //非空断言操作符：一定执行，抛出异常
    /*var str3 = getStr()!!.count()
    println(str3)*/

    // ?: 空和并操作符（elvis）, 可以给缺省值
    var str4 = getStr() ?: "是空的 啦啦啦"
    println(str4)
}

fun getStr(): String? {
    return null
}