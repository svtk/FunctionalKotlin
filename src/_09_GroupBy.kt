package groupBy

import model.*
import java.util.HashMap
import java.util.ArrayList

fun main(args: Array<String>) {
    val students = getStudentsList()
    val map = students.groupBy { it.age }
    println(map)
}



