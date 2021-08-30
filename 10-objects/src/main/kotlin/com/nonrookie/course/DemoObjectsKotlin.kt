package com.nonrookie.course

import java.util.*

fun Any?.toString() = this?.toString() ?: "null"

object DemoObjectsKotlin { // object можно и выкинуть, просто функция в теле файла
    fun demonstration() {
        println("OBJECTS") // Великая экономия места на диске. Можно ; не ставить)
        println(5.toString())
        println(null ?: "null") // Так уж и быть, немного костылик. Но можно написать свой экстеншен! (6 строка)
        println(null.toString())
        println(5 ?: "It is null!")
        println(null ?: "It is null!")
        val list: List<Int>? = listOf(1, 2, 3, 4, 5) // List.of это ж целый импорт. А тут из коробки listOf есть
        val index = 9
        try {
            Objects.checkIndex(index, list!!.size) //Ладно, тут замены нормальной нет
        } catch (e: IndexOutOfBoundsException) {
            println(e.message)
        }

//        null ?: throw NullPointerException("It is null!")
        println(null ?: "default")
        if (list != null) {
            println("List is not null")
        }
        list?.let { //Ну раз != null не устроил и так хочется посравнивать через Objects.nonNull, то ещё вариант есть))
            println("List is not null")
        }
        if (Objects.nonNull(list)) {
            println("List is not null")
        }
        if (list == null) {
            println("List is null")
        }
        if (Objects.isNull(list)) {
            println("List is null")
        }
        println(5 == 5)
        println(null == 5)
        println(null == null)
        println("a" == "a") // Бонус! Можно что угодно через равно сравнивать
    }
}
