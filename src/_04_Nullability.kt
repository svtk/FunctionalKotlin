package nullability

import java_examples.JPerson
import model.Person

fun main(args: Array<String>) {
    //using java
    val person = JPerson("Tomas")
    if (person.getAge() < 42) {
        println("yep!")
    }

    //kotlin

//    val age: Int = null //doesn't compile
    val age: Int = 3
    val ageOrNull: Int? = null //compiles
//    age = ageOrNull

    if (ageOrNull != null) {
        val isAdult = ageOrNull > 21
    }

    val nameOrNull: String? = "Name"

    if (nameOrNull != null) {
        nameOrNull.toUpperCase()
    }

    nameOrNull?.toUpperCase()
}

fun doSmthWithPerson(person: Person?) {
    person?.name ?: "No one"

    if (person == null) fail("Need a person!")
    val age = person.age
}

fun fail(message: String) = throw AssertionError(message)