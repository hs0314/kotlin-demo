package com.heesu.lec03

import kotlin.reflect.typeOf

/* kt에서의 타입
 - 기본 (자바와 동일)
    - 변수에 선언된 값을 기반으로 컴파일러가 타입 추론
 - 타입캐스팅
    - kt에서의 타입변환은 명시적으로 처리해줘야함(java랑 다름)
    - nullable한 값의 경우 null 처리 필수
 - kt의 특이한 3가지 타입
    - Any(=자바의 Object), Unit(=void), Nothing
 - String interpolation, String indexing
 */

fun main() {
    val intNum = 4
    val nullableIntNum: Int? = 3
    //val longNum:Long = num1 // type mismatch

    val longNum:Long = intNum.toLong() // 명시적 변환
    val longNum2:Long = nullableIntNum?.toLong() ?: 0L // nullable한 값의 타입 변환

    printAgeIfPerson(Person("name", 20))
    printAgeIfPersonNullalbe(null)


    // kt string 처리 예시
    val person = Person("john", 20)
    println("name is ${person.name}")

    val manipulatedString = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(manipulatedString)

    val indexingString = "ABC"
    println(indexingString[0])


}

fun printAgeIfPerson(obj:Any) {
    if (obj is Person) { // 자바의 instance of 대체

        /* 스마트 캐스트 -> 타입 변환 없이 바로 obj.age 접근 가능
        val person = obj as Person
        println(person.age)
         */
        println(obj.age)
    }
}

fun printAgeIfPersonNullalbe(obj:Any?) {
    val person = obj as? Person // as?로 null safe 보장(safe-call과 비슷)
    println(person?.age)
}