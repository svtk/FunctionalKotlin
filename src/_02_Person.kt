package model

open class Person(val name: String, val age: Int? = null) {
    override fun toString() = name
}

class Student(
        name: String,
        age: Int?
) : Person(name, age) {
    var university: University? = null
}

class Employee(
        name: String,
        age: Int?,
        val companyName: String
) : Person(name, age)

class Entrepreneur(
        name: String,
        age: Int?,
        val startUpName: String
) : Person(name, age)

fun getStudentsList() = listOf(
        Student("Paul", 23),
        Student("Luis", 19),
        Student("Lucas", 24),
        Student("Emma", 23),
        Student("Noah", 20)
)

fun main(args: Array<String>) {
    val ben = Student("Ben", 21)
    ben.university = TUM
    println(ben)

    val students = getStudentsList()
    for (student in students) {
        student.university = TUM
    }
}





