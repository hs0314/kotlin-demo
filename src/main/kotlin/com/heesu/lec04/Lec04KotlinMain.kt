package com.heesu.lec04

/* 연산자 관련
 - 기본적으로 자바와 거의 동일
 - compareTo 자동 체크
 - 동일성 / 동등성 -> 각 ===, == 으로 체크
 - 반복문에서 활용하는 kt 연산자
    - in / !in 연산자
    - a..b 연산자
  - 연산자 오버로딩 -> 객체마다 연산자 직접 정의 가능
 */

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // kt에서는 객체 비교 연산자에서 자동으로 comaperTo 호출
    // 연산자 타고 들어가면 자동으로 해당 클래스 compareTo 메서드 이동
    if (money1 > money2) {
        println("money1 is greater than money2")
    }


    // 동일성, 동등성
    val m1 = JavaMoney(1_000L)
    val m2 = m1
    val m3 = JavaMoney(1_001L)

    println(m1 === m2)
    println(m1 == m3)


    // 연산자 오버로딩
    // JavaMoney클래스에 매핑되는 kt Money 클래스에서 연산자 오버로딩
    val kt_m1 = Money(1_000L)
    val kt_m2 = Money(1_500L)
    println(kt_m1 + kt_m2)
}