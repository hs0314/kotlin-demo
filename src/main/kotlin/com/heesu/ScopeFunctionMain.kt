package com.heesu

import com.heesu.lec09.Person

// scope function
// 람다를 사용해서 일시적인 영역을 만들고 메서드 체이닝에 활용
// ex) let, run, also, apply, with
fun main() {
    val person = Person("Bob", 25)
    exampleLet(person)
    exampleRun(person)
    exampleAlso(person)
    exampleApply()
    exampleWith(person)
}

// let
// Null 체크
// 추가메서드체이닝 생성
fun exampleLet(person: Person?): String? {
    // person이 null이 아닐 경우에만 실행됨
    val result = person?.let {
        println("let: ${it.name}, ${it.age}")
        it.name
    }
    return result
}

// run
// 객체 초기화와 반환값 계산을 동시에 처리
fun exampleRun(person: Person?): String? {
    val result = person?.run {
        // this로 person을 참조
        println("run: $name, $age")
        "$name is $age years old"  // 마지막 값 반환
    }
    println("run result: $result")
    return result
}

// also
// 객체를 유지하면서 로그 출력, 디버깅 등에 유용
fun exampleAlso(person: Person): Person {
    return person.also {
        println("also: ${it.name}, ${it.age}")
    }
}

// apply
// 객체 설정 시 유용 (빌더 패턴처럼 사용)
fun exampleApply(): Person {
    val person = Person("Init", 0).apply {
        // this로 참조, 객체 필드를 바로 설정 가능
        age = 30
    }
    println("apply: $person")
    return person
}

/* with
- 아래 같이 객체 프로퍼티를 여러번 활용할때
with(bufferedReader) {
    readLine()
    readLine()
    close()
}
 */
fun exampleWith(person: Person) {
    val desc = with(person) {
        println("with: $name, $age")
        "$name is $age years old"
    }
    println("with result: $desc")
}
