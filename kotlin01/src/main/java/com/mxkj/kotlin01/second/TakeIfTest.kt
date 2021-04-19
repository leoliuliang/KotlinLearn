package com.mxkj.kotlin01.second

import java.io.File

/** takeif 如果为true执行，否则不执行 ，类似于if语句，优势是可以直接在对象上调用，避免用临时变量赋值
 *  takeUnless 与 takeif相反
 * */
fun main() {
    File("E://aa.txt").takeIf {it.canRead() && it.canWrite()} ?.readText()
}