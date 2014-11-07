package bulkOperations

import model.*
import java.util.ArrayList
import java.util.HashSet

fun foo(list: List<Student>) {

    my_filter(list) { it.age != null }

    //the same as
    my_filter(list, { it.age != null })

    my_map(list) { (s: Student) -> Employee(s.name, s.age, "") }
}

fun <T> my_filter(list: List<T>, predicate: (T) -> Boolean): List<T> {
    val result = ArrayList<T>()
    for (element in list) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result
}

fun <T, R> my_map(list: List<T>, function: (T) -> R): List<R> {
    val result = ArrayList<R>()
    for (element in list) {
        result.add(function(element))
    }
    return result
}

fun <T, R> my_map(set: Set<T>, function: (T) -> R): Set<R> {
    val result = HashSet<R>()
    for (element in set) {
        result.add(function(element))
    }
    return result
}

fun main(args: Array<String>) {
    val set = my_map(setOf("abc", "cba", "ccc")) { it.length }
    println(set)
}