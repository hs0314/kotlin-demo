package com.heesu.lec10

class Bird(
    species: String
) : Animal(species, 2), Flyable { // kt에서는 상속받는 상위 클래스의 생성자를 바로 호출

    private val wingCount: Int = 2

    override fun move() {
        println("bird move")
    }

    override val legCount: Int
        get() {
            return super.legCount + this.wingCount
        }

    override fun act() {
        super<Flyable>.act() // kt에서 Flyable 인터페이스 default 메서드 호출법
    }
}