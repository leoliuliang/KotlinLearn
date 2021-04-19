package com.mxkj.kotlin01.first

fun main() {
    println(annoymityFun01(2027, "happy"))
    println(annoymityFun02())
    println(annoymityFun03("刘亮", "好的"))
}

/** 匿名函数 带Int参数 */
val annoymityFun01 : (Int,String) -> String = {name,nice ->
    val str = "hello"
    "$name $nice,  $str, I am liang"
}

/** 匿名函数 不带参数 */
val annoymityFun02 : () -> Int = {
    666
}

/** 匿名函数 参数和返回值都 类型推导*/
val annoymityFun03 = {str01:String, str02:String ->
    str01+168+str02
}
