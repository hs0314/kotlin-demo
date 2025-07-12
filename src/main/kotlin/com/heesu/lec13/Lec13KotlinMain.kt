package com.heesu.lec13

import java.util.*

fun main() {

}

class Outer(
    val outerValue: Int
) {

    // 코틀린에서 내부적으로 inner static class로 생성
    // outer클래스에 대한 참조 불가
    class Inner {

    }

    // outer클래스 참조 가능 inner 클래스
    // 권장되지 않음
    inner class Inner2(
        val innerValue2: Int
    ) {
        // outer클래스의 변수 참조
        val outerValue: Int
            get() = this@Outer.outerValue

    }
}