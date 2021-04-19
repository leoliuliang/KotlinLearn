package com.mxkj.kotlin01.second

/**
 * 集合 listOf
 * 可变集合 mutableListOf
 * 运算符：+=， -=
 * */
fun main() {
    val mutableListOf = mutableListOf("abc", "java", "kotlin", 43)
    mutableListOf += "c++"
    //获取值没有就取默认的
    mutableListOf.getOrElse(5){"default"}
    println(mutableListOf)

    val mutableMapOf = mutableMapOf("a" to "数学", "b" to "语文",Pair("c","美术"))
    mutableListOf.add(Pair("c","社会"))
    println(mutableMapOf)
    //遍历map
    mutableMapOf.forEach(){(key,value)->
        println("$value")
    }

    //distinct 快捷转换，相当于先toSet 再toList
    listOf(123,4324,466,123).distinct()

}