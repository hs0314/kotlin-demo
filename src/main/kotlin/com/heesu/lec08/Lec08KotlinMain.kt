package com.heesu.lec08

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/* 함수 활용
 - 함수는 클래스 내,외부 모두 존재가능
    ex) 유틸형 함수를 모아두고 클래스 정의 하지 않고 파일내에 함수만 존재하는 케이스 가능
 - 함수 파라미터에 default 값 셋팅 가능
 - named argument (빌더 패턴의 장점 차용)
 - 가변인자
 */
fun main() {
    repeat("aaa")
    repeat("aaa", 2, false)

    // named argument
    // 지정한 아규먼트값 사용하고 지정되지 않은 아규먼트는 기본값 사용
    repeat("aaa", useNewLine = false)

    // 가변인자
    printAll("A","B","C")
}

// if-else가 하나의 exp이기 때문에 아래와 같이 표현 가능
fun max(a: Int, b: Int) = if (a > b) a else b


// default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {

    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 가변인자 셋팅 (vararg)
fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}