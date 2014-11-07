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
        Student("Marek", 19),
        Student("Lucas", 24),
        Student("Toby", 23),
        Student("Ales", 23),
        Student("David", 20)
)

fun main(args: Array<String>) {
    val martin = Student("Martin", 21)
    martin.university = UniversityOfHradecKralove
    println(martin)

    val students = getStudentsList()
    for (student in students) {
        student.university = UniversityOfHradecKralove
    }
}





