package com.heesu.lec16


fun main() {
    val str:String = "abcde"
    println(str.lastChar())

    println(3 add2 4)

    createPerson("first", "")

}

// 확장함수
// 특정 클래스 내의 내부 멤버함수처럼 외부 kt함수 활용
// 확장함수 자체가 public이기 때문에 클래스의 private 값은 접근 불가
// 확장함수와 클래스 멤버함수 시그니처가 동일하면 멤버함수 우선
fun String.lastChar(): Char { // 확장하려는 String 클래스
    return this[this.length - 1] // this로 실제 클래스 내부 값에 접근
}


// 중위함수
infix fun Int.add2(other: Int): Int {
    return this + other
}

// 지역함수
// 함수 내부에서 함수 호출
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName:String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없음. 현재값 : ${name}")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}