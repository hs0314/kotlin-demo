package com.heesu.lec06

/* 반복문
 - for문은 아래 예제가 있고 while은 아예 동일
 */

fun main() {

    // for-in
    val numbers = listOf(1L,2L,3L)
    for (num in numbers) {
        println(num)
    }

    // 전통적인 for문
    // 범위는 .. 연산자를 통해서 처리
    for (i in 1..3) {
        println(i)
    }

    // 인덱싱 내려가는 for문은 downTo 사용
    for ( i in 5 downTo 1) {
        println(i)
    }

    // +=2 로 단게 건너뒬떄는/
    for (i in 1..5 step 2) {
        println(i)
    }

}