package com.mxkj.kotlin01.third

/**
 * 有时候你可能想知道某个泛型参数具体是什么类型，reified关键字能帮你检查泛型参数类型。
 *
 * reified 和 inline要一起使用
 * */
inline fun<reified T> randomOrBackup(backup: () -> T): T{
    val listOf = listOf(
            Boy("光头强", 19),
            Man("唐三",20)
    )
    val first = listOf.shuffled().first()
    println(first)
    return if (first is T){
        first
    }else{
        backup()
    }
}

fun main() {
    randomOrBackup {
        Boy("胖子",28)
    }
}