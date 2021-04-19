package com.mxkj.kotlin01.second

import java.io.File
import java.nio.file.Path

fun main() {
    ApplicationConfig.doSomeThing()
    ApplicationConfig.doSomeThing()

    //只想用一次load2()，用完就释放
    val school = object : School() {
        override fun load2() = "只加载2"
    }
    println(school.load2())

    ConfigMap.load()
}

/** object 声明单例 */
object ApplicationConfig{
    init {
        println("初始化...")
    }

    fun doSomeThing(){
        println("调用doSomeThing..")
    }
}

open class School(){
    fun load() = "正在加载.."
    open fun load2() = "正在加载..2"
    fun load3() = "正在加载..3"
}

open class ConfigMap{
    //伴生对象
    //只有初始化ConfigMap类或调用load函数时，伴生对象的内容才会载入
    //而且无论实列化ConfigMap类多少次，这个伴生对象始终只有一个实列存在。
    companion object{
        private const val PATH = "E://aa.txt"
        fun load() = File(PATH).readBytes()
    }
}