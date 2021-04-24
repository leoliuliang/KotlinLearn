package com.mxkj.kotlin01.third

//out , 子类泛型对象可以赋值给父类泛型对象
interface Production<out T>{
    fun product(): T
}

//in ，父类泛型对象可以赋值给子类泛型对象
interface Consumer<in T>{
    fun consumer(item : T)
}

//不变, 即生产也消费
interface ProductionConsumer<T>{
    fun product(): T
    fun consumer(item: T)
}

open class Food
open class Fastfood : Food()
class Burger : Fastfood()

//食品店
class FoodStore : Production<Food>{
    override fun product(): Food {
        println("produce burger")
        return Food()
    }
}

//快餐店
class FastFoodStore : Production<Fastfood>{
    override fun product(): Fastfood {
        println("produce fastfood")
        return Fastfood()
    }
}


//快餐店
class BurgerStore : Production<Burger>{
    override fun product(): Burger {
        println("produce burger")
        return Burger()
    }
}

//消费者 ,消费普通食品
class EveryBody : Consumer<Food>{
    override fun consumer(item: Food) {
        println("eat food")
    }
}
//消费快餐的人
class ModernPeople : Consumer<Fastfood>{
    override fun consumer(item: Fastfood) {
        println("eat fastfood")
    }
}

//消费汉堡的人
class American : Consumer<Burger>{
    override fun consumer(item: Burger) {
        println("eat burger")
    }
}

fun main() {
    //因为有out关键字，所以子类型可以向父类型转
    val foodStore: Production<Food> = FoodStore()
    val fastFoodStore: Production<Food> = FastFoodStore()
    val burger: Production<Food> = BurgerStore()

    //因为有in关键字，所以父类型可以向子类转
    val everyBody: Consumer<Burger> = EveryBody()
    val modernPeople: Consumer<Burger> = ModernPeople()
    val american: Consumer<Burger> = American()

}