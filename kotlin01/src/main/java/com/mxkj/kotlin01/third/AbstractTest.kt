package com.mxkj.kotlin01.third

/**
 * abstract 抽象类，和java差不多
 * */
abstract class Gun(val range:Int){
    abstract fun pullTrigger():String
}

class AK47(val price:Int) : Gun(range = 500){
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}

fun main() {
    val aK47 = AK47(250)
    println(aK47.pullTrigger())
}