package com.heesu.lec12

import java.util.*

fun main() {
    val newb = Person.newBaby("baby1")
    println("${newb.name} / ${newb.age}")

    moveSomething(object : Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)


}

// static 함수/변수 -> companion obejct
// 여기에 유틸성함수 넣어도 되지만 그냥 파일 최상단 함수로 하는걸 권장
class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory : Log { // companion obj에 이름 설정 가능
        const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("overrided log")
        }
    }
}

// 익명 클래스
// 실 활용은 main 함수에서 확인
fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

// 싱글톤 클래스
object Singleton {
    var a: Int = 1
}

interface Log {
    fun log()
}