package com.mxkj.kotlin01.first

/** 内联函数 ，inline 定义
 * 在jvm上，lambda会以实例存在，lambda会产生更大的内存开销
 * 可以使用kotlin内联优化机制，内联函数避免了这一问题，因为
 * 哪里有lambda，编译器就会将函数体复制粘贴在那，就不再需要
 * lambda的实列。
 *
 * 但如果是递归函数，就不能内联，因为会无限循环复制粘贴
 * */
fun main() {
    testInline01("刘亮")
}

inline fun testInline01(name:String): () -> String = {
    "$name 168"
}