package com.mxkj.kotlin01.second

fun main() {
    val s1 = "Jason"
    val s2 = "Jason"

    println("$s1 , $s2")
    println(s1 == s2) //比较值
    println(s1 === s2) //比较引用

    val s3 = "jason".capitalize()
    println(s1 === s3)
}