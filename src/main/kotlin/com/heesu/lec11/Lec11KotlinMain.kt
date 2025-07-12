package com.heesu.lec11

/* 접근제어
 - 기본적으로 public -> internal(동일모듈), private(동일파일)
 */

// 유틸성 코드 -> 자바에서 abstract class, private 생성자로 구현 (인스턴스화 방지)
// kt에서는 그냥 유틸 메서드를 클래스밖에 선언
// 디컴파일해서 자바코드로 보면 해당 파일이 final class, 해당 함수가 static final 함수로 선언되어있음
fun isDirPath(path: String): Boolean = path.endsWith("/")


// 생성자에 접근지시 붙일시 constructor 붙여야함
class c internal constructor(){
}

// 필드별 getter/setter에 대한 접근제어
class Car(
    internal val name: String, // getter,setter internal 셋팅
    _price: Int
) {
    var price = _price // 생성자에 들어있는 price로 셋팅
        private set // price setter private 셋팅
}