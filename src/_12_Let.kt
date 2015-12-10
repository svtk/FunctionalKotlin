package let

import model.Student

fun sendEmailTo(student: Student) {
    student.university
}

fun handle(student: Student?) {
//    sendEmailTo(student)
    if (student != null) sendEmailTo(student)

    student?.let { sendEmailTo(it) }
}
