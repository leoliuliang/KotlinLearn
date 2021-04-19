package com.mxkj.kotlin01.second

//主构造函数
class People(_name:String,var _age:Int){
    var name = _name
        get() = field.capitalize()

    //lateinit关键字相当于约定：在用它之前负责初始化
    lateinit var home:String

    val school by lazy { println("lazy也可以延迟初始化，用的时候才初始化")}

    var age = _age

    //次构造函数
    constructor(name:String) : this(name,20)

    //init 初始化块, 要注意 主构造函数>init块>次构造函数 的执行顺序
    init {
        age = 16
    }

    fun test(){
        //只要无法确认lateinit变量是否初始化，就可以执行isInitialized检查
        if (::home.isInitialized){
            println(home)
        }
    }
}

fun main() {
    val people = People("莉莉", 18)
    val people1 = People("baby")
}