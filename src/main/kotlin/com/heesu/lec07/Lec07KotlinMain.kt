package com.heesu.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/* 예외처리
 - kt에서는 익셉션을 모두 unchecked로 간주
 - try with resources 사용안하고 kt inline 확장함수 문법 (ex. use) 사용해서 처리
 */

fun main() {

    val printer: FilePrinter = FilePrinter()
    printer.readFile("./a.txt")
}

// try-catch 문법은 자바와 동일
// if-else처럼 expression으로 간주되기 때문에 바로 return해줘도됌
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str} is not a number")
    }
}

class FilePrinter() {

    fun readFile(path: String) {
        val currentFile = File(".")
        val file = File(path)

        BufferedReader(FileReader(file)).use { reader -> println(reader.readLine()) }
    }

}