package com.mxkj.kotlin01.second

import kotlin.math.absoluteValue

class Player{
    var name = "abcd"
        get() = field.capitalize()
        set(value){
            field.trim()
        }

    var age = 10
        get() = field.absoluteValue
        set(value) {field.absoluteValue}

    //这种不用初始值，直接在get()方法里面赋值，此时不需要filed
    val xx
        get() = (1..8).shuffled().last()
}

fun main() {
    val player = Player()
    player.name = "gad dag o"
    println(player.name)

    player.age = -88
    println(player.age)

}