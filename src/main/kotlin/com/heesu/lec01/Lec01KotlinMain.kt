package com.heesu.lec01

/* tips
 - 불변객체 애용 -> 멀티스레드 환경에서의 동시성 문제를 줄임
 - 타입 명시할때 Long으로만 표현하고, 코틀린 내부적으로 필요시 연산할때 primitive type 변환
 - tools > kotlin bytecode > 디컴파일로 자바코드 형식으로 확인 가능
 */

fun main() {

    // 변수
    var number1: Long = 10L

    // 상수 (불변)
    // 컴파일러가 자동 타입추론을 해주므로 아래와 같이 타입 명시하지 않아도 됌
    // 불변이기 때문에 초기화가 필수
    // 상수 컬렉션이어도 새로운 element 추가는 가능
    val number2 = 10L


    // 변수 null 셋팅 (kotlin 철학 -> null safety)
    var nullable: Long? = 1_000L
    nullable = null


    // 객체 인스턴스화
    // new 사용 X -> 생성자 호출을 함수처럼 간결하게 표현
    val person = Person("heesu")

}