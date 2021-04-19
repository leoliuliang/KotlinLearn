package com.mxkj.kotlin01.third

import sun.management.Agent

/**
 * data 修饰的类代表存储类，有一些独有的特性，比如重写toString，==本来相当于equles比较的是引用，经过data修饰后比较的就是值
 * 数据类不能有open关键字，所以不能继承
 * */
data class People(val name:String){

}

/** 使用data, 可以方便的copy对象 。注意：复制走的是主函数*/
data class Student(val _name: String, val _age: Int){
    var score = 10
    private val hobby = "music"
    val subject:String
    init {
        println("initializing student")
        subject = "math"
    }
    constructor(name: String):this(name,_age=10){
        score = 20
    }

    override fun toString(): String {
        return "Student(_name='$_name', _age=$_age, score=$score, hobby='$hobby', subject='$subject')"
    }

}


fun main() {
    println(People("rose"))
    println(People("kaka") == People("kaka"))

    val student = Student("Jack")
    val copy = student.copy("Mary")//copy 走的是主函数，所以score=10
    println(student)
    println(copy)
}