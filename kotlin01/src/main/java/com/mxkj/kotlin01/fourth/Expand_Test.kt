package com.mxkj.kotlin01.fourth

/**
 * 扩展函数：可以在不修改类定义的情况下增加类的功能。
 * 扩展可用于自定义类，也可以用于List String,以及Kotlin标准库里的其他类。
 * 和继承相似，扩展也能共享类行为，在你无法接触某个类定义，或者某个类没有使用open修饰符，导致你无法继承它时，扩展就是增加类功能最好的选择。
 * */

//给字符串追加amount个！
fun String.addExt(amount:Int = 1) = this +"!".repeat(amount)

//在超类上定义扩展函数，Any所以的子类都可以使用easyPrint了
//fun Any.easyPrint() = println(this)

fun main() {
//    println("abc".addExt(5))

    "熊二".easyPrint().addExt(8).easyPrint()

    //let函数就属于泛型扩展函数
    "abc".let {

    }
}

/**
 * 泛型扩展函数
 * 泛型扩展函数不仅可以支持任何类型的接收者，还保留了接收者的类型信息，
 * 使用泛型类型后，扩展函数能够支持更多类型的接收者，适用范围更广
 * */
fun <T> T.easyPrint() : T{
    println(this)
    return this
}