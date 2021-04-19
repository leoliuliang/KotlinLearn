package com.mxkj.kotlin01.second
/** 字符串截取 */

const val NAME = "Jemmy's friend"
const val PERSON = "xiaoming, marry, hongli"
fun main() {
    val index = NAME.indexOf('\'')
    println(index)
    //类似java
//    println(NAME.substring(0,index))

    // 支持IntRange类型(表示一个整数范围内的类型)，until创建的范围不包括上限值
    val str = NAME.substring(0 until index)
    println(str)

    //split函数返回的是List集合数据，list又支持解构语法特性，它允许你在一个表达式里给多个变量赋值，解构常用来简化变量的赋值
    val (s1,s2,s3) = PERSON.split(',')
    println("$s1 $s2 $s3")

}