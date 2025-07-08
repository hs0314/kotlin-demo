package com.heesu.lec09

fun main() {
    val person = Person("name", 30)

    println(person.name) // setter
    person.age = 31 // getter
    println(person.age)
}

// kt에서는 필드 선언 시, getter/setter 자동 생성
class Person(
    name: String,
    var age: Int) {

    // 프로퍼티의 자동생성 getter대신 커스텀 getter로 대체 가능
    // 무한루프 방지용으로 자기자신을 가리키는 field 예약어 (=backing field) 사용
    // 굳이 이렇게 하지말고 함수를 하나 더 파는게 가독성이 좋을듯..
    val name = name
        get() = field.uppercase()

    // 생성자 호출 시점에 호출
    // 기본값 셋팅, validation에 활용
    init {
        if (age < 0) {
            throw IllegalArgumentException("Age can't be negative")
        }
    }

    // 부생성자 -> 최종적으로 주생성자를 this로 호출해야함
    // kt에서는 부생성자보다 default parameter를 더 권장하긴함
    constructor(name: String) : this(name, 1)

    // isAdult라는 함수를 커스텀 getter 를 통해서 프로퍼티처럼 보이게 정의할수도 있음
    val isAdult: Boolean
        get() {
            return this.age > 18
        }
}