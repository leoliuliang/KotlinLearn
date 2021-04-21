package com.mxkj.kotlin01.third


/** 泛型类  类型的约束*/

class MagicBox2<T : Human>(item: T){
    var available = false
    private val subject: T = item

}

open class Human(val age: Int)
class Boy2( name: String,  age: Int) : Human(age)
class Man2(val name: String, val age: Int)
class Dog2(val wright:Int)

fun main(){
    val boy:MagicBox2<Boy2> = MagicBox2(Boy2("小明", 8))
//    val dog:MagicBox2<Dog2> = MagicBox2(Dog2(20))
}