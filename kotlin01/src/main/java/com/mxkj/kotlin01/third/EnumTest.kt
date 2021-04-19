package com.mxkj.kotlin01.third

/** 枚举类，枚举也是一个类 */
enum class Direction(private val p: PlayScore){
    EAST(PlayScore(2,3)),
    WEST(PlayScore(8,8)),
    SOUTH(PlayScore(6,1)),
    NORTH(PlayScore(10,0));

    fun updatePlayScore(playScore: PlayScore) =
            PlayScore(playScore.experience + p.experience, playScore.level + p.level)
}


fun main() {
    println(Direction.SOUTH.updatePlayScore(PlayScore(1,1)))
}