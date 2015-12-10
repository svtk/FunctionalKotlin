package conventions


fun multiAssignPair(pair: Pair<Int, String>) {
    val (first, second) = pair
}

class MyPair {
    operator fun component1(): Int = 1
    operator fun component2(): String = "a"
}

fun howItWorks() {
    fun invocation() {
        val (i, s) = MyPair()
    }
    //invocations of functions 'component1' and 'component2' are generated
    fun generatedCode() {
        val tmp = MyPair()
        val i = tmp.component1()
        val s = tmp.component2()
    }
}

fun iterateOverCollectionWithIndex(collection: Collection<Int>) {
    for ((index, element) in collection.withIndex()) {
        println("$index: $element")
    }
}

fun howWorksMultiAssignmentInForCycle() {
    fun invocation(it: Iterator<MyPair>) {
        for ((i, s) in it) {
        }
    }

    fun generatedCode(it: Iterator<MyPair>) {
        for (tmp in it) {
            val i = tmp.component1()
            val s = tmp.component2()
        }
    }
}

// with 'data' annotation 'component1', 'component2', etc. are generated automatically
// for constructor parameters
data class MyAnotherPair(val i: Int, val s: String)
