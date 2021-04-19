package com.mxkj.kotlin01.first

/** 定义参数是函数的函数 ，函数的参数是另一个函数*/
fun main() {
    /* 匿名函数 */
    val getDisCountWords = {goodsName:String, hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11促销$goodsName，倒计 $hour 小时"
    }
    showOnBoard("充气baby", getDisCountWords)

    /* 以上可以简化写法 */
    showOnBoard("刮胡刀") { goodsName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年，双11促销$goodsName，倒计 $hour 小时"
    }

}

/** 具名参数
 * 显示促销的文案，文案由另一个函数showDiscount生成
 * */
fun showOnBoard(goodsName: String, showDiscount: (String,Int) -> String){
    val hour = (1..24).shuffled().last()
    println(showDiscount(goodsName,hour))
}
