package com.heesu.lec05

/* kt 조건문은 자바와 거의 동일하지만 아래 차이점이 있음
 - if-else 자체가 하나의 expression
 - switch-case문을 대체하는 when
 - in 연산자를 통한 between 처리
 */

fun main() {
    validateScoreIsNotNegative(1)

    println(getPassOrFail(51))

    usingInExp(10)

    println(getGradeWithWhenExp(95))

    judgeNumber(11)

}

fun validateScoreIsNotNegative(score: Int) { // 함수에서 void(Unit) 생략 가능
    if (score < 0) {
        throw IllegalArgumentException("${score} must be greater than 0")
    }
}

// kt의 if-else 는 expression (특정값)
// 아래와 같이 바로 return 해버릴 수 있음 (=자바의 3항 연산자)
fun getPassOrFail(score: Int): String {
    return if (score >=50) {
        "Pass"
    } else {
        "Fail"
    }
}

// in 연산자를 활용한 조건 처리 (between 활용도 좋다)
fun usingInExp(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score} must be between 0 and 100")
    }
}

fun getGradeWithWhenExp(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

// 들어온 값 분기
fun judgeNumber(number: Int) {
    when (number) {
        1,0,-1 -> println("1,0,-1 중 하나")
        else -> println("1,0,-1이 아님")
    }
}