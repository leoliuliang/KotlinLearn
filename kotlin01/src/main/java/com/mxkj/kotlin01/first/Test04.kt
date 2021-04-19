package com.mxkj.kotlin01.first

/** 传递函数的引用  :: */
fun main() {

    showOnBoard02("空调", ::getDiscountWord)
}

/* 具名函数需要写return, 匿名函数不用 */
fun getDiscountWord(goodsName: String,hour:Int) : String{
    val currentYear = 2027
    return "${currentYear}年，双11促销$goodsName,倒计 $hour 小时"
}

fun showOnBoard02(goodsName: String, discountWords: (String,Int) -> String){
    val hour = (1..24).shuffled().last()
    println(discountWords(goodsName,hour))
}