package com.mxkj.kotlin01.second

import java.io.File

fun main() {
    letTest()
    runTest()
}

fun alsoTest(){
    // also 和let函数差不多, 不同的是also返回接收者对象
    val fileList:List<String>
    File("E://aa.txt")
     .also {
        println(it.name)
    }.also {
        fileList = it.readLines()
    }
}

fun runTest(){
    //run 可用来执行函数引用,当有多个函数调用，run的优势就显而易见了
    "The people's Republic of China".run(::isLong).run(::println)
}
fun isLong(name:String) = name.length >= 10

fun letTest(){
    //let函数返回lambda的最后一行
    val let = listOf(3, 2, 1).first().let {
        it * it
    }
    println(let)
}

fun applyTest(){
    //apply 返回的是对象本身,当前的接收者，这里就是返回file,相当于隐式调用，省略this.
    val file = File("C://aa.txt").apply {
        setWritable(true)
        setReadable(true)
        setExecutable(false)
    }
}