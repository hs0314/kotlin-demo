package com.heesu.lec15

fun main() {
    //listFunction()
    mapFunction()
    //setFunction()
}

fun handleCollectionNull() {
    /*
    List<Int?> => list안에 null 가능, list는 not null
    List<Int>? => list안 element는 notnull, list는 nullable
    List<Int?>? => list, element 모두 nullable
     */

    // java + kotlin 혼용되어있는 프로젝트에서는 java에서는 nullable여부로 컬렉션 구분이 없기떄문에
    // kotlin쪽 컬렉션이 java에서 호출되면 컬렉션이 불변이어도 내용이 변할 수 있음을 감안해야함
    // ex) 자바의 List<Integer> => kt에서는 위 3가지 type중 어떤건지 체크해야함
}

fun listFunction() {
    // kt 배열 예시 -> 잘안쓰고 Collection활용
    var array = arrayOf(100,110)

    array = array.plus(300) // 신규 e 추가
    for (i in array.indices) {
        println("${i} - ${array[i]}")
    }
    for ((idx,value) in array.withIndex()) {
        println("${idx} - ${value}")
    }


    // kt에서 컬렉션도 불변/가변 여부를 꼭 설정해야함
    // 불변 컬렉션이어도 컬렉션 내부 참조타입인 요소 수정은 가능
    val numbers = listOf(100,200) // 불변 리스트
    val mutableNumbers = mutableListOf(100,200) // 가변 리스트
    val emptyList = emptyList<Int>()

    println(numbers[0])
    for ((idx,value) in numbers.withIndex()) {
        println("${idx} - ${value}")
    }

    mutableNumbers.add(300)
}

fun mapFunction() {
    val oldMap = mutableMapOf<Int, String>() // 타입 추론을 할 수 없어서 타입정보를 미리 셋팅
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    val newMap = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    println(oldMap)
    println(newMap)

    for (key in oldMap.keys) {
        println("${key} - ${oldMap[key]}")
    }
    for ((key,value) in newMap.entries) {
        println("${key} - ${newMap[key]}")
    }
}

fun setFunction() {
    val numberSet = setOf(100,200,100)
    val mutableNumbers = mutableSetOf(100,200) // 내부적으로 linkedHashSet 사용
    println(numberSet)
}