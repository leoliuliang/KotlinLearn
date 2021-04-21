package com.mxkj.kotlin01.third

/** 泛型类 */

class MagicBox<T>(item: T){
    var available = false
    private val subject: T = item

    //泛型参数应用于函数
    fun fetch() : T?{
        return subject.takeIf { available }
    }

    //多泛型参数，函数fetch返回类型是R，它的参数是匿名函数subjectModFunction，匿名函数参数是T，返回R
    fun <R> fetch(subjectModFunction: (T) -> R) : R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

class Boy(val name: String, val age: Int)
class Man(val name: String, val age: Int)
class Dog(val wright:Int)

fun main(){
    val boy:MagicBox<Boy> = MagicBox(Boy("小明", 8))
    val dog = MagicBox(Dog(20))
//    boy.available = false
    boy.available = true

    boy.fetch().run {
        println("you find me? ${this?.name}")
    }

    //此处业务场景是：将男孩变男人
    boy.fetch {
        Man(it.name,it.age.plus(20))
    }

}