package com.heesu.lec10

class Cat(
    species: String
) : Animal(species, 4) { // kt에서는 상속받는 상위 클래스의 생성자를 바로 호출

    override fun move() {
        println("cat move")
    }
}