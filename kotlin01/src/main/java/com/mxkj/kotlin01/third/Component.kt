package com.mxkj.kotlin01.third

/** 解构声明 ，data的数据类自动生成*/
class PlayScore(val experience:Int, val level: Int){
    operator fun component1() = experience
    operator fun component2() = level

    override fun toString(): String {
        return "PlayScore(experience=$experience, level=$level)"
    }
}

fun main() {
    val (i, j) = PlayScore(8, 18)
    println(i)
    println(j)
}