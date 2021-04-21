package com.mxkj.kotlin01.third

/**
 * 接口中所有的实现都要用override关键字，方法不用open，默认就是open。
 * 90%情况接口中都是函数的声明，有属性的话基本都是常量。
 * */
interface Movable{
    val maxSpeed:Int
        get() = (1..8).shuffled().last() //只要你愿意，你可以在接口里提供默认属性的getter方法和函数实现

    var wheels : Int

    fun move(movable: Movable): String
}

class Car(name: String, override var wheels: Int = 4) : Movable{
    override var maxSpeed: Int
        get() = super.maxSpeed //用父类的
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }
}


fun main() {

}