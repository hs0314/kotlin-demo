package com.heesu.lec14

fun main() {
    val person1 = Person(11, "one")
    val person2 = Person(20, "two")
    println(person1.toString())
    println(person1 == person2)

    handleCountry(Country.KOREA)
}

// data class
// getter, setter, toString, equals, hashcode 자동생성
data class Person(
    val age: Int,
    val name: String
)

// enum class
enum class Country (
    val code: String
){
    KOREA("ko"),
    AMERICA("am")
}
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("Korea")
        Country.AMERICA -> println("America")
    }
}

//sealed class, sealed interface
// 상속 가능하도록 추상클래스를 만들지만 외부에서는 상속받지 못하도록
// 컴파일 타임때 하위클래스 타입을 모두 기억하기 때문에 런타임 시점에 클래스타입 추가 불가 (=enum과 같음)
// enum은 상속불가, sealed는 가능