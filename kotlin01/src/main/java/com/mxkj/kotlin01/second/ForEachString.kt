package com.mxkj.kotlin01.second

import kotlin.math.roundToInt

fun main() {
    val country = "The people's Republic of Chain"
    //foreach函数遍历每一个字符
    country.forEach {
        println("$it-")
    }

    //安全转换函数
    val toIntOrNull = "8.89".toIntOrNull()
    println(toIntOrNull)

    //两位小数
    val format = "%.2f".format(8.88868)
    println(format)

     //四舍五入
    8.6586.roundToInt()
}