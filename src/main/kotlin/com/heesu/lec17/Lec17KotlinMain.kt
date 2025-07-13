package com.heesu.lec17

// kt는 자바와 다르게 함수를 1급으로 간주 => 변수, 파라미터 등에 바로 셋팅 가능
fun main() {
    val fruits = listOf(
        Fruit("apple", 1000),
        Fruit("banana", 2000),
        Fruit("watermelon", 3000)
    )

    // 람다 호출 방법
    println(isApple(fruits[0]))
    println(isApple.invoke(fruits[0]))

    println(filterFruits(fruits, isApple)[0].name)
    // 함수를 바로 넣어줘도됌. 이때 함수가 가장 마지막 args일때는 아래와 같이 소괄호 밖에 중괄호 안에 람다로 쓸수있음
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "apple" }
    // 위에서 들어오는 파라미터가 1개이므로 이떄는 it로 변환도 가능
    filterFruits(fruits) { it.name == "apple" }

    // 클로저
    // 람다가 시작시점에 참조하는 변수들의 정보를 모두 포획해서 가지고있 -> 1급함수로서의 역할 가능
    var targetFruitName = "apple"
    targetFruitName = "banana"
    filterFruits(fruits) { it.name == targetFruitName }


}

// 람다 생성법1
val isApple = fun(fruit: Fruit): Boolean {
    return fruit.name == "apple"
}
// 람다 생성법2
val isApple2 = { fruit: Fruit -> fruit.name == "apple" }

// 기존 자바에서 filter를 Predicate으로 받는걸 kt에서는 함수 그대로 밭을 수 있음
fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}