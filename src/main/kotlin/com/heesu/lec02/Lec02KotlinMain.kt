package com.heesu.lec02

/* tips
 - kt에서의 null 체크 -> ?를 통해서 nullable 타입을 다르게 취급
 - safe call / Elvis 연산자
   - ex) str?.length
   - ex) str?.length ?: 0
 - null 아님 단언방법
    - ex) str!!.length
    - 컴파일 타임에서는 이슈없지만 런타임시 npe발생 가능성 있음
 - 플랫폼 타입
    - @Nullable 등 명시가 없어서 kt에서 null 관련 정보를 알 수 없는 타입
    - 런타임 npe 발생 가능성 있음
 */
fun main() {
    val safeCallEx: String? = "nullable string"
    val elvisEx: String? = null

    println(safeCallEx?.length) // safe call - null이면 값자체가 null
    println(elvisEx?.length ?: -1) // elvis 연산자 - null이면 뒤의값 사용.. 삼항연산자 같음
}

fun startsWithA1(str: String?): Boolean {

    return str?.startsWith("A") ?: throw IllegalArgumentException("String can't be null")
}

// 자바의 Boolean객체는 nullable 하므로 리턴타입에도 명시
fun startsWithA2(str: String?): Boolean? {

    // str이 null인 경우, null을 반환하기 떄문에 별도의 elvis 연산자 필요없음
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {

    // xxx: str이 nullable하기 때문에 아래와 같은 소스는 컴파일 시점 오류발생
    //str.startsWith("A")

    return str?.startsWith("A") ?: false
}