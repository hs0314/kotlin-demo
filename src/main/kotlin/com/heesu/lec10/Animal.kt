package com.heesu.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 프로퍼티에 대한 getter/setter 오버라이딩 시, open 필요
) {

    abstract fun move()

}