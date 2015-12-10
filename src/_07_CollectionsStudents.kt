package collectionsStudents

import java.util.HashSet
import java.util.ArrayList
import model.*

fun main(args: Array<String>) {
    val s1 = Student("Martin", 23)
    val students = getStudentsList()
    for (student in students) {
        student.university = TUM
    }

    val olderThan21 = HashSet<Student>()

    for (student in students) {
        if (student.age != null && student.age > 21) {
            olderThan21.add(student)
        }
    }

    // "functional" version
    val olderThan21v1 = students.filter({ s: Student -> s.age != null && s.age > 21 })
    val olderThan21v2 = students.filter { s: Student -> s.age != null && s.age > 21 }
    val olderThan21v3 = students.filter { s -> s.age != null && s.age > 21 }
    val olderThan21v4 = students.filter { it.age != null && it.age > 21 }

    val isOldEnough: (Student) -> Boolean = { s: Student -> s.age != null && s.age > 21 }
    val olderThan21v5 = students.filter(isOldEnough)

    //sout - question
    if (isOldEnough.invoke(s1)) {
        println("$s1 is old enough!")
    }

    //the same
    if (isOldEnough(s1)) {
        println("$s1 is old enough!")
    }

    //----------
    val employees = ArrayList<Employee>()
    for (s in students) {
        employees.add(Employee(s.name, s.age, "GMC"))
    }

    val employees1: List<Employee> =
            students.map { Employee(it.name, it.age, "GMC") }
}