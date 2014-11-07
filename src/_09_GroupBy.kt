package groupBy

import model.*
import java.util.HashMap
import java.util.ArrayList

fun main(args: Array<String>) {
    doSmth(getStudentsList())
}

fun doSmth(students: List<Student>) {
    val map: Map<Int?, List<Student>> = students.groupBy { it.age }

    my_groupBy (students) { it.age }
    println(map)
}

fun <T, K> my_groupBy(students: List<T>, toKey: (T) -> K): Map<K, List<T>> {
    val result = HashMap<K, MutableList<T>>()
    for (student in students) {
        val key = toKey(student)
        var list = result[key]
        if (list == null) {
            list = ArrayList<T>()
        }
        // the same as
//        val list = result.getOrPut(key, { ArrayList<T>() })
        list.add(student)
    }
    return result
}




