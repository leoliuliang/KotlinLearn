package com.mxkj.kotlin01.second

import java.io.File

/** takeif 如果为true执行，否则不执行 ，类似于if语句，优势是可以直接在对象上调用，避免用临时变量赋值
 *  takeUnless 与 takeif相反
 * */
fun main() {
    //{it.canRead() && it.canWrite()} lambda表达式返回true，takeIf就返回File对象，否则返回null
    File("E://aa.txt").takeIf {it.canRead() && it.canWrite()} ?.readText()
}