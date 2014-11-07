package patternMatching


trait Expr
class Num(val value : Int) : Expr
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e : Expr) : Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum)
        return eval(e.left) + eval(e.right)

    throw IllegalArgumentException("Unknown expression")
}

fun evalWhen(e : Expr) : Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalWhen(e.left) + evalWhen(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args : Array<String>) {
    println(evalWhen(Sum(Num(1), Num(2))))
    println(eval(Sum(Num(1), Num(2))))
}
