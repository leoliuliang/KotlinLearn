package com.mxkj.kotlin01.third

/** 泛型类  vararg可变参数，类似java中的可变参数... */

class MagicBox3<T>(vararg item: T){
    var available = false
    private val subject: Array<out T> = item

    //泛型参数应用于函数
    fun fetch(index : Int) : T?{
        return subject[index].takeIf { available }
    }

    //多泛型参数，函数fetch返回类型是R，它的参数是匿名函数subjectModFunction，匿名函数参数是T，返回R
    fun <R> fetch(index: Int, subjectModFunction: (T) -> R) : R? {
        return subjectModFunction(subject[index]).takeIf { available }
    }

    operator fun get(i: Int) : T? = subject[i].takeIf { available }
}

class Boy3(val name: String, val age: Int)
class Man3(val name: String, val age: Int)
class Dog3(val wright:Int)

fun main(){
    val boy:MagicBox3<Boy3> = MagicBox3(Boy3("小明", 8),Boy3("哄哄", 22),Boy3("熊二", 33))
    val dog = MagicBox3(Dog3(20))
//    boy.available = false
    boy.available = true

    boy.fetch(1).run {
        println("you find me? ${this?.name}")
    }

    //此处业务场景是：将男孩变男人
    boy.fetch(2) {
        Man(it.name,it.age.plus(20))
    }

    //boy[2] 要想这样用必须运算符重载，就是去实现get()函数
    println( boy[2]?.name)
}