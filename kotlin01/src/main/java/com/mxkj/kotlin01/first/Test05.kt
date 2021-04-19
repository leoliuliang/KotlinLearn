package com.mxkj.kotlin01.first

/** 函数类型作为返回类型 ，就是返回一个函数 */
fun main() {
    /*这里返回一个函数configDiscountWord*/
    val configDiscountWord = configDiscountWord()
    println(configDiscountWord("风扇"))
}

fun configDiscountWord(): (String) -> String{
    return {goodsName : String ->
        val currentYear = 2021
        val hour = (1..24).shuffled().last()
        "${currentYear}年，双11促销$goodsName,倒计 $hour 小时"
    }
}