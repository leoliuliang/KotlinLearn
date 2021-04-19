package com.mxkj.kotlin01.second

/** replace */
fun main() {
    val country = "The people's Republic of Chain"

    val str = country.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" -> "9"
            "i" -> "5"
            "o" -> "2"
            "u" -> "6"
            else -> it.value
        }
    }

    println(country)
    println(str)
}